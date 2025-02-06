grammar Grammar;

@header {
    import java.io.*;
    import java.util.*;
    import java.util.regex.*;
}

@members {
    static FileWriter writer;
    static Set<String> declaredNonTerms = new HashSet<>();
    static Set<String> declaredTerms = new HashSet<>();
    static Set<String> usedNonTerms = new HashSet<>();
    static Set<String> usedTerms = new HashSet<>();

    public static void startFile() {
        try {
            writer = new FileWriter("OutputGrammar.g4");
            writer.write("grammar OutputGrammar;\n\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void closeFile() {
        try {
            if (writer != null) {
                writer.close();
            }

            // Controllo semantico: verifica che tutti i NON_TERM usati siano stati dichiarati
            for (String token : usedNonTerms) {
                if (!declaredNonTerms.contains(token)) {
                    System.err.println("Errore: Il NON_TERM '" + token + "' è usato ma non dichiarato.");
                }
            }

            // Controllo semantico: verifica che tutti i TERM usati siano stati dichiarati
            for (String token : usedTerms) {
                if (!declaredTerms.contains(token)) {
                    System.err.println("Errore: Il TERM '" + token + "' è usato ma non dichiarato.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile(String text) {
        try {
            if (writer != null) {
                writer.write(text + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Funzione per rimuovere la ricorsione sinistra
    public static void removeLeftRecursion(String ruleName, String leftPart, String rightPart) {
        String nonRecursivePart = rightPart.trim();
        String recursivePart = leftPart.replace(ruleName,"").trim();
        writeToFile(ruleName + " : " + "(" + nonRecursivePart + ")" + " " + ruleName + "_tail?" + ";");
        writeToFile(ruleName + "_tail" + " : " + "(" + recursivePart + ")" + " " + ruleName + "_tail?" + ";");
    }

}

start:
    { startFile(); }
    s_section l_section EOF
    { closeFile(); };

s_section:
    S_START s_rule+ S_END;

s_rule:
    NON_TERM EQUAL s_expr ';'
    {
        String ruleName = $NON_TERM.text.replaceAll("[<>]", "");
        declaredNonTerms.add(ruleName.toLowerCase());

        StringBuilder recursiveParts = new StringBuilder();
        StringBuilder nonRecursiveParts = new StringBuilder();

        Queue<String> queue = new LinkedList<>();
        queue.add($s_expr.value.trim());

        while (!queue.isEmpty()) {
            String current = queue.poll();
            String[] parts = current.split("\\|", 2); // Dividi solo alla prima occorrenza di '|'
            String leftPart = parts[0].trim();

            // Se la parte sinistra inizia con ruleName, la aggiungiamo ai pezzi ricorsivi
            if (leftPart.startsWith(ruleName)) {
                if (recursiveParts.length() > 0) recursiveParts.append(" | ");
                recursiveParts.append(leftPart);

                // Se esiste una parte destra, continua la divisione con essa
                if (parts.length > 1) {
                    queue.add(parts[1].trim());
                }

            } else {
                // Se la parte sinistra NON è ricorsiva, la aggiungiamo ai pezzi normali
                if (nonRecursiveParts.length() > 0) nonRecursiveParts.append(" | ");
                nonRecursiveParts.append(leftPart);

                // Se esiste una parte destra, la aggiungiamo direttamente ai pezzi normali
                if (parts.length > 1) {
                    if (nonRecursiveParts.length() > 0) nonRecursiveParts.append(" | ");
                    nonRecursiveParts.append(parts[1].trim());
                }
            }
        }

        String leftPart = recursiveParts.toString();
        String rightPart = nonRecursiveParts.toString();

        if (leftPart.length() > 0 && rightPart.length() > 0)
            removeLeftRecursion(ruleName, leftPart, rightPart);
        else if (leftPart.length() == 0 && rightPart.length() > 0)
            writeToFile(ruleName.toLowerCase() + " : " + rightPart + ";");
        else if (leftPart.length() > 0 && rightPart.length() == 0) {
            writeToFile(ruleName.toLowerCase() + " : " + leftPart + ";");
            System.err.println("La regola sintattica " + ruleName + " presenta una ricorsione diretta infinita");
        }
    };

s_expr returns [String value]:
    e1=s_seq (e2=s_expr_aux)? {
        $value = $e1.value;
        if ($e2.value != null && !$e2.value.isEmpty()) {
            $value += " " + $e2.value.trim();
        }
    };

s_seq returns [String value]:
    e1=s_term (e2=s_seq)? {
        $value = $e1.value;
        if ($e2.value != null && !$e2.value.isEmpty()) {
            $value += " " + $e2.value.trim();
        }
    }
    | { $value = ""; };

s_expr_aux returns [String value]:
    '|' e1=s_seq (e2=s_expr_aux)? {
        $value = "| " + $e1.value;
        if ($e2.value != null && !$e2.value.isEmpty()) {
            $value += " " + $e2.value.trim();
        }
    }
    | { $value = ""; };

s_term returns [String value]:
    NON_TERM
    {
        String tokenName = $NON_TERM.text.replaceAll("[<>]", "");
        usedNonTerms.add(tokenName.toLowerCase());
        $value = tokenName;
    }
    | TERM
    {
        String tokenName = $TERM.text.replaceAll("[<>]", "");
        usedTerms.add(tokenName.toUpperCase());
        $value = tokenName;
    }
    | S_CHAR { $value = $S_CHAR.text; }
    | s_group { $value = $s_group.value; };

s_group returns [String value]:
    '(' e=s_expr ')' { $value = "(" + $e.value + ")"; }
    | '[' e=s_expr ']' { $value = "(" + $e.value + ")?"; }
    | '{' e=s_expr '}' { $value = "(" + $e.value + ")+"; };

l_section:
    L_START l_rule+ L_END;

l_rule:
    TERM EQUAL l_reg_exp ';'
    {
        String tokenName = $TERM.text.replaceAll("[<>]", "");
        declaredTerms.add(tokenName.toUpperCase());
        writeToFile(tokenName.toUpperCase() + " : " + $l_reg_exp.value + ";");
    };

l_reg_exp returns [String value]:
    { StringBuilder sb = new StringBuilder(); }
    (part1=l_reg_exp_part { sb.append($part1.value).append(" "); })+
        ('|' { sb.append("|"); }
            (part2=l_reg_exp_part { sb.append($part2.value).append(" "); })+
        )*
    { $value = sb.toString().trim(); };

l_reg_exp_part returns [String value]:
    l_atom l_quant?
    {
           if ($l_quant.text != null) {
               String q = $l_quant.text;
               if (q.matches("\\{\\d+,\\d+\\}")) {  // Caso {m,n}
                   String[] bounds = q.replaceAll("[{}]", "").split(",");
                   int min = Integer.parseInt(bounds[0]);
                   int max = Integer.parseInt(bounds[1]);
                   if (max > min) {
                       $value = String.join(" ", Collections.nCopies(min, $l_atom.value)) +
                                String.join(" ", Collections.nCopies(max - min, "(" + $l_atom.value + ")?"));
                   } else {
                       $value = String.join(" ", Collections.nCopies(min, $l_atom.value));
                   }
               } else if (q.matches("\\{\\d+,\\}")) {  // Caso {m,}
                   int min = Integer.parseInt(q.replaceAll("[{}]", "").split(",")[0]);
                   $value = String.join(" ", Collections.nCopies(min, $l_atom.value)) + " " + $l_atom.value + "*";
               } else if (q.matches("\\{\\d+\\}")) {  // Caso {m}
                   int count = Integer.parseInt(q.replaceAll("[{}]", ""));
                   $value = String.join(" ", Collections.nCopies(count, $l_atom.value));
               } else {
                   $value = $l_atom.value + q; // ?, +, *
               }
           } else {
               $value = $l_atom.value;
           }
    };

l_quant:
    '{' cifra1=CIFRA+ (',' cifra2=CIFRA+)? '}'
    {
        int min = Integer.parseInt($cifra1.text);
        int max = Integer.parseInt($cifra2.text);
        if (min > max) {
            System.err.println("Errore: Quantificatore non valido {" + min + "," + max + "}: il primo numero non può essere maggiore del secondo.");
        }
    }
    | QUANTIFICATORE;

l_atom returns [String value]:
    l_simple_atom { $value = $l_simple_atom.value; }
    | l_atom_group { $value = $l_atom_group.value; };

l_simple_atom returns [String value]:
    CHAR { $value = "'" + $CHAR.text + "'"; }
    | CIFRA { $value = "'" + $CIFRA.text + "'"; }
    | ESCAPE { $value = "'" + $ESCAPE.text + "'"; }
    | METACHAR { $value = "'" + $METACHAR.getText().charAt(1) + "'"; }
    | SHORTCUT
    {
         String shortcutText = $SHORTCUT.getText();
         switch (shortcutText) {
            case "\\w": $value = "[a-zA-Z0-9_]"; break;
            case "\\d": $value = "[0-9]"; break;
            case "\\s": $value = "[ \t\r\n]"; break;
            case "\\W": $value = "~[a-zA-Z0-9_]"; break;
            case "\\D": $value = "~[0-9]"; break;
            case "\\S": $value = "~[\t\r\n]"; break;
            default: $value = "'" + shortcutText + "'"; break;
         }
    }
    | '[' '^'? (l_interval | CHAR | CIFRA | ESCAPE | METACHAR)+ ']'
      {
          String textValue = $text;
          // Creiamo un pattern per trovare il backslash seguito da un carattere
          Pattern pattern = Pattern.compile("\\\\(.)");
          Matcher matcher = pattern.matcher(textValue);
          StringBuffer result = new StringBuffer();

          // Eseguiamo la sostituzione in base al tipo di carattere
          while (matcher.find()) {
              String matched = matcher.group(1);
              // Se è uno degli escape \r, \n, \t, manteniamo il backslash
              if (!(matched.equals("r") || matched.equals("n") || matched.equals("t"))) {
                  matcher.appendReplacement(result, matched);  // Rimuovi il backslash per i METACHAR
              }
          }
          matcher.appendTail(result);  // Aggiungiamo il resto della stringa
          textValue = result.toString();

      // Gestire il caso del negato '[^'
      if (textValue.startsWith("[^")) {
          textValue = "~[" + textValue.substring(2);
      }

      $value = textValue;
  };

l_atom_group returns [String value]:
    '(' s1=l_reg_exp ')' { $value = "(" + $s1.value + ")"; };

l_interval:
    (char1=(CHAR|CIFRA) '-' char2=(CHAR|CIFRA))
    {
        char startChar = $char1.text.charAt(0);
        char endChar = $char2.text.charAt(0);
        if (startChar > endChar) {
            System.err.println("Errore: Intervallo non valido '" + startChar + "-" + endChar + "': il primo carattere deve avere un valore ASCII minore o uguale al secondo.");
        }
    };

L_START: 'LEXER_START';
L_END: 'LEXER_END';
TERM: '<' [A-Z_]+ '>';
S_START: 'PARSER_START';
S_END: 'PARSER_END';
NON_TERM: '<' [a-z_]+ '>';
S_CHAR: '\'' ~['\r\n] '\'';
QUANTIFICATORE: '?' | '+' | '*';
CIFRA: [0-9];
CHAR: [a-zA-Z_];
METACHAR: '\\' ~[a-zA-Z0-9_];
SHORTCUT: '\\' [dDwWsS];
ESCAPE: '\\' [trn];
EQUAL: '::=';
WS: [ \t\r\n]+ -> skip;
