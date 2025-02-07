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
	        String recursivePart = cleanRule(leftPart, ruleName);
	        String op = checkOperator(recursivePart);
	        recursivePart = recursivePart.replace(op,"").trim();
	        writeToFile(ruleName + " : " + "(" + nonRecursivePart + ")" + op + " " + ruleName + "_tail?" + ";");
	        writeToFile(ruleName + "_tail" + " : " + "(" + recursivePart + ")" + " " + ruleName + "_tail?" + ";");
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

	    public static String checkOperator(String input) {
	        String op = input.trim().substring(0,1);
	        if (op.equals("*") | op.equals("+") | op.equals("?")) return op;
	        else return "";
	    }

	    public static String[] splitIgnoringParentheses(String input) {
	            int openParentheses = 0;
	            for (int i = 0; i < input.length(); i++) {
	                char c = input.charAt(i);
	                if (c == '(') {
	                    openParentheses++;
	                } else if (c == ')') {
	                    openParentheses--;
	                } else if (c == '|' && openParentheses == 0) {
	                    // Abbiamo trovato il primo '|' fuori dalle parentesi
	                    return new String[]{input.substring(0, i), input.substring(i + 1)};
	                }
	            }
	            // Se non troviamo un '|', restituiamo l'intera stringa senza split
	            return new String[]{input};
	    }

	    public static boolean startsWithIgnoringBrackets(String input, String prefix) {
	        // Rimuove parentesi tonde, quadre e graffe iniziali con eventuali spazi
	        String cleaned = input.replaceFirst("^[\\[{(]+\\s*", "");
	        return cleaned.startsWith(prefix);
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
		"\u0004\u0000\u001a\u00a7\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
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
		"\f\u0001\f\u0001\r\u0001\r\u0004\rd\b\r\u000b\r\f\re\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0004\u0010\u0084\b\u0010\u000b\u0010\f\u0010\u0085"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0004\u0019\u00a2\b\u0019\u000b\u0019\f\u0019"+
		"\u00a3\u0001\u0019\u0001\u0019\u0000\u0000\u001a\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a\u0001"+
		"\u0000\n\u0002\u0000AZ__\u0002\u0000__az\u0003\u0000\n\n\r\r\'\'\u0002"+
		"\u0000*+??\u0001\u000009\u0003\u0000AZ__az\u0004\u000009AZ__az\u0006\u0000"+
		"DDSSWWddssww\u0003\u0000nnrrtt\u0003\u0000\t\n\r\r  \u00a9\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000"+
		"\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u0001"+
		"5\u0001\u0000\u0000\u0000\u00037\u0001\u0000\u0000\u0000\u00059\u0001"+
		"\u0000\u0000\u0000\u0007;\u0001\u0000\u0000\u0000\t=\u0001\u0000\u0000"+
		"\u0000\u000b?\u0001\u0000\u0000\u0000\rA\u0001\u0000\u0000\u0000\u000f"+
		"C\u0001\u0000\u0000\u0000\u0011E\u0001\u0000\u0000\u0000\u0013G\u0001"+
		"\u0000\u0000\u0000\u0015I\u0001\u0000\u0000\u0000\u0017K\u0001\u0000\u0000"+
		"\u0000\u0019W\u0001\u0000\u0000\u0000\u001ba\u0001\u0000\u0000\u0000\u001d"+
		"i\u0001\u0000\u0000\u0000\u001fv\u0001\u0000\u0000\u0000!\u0081\u0001"+
		"\u0000\u0000\u0000#\u0089\u0001\u0000\u0000\u0000%\u008d\u0001\u0000\u0000"+
		"\u0000\'\u008f\u0001\u0000\u0000\u0000)\u0091\u0001\u0000\u0000\u0000"+
		"+\u0093\u0001\u0000\u0000\u0000-\u0096\u0001\u0000\u0000\u0000/\u0099"+
		"\u0001\u0000\u0000\u00001\u009c\u0001\u0000\u0000\u00003\u00a1\u0001\u0000"+
		"\u0000\u000056\u0005;\u0000\u00006\u0002\u0001\u0000\u0000\u000078\u0005"+
		"|\u0000\u00008\u0004\u0001\u0000\u0000\u00009:\u0005(\u0000\u0000:\u0006"+
		"\u0001\u0000\u0000\u0000;<\u0005)\u0000\u0000<\b\u0001\u0000\u0000\u0000"+
		"=>\u0005[\u0000\u0000>\n\u0001\u0000\u0000\u0000?@\u0005]\u0000\u0000"+
		"@\f\u0001\u0000\u0000\u0000AB\u0005{\u0000\u0000B\u000e\u0001\u0000\u0000"+
		"\u0000CD\u0005}\u0000\u0000D\u0010\u0001\u0000\u0000\u0000EF\u0005,\u0000"+
		"\u0000F\u0012\u0001\u0000\u0000\u0000GH\u0005^\u0000\u0000H\u0014\u0001"+
		"\u0000\u0000\u0000IJ\u0005-\u0000\u0000J\u0016\u0001\u0000\u0000\u0000"+
		"KL\u0005L\u0000\u0000LM\u0005E\u0000\u0000MN\u0005X\u0000\u0000NO\u0005"+
		"E\u0000\u0000OP\u0005R\u0000\u0000PQ\u0005_\u0000\u0000QR\u0005S\u0000"+
		"\u0000RS\u0005T\u0000\u0000ST\u0005A\u0000\u0000TU\u0005R\u0000\u0000"+
		"UV\u0005T\u0000\u0000V\u0018\u0001\u0000\u0000\u0000WX\u0005L\u0000\u0000"+
		"XY\u0005E\u0000\u0000YZ\u0005X\u0000\u0000Z[\u0005E\u0000\u0000[\\\u0005"+
		"R\u0000\u0000\\]\u0005_\u0000\u0000]^\u0005E\u0000\u0000^_\u0005N\u0000"+
		"\u0000_`\u0005D\u0000\u0000`\u001a\u0001\u0000\u0000\u0000ac\u0005<\u0000"+
		"\u0000bd\u0007\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000gh\u0005>\u0000\u0000h\u001c\u0001\u0000\u0000\u0000"+
		"ij\u0005P\u0000\u0000jk\u0005A\u0000\u0000kl\u0005R\u0000\u0000lm\u0005"+
		"S\u0000\u0000mn\u0005E\u0000\u0000no\u0005R\u0000\u0000op\u0005_\u0000"+
		"\u0000pq\u0005S\u0000\u0000qr\u0005T\u0000\u0000rs\u0005A\u0000\u0000"+
		"st\u0005R\u0000\u0000tu\u0005T\u0000\u0000u\u001e\u0001\u0000\u0000\u0000"+
		"vw\u0005P\u0000\u0000wx\u0005A\u0000\u0000xy\u0005R\u0000\u0000yz\u0005"+
		"S\u0000\u0000z{\u0005E\u0000\u0000{|\u0005R\u0000\u0000|}\u0005_\u0000"+
		"\u0000}~\u0005E\u0000\u0000~\u007f\u0005N\u0000\u0000\u007f\u0080\u0005"+
		"D\u0000\u0000\u0080 \u0001\u0000\u0000\u0000\u0081\u0083\u0005<\u0000"+
		"\u0000\u0082\u0084\u0007\u0001\u0000\u0000\u0083\u0082\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0005>\u0000\u0000\u0088\"\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0005\'\u0000\u0000\u008a\u008b\b\u0002\u0000\u0000\u008b"+
		"\u008c\u0005\'\u0000\u0000\u008c$\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0007\u0003\u0000\u0000\u008e&\u0001\u0000\u0000\u0000\u008f\u0090\u0007"+
		"\u0004\u0000\u0000\u0090(\u0001\u0000\u0000\u0000\u0091\u0092\u0007\u0005"+
		"\u0000\u0000\u0092*\u0001\u0000\u0000\u0000\u0093\u0094\u0005\\\u0000"+
		"\u0000\u0094\u0095\b\u0006\u0000\u0000\u0095,\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0005\\\u0000\u0000\u0097\u0098\u0007\u0007\u0000\u0000\u0098"+
		".\u0001\u0000\u0000\u0000\u0099\u009a\u0005\\\u0000\u0000\u009a\u009b"+
		"\u0007\b\u0000\u0000\u009b0\u0001\u0000\u0000\u0000\u009c\u009d\u0005"+
		":\u0000\u0000\u009d\u009e\u0005:\u0000\u0000\u009e\u009f\u0005=\u0000"+
		"\u0000\u009f2\u0001\u0000\u0000\u0000\u00a0\u00a2\u0007\t\u0000\u0000"+
		"\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0006\u0019\u0000\u0000"+
		"\u00a64\u0001\u0000\u0000\u0000\u0004\u0000e\u0085\u00a3\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}