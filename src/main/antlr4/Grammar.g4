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
    static Map<String, Set<String>> dependencies = new HashMap<>();

    public static void startFile() {
        try {
            writer = new FileWriter("OutputGrammar.g4");
            writer.write("grammar OutputGrammar;\n\n");
            writer.write("@header {\n");
            writer.write("  // Inserisci qui gli import\n");
            writer.write("}\n\n");
            writer.write("@members {\n");
            writer.write("  // Inserisci qui il tuo codice\n");
            writer.write("}\n\n");
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

            // Controllo per la ricorsione sinistra indiretta
            checkIndirectLeftRecursion();

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
    public static String[] removeLeftRecursion(String ruleName, String leftPart, String rightPart) {
        String nonRecursivePart = rightPart.trim();
        String recursivePart = cleanRule(leftPart, ruleName);
        char op = checkOperators(splitIgnoringParentheses(recursivePart));
        StringBuilder buffer = new StringBuilder();
        for (String s: splitIgnoringParentheses(recursivePart)) {
            s = s.trim();
            while (startsWithIgnoringBrackets(s,"+") | startsWithIgnoringBrackets(s,"*") | startsWithIgnoringBrackets(s,"?")) {
                if (startsWithIgnoringBrackets(s,"+")) s = s.replaceFirst("\\+", "");
                else if (startsWithIgnoringBrackets(s,"*")) s = s.replaceFirst("\\*", "");
                else if (startsWithIgnoringBrackets(s,"?")) s = s.replaceFirst("\\?", "");
            }
            if (buffer.length() > 0) buffer.append(" | ");
            buffer.append(s);
        }
        recursivePart = buffer.toString();
        String rule1 = ruleName + " : " + "(" + nonRecursivePart + ")" + op + " " + ruleName + "_tail?";
        String rule2 = ruleName + "_tail" + " : " + "(" + recursivePart + ")" + " " + ruleName + "_tail?";
        return new String[]{rule1, rule2};
    }

    public static String cleanRule(String leftPart, String ruleName) {
        String result = leftPart.replace(ruleName,"").trim();
        String regex = "\\(\\s*([?+*]*)\\s*\\)";
        // Ciclo per rimuovere ripetutamente le parentesi e i simboli
        while (result.matches(".*" + regex + ".*")) {
            result = result.replaceFirst(regex, "$1").trim();
        }
        return result;
    }

    public static char checkOperators(String[] input) {
        List<String> chars = new ArrayList<String>();
        for (String s: input) {
            s = s.trim();
            while (s.charAt(0) == '(') s = s.substring(1,s.length());
            String op = s.substring(0,1);
            if (op.equals("*") | op.equals("+") | op.equals("?")) chars.add(op);
        }
        if (chars.contains("?") && !chars.contains("+") && !chars.contains("*"))
            return '?';
        else if (!chars.contains("?") && chars.contains("+") && !chars.contains("*"))
            return '+';
        else if (chars.contains("?") && chars.contains("+") || chars.contains("*"))
            return '*';
        else
            return ' ';
    }

    public static String[] splitIgnoringParentheses(String input) {
        List<String> parts = new ArrayList<>();
        int openParentheses = 0;
        int lastSplitIndex = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '(') {
                openParentheses++;
            } else if (c == ')') {
                openParentheses--;
            } else if (c == '|' && openParentheses == 0) {
                parts.add(input.substring(lastSplitIndex, i));
                lastSplitIndex = i + 1;
            }
        }

        // Aggiunge l'ultima parte della stringa
        parts.add(input.substring(lastSplitIndex));

        return parts.toArray(new String[0]);
    }

    public static boolean startsWithIgnoringBrackets(String input, String prefix) {
        // Rimuove parentesi tonde, quadre e graffe iniziali con eventuali spazi
        String cleaned = input.replaceFirst("^[\\(]+\\s*", "");
        return cleaned.startsWith(prefix);
    }

    public static void checkIndirectLeftRecursion() {
        for (String rule : declaredNonTerms) {
            Set<String> visited = new HashSet<>();
            if (hasIndirectLeftRecursion(rule, rule, visited)) {
                System.err.println("Warning: Ricorsione sinistra indiretta trovata in " + rule);
            }
        }
    }

    private static boolean hasIndirectLeftRecursion(String start, String current, Set<String> visited) {
        if (!dependencies.containsKey(current)) return false;
        if (visited.contains(current)) return false; // Evita cicli infiniti

        visited.add(current);
        for (String next : dependencies.get(current)) {
            if (next.equals(start)) return true; // Abbiamo trovato un ciclo che riporta alla regola iniziale
            if (hasIndirectLeftRecursion(start, next, visited)) return true;
        }
        return false;
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

        for(String rule: splitIgnoringParentheses($s_expr.value.trim())) {
            rule = rule.trim();
            if (startsWithIgnoringBrackets(rule, ruleName)) {
                if (recursiveParts.length() > 0) recursiveParts.append(" | ");
                recursiveParts.append(rule);
            }
            else {
                if (nonRecursiveParts.length() > 0) nonRecursiveParts.append(" | ");
                nonRecursiveParts.append(rule);
                String token = rule.split("\\s+")[0].replaceAll("[\\(\\)\\?\\+\\*]", "");
                if (token != null)
                    dependencies.computeIfAbsent(ruleName, k -> new HashSet<>()).add(token);
            }
        }

        String leftPart = recursiveParts.toString();
        String rightPart = nonRecursiveParts.toString();

        List<String> rules = new ArrayList<String>();

        if (leftPart.length() > 0 && rightPart.length() > 0)
            rules = Arrays.asList(removeLeftRecursion(ruleName, leftPart, rightPart));
        else if (leftPart.length() == 0 && rightPart.length() > 0)
            rules.add(ruleName.toLowerCase() + " : " + rightPart);
        else if (leftPart.length() > 0 && rightPart.length() == 0) {
            rules.add(ruleName.toLowerCase() + " : " + leftPart);
            System.err.println("La regola sintattica " + ruleName + " presenta una ricorsione diretta infinita");
        }

        for(String rule: rules) {
            writeToFile(rule + " {");
            writeToFile("  // Inserisci qui le azioni semantiche");
            writeToFile("};\n");
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
    e=s_atom { $value = $s_atom.value; }
    | s_brackets_atom { $value = $s_brackets_atom.value; };

s_atom returns [String value]:
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
    | '(' e=s_expr ')' { $value = "(" + $e.value + ")"; };

s_brackets_atom returns [String value]:
    '[' e=s_atom ']' { $value = $e.value + "?"; }
    | '{' e=s_atom '}' { $value = $e.value + "+"; }
    | '{' '[' e=s_atom ']' '}' { $value = $e.value + "*"; }
    | '[' '{' e=s_atom '}' ']' { $value = $e.value + "*"; };

l_section:
    L_START l_rule+ L_END;

l_rule:
    TERM EQUAL l_reg_exp ';'
    {
        String tokenName = $TERM.text.replaceAll("[<>]", "");
        declaredTerms.add(tokenName.toUpperCase());
        if (tokenName.equals("SKIP_")) writeToFile(tokenName.toUpperCase() + " : " + $l_reg_exp.value + " -> skip;");
        else writeToFile(tokenName.toUpperCase() + " : " + $l_reg_exp.value + ";");
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
TERM: '<' [A-Z][A-Z_]+ '>';
S_START: 'PARSER_START';
S_END: 'PARSER_END';
NON_TERM: '<' [a-z][a-z_]+ '>';
S_CHAR: '\'' ~['\r\n] '\'';
QUANTIFICATORE: '?' | '+' | '*';
CIFRA: [0-9];
CHAR: [a-zA-Z_];
METACHAR: '\\' ~[a-zA-Z0-9_];
SHORTCUT: '\\' [dDwWsS];
ESCAPE: '\\' [trn];
EQUAL: '::=';
WS: [ \t\r\n]+ -> skip;
