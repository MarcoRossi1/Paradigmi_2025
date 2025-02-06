// Generated from C:/Users/fullm/IdeaProjects/Paradigmi_2025/src/main/antlr4/Grammar.g4 by ANTLR 4.13.2

    import java.io.*;
    import java.util.*;

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
		NON_TERM=17, S_CHAR=18, QUANTIFICATORE=19, NUM=20, CHAR=21, METACHAR=22, 
		SHORTCUT=23, EQUAL=24, WS=25;
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
			"S_CHAR", "QUANTIFICATORE", "NUM", "CHAR", "METACHAR", "SHORTCUT", "EQUAL", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'|'", "'('", "')'", "'['", "']'", "'{'", "'}'", "','", 
			"'^'", "'-'", "'LEXER_START'", "'LEXER_END'", null, "'PARSER_START'", 
			"'PARSER_END'", null, null, null, null, null, null, null, "'::='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"L_START", "L_END", "TERM", "S_START", "S_END", "NON_TERM", "S_CHAR", 
			"QUANTIFICATORE", "NUM", "CHAR", "METACHAR", "SHORTCUT", "EQUAL", "WS"
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
		"\u0004\u0000\u0019\u00a5\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0004\rb\b\r\u000b\r\f\rc\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0004"+
		"\u0010\u0082\b\u0010\u000b\u0010\f\u0010\u0083\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0004\u0013\u008f\b\u0013\u000b\u0013\f\u0013\u0090\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0004\u0018\u00a0\b\u0018\u000b\u0018\f\u0018\u00a1\u0001\u0018"+
		"\u0001\u0018\u0000\u0000\u0019\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017/\u00181\u0019\u0001\u0000\b\u0002\u0000"+
		"AZ__\u0002\u0000__az\u0003\u0000\n\n\r\r\'\'\u0002\u0000*+??\u0001\u0000"+
		"09\u0004\u000009AZ__az\u0006\u0000DDSSWWddssww\u0003\u0000\t\n\r\r  \u00a8"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00013\u0001\u0000"+
		"\u0000\u0000\u00035\u0001\u0000\u0000\u0000\u00057\u0001\u0000\u0000\u0000"+
		"\u00079\u0001\u0000\u0000\u0000\t;\u0001\u0000\u0000\u0000\u000b=\u0001"+
		"\u0000\u0000\u0000\r?\u0001\u0000\u0000\u0000\u000fA\u0001\u0000\u0000"+
		"\u0000\u0011C\u0001\u0000\u0000\u0000\u0013E\u0001\u0000\u0000\u0000\u0015"+
		"G\u0001\u0000\u0000\u0000\u0017I\u0001\u0000\u0000\u0000\u0019U\u0001"+
		"\u0000\u0000\u0000\u001b_\u0001\u0000\u0000\u0000\u001dg\u0001\u0000\u0000"+
		"\u0000\u001ft\u0001\u0000\u0000\u0000!\u007f\u0001\u0000\u0000\u0000#"+
		"\u0087\u0001\u0000\u0000\u0000%\u008b\u0001\u0000\u0000\u0000\'\u008e"+
		"\u0001\u0000\u0000\u0000)\u0092\u0001\u0000\u0000\u0000+\u0094\u0001\u0000"+
		"\u0000\u0000-\u0097\u0001\u0000\u0000\u0000/\u009a\u0001\u0000\u0000\u0000"+
		"1\u009f\u0001\u0000\u0000\u000034\u0005;\u0000\u00004\u0002\u0001\u0000"+
		"\u0000\u000056\u0005|\u0000\u00006\u0004\u0001\u0000\u0000\u000078\u0005"+
		"(\u0000\u00008\u0006\u0001\u0000\u0000\u00009:\u0005)\u0000\u0000:\b\u0001"+
		"\u0000\u0000\u0000;<\u0005[\u0000\u0000<\n\u0001\u0000\u0000\u0000=>\u0005"+
		"]\u0000\u0000>\f\u0001\u0000\u0000\u0000?@\u0005{\u0000\u0000@\u000e\u0001"+
		"\u0000\u0000\u0000AB\u0005}\u0000\u0000B\u0010\u0001\u0000\u0000\u0000"+
		"CD\u0005,\u0000\u0000D\u0012\u0001\u0000\u0000\u0000EF\u0005^\u0000\u0000"+
		"F\u0014\u0001\u0000\u0000\u0000GH\u0005-\u0000\u0000H\u0016\u0001\u0000"+
		"\u0000\u0000IJ\u0005L\u0000\u0000JK\u0005E\u0000\u0000KL\u0005X\u0000"+
		"\u0000LM\u0005E\u0000\u0000MN\u0005R\u0000\u0000NO\u0005_\u0000\u0000"+
		"OP\u0005S\u0000\u0000PQ\u0005T\u0000\u0000QR\u0005A\u0000\u0000RS\u0005"+
		"R\u0000\u0000ST\u0005T\u0000\u0000T\u0018\u0001\u0000\u0000\u0000UV\u0005"+
		"L\u0000\u0000VW\u0005E\u0000\u0000WX\u0005X\u0000\u0000XY\u0005E\u0000"+
		"\u0000YZ\u0005R\u0000\u0000Z[\u0005_\u0000\u0000[\\\u0005E\u0000\u0000"+
		"\\]\u0005N\u0000\u0000]^\u0005D\u0000\u0000^\u001a\u0001\u0000\u0000\u0000"+
		"_a\u0005<\u0000\u0000`b\u0007\u0000\u0000\u0000a`\u0001\u0000\u0000\u0000"+
		"bc\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000ef\u0005>\u0000\u0000f\u001c\u0001\u0000"+
		"\u0000\u0000gh\u0005P\u0000\u0000hi\u0005A\u0000\u0000ij\u0005R\u0000"+
		"\u0000jk\u0005S\u0000\u0000kl\u0005E\u0000\u0000lm\u0005R\u0000\u0000"+
		"mn\u0005_\u0000\u0000no\u0005S\u0000\u0000op\u0005T\u0000\u0000pq\u0005"+
		"A\u0000\u0000qr\u0005R\u0000\u0000rs\u0005T\u0000\u0000s\u001e\u0001\u0000"+
		"\u0000\u0000tu\u0005P\u0000\u0000uv\u0005A\u0000\u0000vw\u0005R\u0000"+
		"\u0000wx\u0005S\u0000\u0000xy\u0005E\u0000\u0000yz\u0005R\u0000\u0000"+
		"z{\u0005_\u0000\u0000{|\u0005E\u0000\u0000|}\u0005N\u0000\u0000}~\u0005"+
		"D\u0000\u0000~ \u0001\u0000\u0000\u0000\u007f\u0081\u0005<\u0000\u0000"+
		"\u0080\u0082\u0007\u0001\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0005>\u0000\u0000\u0086\"\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0005\'\u0000\u0000\u0088\u0089\b\u0002\u0000\u0000\u0089\u008a"+
		"\u0005\'\u0000\u0000\u008a$\u0001\u0000\u0000\u0000\u008b\u008c\u0007"+
		"\u0003\u0000\u0000\u008c&\u0001\u0000\u0000\u0000\u008d\u008f\u0007\u0004"+
		"\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000"+
		"\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000"+
		"\u0000\u0000\u0091(\u0001\u0000\u0000\u0000\u0092\u0093\u0007\u0005\u0000"+
		"\u0000\u0093*\u0001\u0000\u0000\u0000\u0094\u0095\u0005\\\u0000\u0000"+
		"\u0095\u0096\b\u0005\u0000\u0000\u0096,\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0005\\\u0000\u0000\u0098\u0099\u0007\u0006\u0000\u0000\u0099."+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0005:\u0000\u0000\u009b\u009c\u0005"+
		":\u0000\u0000\u009c\u009d\u0005=\u0000\u0000\u009d0\u0001\u0000\u0000"+
		"\u0000\u009e\u00a0\u0007\u0007\u0000\u0000\u009f\u009e\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0006\u0018\u0000\u0000\u00a42\u0001\u0000\u0000\u0000"+
		"\u0005\u0000c\u0083\u0090\u00a1\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}