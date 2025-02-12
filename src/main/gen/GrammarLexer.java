// Generated from C:/Users/fullm/IdeaProjects/Paradigmi_2025/src/main/antlr4/Grammar.g4 by ANTLR 4.13.2

    import java.io.*;
    import java.util.*;
    import java.util.regex.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, L_START=12, L_END=13, TERM=14, S_START=15, S_END=16, 
		NON_TERM=17, S_CHAR=18, QUANTIFICATORE=19, CIFRA=20, CHAR=21, METACHAR=22, 
		SHORTCUT=23, ESCAPE=24, EQUAL=25, WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "L_START", "L_END", "TERM", "S_START", "S_END", "NON_TERM", 
			"S_CHAR", "QUANTIFICATORE", "CIFRA", "CHAR", "METACHAR", "SHORTCUT", 
			"ESCAPE", "EQUAL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'|'", "'('", "')'", "'['", "']'", "'{'", "'}'", "','", 
			"'^'", "'-'", "'LEXER_START'", "'LEXER_END'", null, "'PARSER_START'", 
			"'PARSER_END'", null, null, null, null, null, null, null, null, "'::='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"L_START", "L_END", "TERM", "S_START", "S_END", "NON_TERM", "S_CHAR", 
			"QUANTIFICATORE", "CIFRA", "CHAR", "METACHAR", "SHORTCUT", "ESCAPE", 
			"EQUAL", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	    static FileWriter writer;
	    static Set<String> declaredNonTerms = new HashSet<>();
	    static Set<String> declaredTerms = new HashSet<>();
	    static Set<String> usedNonTerms = new HashSet<>();
	    static Set<String> usedTerms = new HashSet<>();
	    static Map<String, Set<String>> prodRulesBuffer = new LinkedHashMap<>();
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

	            System.out.println("Numero di simboli terminali: " + declaredTerms.size());
	            System.out.println("Numero di simboli non terminali: " + declaredNonTerms.size());

	            List<Integer> rhsValues = new ArrayList<Integer>();
	            int numProdRules = 0;
	            for(String sxRule: prodRules.keySet()) {
	                numProdRules = numProdRules + prodRules.get(sxRule).size();
	                for (String dxRule: prodRules.get(sxRule))
	                    rhsValues.add(dxRule.split("\\s+").length);
	            }
	            System.out.println("Numero di prodRulesBuffer di produzione: " + numProdRules);
	            System.out.println("Numero di prodRulesBuffer con RHS unitario: " + rhsValues.stream().filter(i -> i.equals(1)).count());
	            System.out.println("RHS massimo: " + Collections.max(rhsValues));
	            System.out.println("RHS medio: " + rhsValues.stream().mapToInt(val -> val).average().orElse(0.0));

	            Float avgAlternatives = Float.valueOf(numProdRules) / Float.valueOf(prodRules.keySet().size());
	            System.out.println("Numero medio di alternative di una regola: " + String.format(Locale.US,"%.1f",avgAlternatives));

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
	    public static Map<String,List<String>> removeLeftRecursion(String ruleName, List<String> recursiveParts, List<String> nonRecursiveParts) {

	        List<String> buffer = new ArrayList<String>();
	        for(String rule: recursiveParts)
	            buffer.add(cleanRule(rule, ruleName));
	        String op = checkOperators(buffer.toArray(new String[0]));

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

	    public static String checkOperators(String[] input) {
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

	        parts.add(input.substring(lastSplitIndex));
	        return parts.toArray(new String[0]);
	    }

	    public static boolean startsWithIgnoringBrackets(String input, String prefix) {
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

	            /*String regex = "[?+*]{2,}";
	            Pattern pattern = Pattern.compile(regex);
	            Matcher matcher = pattern.matcher(s);
	            String result = matcher.replaceAll(match -> {
	                String[] operators = match.group().split("");
	                return checkOperators(operators);
	            });
	            sb.append(result);*/

	            if (sb.length()>0 && end.length()>0) sb.append(" ");
	            sb.append(end);

	            rules.add(sb.toString());
	        }
	        return rules;
	    }    


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001a\u00ab\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\re\b\r\n\r\f\rh\t\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0087\b\u0010\n\u0010"+
		"\f\u0010\u008a\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0004\u0019\u00a6\b\u0019"+
		"\u000b\u0019\f\u0019\u00a7\u0001\u0019\u0001\u0019\u0000\u0000\u001a\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u00181\u00193\u001a\u0001\u0000\f\u0001\u0000AZ\u0002\u0000AZ__\u0001"+
		"\u0000az\u0002\u0000__az\u0003\u0000\n\n\r\r\'\'\u0002\u0000*+??\u0001"+
		"\u000009\u0003\u0000AZ__az\u0004\u000009AZ__az\u0006\u0000DDSSWWddssw"+
		"w\u0003\u0000nnrrtt\u0003\u0000\t\n\r\r  \u00ad\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00015\u0001"+
		"\u0000\u0000\u0000\u00037\u0001\u0000\u0000\u0000\u00059\u0001\u0000\u0000"+
		"\u0000\u0007;\u0001\u0000\u0000\u0000\t=\u0001\u0000\u0000\u0000\u000b"+
		"?\u0001\u0000\u0000\u0000\rA\u0001\u0000\u0000\u0000\u000fC\u0001\u0000"+
		"\u0000\u0000\u0011E\u0001\u0000\u0000\u0000\u0013G\u0001\u0000\u0000\u0000"+
		"\u0015I\u0001\u0000\u0000\u0000\u0017K\u0001\u0000\u0000\u0000\u0019W"+
		"\u0001\u0000\u0000\u0000\u001ba\u0001\u0000\u0000\u0000\u001dk\u0001\u0000"+
		"\u0000\u0000\u001fx\u0001\u0000\u0000\u0000!\u0083\u0001\u0000\u0000\u0000"+
		"#\u008d\u0001\u0000\u0000\u0000%\u0091\u0001\u0000\u0000\u0000\'\u0093"+
		"\u0001\u0000\u0000\u0000)\u0095\u0001\u0000\u0000\u0000+\u0097\u0001\u0000"+
		"\u0000\u0000-\u009a\u0001\u0000\u0000\u0000/\u009d\u0001\u0000\u0000\u0000"+
		"1\u00a0\u0001\u0000\u0000\u00003\u00a5\u0001\u0000\u0000\u000056\u0005"+
		";\u0000\u00006\u0002\u0001\u0000\u0000\u000078\u0005|\u0000\u00008\u0004"+
		"\u0001\u0000\u0000\u00009:\u0005(\u0000\u0000:\u0006\u0001\u0000\u0000"+
		"\u0000;<\u0005)\u0000\u0000<\b\u0001\u0000\u0000\u0000=>\u0005[\u0000"+
		"\u0000>\n\u0001\u0000\u0000\u0000?@\u0005]\u0000\u0000@\f\u0001\u0000"+
		"\u0000\u0000AB\u0005{\u0000\u0000B\u000e\u0001\u0000\u0000\u0000CD\u0005"+
		"}\u0000\u0000D\u0010\u0001\u0000\u0000\u0000EF\u0005,\u0000\u0000F\u0012"+
		"\u0001\u0000\u0000\u0000GH\u0005^\u0000\u0000H\u0014\u0001\u0000\u0000"+
		"\u0000IJ\u0005-\u0000\u0000J\u0016\u0001\u0000\u0000\u0000KL\u0005L\u0000"+
		"\u0000LM\u0005E\u0000\u0000MN\u0005X\u0000\u0000NO\u0005E\u0000\u0000"+
		"OP\u0005R\u0000\u0000PQ\u0005_\u0000\u0000QR\u0005S\u0000\u0000RS\u0005"+
		"T\u0000\u0000ST\u0005A\u0000\u0000TU\u0005R\u0000\u0000UV\u0005T\u0000"+
		"\u0000V\u0018\u0001\u0000\u0000\u0000WX\u0005L\u0000\u0000XY\u0005E\u0000"+
		"\u0000YZ\u0005X\u0000\u0000Z[\u0005E\u0000\u0000[\\\u0005R\u0000\u0000"+
		"\\]\u0005_\u0000\u0000]^\u0005E\u0000\u0000^_\u0005N\u0000\u0000_`\u0005"+
		"D\u0000\u0000`\u001a\u0001\u0000\u0000\u0000ab\u0005<\u0000\u0000bf\u0007"+
		"\u0000\u0000\u0000ce\u0007\u0001\u0000\u0000dc\u0001\u0000\u0000\u0000"+
		"eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000gi\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0005>\u0000"+
		"\u0000j\u001c\u0001\u0000\u0000\u0000kl\u0005P\u0000\u0000lm\u0005A\u0000"+
		"\u0000mn\u0005R\u0000\u0000no\u0005S\u0000\u0000op\u0005E\u0000\u0000"+
		"pq\u0005R\u0000\u0000qr\u0005_\u0000\u0000rs\u0005S\u0000\u0000st\u0005"+
		"T\u0000\u0000tu\u0005A\u0000\u0000uv\u0005R\u0000\u0000vw\u0005T\u0000"+
		"\u0000w\u001e\u0001\u0000\u0000\u0000xy\u0005P\u0000\u0000yz\u0005A\u0000"+
		"\u0000z{\u0005R\u0000\u0000{|\u0005S\u0000\u0000|}\u0005E\u0000\u0000"+
		"}~\u0005R\u0000\u0000~\u007f\u0005_\u0000\u0000\u007f\u0080\u0005E\u0000"+
		"\u0000\u0080\u0081\u0005N\u0000\u0000\u0081\u0082\u0005D\u0000\u0000\u0082"+
		" \u0001\u0000\u0000\u0000\u0083\u0084\u0005<\u0000\u0000\u0084\u0088\u0007"+
		"\u0002\u0000\u0000\u0085\u0087\u0007\u0003\u0000\u0000\u0086\u0085\u0001"+
		"\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008b\u0001"+
		"\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008c\u0005"+
		">\u0000\u0000\u008c\"\u0001\u0000\u0000\u0000\u008d\u008e\u0005\'\u0000"+
		"\u0000\u008e\u008f\b\u0004\u0000\u0000\u008f\u0090\u0005\'\u0000\u0000"+
		"\u0090$\u0001\u0000\u0000\u0000\u0091\u0092\u0007\u0005\u0000\u0000\u0092"+
		"&\u0001\u0000\u0000\u0000\u0093\u0094\u0007\u0006\u0000\u0000\u0094(\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0007\u0007\u0000\u0000\u0096*\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0005\\\u0000\u0000\u0098\u0099\b\b\u0000\u0000"+
		"\u0099,\u0001\u0000\u0000\u0000\u009a\u009b\u0005\\\u0000\u0000\u009b"+
		"\u009c\u0007\t\u0000\u0000\u009c.\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0005\\\u0000\u0000\u009e\u009f\u0007\n\u0000\u0000\u009f0\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0005:\u0000\u0000\u00a1\u00a2\u0005:\u0000\u0000"+
		"\u00a2\u00a3\u0005=\u0000\u0000\u00a32\u0001\u0000\u0000\u0000\u00a4\u00a6"+
		"\u0007\u000b\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0006\u0019\u0000\u0000\u00aa4\u0001\u0000\u0000\u0000\u0004\u0000f\u0088"+
		"\u00a7\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}