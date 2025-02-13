// Generated from C:/Users/fullm/IdeaProjects/Paradigmi_2025/src/main/antlr4/Grammar.g4 by ANTLR 4.13.2

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("CheckReturnValue")
public class MyVisitorJavaCC extends AbstractParseTreeVisitor<String> implements MyVisitorInterface {
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
            writer = new FileWriter("OutputGrammar.jj");
            writeToFile("grammar OutputGrammar;\n");
            writeToFile("@header {");
            writeToFile("  // Inserisci qui gli import");
            writeToFile("}\n");
            writeToFile("@members {");
            writeToFile("  // Inserisci qui il tuo codice");
            writeToFile("}\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void closeFile() {
        try {
            // OTTIMIZZAZIONI
            prodRules = manageRecursion(prodRulesBuffer);

            // SCRITTURE SUL FILE
            writeRulesToFile(prodRules,lexerRules);

            // CONTROLLO SEMANTICO: verifica che tutti i NON_TERM usati siano stati dichiarati
            for (String token : usedNonTerms) {
                if (!prodRulesBuffer.containsKey(token)) {
                    System.err.println("Errore: Il NON_TERM '" + token + "' è usato ma non dichiarato.");
                }
            }

            // CONTROLLO SEMANTICO: verifica che tutti i TERM usati siano stati dichiarati
            for (String token : usedTerms) {
                if (!lexerRules.containsKey(token)) {
                    System.err.println("Errore: Il TERM '" + token + "' è usato ma non dichiarato.");
                }
            }

            // CONTROLLO SEMANTICO: ricorsione indiretta sinistra
            checkIndirectLeftRecursion(prodRules);

            // CALCOLO DI METRICHE
            System.out.println("\nMETRICHE APPLICATE ALLA GRAMMATICA IN INPUT");
            calculateMetrics(prodRulesBuffer);
            System.out.println("\nMETRICHE APPLICATE ALLA GRAMMATICA IN OUTPUT");
            calculateMetrics(prodRules);

            if (writer != null) writer.close();

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
            sb.append(name.toLowerCase()).append(" : ");
            for(String rule: prodRules.get(name)) sb.append(rule).append(" | ");
            sb.setLength(sb.length() - 3);
            writeToFile(sb + " {");
            writeToFile("  // Inserisci qui le azioni semantiche");
            writeToFile("};\n");
        }
        writeToFile("TOKEN : {");
        int i = 0;
        for(String name: lexerRules.keySet()) {
            if (i == 0)
                writeToFile("   <" + name + " : " + lexerRules.get(name) + ">");
            else
                writeToFile("   | <" + name + " : " + lexerRules.get(name) + ">");
            i++;
        }
        writeToFile("}");
    }

    public static void calculateMetrics(Map<String,Set<String>> rules) {
        System.out.println("Numero di simboli terminali: " + lexerRules.size());
        System.out.println("Numero di simboli non terminali: " + rules.size());

        List<Integer> rhsValues = new ArrayList<>();
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

        Float avgAlternatives = (float) numProdRules / (float) prodRules.size();
        System.out.println("Numero medio di regole alternative di un simbolo non terminale: "
                + String.format("%.1f",avgAlternatives));
    }

    public static Map<String,Set<String>> manageRecursion(Map<String,Set<String>> prodRulesOld) {
        Map<String,Set<String>> prodRulesNew = new LinkedHashMap<>();
        for (String ruleName: prodRulesOld.keySet()) {
            List<String> recursiveParts = new ArrayList<>();
            List<String> nonRecursiveParts = new ArrayList<>();

            for(String rule: prodRulesOld.get(ruleName)) {
                rule = rule.trim();
                if (startsWithIgnoringBrackets(rule, ruleName)) {
                    recursiveParts.add(rule);
                }
                else {
                    nonRecursiveParts.add(rule);
                    String token = rule.split("\\s+")[0].replaceAll("[()?+*]", "");
                    dependencies.computeIfAbsent(ruleName, _ -> new HashSet<>()).add(token);
                }
            }

            Map<String,List<String>> newRules = new LinkedHashMap<>();
            if (!recursiveParts.isEmpty() && !nonRecursiveParts.isEmpty())
                newRules = removeLeftRecursion(ruleName, recursiveParts, nonRecursiveParts);
            else if (recursiveParts.isEmpty() && !nonRecursiveParts.isEmpty())
                newRules.put(ruleName, nonRecursiveParts);
            else if (!recursiveParts.isEmpty()) {
                newRules.put(ruleName, recursiveParts);
                System.err.println("La regola sintattica " + ruleName + " presenta una ricorsione diretta infinita");
            }

            for(String name: newRules.keySet())
                for(String rule: newRules.get(name))
                    prodRulesNew.computeIfAbsent(name, _ -> new HashSet<>()).add(rule);
        }

        return prodRulesNew;
    }

    public static Map<String,List<String>> removeLeftRecursion(String ruleName, List<String> recursiveParts, List<String> nonRecursiveParts) {
        List<String> buffer = new ArrayList<>();
        for(String rule: recursiveParts)
            buffer.add(cleanRule(rule, ruleName));
        String op = convertOperators(buffer.toArray(new String[0]));

        recursiveParts = new ArrayList<>();
        for (String s: buffer) {
            s = s.trim();
            while (startsWithIgnoringBrackets(s,"+") | startsWithIgnoringBrackets(s,"*") | startsWithIgnoringBrackets(s,"?")) {
                if (startsWithIgnoringBrackets(s,"+")) s = s.replaceFirst("\\+", "");
                else if (startsWithIgnoringBrackets(s,"*")) s = s.replaceFirst("\\*", "");
                else if (startsWithIgnoringBrackets(s,"?")) s = s.replaceFirst("\\?", "");
            }
            recursiveParts.add("(" + s.trim() + ")" + " " + ruleName + "_tail?");
        }

        buffer = new ArrayList<>();
        for(String s: nonRecursiveParts) {
            buffer.add("(" + s.trim() + ")" + op + " " + ruleName + "_tail?");
        }

        Map<String,List<String>> refactoredRules = new LinkedHashMap<>();
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
        List<String> chars = new ArrayList<>();
        for (String s: input) {
            s = s.trim();
            while (s.charAt(0) == '(') s = s.substring(1);
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
        String cleaned = input.replaceFirst("^[(]+\\s*", "");
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
        List<String> input;
        List<String> output = new ArrayList<>();
        boolean isSplittable = false;
        output.add(rule);
        if (findFirstOr(rule) != -1)
            isSplittable = true;
        while (isSplittable) {
            isSplittable = false;
            List<String> temp = output;
            output = new ArrayList<>();
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
        List<String> rules = new ArrayList<>();
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

            if (!sb.isEmpty() && !s.isEmpty()) sb.append(" ");
            s = s.trim();
            if (!op.isEmpty()) s = "(" + s + ")" + op;
            sb.append(s);

            if (!sb.isEmpty() && !end.isEmpty()) sb.append(" ");
            sb.append(end);

            rules.add(sb.toString());
        }
        return rules;
    }

    @Override
    public String visitStart(GrammarParser.StartContext ctx) {
        startFile();
        visitS_section(ctx.s_section());
        visitL_section(ctx.l_section());
        closeFile();
        return "";
    }

    @Override
    public String visitS_section(GrammarParser.S_sectionContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i++)
            if (ctx.getChild(i) instanceof GrammarParser.S_ruleContext part)
                visitS_rule(part);

        Map<String,Set<String>> prodRulesOld = new LinkedHashMap<>();
        for(String ruleName: prodRulesBuffer.keySet()) {
            List<String> rules = new ArrayList<>();
            for(String r1: prodRulesBuffer.get(ruleName)) {
                for(String r2: splitIgnoringBrackets(r1))
                    rules.addAll(splitInsideBrackets(r2));
            }
            prodRulesOld.put(ruleName, new HashSet<>(rules));
        }
        prodRulesBuffer = prodRulesOld;
        return "";
    }

    @Override
    public String visitS_rule(GrammarParser.S_ruleContext ctx) {
        String ruleName = ctx.NON_TERM().getText().replaceAll("[<>]", "");
        prodRulesBuffer.computeIfAbsent(ruleName, _ -> new HashSet<>()).add(visitS_expr(ctx.s_expr()).trim());
        return ctx.getText();
    }

    @Override
    public String visitS_expr(GrammarParser.S_exprContext ctx){
        StringBuilder sb = new StringBuilder();
        sb.append(visitS_seq(ctx.s_seq()));
        if (ctx.s_expr_aux() != null) {
            sb.append(" ");
            sb.append(visitS_expr_aux(ctx.s_expr_aux()));
        }
        return sb.toString().trim();
    }

    @Override
    public String visitS_seq(GrammarParser.S_seqContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(visitS_term(ctx.s_term()));
        if (ctx.s_seq() != null) {
            sb.append(" ");
            sb.append(visitS_seq(ctx.s_seq()));
        }
        return sb.toString().trim();
    }

    @Override
    public String visitS_expr_aux(GrammarParser.S_expr_auxContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("| ");
        sb.append(visitS_seq(ctx.s_seq()));
        if (ctx.s_expr_aux() != null) {
            sb.append(" ");
            sb.append(visitS_expr_aux(ctx.s_expr_aux()));
        }
        return sb.toString().trim();
    }

    @Override
    public String visitS_term(GrammarParser.S_termContext ctx) {
        if (ctx.s_atom() != null)
            return visitS_atom(ctx.s_atom());
        else if (ctx.s_brackets_atom() != null)
            return visitS_brackets_atom(ctx.s_brackets_atom());
        return "";
    }

    @Override
    public String visitS_atom(GrammarParser.S_atomContext ctx) {
        if (ctx.NON_TERM() != null) {
            String tokenName = ctx.NON_TERM().getText().replaceAll("[<>]", "").toLowerCase();
            usedNonTerms.add(tokenName); // Aggiungi alla lista dei non terminali usati
            return tokenName;
        } else if (ctx.TERM() != null) {
            String tokenName = ctx.TERM().getText().replaceAll("[<>]", "").toUpperCase();
            usedTerms.add(tokenName); // Aggiungi alla lista dei terminali usati
            return tokenName;
        } else if (ctx.S_CHAR() != null) {
            return ctx.S_CHAR().getText(); // Restituisci il testo del carattere speciale
        } else if (ctx.s_expr() != null) {
            return "(" + visitS_expr(ctx.s_expr()) + ")"; // Racchiudi il risultato tra parentesi
        }
        return ""; // Caso di fallback (non dovrebbe mai succedere)
    }

    @Override
    public String visitS_brackets_atom(GrammarParser.S_brackets_atomContext ctx) {
        String atomValue = visitS_atom(ctx.s_atom());
        if (ctx.getChild(0).getText().equals("[")) {
            if (ctx.getChildCount() > 3 && ctx.getChild(1).getText().equals("{")) {
                return atomValue + "*"; // Caso: {[s_atom]} -> s_atom*
            } else {
                return atomValue + "+"; // Caso: {s_atom} -> s_atom+
            }
        } else if (ctx.getChild(0).getText().equals("{")) {
            if (ctx.getChildCount() > 3 && ctx.getChild(1).getText().equals("[")) {
                return atomValue + "*"; // Caso: {[s_atom]} -> s_atom*
            } else {
                return atomValue + "+"; // Caso: {s_atom} -> s_atom+
            }
        }
        return atomValue;
    }

    @Override
    public String visitL_section(GrammarParser.L_sectionContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i++)
            if (ctx.getChild(i) instanceof GrammarParser.L_ruleContext part)
                visitL_rule(part);
        return "";
    }

    @Override
    public String visitL_rule(GrammarParser.L_ruleContext ctx) {
        String tokenName = ctx.TERM().getText().replaceAll("[<>]", "");
        String regExp = visitL_reg_exp(ctx.l_reg_exp());
        lexerRules.put(tokenName, regExp);
        return ctx.getText();
    }

    @Override
    public String visitL_reg_exp(GrammarParser.L_reg_expContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof GrammarParser.L_reg_exp_partContext part) {
                sb.append(visitL_reg_exp_part(part)).append(" ");
            } else if (ctx.getChild(i).getText().equals("|")) {
                sb.append("| ");
            }
        }
        return sb.toString().trim();
    }

    @Override
    public String visitL_reg_exp_part(GrammarParser.L_reg_exp_partContext ctx) {
        if (ctx.l_quant() != null) {
            String value;
            String q = ctx.l_quant().getText();
            if (q.matches("\\{\\d+,\\d+}")) {  // Caso {m,n}
                String[] bounds = q.replaceAll("[{}]", "").split(",");
                int min = Integer.parseInt(bounds[0]);
                int max = Integer.parseInt(bounds[1]);
                if (max > min) {
                    value = String.join(" ", Collections.nCopies(min, visitL_atom(ctx.l_atom()))) +
                            String.join(" ", Collections.nCopies(max - min, "(" + visitL_atom(ctx.l_atom()) + ")?"));
                } else {
                    value = String.join(" ", Collections.nCopies(min, visitL_atom(ctx.l_atom())));
                }
            } else if (q.matches("\\{\\d+,}")) {  // Caso {m,}
                int min = Integer.parseInt(q.replaceAll("[{}]", "").split(",")[0]);
                value = String.join(" ", Collections.nCopies(min, visitL_atom(ctx.l_atom()))) + " " + visitL_atom(ctx.l_atom()) + "*";
            } else if (q.matches("\\{\\d+}")) {  // Caso {m}
                int count = Integer.parseInt(q.replaceAll("[{}]", ""));
                value = String.join(" ", Collections.nCopies(count, visitL_atom(ctx.l_atom())));
            } else {
                String atomText = visitL_atom(ctx.l_atom());
                if (!atomText.startsWith("(") && !atomText.endsWith(")"))
                    atomText = "(" + atomText + ")";
                value = atomText + q; // ?, +, *
            }
            return value;
        } else {
            return visitL_atom(ctx.l_atom());
        }
    }

    @Override
    public String visitL_quant(GrammarParser.L_quantContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitL_atom(GrammarParser.L_atomContext ctx) {
        if (ctx.l_simple_atom() != null) {
            return visitL_simple_atom(ctx.l_simple_atom());
        } else if (ctx.l_atom_group() != null) {
            return visitL_atom_group(ctx.l_atom_group());
        } else return null;
    }

    @Override
    public String visitL_simple_atom(GrammarParser.L_simple_atomContext ctx) {
        if (ctx.getText().startsWith("[") && ctx.getText().endsWith("]")) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < ctx.getChildCount(); i++) {
                if (ctx.getChild(i).getText().equals("[")
                        || ctx.getChild(i).getText().equals("]")
                        || ctx.getChild(i).getText().equals("^"))
                    sb.append(ctx.getChild(i).getText());
                else if (ctx.getChild(i) instanceof GrammarParser.L_intervalContext interval)
                    sb.append(visitL_interval(interval)).append(",");
                else
                    sb.append("\"").append(ctx.getChild(i).getText()).append("\"").append(",");
            }
            String textValue = sb.toString();
            if (textValue.endsWith(",]")) textValue = textValue.replaceFirst(",]", "]");

            // Creiamo un pattern per trovare il backslash seguito da un carattere
            Pattern pattern = Pattern.compile("\\\\(.)");
            Matcher matcher = pattern.matcher(textValue);
            StringBuilder result = new StringBuilder();

            // Eseguiamo la sostituzione in base al tipo di carattere
            while (matcher.find()) {
                String matched = matcher.group(1);
                if (!(matched.equals("r") || matched.equals("n") || matched.equals("t"))) {
                    matcher.appendReplacement(result, matched); // Rimuove il backslash per i METACHAR
                }
            }
            matcher.appendTail(result);
            textValue = result.toString();

            // Gestire il caso del negato '[^'
            if (textValue.startsWith("[^")) {
                textValue = "~[" + textValue.substring(2);
            }

            return textValue;
        } else if (ctx.CHAR(0) != null) {
            return "\"" + ctx.CHAR(0).getText() + "\"";
        } else if (ctx.CIFRA(0) != null) {
            return "\"" + ctx.CIFRA(0).getText() + "\"";
        } else if (ctx.ESCAPE(0) != null) {
            return "\"" + ctx.ESCAPE(0).getText() + "\"";
        } else if (ctx.METACHAR(0) != null) {
            return "\"" + ctx.METACHAR(0).getText().charAt(1) + "\"";

        } else if (ctx.SHORTCUT() != null) {
            String shortcutText = ctx.SHORTCUT().getText();
            return switch (shortcutText) {
                case "\\w" -> "[\"a\"-\"z\",\"A\"-\"Z\",\"0\"-\"9\",\"_\"]";
                case "\\d" -> "[\"0\"-\"9\"]";
                case "\\s" -> "[\" \",\"\t\",\"\r\",\"\n\"]";
                case "\\W" -> "~[\"a\"-\"z\",\"A\"-\"Z\",\"0\"-\"9\",\"_\"]";
                case "\\D" -> "~[\"0\"-\"9\"]";
                case "\\S" -> "~[\"\t\",\"\r\",\"\n\"]";
                default -> "'" + shortcutText + "'";
            };
        } else return null; // Caso di fallback, non dovrebbe mai accadere
    }

    @Override
    public String visitL_atom_group(GrammarParser.L_atom_groupContext ctx) {
        return "(" + visitL_reg_exp(ctx.s1) + ")";
    }

    @Override
    public String visitL_interval(GrammarParser.L_intervalContext ctx) {
        String char1 = "\"" + ctx.getChild(0).getText() + "\"";
        String char2 = "\"" + ctx.getChild(2).getText() + "\"";
        return char1 + "-" + char2;
    }
}