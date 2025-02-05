// Generated from C:/Users/fullm/IdeaProjects/Paradigmi_2025/src/main/antlr4/Grammar.g4 by ANTLR 4.13.2
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
		T__9=10, T__10=11, T__11=12, L_START=13, L_END=14, L_TOKEN=15, S_START=16, 
		S_END=17, S_TOKEN=18, CHAR=19, QUANTIFICATORE=20, LETTERA=21, CIFRA=22, 
		METACHAR=23, SHORTCUT=24, EQUAL=25, WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "L_START", "L_END", "L_TOKEN", "S_START", "S_END", 
			"S_TOKEN", "CHAR", "QUANTIFICATORE", "LETTERA", "CIFRA", "METACHAR", 
			"SHORTCUT", "EQUAL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'|'", "'('", "')'", "'['", "']'", "'{'", "'}'", "','", 
			"'_'", "'^'", "'-'", "'LEXER_START'", "'LEXER_END'", null, "'PARSER_START'", 
			"'PARSER_END'", null, null, null, null, null, null, null, "'::='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "L_START", "L_END", "L_TOKEN", "S_START", "S_END", "S_TOKEN", "CHAR", 
			"QUANTIFICATORE", "LETTERA", "CIFRA", "METACHAR", "SHORTCUT", "EQUAL", 
			"WS"
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
		"\u0004\u0000\u001a\u00a6\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
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
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0004\u000ef\b\u000e\u000b\u000e\f\u000eg\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0004\u0011\u0086\b\u0011\u000b\u0011\f"+
		"\u0011\u0087\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0004\u0019\u00a1\b\u0019\u000b\u0019\f\u0019\u00a2\u0001\u0019\u0001"+
		"\u0019\u0000\u0000\u001a\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a\u0001\u0000\t\u0002\u0000"+
		"AZ__\u0002\u0000__az\u0003\u0000\n\n\r\r\'\'\u0002\u0000*+??\u0002\u0000"+
		"AZaz\u0001\u000009\u0004\u000009AZ__az\u0006\u0000DDSSWWddssww\u0003\u0000"+
		"\t\n\r\r  \u00a8\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00015\u0001\u0000\u0000\u0000\u00037\u0001"+
		"\u0000\u0000\u0000\u00059\u0001\u0000\u0000\u0000\u0007;\u0001\u0000\u0000"+
		"\u0000\t=\u0001\u0000\u0000\u0000\u000b?\u0001\u0000\u0000\u0000\rA\u0001"+
		"\u0000\u0000\u0000\u000fC\u0001\u0000\u0000\u0000\u0011E\u0001\u0000\u0000"+
		"\u0000\u0013G\u0001\u0000\u0000\u0000\u0015I\u0001\u0000\u0000\u0000\u0017"+
		"K\u0001\u0000\u0000\u0000\u0019M\u0001\u0000\u0000\u0000\u001bY\u0001"+
		"\u0000\u0000\u0000\u001dc\u0001\u0000\u0000\u0000\u001fk\u0001\u0000\u0000"+
		"\u0000!x\u0001\u0000\u0000\u0000#\u0083\u0001\u0000\u0000\u0000%\u008b"+
		"\u0001\u0000\u0000\u0000\'\u008f\u0001\u0000\u0000\u0000)\u0091\u0001"+
		"\u0000\u0000\u0000+\u0093\u0001\u0000\u0000\u0000-\u0095\u0001\u0000\u0000"+
		"\u0000/\u0098\u0001\u0000\u0000\u00001\u009b\u0001\u0000\u0000\u00003"+
		"\u00a0\u0001\u0000\u0000\u000056\u0005;\u0000\u00006\u0002\u0001\u0000"+
		"\u0000\u000078\u0005|\u0000\u00008\u0004\u0001\u0000\u0000\u00009:\u0005"+
		"(\u0000\u0000:\u0006\u0001\u0000\u0000\u0000;<\u0005)\u0000\u0000<\b\u0001"+
		"\u0000\u0000\u0000=>\u0005[\u0000\u0000>\n\u0001\u0000\u0000\u0000?@\u0005"+
		"]\u0000\u0000@\f\u0001\u0000\u0000\u0000AB\u0005{\u0000\u0000B\u000e\u0001"+
		"\u0000\u0000\u0000CD\u0005}\u0000\u0000D\u0010\u0001\u0000\u0000\u0000"+
		"EF\u0005,\u0000\u0000F\u0012\u0001\u0000\u0000\u0000GH\u0005_\u0000\u0000"+
		"H\u0014\u0001\u0000\u0000\u0000IJ\u0005^\u0000\u0000J\u0016\u0001\u0000"+
		"\u0000\u0000KL\u0005-\u0000\u0000L\u0018\u0001\u0000\u0000\u0000MN\u0005"+
		"L\u0000\u0000NO\u0005E\u0000\u0000OP\u0005X\u0000\u0000PQ\u0005E\u0000"+
		"\u0000QR\u0005R\u0000\u0000RS\u0005_\u0000\u0000ST\u0005S\u0000\u0000"+
		"TU\u0005T\u0000\u0000UV\u0005A\u0000\u0000VW\u0005R\u0000\u0000WX\u0005"+
		"T\u0000\u0000X\u001a\u0001\u0000\u0000\u0000YZ\u0005L\u0000\u0000Z[\u0005"+
		"E\u0000\u0000[\\\u0005X\u0000\u0000\\]\u0005E\u0000\u0000]^\u0005R\u0000"+
		"\u0000^_\u0005_\u0000\u0000_`\u0005E\u0000\u0000`a\u0005N\u0000\u0000"+
		"ab\u0005D\u0000\u0000b\u001c\u0001\u0000\u0000\u0000ce\u0005<\u0000\u0000"+
		"df\u0007\u0000\u0000\u0000ed\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000ij\u0005>\u0000\u0000j\u001e\u0001\u0000\u0000\u0000kl\u0005"+
		"P\u0000\u0000lm\u0005A\u0000\u0000mn\u0005R\u0000\u0000no\u0005S\u0000"+
		"\u0000op\u0005E\u0000\u0000pq\u0005R\u0000\u0000qr\u0005_\u0000\u0000"+
		"rs\u0005S\u0000\u0000st\u0005T\u0000\u0000tu\u0005A\u0000\u0000uv\u0005"+
		"R\u0000\u0000vw\u0005T\u0000\u0000w \u0001\u0000\u0000\u0000xy\u0005P"+
		"\u0000\u0000yz\u0005A\u0000\u0000z{\u0005R\u0000\u0000{|\u0005S\u0000"+
		"\u0000|}\u0005E\u0000\u0000}~\u0005R\u0000\u0000~\u007f\u0005_\u0000\u0000"+
		"\u007f\u0080\u0005E\u0000\u0000\u0080\u0081\u0005N\u0000\u0000\u0081\u0082"+
		"\u0005D\u0000\u0000\u0082\"\u0001\u0000\u0000\u0000\u0083\u0085\u0005"+
		"<\u0000\u0000\u0084\u0086\u0007\u0001\u0000\u0000\u0085\u0084\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0005>\u0000\u0000\u008a$\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0005\'\u0000\u0000\u008c\u008d\b\u0002\u0000\u0000\u008d"+
		"\u008e\u0005\'\u0000\u0000\u008e&\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0007\u0003\u0000\u0000\u0090(\u0001\u0000\u0000\u0000\u0091\u0092\u0007"+
		"\u0004\u0000\u0000\u0092*\u0001\u0000\u0000\u0000\u0093\u0094\u0007\u0005"+
		"\u0000\u0000\u0094,\u0001\u0000\u0000\u0000\u0095\u0096\u0005\\\u0000"+
		"\u0000\u0096\u0097\b\u0006\u0000\u0000\u0097.\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0005\\\u0000\u0000\u0099\u009a\u0007\u0007\u0000\u0000\u009a"+
		"0\u0001\u0000\u0000\u0000\u009b\u009c\u0005:\u0000\u0000\u009c\u009d\u0005"+
		":\u0000\u0000\u009d\u009e\u0005=\u0000\u0000\u009e2\u0001\u0000\u0000"+
		"\u0000\u009f\u00a1\u0007\b\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0006\u0019\u0000\u0000\u00a54\u0001\u0000\u0000\u0000\u0004"+
		"\u0000g\u0087\u00a2\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}