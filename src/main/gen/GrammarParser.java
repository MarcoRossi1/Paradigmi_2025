// Generated from C:/Users/fullm/IdeaProjects/Paradigmi_2025/src/main/antlr4/Grammar.g4 by ANTLR 4.13.2

    import java.io.*;
    import java.util.*;
    import java.util.regex.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, L_START=12, L_END=13, TERM=14, S_START=15, S_END=16, 
		NON_TERM=17, S_CHAR=18, QUANTIFICATORE=19, CIFRA=20, CHAR=21, METACHAR=22, 
		SHORTCUT=23, ESCAPE=24, EQUAL=25, WS=26;
	public static final int
		RULE_start = 0, RULE_s_section = 1, RULE_s_rule = 2, RULE_s_expr = 3, 
		RULE_s_seq = 4, RULE_s_expr_aux = 5, RULE_s_term = 6, RULE_s_atom = 7, 
		RULE_s_brackets_atom = 8, RULE_l_section = 9, RULE_l_rule = 10, RULE_l_reg_exp = 11, 
		RULE_l_reg_exp_part = 12, RULE_l_quant = 13, RULE_l_atom = 14, RULE_l_simple_atom = 15, 
		RULE_l_atom_group = 16, RULE_l_interval = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "s_section", "s_rule", "s_expr", "s_seq", "s_expr_aux", "s_term", 
			"s_atom", "s_brackets_atom", "l_section", "l_rule", "l_reg_exp", "l_reg_exp_part", 
			"l_quant", "l_atom", "l_simple_atom", "l_atom_group", "l_interval"
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

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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
	            buffer.add(rule.replaceFirst(ruleName,""));
	        String op = checkOperators(buffer.toArray(new String[0]));

	        recursiveParts = new ArrayList<String>();
	        for (String s: buffer) {
	            s = s.trim();
	            while (startsWithIgnoringBrackets(s,"+") | startsWithIgnoringBrackets(s,"*") | startsWithIgnoringBrackets(s,"?")) {
	                if (startsWithIgnoringBrackets(s,"+")) s = s.replaceFirst("\\+", "");
	                else if (startsWithIgnoringBrackets(s,"*")) s = s.replaceFirst("\\*", "");
	                else if (startsWithIgnoringBrackets(s,"?")) s = s.replaceFirst("\\?", "");
	            }
	            recursiveParts.add("(" + s + ")" + " " + ruleName + "_tail?");
	        }

	        buffer = new ArrayList<String>();
	        for(String s: nonRecursiveParts) {
	            s = s.trim();
	            buffer.add("(" + s + ")" + op + " " + ruleName + "_tail?");
	        }

	        Map<String,List<String>> refactoredRules = new LinkedHashMap<String,List<String>>();
	        refactoredRules.put(ruleName,buffer);
	        refactoredRules.put((ruleName+"_tail"),recursiveParts);
	        return refactoredRules;
	    }

	    /*public static String cleanRule(String leftPart, String ruleName) {
	        String result = leftPart.replaceFirst(ruleName,"").trim();
	        String regex = "\\(\\s*([?+*]*)\\s*\\)";
	        // Ciclo per rimuovere ripetutamente le parentesi
	        while (result.matches(".*" + regex + ".*")) {
	            result = result.replaceFirst(regex, "$1").trim();
	        }
	        return result;
	    }*/

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

	    public static int findFirstBracket(String input) {
	        for (int i = 0; i < input.length(); i++) {
	            char currentChar = input.charAt(i);
	            if (currentChar == '(')
	                if ((i==0 || input.charAt(i-1)!='\'') || (i==input.length()-1 || input.charAt(i+1)!='\''))
	                    return i;
	        }
	        return -1;
	    }

	    public static int findLastBracket(String input) {
	        for (int i = input.length() - 1; i >= 0; i--) {
	            char currentChar = input.charAt(i);
	            if (currentChar == ')')
	                if ((i==0 || input.charAt(i-1)!='\'') || (i==input.length()-1 || input.charAt(i+1)!='\''))
	                    return i;
	        }
	        return -1;
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
	            } else if (c == '|' && openParentheses == 0) {
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

	    private static List<String> convertAndRemoveBrackets(String rule) {
	        String regex = "(?<!')\\(|(?<!')\\)";
	        Pattern pattern = Pattern.compile(regex);
	        List<String> input = new ArrayList<String>();
	        List<String> output = new ArrayList<String>();
	        boolean isSplittable = false;
	        Matcher matcher = pattern.matcher(rule);
	        output.add(rule);
	        if (matcher.find())
	            isSplittable = true;
	        while (isSplittable) {
	            isSplittable = false;
	            List<String> temp = output;
	            output = new ArrayList<String>();
	            input = temp;
	            for(String s: input)
	                output.addAll(splitIfContainsBrackets(s));
	            for (String s: output) {
	                matcher = pattern.matcher(s);
	                if (matcher.find()) {
	                    isSplittable = true;
	                    break;
	                }
	            }
	        }
	        return output;
	    }
	    
	    public static List<String> splitIfContainsBrackets(String input) {
	        List<String> rules = new ArrayList<String>();
	        input = input.trim();

	        int startIdx = findFirstBracket(input);
	        int endIdx = findLastBracket(input);

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
	            s = s.replaceAll(" ", op+" ");
	            s = s + op;

	            String regex = "[?+*]{2,}";
	            Pattern pattern = Pattern.compile(regex);
	            Matcher matcher = pattern.matcher(s);
	            String result = matcher.replaceAll(match -> {
	                String[] operators = match.group().split("");
	                return checkOperators(operators);
	            });
	            sb.append(result);

	            if (sb.length()>0 && end.length()>0) sb.append(" ");
	            sb.append(end);

	            rules.add(sb.toString());
	        }
	        return rules;
	    }    

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public S_sectionContext s_section() {
			return getRuleContext(S_sectionContext.class,0);
		}
		public L_sectionContext l_section() {
			return getRuleContext(L_sectionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 startFile(); 
			setState(37);
			s_section();
			setState(38);
			l_section();
			setState(39);
			match(EOF);
			 closeFile(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class S_sectionContext extends ParserRuleContext {
		public TerminalNode S_START() { return getToken(GrammarParser.S_START, 0); }
		public TerminalNode S_END() { return getToken(GrammarParser.S_END, 0); }
		public List<S_ruleContext> s_rule() {
			return getRuleContexts(S_ruleContext.class);
		}
		public S_ruleContext s_rule(int i) {
			return getRuleContext(S_ruleContext.class,i);
		}
		public S_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterS_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitS_section(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitS_section(this);
			else return visitor.visitChildren(this);
		}
	}

	public final S_sectionContext s_section() throws RecognitionException {
		S_sectionContext _localctx = new S_sectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_s_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(S_START);
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				s_rule();
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NON_TERM );
			setState(48);
			match(S_END);

			        for(String ruleName: prodRulesBuffer.keySet()) {
			            List<String> rules = new ArrayList<String>();
			            for(String r1: prodRulesBuffer.get(ruleName)) {
			                for(String r2: splitIgnoringBrackets(r1))
			                    rules.addAll(convertAndRemoveBrackets(r2));
			            }

			            List<String> recursiveParts = new ArrayList<String>();
			            List<String> nonRecursiveParts = new ArrayList<String>();

			            for(String rule: rules) {
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


			            for(String name: newRules.keySet()) {
			                StringBuilder sb = new StringBuilder();
			                sb.append(name.toLowerCase() + " : ");
			                for(String rule: newRules.get(name)) {
			                    prodRules.computeIfAbsent(name, k -> new HashSet<>()).add(rule);
			                    sb.append(rule + " | ");
			                }
			                sb.setLength(sb.length() - 3);
			                writeToFile(sb.toString() + " {");
			                writeToFile("  // Inserisci qui le azioni semantiche");
			                writeToFile("};\n");
			            }

			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class S_ruleContext extends ParserRuleContext {
		public Token NON_TERM;
		public S_exprContext s_expr;
		public TerminalNode NON_TERM() { return getToken(GrammarParser.NON_TERM, 0); }
		public TerminalNode EQUAL() { return getToken(GrammarParser.EQUAL, 0); }
		public S_exprContext s_expr() {
			return getRuleContext(S_exprContext.class,0);
		}
		public S_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterS_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitS_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitS_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final S_ruleContext s_rule() throws RecognitionException {
		S_ruleContext _localctx = new S_ruleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_s_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			((S_ruleContext)_localctx).NON_TERM = match(NON_TERM);
			setState(52);
			match(EQUAL);
			setState(53);
			((S_ruleContext)_localctx).s_expr = s_expr();
			setState(54);
			match(T__0);

			        String ruleName = (((S_ruleContext)_localctx).NON_TERM!=null?((S_ruleContext)_localctx).NON_TERM.getText():null).replaceAll("[<>]", "");
			        declaredNonTerms.add(ruleName.toLowerCase());
			        prodRulesBuffer.computeIfAbsent(ruleName, k -> new HashSet<>()).add(((S_ruleContext)_localctx).s_expr.value.trim());
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class S_exprContext extends ParserRuleContext {
		public String value;
		public S_seqContext e1;
		public S_expr_auxContext e2;
		public S_seqContext s_seq() {
			return getRuleContext(S_seqContext.class,0);
		}
		public S_expr_auxContext s_expr_aux() {
			return getRuleContext(S_expr_auxContext.class,0);
		}
		public S_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterS_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitS_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitS_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final S_exprContext s_expr() throws RecognitionException {
		S_exprContext _localctx = new S_exprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_s_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			((S_exprContext)_localctx).e1 = s_seq();
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(58);
				((S_exprContext)_localctx).e2 = s_expr_aux();
				}
				break;
			}

			        ((S_exprContext)_localctx).value =  ((S_exprContext)_localctx).e1.value;
			        if (((S_exprContext)_localctx).e2.value != null && !((S_exprContext)_localctx).e2.value.isEmpty()) {
			            _localctx.value += " " + ((S_exprContext)_localctx).e2.value.trim();
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class S_seqContext extends ParserRuleContext {
		public String value;
		public S_termContext e1;
		public S_seqContext e2;
		public S_termContext s_term() {
			return getRuleContext(S_termContext.class,0);
		}
		public S_seqContext s_seq() {
			return getRuleContext(S_seqContext.class,0);
		}
		public S_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterS_seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitS_seq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitS_seq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final S_seqContext s_seq() throws RecognitionException {
		S_seqContext _localctx = new S_seqContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_s_seq);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__4:
			case T__6:
			case TERM:
			case NON_TERM:
			case S_CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				((S_seqContext)_localctx).e1 = s_term();
				setState(65);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(64);
					((S_seqContext)_localctx).e2 = s_seq();
					}
					break;
				}

				        ((S_seqContext)_localctx).value =  ((S_seqContext)_localctx).e1.value;
				        if (((S_seqContext)_localctx).e2.value != null && !((S_seqContext)_localctx).e2.value.isEmpty()) {
				            _localctx.value += " " + ((S_seqContext)_localctx).e2.value.trim();
				        }
				    
				}
				break;
			case T__0:
			case T__1:
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				 ((S_seqContext)_localctx).value =  ""; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class S_expr_auxContext extends ParserRuleContext {
		public String value;
		public S_seqContext e1;
		public S_expr_auxContext e2;
		public S_seqContext s_seq() {
			return getRuleContext(S_seqContext.class,0);
		}
		public S_expr_auxContext s_expr_aux() {
			return getRuleContext(S_expr_auxContext.class,0);
		}
		public S_expr_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_expr_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterS_expr_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitS_expr_aux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitS_expr_aux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final S_expr_auxContext s_expr_aux() throws RecognitionException {
		S_expr_auxContext _localctx = new S_expr_auxContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_s_expr_aux);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(T__1);
				setState(73);
				((S_expr_auxContext)_localctx).e1 = s_seq();
				setState(75);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(74);
					((S_expr_auxContext)_localctx).e2 = s_expr_aux();
					}
					break;
				}

				        ((S_expr_auxContext)_localctx).value =  "| " + ((S_expr_auxContext)_localctx).e1.value;
				        if (((S_expr_auxContext)_localctx).e2.value != null && !((S_expr_auxContext)_localctx).e2.value.isEmpty()) {
				            _localctx.value += " " + ((S_expr_auxContext)_localctx).e2.value.trim();
				        }
				    
				}
				break;
			case T__0:
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				 ((S_expr_auxContext)_localctx).value =  ""; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class S_termContext extends ParserRuleContext {
		public String value;
		public S_atomContext e;
		public S_atomContext s_atom;
		public S_brackets_atomContext s_brackets_atom;
		public S_atomContext s_atom() {
			return getRuleContext(S_atomContext.class,0);
		}
		public S_brackets_atomContext s_brackets_atom() {
			return getRuleContext(S_brackets_atomContext.class,0);
		}
		public S_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterS_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitS_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitS_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final S_termContext s_term() throws RecognitionException {
		S_termContext _localctx = new S_termContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_s_term);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case TERM:
			case NON_TERM:
			case S_CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				((S_termContext)_localctx).e = ((S_termContext)_localctx).s_atom = s_atom();
				 ((S_termContext)_localctx).value =  ((S_termContext)_localctx).s_atom.value; 
				}
				break;
			case T__4:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				((S_termContext)_localctx).s_brackets_atom = s_brackets_atom();
				 ((S_termContext)_localctx).value =  ((S_termContext)_localctx).s_brackets_atom.value; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class S_atomContext extends ParserRuleContext {
		public String value;
		public Token NON_TERM;
		public Token TERM;
		public Token S_CHAR;
		public S_exprContext e;
		public TerminalNode NON_TERM() { return getToken(GrammarParser.NON_TERM, 0); }
		public TerminalNode TERM() { return getToken(GrammarParser.TERM, 0); }
		public TerminalNode S_CHAR() { return getToken(GrammarParser.S_CHAR, 0); }
		public S_exprContext s_expr() {
			return getRuleContext(S_exprContext.class,0);
		}
		public S_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterS_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitS_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitS_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final S_atomContext s_atom() throws RecognitionException {
		S_atomContext _localctx = new S_atomContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_s_atom);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NON_TERM:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				((S_atomContext)_localctx).NON_TERM = match(NON_TERM);

				        String tokenName = (((S_atomContext)_localctx).NON_TERM!=null?((S_atomContext)_localctx).NON_TERM.getText():null).replaceAll("[<>]", "");
				        usedNonTerms.add(tokenName.toLowerCase());
				        ((S_atomContext)_localctx).value =  tokenName;
				    
				}
				break;
			case TERM:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				((S_atomContext)_localctx).TERM = match(TERM);

				        String tokenName = (((S_atomContext)_localctx).TERM!=null?((S_atomContext)_localctx).TERM.getText():null).replaceAll("[<>]", "");
				        usedTerms.add(tokenName.toUpperCase());
				        ((S_atomContext)_localctx).value =  tokenName;
				    
				}
				break;
			case S_CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				((S_atomContext)_localctx).S_CHAR = match(S_CHAR);
				 ((S_atomContext)_localctx).value =  (((S_atomContext)_localctx).S_CHAR!=null?((S_atomContext)_localctx).S_CHAR.getText():null); 
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				match(T__2);
				setState(97);
				((S_atomContext)_localctx).e = s_expr();
				setState(98);
				match(T__3);
				 ((S_atomContext)_localctx).value =  "(" + ((S_atomContext)_localctx).e.value + ")"; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class S_brackets_atomContext extends ParserRuleContext {
		public String value;
		public S_atomContext e;
		public S_atomContext s_atom() {
			return getRuleContext(S_atomContext.class,0);
		}
		public S_brackets_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_brackets_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterS_brackets_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitS_brackets_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitS_brackets_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final S_brackets_atomContext s_brackets_atom() throws RecognitionException {
		S_brackets_atomContext _localctx = new S_brackets_atomContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_s_brackets_atom);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(T__4);
				setState(104);
				((S_brackets_atomContext)_localctx).e = s_atom();
				setState(105);
				match(T__5);
				 ((S_brackets_atomContext)_localctx).value =  ((S_brackets_atomContext)_localctx).e.value + "?"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(T__6);
				setState(109);
				((S_brackets_atomContext)_localctx).e = s_atom();
				setState(110);
				match(T__7);
				 ((S_brackets_atomContext)_localctx).value =  ((S_brackets_atomContext)_localctx).e.value + "+"; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				match(T__6);
				setState(114);
				match(T__4);
				setState(115);
				((S_brackets_atomContext)_localctx).e = s_atom();
				setState(116);
				match(T__5);
				setState(117);
				match(T__7);
				 ((S_brackets_atomContext)_localctx).value =  ((S_brackets_atomContext)_localctx).e.value + "*"; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				match(T__4);
				setState(121);
				match(T__6);
				setState(122);
				((S_brackets_atomContext)_localctx).e = s_atom();
				setState(123);
				match(T__7);
				setState(124);
				match(T__5);
				 ((S_brackets_atomContext)_localctx).value =  ((S_brackets_atomContext)_localctx).e.value + "*"; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class L_sectionContext extends ParserRuleContext {
		public TerminalNode L_START() { return getToken(GrammarParser.L_START, 0); }
		public TerminalNode L_END() { return getToken(GrammarParser.L_END, 0); }
		public List<L_ruleContext> l_rule() {
			return getRuleContexts(L_ruleContext.class);
		}
		public L_ruleContext l_rule(int i) {
			return getRuleContext(L_ruleContext.class,i);
		}
		public L_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterL_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitL_section(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitL_section(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_sectionContext l_section() throws RecognitionException {
		L_sectionContext _localctx = new L_sectionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_l_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(L_START);
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				l_rule();
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TERM );
			setState(135);
			match(L_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class L_ruleContext extends ParserRuleContext {
		public Token TERM;
		public L_reg_expContext l_reg_exp;
		public TerminalNode TERM() { return getToken(GrammarParser.TERM, 0); }
		public TerminalNode EQUAL() { return getToken(GrammarParser.EQUAL, 0); }
		public L_reg_expContext l_reg_exp() {
			return getRuleContext(L_reg_expContext.class,0);
		}
		public L_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterL_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitL_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitL_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_ruleContext l_rule() throws RecognitionException {
		L_ruleContext _localctx = new L_ruleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_l_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			((L_ruleContext)_localctx).TERM = match(TERM);
			setState(138);
			match(EQUAL);
			setState(139);
			((L_ruleContext)_localctx).l_reg_exp = l_reg_exp();
			setState(140);
			match(T__0);

			        String tokenName = (((L_ruleContext)_localctx).TERM!=null?((L_ruleContext)_localctx).TERM.getText():null).replaceAll("[<>]", "");
			        declaredTerms.add(tokenName.toUpperCase());
			        if (tokenName.equals("SKIP_")) writeToFile(tokenName.toUpperCase() + " : " + ((L_ruleContext)_localctx).l_reg_exp.value + " -> skip;");
			        else writeToFile(tokenName.toUpperCase() + " : " + ((L_ruleContext)_localctx).l_reg_exp.value + ";");
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class L_reg_expContext extends ParserRuleContext {
		public String value;
		public L_reg_exp_partContext part1;
		public L_reg_exp_partContext part2;
		public List<L_reg_exp_partContext> l_reg_exp_part() {
			return getRuleContexts(L_reg_exp_partContext.class);
		}
		public L_reg_exp_partContext l_reg_exp_part(int i) {
			return getRuleContext(L_reg_exp_partContext.class,i);
		}
		public L_reg_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_reg_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterL_reg_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitL_reg_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitL_reg_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_reg_expContext l_reg_exp() throws RecognitionException {
		L_reg_expContext _localctx = new L_reg_expContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_l_reg_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 StringBuilder sb = new StringBuilder(); 
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(144);
				((L_reg_expContext)_localctx).part1 = l_reg_exp_part();
				 sb.append(((L_reg_expContext)_localctx).part1.value).append(" "); 
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 32505896L) != 0) );
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(151);
				match(T__1);
				 sb.append("|"); 
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(153);
					((L_reg_expContext)_localctx).part2 = l_reg_exp_part();
					 sb.append(((L_reg_expContext)_localctx).part2.value).append(" "); 
					}
					}
					setState(158); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 32505896L) != 0) );
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 ((L_reg_expContext)_localctx).value =  sb.toString().trim(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class L_reg_exp_partContext extends ParserRuleContext {
		public String value;
		public L_atomContext l_atom;
		public L_quantContext l_quant;
		public L_atomContext l_atom() {
			return getRuleContext(L_atomContext.class,0);
		}
		public L_quantContext l_quant() {
			return getRuleContext(L_quantContext.class,0);
		}
		public L_reg_exp_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_reg_exp_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterL_reg_exp_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitL_reg_exp_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitL_reg_exp_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_reg_exp_partContext l_reg_exp_part() throws RecognitionException {
		L_reg_exp_partContext _localctx = new L_reg_exp_partContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_l_reg_exp_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			((L_reg_exp_partContext)_localctx).l_atom = l_atom();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6 || _la==QUANTIFICATORE) {
				{
				setState(168);
				((L_reg_exp_partContext)_localctx).l_quant = l_quant();
				}
			}


			           if ((((L_reg_exp_partContext)_localctx).l_quant!=null?_input.getText(((L_reg_exp_partContext)_localctx).l_quant.start,((L_reg_exp_partContext)_localctx).l_quant.stop):null) != null) {
			               String q = (((L_reg_exp_partContext)_localctx).l_quant!=null?_input.getText(((L_reg_exp_partContext)_localctx).l_quant.start,((L_reg_exp_partContext)_localctx).l_quant.stop):null);
			               if (q.matches("\\{\\d+,\\d+\\}")) {  // Caso {m,n}
			                   String[] bounds = q.replaceAll("[{}]", "").split(",");
			                   int min = Integer.parseInt(bounds[0]);
			                   int max = Integer.parseInt(bounds[1]);
			                   if (max > min) {
			                       ((L_reg_exp_partContext)_localctx).value =  String.join(" ", Collections.nCopies(min, ((L_reg_exp_partContext)_localctx).l_atom.value)) +
			                                String.join(" ", Collections.nCopies(max - min, "(" + ((L_reg_exp_partContext)_localctx).l_atom.value + ")?"));
			                   } else {
			                       ((L_reg_exp_partContext)_localctx).value =  String.join(" ", Collections.nCopies(min, ((L_reg_exp_partContext)_localctx).l_atom.value));
			                   }
			               } else if (q.matches("\\{\\d+,\\}")) {  // Caso {m,}
			                   int min = Integer.parseInt(q.replaceAll("[{}]", "").split(",")[0]);
			                   ((L_reg_exp_partContext)_localctx).value =  String.join(" ", Collections.nCopies(min, ((L_reg_exp_partContext)_localctx).l_atom.value)) + " " + ((L_reg_exp_partContext)_localctx).l_atom.value + "*";
			               } else if (q.matches("\\{\\d+\\}")) {  // Caso {m}
			                   int count = Integer.parseInt(q.replaceAll("[{}]", ""));
			                   ((L_reg_exp_partContext)_localctx).value =  String.join(" ", Collections.nCopies(count, ((L_reg_exp_partContext)_localctx).l_atom.value));
			               } else {
			                   ((L_reg_exp_partContext)_localctx).value =  ((L_reg_exp_partContext)_localctx).l_atom.value + q; // ?, +, *
			               }
			           } else {
			               ((L_reg_exp_partContext)_localctx).value =  ((L_reg_exp_partContext)_localctx).l_atom.value;
			           }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class L_quantContext extends ParserRuleContext {
		public Token cifra1;
		public Token cifra2;
		public List<TerminalNode> CIFRA() { return getTokens(GrammarParser.CIFRA); }
		public TerminalNode CIFRA(int i) {
			return getToken(GrammarParser.CIFRA, i);
		}
		public TerminalNode QUANTIFICATORE() { return getToken(GrammarParser.QUANTIFICATORE, 0); }
		public L_quantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_quant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterL_quant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitL_quant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitL_quant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_quantContext l_quant() throws RecognitionException {
		L_quantContext _localctx = new L_quantContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_l_quant);
		int _la;
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(T__6);
				setState(175); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(174);
					((L_quantContext)_localctx).cifra1 = match(CIFRA);
					}
					}
					setState(177); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CIFRA );
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(179);
					match(T__8);
					setState(181); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(180);
						((L_quantContext)_localctx).cifra2 = match(CIFRA);
						}
						}
						setState(183); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CIFRA );
					}
				}

				setState(187);
				match(T__7);

				        int min = Integer.parseInt((((L_quantContext)_localctx).cifra1!=null?((L_quantContext)_localctx).cifra1.getText():null));
				        int max = Integer.parseInt((((L_quantContext)_localctx).cifra2!=null?((L_quantContext)_localctx).cifra2.getText():null));
				        if (min > max) {
				            System.err.println("Errore: Quantificatore non valido {" + min + "," + max + "}: il primo numero non può essere maggiore del secondo.");
				        }
				    
				}
				break;
			case QUANTIFICATORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(QUANTIFICATORE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class L_atomContext extends ParserRuleContext {
		public String value;
		public L_simple_atomContext l_simple_atom;
		public L_atom_groupContext l_atom_group;
		public L_simple_atomContext l_simple_atom() {
			return getRuleContext(L_simple_atomContext.class,0);
		}
		public L_atom_groupContext l_atom_group() {
			return getRuleContext(L_atom_groupContext.class,0);
		}
		public L_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterL_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitL_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitL_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_atomContext l_atom() throws RecognitionException {
		L_atomContext _localctx = new L_atomContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_l_atom);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case CIFRA:
			case CHAR:
			case METACHAR:
			case SHORTCUT:
			case ESCAPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				((L_atomContext)_localctx).l_simple_atom = l_simple_atom();
				 ((L_atomContext)_localctx).value =  ((L_atomContext)_localctx).l_simple_atom.value; 
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				((L_atomContext)_localctx).l_atom_group = l_atom_group();
				 ((L_atomContext)_localctx).value =  ((L_atomContext)_localctx).l_atom_group.value; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class L_simple_atomContext extends ParserRuleContext {
		public String value;
		public Token CHAR;
		public Token CIFRA;
		public Token ESCAPE;
		public Token METACHAR;
		public Token SHORTCUT;
		public List<TerminalNode> CHAR() { return getTokens(GrammarParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(GrammarParser.CHAR, i);
		}
		public List<TerminalNode> CIFRA() { return getTokens(GrammarParser.CIFRA); }
		public TerminalNode CIFRA(int i) {
			return getToken(GrammarParser.CIFRA, i);
		}
		public List<TerminalNode> ESCAPE() { return getTokens(GrammarParser.ESCAPE); }
		public TerminalNode ESCAPE(int i) {
			return getToken(GrammarParser.ESCAPE, i);
		}
		public List<TerminalNode> METACHAR() { return getTokens(GrammarParser.METACHAR); }
		public TerminalNode METACHAR(int i) {
			return getToken(GrammarParser.METACHAR, i);
		}
		public TerminalNode SHORTCUT() { return getToken(GrammarParser.SHORTCUT, 0); }
		public List<L_intervalContext> l_interval() {
			return getRuleContexts(L_intervalContext.class);
		}
		public L_intervalContext l_interval(int i) {
			return getRuleContext(L_intervalContext.class,i);
		}
		public L_simple_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_simple_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterL_simple_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitL_simple_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitL_simple_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_simple_atomContext l_simple_atom() throws RecognitionException {
		L_simple_atomContext _localctx = new L_simple_atomContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_l_simple_atom);
		int _la;
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				((L_simple_atomContext)_localctx).CHAR = match(CHAR);
				 ((L_simple_atomContext)_localctx).value =  "'" + (((L_simple_atomContext)_localctx).CHAR!=null?((L_simple_atomContext)_localctx).CHAR.getText():null) + "'"; 
				}
				break;
			case CIFRA:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				((L_simple_atomContext)_localctx).CIFRA = match(CIFRA);
				 ((L_simple_atomContext)_localctx).value =  "'" + (((L_simple_atomContext)_localctx).CIFRA!=null?((L_simple_atomContext)_localctx).CIFRA.getText():null) + "'"; 
				}
				break;
			case ESCAPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				((L_simple_atomContext)_localctx).ESCAPE = match(ESCAPE);
				 ((L_simple_atomContext)_localctx).value =  "'" + (((L_simple_atomContext)_localctx).ESCAPE!=null?((L_simple_atomContext)_localctx).ESCAPE.getText():null) + "'"; 
				}
				break;
			case METACHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				((L_simple_atomContext)_localctx).METACHAR = match(METACHAR);
				 ((L_simple_atomContext)_localctx).value =  "'" + ((L_simple_atomContext)_localctx).METACHAR.getText().charAt(1) + "'"; 
				}
				break;
			case SHORTCUT:
				enterOuterAlt(_localctx, 5);
				{
				setState(208);
				((L_simple_atomContext)_localctx).SHORTCUT = match(SHORTCUT);

				         String shortcutText = ((L_simple_atomContext)_localctx).SHORTCUT.getText();
				         switch (shortcutText) {
				            case "\\w": ((L_simple_atomContext)_localctx).value =  "[a-zA-Z0-9_]"; break;
				            case "\\d": ((L_simple_atomContext)_localctx).value =  "[0-9]"; break;
				            case "\\s": ((L_simple_atomContext)_localctx).value =  "[ \t\r\n]"; break;
				            case "\\W": ((L_simple_atomContext)_localctx).value =  "~[a-zA-Z0-9_]"; break;
				            case "\\D": ((L_simple_atomContext)_localctx).value =  "~[0-9]"; break;
				            case "\\S": ((L_simple_atomContext)_localctx).value =  "~[\t\r\n]"; break;
				            default: ((L_simple_atomContext)_localctx).value =  "'" + shortcutText + "'"; break;
				         }
				    
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 6);
				{
				setState(210);
				match(T__4);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(211);
					match(T__9);
					}
				}

				setState(219); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(219);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(214);
						l_interval();
						}
						break;
					case 2:
						{
						setState(215);
						match(CHAR);
						}
						break;
					case 3:
						{
						setState(216);
						match(CIFRA);
						}
						break;
					case 4:
						{
						setState(217);
						match(ESCAPE);
						}
						break;
					case 5:
						{
						setState(218);
						match(METACHAR);
						}
						break;
					}
					}
					setState(221); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 24117248L) != 0) );
				setState(223);
				match(T__5);

				          String textValue = _input.getText(_localctx.start, _input.LT(-1));
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

				      ((L_simple_atomContext)_localctx).value =  textValue;
				  
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class L_atom_groupContext extends ParserRuleContext {
		public String value;
		public L_reg_expContext s1;
		public L_reg_expContext l_reg_exp() {
			return getRuleContext(L_reg_expContext.class,0);
		}
		public L_atom_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_atom_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterL_atom_group(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitL_atom_group(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitL_atom_group(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_atom_groupContext l_atom_group() throws RecognitionException {
		L_atom_groupContext _localctx = new L_atom_groupContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_l_atom_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__2);
			setState(228);
			((L_atom_groupContext)_localctx).s1 = l_reg_exp();
			setState(229);
			match(T__3);
			 ((L_atom_groupContext)_localctx).value =  "(" + ((L_atom_groupContext)_localctx).s1.value + ")"; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class L_intervalContext extends ParserRuleContext {
		public Token char1;
		public Token char2;
		public List<TerminalNode> CHAR() { return getTokens(GrammarParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(GrammarParser.CHAR, i);
		}
		public List<TerminalNode> CIFRA() { return getTokens(GrammarParser.CIFRA); }
		public TerminalNode CIFRA(int i) {
			return getToken(GrammarParser.CIFRA, i);
		}
		public L_intervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterL_interval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitL_interval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitL_interval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_intervalContext l_interval() throws RecognitionException {
		L_intervalContext _localctx = new L_intervalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_l_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(232);
			((L_intervalContext)_localctx).char1 = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==CIFRA || _la==CHAR) ) {
				((L_intervalContext)_localctx).char1 = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(233);
			match(T__10);
			setState(234);
			((L_intervalContext)_localctx).char2 = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==CIFRA || _la==CHAR) ) {
				((L_intervalContext)_localctx).char2 = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}

			        char startChar = (((L_intervalContext)_localctx).char1!=null?((L_intervalContext)_localctx).char1.getText():null).charAt(0);
			        char endChar = (((L_intervalContext)_localctx).char2!=null?((L_intervalContext)_localctx).char2.getText():null).charAt(0);
			        if (startChar > endChar) {
			            System.err.println("Errore: Intervallo non valido '" + startChar + "-" + endChar + "': il primo carattere deve avere un valore ASCII minore o uguale al secondo.");
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001a\u00ef\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0004\u0001-\b\u0001\u000b\u0001\f\u0001.\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003<\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004B\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004G\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005L\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005Q\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006Y\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007f\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0080\b\b\u0001\t\u0001\t\u0004"+
		"\t\u0084\b\t\u000b\t\f\t\u0085\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0004\u000b\u0094\b\u000b\u000b\u000b\f\u000b\u0095\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u009d\b\u000b\u000b"+
		"\u000b\f\u000b\u009e\u0005\u000b\u00a1\b\u000b\n\u000b\f\u000b\u00a4\t"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003\f\u00aa\b\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0004\r\u00b0\b\r\u000b\r\f\r\u00b1\u0001\r"+
		"\u0001\r\u0004\r\u00b6\b\r\u000b\r\f\r\u00b7\u0003\r\u00ba\b\r\u0001\r"+
		"\u0001\r\u0001\r\u0003\r\u00bf\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00c7\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00d5\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0004\u000f\u00dc\b\u000f\u000b\u000f\f\u000f\u00dd\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00e2\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000"+
		"\u0001\u0001\u0000\u0014\u0015\u00fe\u0000$\u0001\u0000\u0000\u0000\u0002"+
		"*\u0001\u0000\u0000\u0000\u00043\u0001\u0000\u0000\u0000\u00069\u0001"+
		"\u0000\u0000\u0000\bF\u0001\u0000\u0000\u0000\nP\u0001\u0000\u0000\u0000"+
		"\fX\u0001\u0000\u0000\u0000\u000ee\u0001\u0000\u0000\u0000\u0010\u007f"+
		"\u0001\u0000\u0000\u0000\u0012\u0081\u0001\u0000\u0000\u0000\u0014\u0089"+
		"\u0001\u0000\u0000\u0000\u0016\u008f\u0001\u0000\u0000\u0000\u0018\u00a7"+
		"\u0001\u0000\u0000\u0000\u001a\u00be\u0001\u0000\u0000\u0000\u001c\u00c6"+
		"\u0001\u0000\u0000\u0000\u001e\u00e1\u0001\u0000\u0000\u0000 \u00e3\u0001"+
		"\u0000\u0000\u0000\"\u00e8\u0001\u0000\u0000\u0000$%\u0006\u0000\uffff"+
		"\uffff\u0000%&\u0003\u0002\u0001\u0000&\'\u0003\u0012\t\u0000\'(\u0005"+
		"\u0000\u0000\u0001()\u0006\u0000\uffff\uffff\u0000)\u0001\u0001\u0000"+
		"\u0000\u0000*,\u0005\u000f\u0000\u0000+-\u0003\u0004\u0002\u0000,+\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000"+
		"./\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000001\u0005\u0010\u0000"+
		"\u000012\u0006\u0001\uffff\uffff\u00002\u0003\u0001\u0000\u0000\u0000"+
		"34\u0005\u0011\u0000\u000045\u0005\u0019\u0000\u000056\u0003\u0006\u0003"+
		"\u000067\u0005\u0001\u0000\u000078\u0006\u0002\uffff\uffff\u00008\u0005"+
		"\u0001\u0000\u0000\u00009;\u0003\b\u0004\u0000:<\u0003\n\u0005\u0000;"+
		":\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000"+
		"\u0000=>\u0006\u0003\uffff\uffff\u0000>\u0007\u0001\u0000\u0000\u0000"+
		"?A\u0003\f\u0006\u0000@B\u0003\b\u0004\u0000A@\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0006\u0004\uffff"+
		"\uffff\u0000DG\u0001\u0000\u0000\u0000EG\u0006\u0004\uffff\uffff\u0000"+
		"F?\u0001\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000G\t\u0001\u0000\u0000"+
		"\u0000HI\u0005\u0002\u0000\u0000IK\u0003\b\u0004\u0000JL\u0003\n\u0005"+
		"\u0000KJ\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0001\u0000"+
		"\u0000\u0000MN\u0006\u0005\uffff\uffff\u0000NQ\u0001\u0000\u0000\u0000"+
		"OQ\u0006\u0005\uffff\uffff\u0000PH\u0001\u0000\u0000\u0000PO\u0001\u0000"+
		"\u0000\u0000Q\u000b\u0001\u0000\u0000\u0000RS\u0003\u000e\u0007\u0000"+
		"ST\u0006\u0006\uffff\uffff\u0000TY\u0001\u0000\u0000\u0000UV\u0003\u0010"+
		"\b\u0000VW\u0006\u0006\uffff\uffff\u0000WY\u0001\u0000\u0000\u0000XR\u0001"+
		"\u0000\u0000\u0000XU\u0001\u0000\u0000\u0000Y\r\u0001\u0000\u0000\u0000"+
		"Z[\u0005\u0011\u0000\u0000[f\u0006\u0007\uffff\uffff\u0000\\]\u0005\u000e"+
		"\u0000\u0000]f\u0006\u0007\uffff\uffff\u0000^_\u0005\u0012\u0000\u0000"+
		"_f\u0006\u0007\uffff\uffff\u0000`a\u0005\u0003\u0000\u0000ab\u0003\u0006"+
		"\u0003\u0000bc\u0005\u0004\u0000\u0000cd\u0006\u0007\uffff\uffff\u0000"+
		"df\u0001\u0000\u0000\u0000eZ\u0001\u0000\u0000\u0000e\\\u0001\u0000\u0000"+
		"\u0000e^\u0001\u0000\u0000\u0000e`\u0001\u0000\u0000\u0000f\u000f\u0001"+
		"\u0000\u0000\u0000gh\u0005\u0005\u0000\u0000hi\u0003\u000e\u0007\u0000"+
		"ij\u0005\u0006\u0000\u0000jk\u0006\b\uffff\uffff\u0000k\u0080\u0001\u0000"+
		"\u0000\u0000lm\u0005\u0007\u0000\u0000mn\u0003\u000e\u0007\u0000no\u0005"+
		"\b\u0000\u0000op\u0006\b\uffff\uffff\u0000p\u0080\u0001\u0000\u0000\u0000"+
		"qr\u0005\u0007\u0000\u0000rs\u0005\u0005\u0000\u0000st\u0003\u000e\u0007"+
		"\u0000tu\u0005\u0006\u0000\u0000uv\u0005\b\u0000\u0000vw\u0006\b\uffff"+
		"\uffff\u0000w\u0080\u0001\u0000\u0000\u0000xy\u0005\u0005\u0000\u0000"+
		"yz\u0005\u0007\u0000\u0000z{\u0003\u000e\u0007\u0000{|\u0005\b\u0000\u0000"+
		"|}\u0005\u0006\u0000\u0000}~\u0006\b\uffff\uffff\u0000~\u0080\u0001\u0000"+
		"\u0000\u0000\u007fg\u0001\u0000\u0000\u0000\u007fl\u0001\u0000\u0000\u0000"+
		"\u007fq\u0001\u0000\u0000\u0000\u007fx\u0001\u0000\u0000\u0000\u0080\u0011"+
		"\u0001\u0000\u0000\u0000\u0081\u0083\u0005\f\u0000\u0000\u0082\u0084\u0003"+
		"\u0014\n\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000"+
		"\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0005\r\u0000"+
		"\u0000\u0088\u0013\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u000e\u0000"+
		"\u0000\u008a\u008b\u0005\u0019\u0000\u0000\u008b\u008c\u0003\u0016\u000b"+
		"\u0000\u008c\u008d\u0005\u0001\u0000\u0000\u008d\u008e\u0006\n\uffff\uffff"+
		"\u0000\u008e\u0015\u0001\u0000\u0000\u0000\u008f\u0093\u0006\u000b\uffff"+
		"\uffff\u0000\u0090\u0091\u0003\u0018\f\u0000\u0091\u0092\u0006\u000b\uffff"+
		"\uffff\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0090\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u00a2\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0005\u0002\u0000\u0000\u0098\u009c\u0006\u000b"+
		"\uffff\uffff\u0000\u0099\u009a\u0003\u0018\f\u0000\u009a\u009b\u0006\u000b"+
		"\uffff\uffff\u0000\u009b\u009d\u0001\u0000\u0000\u0000\u009c\u0099\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009c\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a0\u0097\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0006\u000b\uffff\uffff\u0000\u00a6\u0017"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a9\u0003\u001c\u000e\u0000\u00a8\u00aa"+
		"\u0003\u001a\r\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac\u0006"+
		"\f\uffff\uffff\u0000\u00ac\u0019\u0001\u0000\u0000\u0000\u00ad\u00af\u0005"+
		"\u0007\u0000\u0000\u00ae\u00b0\u0005\u0014\u0000\u0000\u00af\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00af\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b5\u0005\t\u0000\u0000\u00b4\u00b6\u0005\u0014"+
		"\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0005\b\u0000\u0000\u00bc\u00bf\u0006\r\uffff"+
		"\uffff\u0000\u00bd\u00bf\u0005\u0013\u0000\u0000\u00be\u00ad\u0001\u0000"+
		"\u0000\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u001b\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0003\u001e\u000f\u0000\u00c1\u00c2\u0006\u000e"+
		"\uffff\uffff\u0000\u00c2\u00c7\u0001\u0000\u0000\u0000\u00c3\u00c4\u0003"+
		" \u0010\u0000\u00c4\u00c5\u0006\u000e\uffff\uffff\u0000\u00c5\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c0\u0001\u0000\u0000\u0000\u00c6\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c7\u001d\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005"+
		"\u0015\u0000\u0000\u00c9\u00e2\u0006\u000f\uffff\uffff\u0000\u00ca\u00cb"+
		"\u0005\u0014\u0000\u0000\u00cb\u00e2\u0006\u000f\uffff\uffff\u0000\u00cc"+
		"\u00cd\u0005\u0018\u0000\u0000\u00cd\u00e2\u0006\u000f\uffff\uffff\u0000"+
		"\u00ce\u00cf\u0005\u0016\u0000\u0000\u00cf\u00e2\u0006\u000f\uffff\uffff"+
		"\u0000\u00d0\u00d1\u0005\u0017\u0000\u0000\u00d1\u00e2\u0006\u000f\uffff"+
		"\uffff\u0000\u00d2\u00d4\u0005\u0005\u0000\u0000\u00d3\u00d5\u0005\n\u0000"+
		"\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d5\u00db\u0001\u0000\u0000\u0000\u00d6\u00dc\u0003\"\u0011\u0000"+
		"\u00d7\u00dc\u0005\u0015\u0000\u0000\u00d8\u00dc\u0005\u0014\u0000\u0000"+
		"\u00d9\u00dc\u0005\u0018\u0000\u0000\u00da\u00dc\u0005\u0016\u0000\u0000"+
		"\u00db\u00d6\u0001\u0000\u0000\u0000\u00db\u00d7\u0001\u0000\u0000\u0000"+
		"\u00db\u00d8\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000"+
		"\u00db\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000"+
		"\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u0006\u0000\u0000"+
		"\u00e0\u00e2\u0006\u000f\uffff\uffff\u0000\u00e1\u00c8\u0001\u0000\u0000"+
		"\u0000\u00e1\u00ca\u0001\u0000\u0000\u0000\u00e1\u00cc\u0001\u0000\u0000"+
		"\u0000\u00e1\u00ce\u0001\u0000\u0000\u0000\u00e1\u00d0\u0001\u0000\u0000"+
		"\u0000\u00e1\u00d2\u0001\u0000\u0000\u0000\u00e2\u001f\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0005\u0003\u0000\u0000\u00e4\u00e5\u0003\u0016\u000b"+
		"\u0000\u00e5\u00e6\u0005\u0004\u0000\u0000\u00e6\u00e7\u0006\u0010\uffff"+
		"\uffff\u0000\u00e7!\u0001\u0000\u0000\u0000\u00e8\u00e9\u0007\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0005\u000b\u0000\u0000\u00ea\u00eb\u0007\u0000\u0000"+
		"\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed\u0006\u0011\uffff"+
		"\uffff\u0000\u00ed#\u0001\u0000\u0000\u0000\u0017.;AFKPXe\u007f\u0085"+
		"\u0095\u009e\u00a2\u00a9\u00b1\u00b7\u00b9\u00be\u00c6\u00d4\u00db\u00dd"+
		"\u00e1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}