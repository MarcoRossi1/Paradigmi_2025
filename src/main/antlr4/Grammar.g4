grammar Grammar;

@header {
    import java.io.*;
    import java.util.*;
    import java.util.regex.*;
}

@members {
    static FileWriter writer;

    static Map<String, String> lexerRules = new LinkedHashMap<>();
    static Set<String> usedNonTerms = new HashSet<>();
    static Set<String> usedTerms = new HashSet<>();

    // INPUT
    static Map<String, Set<String>> prodRulesBuffer = new LinkedHashMap<>();

    // OUTPUT
    static Map<String, Set<String>> prodRules = new LinkedHashMap<>();
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
            prodRules = manageRecursion(prodRulesBuffer);
            writeRulesToFile(prodRules,lexerRules);

            if (writer != null) {
                writer.close();
            }

            // Controllo semantico: verifica che tutti i NON_TERM usati siano stati dichiarati
            for (String token : usedNonTerms) {
                if (!prodRulesBuffer.keySet().contains(token)) {
                    System.err.println("Errore: Il NON_TERM '" + token + "' è usato ma non dichiarato.");
                }
            }

            // Controllo semantico: verifica che tutti i TERM usati siano stati dichiarati
            for (String token : usedTerms) {
                if (!lexerRules.keySet().contains(token)) {
                    System.err.println("Errore: Il TERM '" + token + "' è usato ma non dichiarato.");
                }
            }

            checkIndirectLeftRecursion(prodRules);
            System.out.println("\nMETRICHE APPLICATE ALLA GRAMMATICA IN INPUT");
            calculateMetrics(prodRulesBuffer);
            System.out.println("\nMETRICHE APPLICATE ALLA GRAMMATICA IN OUTPUT");
            calculateMetrics(prodRules);


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

    public static void writeRulesToFile(Map<String,Set<String>> prodRules, Map<String,String> lexerRules) {
        for(String name: prodRules.keySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(name.toLowerCase() + " : ");
            for(String rule: prodRules.get(name)) sb.append(rule + " | ");
            sb.setLength(sb.length() - 3);
            writeToFile(sb.toString() + " {");
            writeToFile("  // Inserisci qui le azioni semantiche");
            writeToFile("};\n");
        }
        for(String name: lexerRules.keySet()) {
            writeToFile(name + " : " + lexerRules.get(name) + ";");
        }
    }

    public static void calculateMetrics(Map<String,Set<String>> rules) {
        System.out.println("Numero di simboli terminali: " + lexerRules.keySet().size());
        System.out.println("Numero di simboli non terminali: " + rules.keySet().size());

        List<Integer> rhsValues = new ArrayList<Integer>();
        int numProdRules = 0;
        for(String sxRule: rules.keySet()) {
            numProdRules = numProdRules + rules.get(sxRule).size();
            for (String dxRule: rules.get(sxRule))
                rhsValues.add(dxRule.split("\\s+").length);
        }

        System.out.println("Numero di regole di produzione: " + numProdRules);
        System.out.println("Numero di regole di produzione con RHS unitario: "
            + rhsValues.stream().filter(i -> i.equals(1)).count());
        System.out.println("RHS massimo: " + Collections.max(rhsValues));
        double rhsAverage = rhsValues.stream().mapToInt(val -> val).average().orElse(0.0);
        System.out.println("RHS medio: " + String.format("%.1f", rhsAverage));

        Float avgAlternatives = Float.valueOf(numProdRules) / Float.valueOf(prodRules.keySet().size());
        System.out.println("Numero medio di regole alternative di un simbolo non terminale: "
            + String.format("%.1f",avgAlternatives));
    }

    public static Map<String,Set<String>> manageRecursion(Map<String,Set<String>> prodRulesOld) {
        Map<String,Set<String>> prodRulesNew = new LinkedHashMap<String,Set<String>>();
        for (String ruleName: prodRulesOld.keySet()) {
            List<String> recursiveParts = new ArrayList<String>();
            List<String> nonRecursiveParts = new ArrayList<String>();

            for(String rule: prodRulesOld.get(ruleName)) {
                rule = rule.trim();
                if (startsWithIgnoringBrackets(rule, ruleName)) {
                    recursiveParts.add(rule);
                }
                else {
                    nonRecursiveParts.add(rule);
                    String token = rule.split("\\s+")[0].replaceAll("[\\(\\)\\?\\+\\*]", "");
                    if (token != null) dependencies.computeIfAbsent(ruleName, k -> new HashSet<>()).add(token);
                }
            }

            Map<String,List<String>> newRules = new LinkedHashMap<String,List<String>>();
            if (recursiveParts.size() > 0 && nonRecursiveParts.size() > 0)
                newRules = removeLeftRecursion(ruleName, recursiveParts, nonRecursiveParts);
            else if (recursiveParts.size() == 0 && nonRecursiveParts.size() > 0)
                newRules.put(ruleName, nonRecursiveParts);
            else if (recursiveParts.size() > 0 && nonRecursiveParts.size() == 0) {
                newRules.put(ruleName, recursiveParts);
                System.err.println("La regola sintattica " + ruleName + " presenta una ricorsione diretta infinita");
            }

            for(String name: newRules.keySet())
                for(String rule: newRules.get(name))
                    prodRulesNew.computeIfAbsent(name, k -> new HashSet<>()).add(rule);
        }
        
        return prodRulesNew;
    }

    public static Map<String,List<String>> removeLeftRecursion(String ruleName, List<String> recursiveParts, List<String> nonRecursiveParts) {
        List<String> buffer = new ArrayList<String>();
        for(String rule: recursiveParts)
            buffer.add(cleanRule(rule, ruleName));
        String op = convertOperators(buffer.toArray(new String[0]));

        recursiveParts = new ArrayList<String>();
        for (String s: buffer) {
            s = s.trim();
            while (startsWithIgnoringBrackets(s,"+") | startsWithIgnoringBrackets(s,"*") | startsWithIgnoringBrackets(s,"?")) {
                if (startsWithIgnoringBrackets(s,"+")) s = s.replaceFirst("\\+", "");
                else if (startsWithIgnoringBrackets(s,"*")) s = s.replaceFirst("\\*", "");
                else if (startsWithIgnoringBrackets(s,"?")) s = s.replaceFirst("\\?", "");
            }
            recursiveParts.add("(" + s.trim() + ")" + " " + ruleName + "_tail?");
        }

        buffer = new ArrayList<String>();
        for(String s: nonRecursiveParts) {
            buffer.add("(" + s.trim() + ")" + op + " " + ruleName + "_tail?");
        }

        Map<String,List<String>> refactoredRules = new LinkedHashMap<String,List<String>>();
        refactoredRules.put(ruleName,buffer);
        refactoredRules.put((ruleName+"_tail"),recursiveParts);
        return refactoredRules;
    }

    public static String cleanRule(String leftPart, String ruleName) {
        String result = leftPart.replaceFirst(ruleName,"").trim();
        String regex = "\\(\\s*([?+*]*)\\s*\\)";
        // Ciclo per rimuovere ripetutamente le parentesi
        while (result.matches(".*" + regex + ".*")) {
            result = result.replaceFirst(regex, "$1").trim();
        }
        return result;
    }

    public static String convertOperators(String[] input) {
        List<String> chars = new ArrayList<String>();
        for (String s: input) {
            s = s.trim();
            while (s.charAt(0) == '(') s = s.substring(1,s.length());
            String op = s.substring(0,1);
            if (op.equals("*") | op.equals("+") | op.equals("?")) chars.add(op);
        }
        if (chars.contains("?") && !chars.contains("+") && !chars.contains("*"))
            return "?";
        else if (!chars.contains("?") && chars.contains("+") && !chars.contains("*"))
            return "+";
        else if (chars.contains("?") && chars.contains("+") || chars.contains("*"))
            return "*";
        else
            return "";
    }

    public static String[] splitIgnoringBrackets(String input) {
        List<String> parts = new ArrayList<>();
        int openParentheses = 0;
        int lastSplitIndex = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '(') {
                openParentheses++;
            } else if (c == ')') {
                openParentheses--;
            } else if (c == '|' && openParentheses == 0 &&
                ((i==0 || input.charAt(i-1)!='\'') ||
                (i==input.length()-1 || input.charAt(i+1)!='\''))) {
                parts.add(input.substring(lastSplitIndex, i));
                lastSplitIndex = i + 1;
            }
        }

        parts.add(input.substring(lastSplitIndex).trim());
        return parts.toArray(new String[0]);
    }

    public static boolean startsWithIgnoringBrackets(String input, String prefix) {
        String cleaned = input.replaceFirst("^[\\(]+\\s*", "");
        return cleaned.startsWith(prefix);
    }

    public static void checkIndirectLeftRecursion(Map<String,Set<String>> rules) {
        for (String rule : rules.keySet()) {
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

    private static List<String> splitInsideBrackets(String rule) {
        List<String> input = new ArrayList<String>();
        List<String> output = new ArrayList<String>();
        boolean isSplittable = false;
        output.add(rule);
        if (findFirstOr(rule) != -1)
            isSplittable = true;
        while (isSplittable) {
            isSplittable = false;
            List<String> temp = output;
            output = new ArrayList<String>();
            input = temp;
            for(String s: input)
                output.addAll(refactorBrackets(s));
            for (String s: output) {
                if (findFirstOr(s) != -1) {
                    isSplittable = true;
                    break;
                }
            }
        }
        return output;
    }

    public static int findOpenBracket(String input, int index) {
        for (int i = index; i >= 0; i--) {
            char currentChar = input.charAt(i);
            if (currentChar == '(')
                if ((i==0 || input.charAt(i-1)!='\'') || (i==input.length()-1 || input.charAt(i+1)!='\''))
                    return i;
        }
        return -1;
    }

    public static int findClosedBracket(String input, int index) {
        for (int i = index; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == ')')
                if ((i==0 || input.charAt(i-1)!='\'') || (i==input.length()-1 || input.charAt(i+1)!='\''))
                    return i;
        }
        return -1;
    }

    public static int findFirstOr(String input) {
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == '|')
                if ((i==0 || input.charAt(i-1)!='\'') || (i==input.length()-1 || input.charAt(i+1)!='\''))
                    return i;
        }
        return -1;
    }
    
    public static List<String> refactorBrackets(String input) {
        List<String> rules = new ArrayList<String>();
        input = input.trim();

        int orIdx = findFirstOr(input);
        if (orIdx == -1) {
            rules.add(input);
            return rules;
        }
        
        int startIdx = findOpenBracket(input, orIdx);
        int endIdx = findClosedBracket(input, orIdx);
        if (startIdx == -1 || endIdx == -1 || startIdx > endIdx) {
            rules.add(input);
            return rules;
        }

        String start = input.substring(0, startIdx).trim();
        String middle = input.substring(startIdx + 1, endIdx).trim();
        String end;
        String op;

        if (input.length() > endIdx+1) {
            op = String.valueOf(input.charAt(endIdx+1));
        }
        else
            op = "";

        if (!op.equals("*") && !op.equals("+") && !op.equals("?")) {
            end = input.substring(endIdx + 1).trim();
            op = "";
        }
        else
            end = input.substring(endIdx + 2).trim();

        for(String s: splitIgnoringBrackets(middle)) {
            StringBuilder sb = new StringBuilder();
            sb.append(start);

            if (sb.length()>0 && s.length()>0) sb.append(" ");
            s = s.trim();
            if (!op.equals("")) s = "(" + s + ")" + op;
            sb.append(s);

            if (sb.length()>0 && end.length()>0) sb.append(" ");
            sb.append(end);

            rules.add(sb.toString());
        }
        return rules;
    }    
}

start:
    { startFile(); }
    s_section l_section EOF
    { closeFile(); };

s_section:
    S_START s_rule+ S_END {
        Map<String,Set<String>> prodRulesOld = new LinkedHashMap<String,Set<String>>();
        for(String ruleName: prodRulesBuffer.keySet()) {
            List<String> rules = new ArrayList<String>();
            for(String r1: prodRulesBuffer.get(ruleName)) {
                for(String r2: splitIgnoringBrackets(r1))
                    rules.addAll(splitInsideBrackets(r2));
            }
            prodRulesOld.put(ruleName, new HashSet<String>(rules));
        }
        prodRulesBuffer = prodRulesOld;
    };

s_rule:
    NON_TERM EQUAL s_expr ';'
    {
        String ruleName = $NON_TERM.text.replaceAll("[<>]", "");
        prodRulesBuffer.computeIfAbsent(ruleName, k -> new HashSet<>()).add($s_expr.value.trim());
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
        String regExp = $l_reg_exp.value;
        if (tokenName.equals("SKIP_")) regExp = $l_reg_exp.value + " -> skip";
        lexerRules.put(tokenName, regExp);
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
TERM: '<' [A-Z][A-Z_]* '>';
S_START: 'PARSER_START';
S_END: 'PARSER_END';
NON_TERM: '<' [a-z][a-z_]* '>';
S_CHAR: '\'' ~['\r\n] '\'';
QUANTIFICATORE: '?' | '+' | '*';
CIFRA: [0-9];
CHAR: [a-zA-Z_];
METACHAR: '\\' ~[a-zA-Z0-9_];
SHORTCUT: '\\' [dDwWsS];
ESCAPE: '\\' [trn];
EQUAL: '::=';
WS: [ \t\r\n]+ -> skip;
