// Generated from /Users/marco/Documents/Antlr/Paradigmi/src/main/antlr4/Grammar.g4 by ANTLR 4.13.2
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
		QUANTIFICATORE=1, LETTERA=2, CIFRA=3, METACHAR=4, SHORTCUT=5, OR=6, TOPEN=7, 
		TCLOSE=8, QOPEN=9, QCLOSE=10, GOPEN=11, GCLOSE=12, TRATTINO=13, NOT=14, 
		AOPEN=15, ACLOSE=16, EQUAL=17, VIRGOLA=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"QUANTIFICATORE", "LETTERA", "CIFRA", "METACHAR", "SHORTCUT", "OR", "TOPEN", 
			"TCLOSE", "QOPEN", "QCLOSE", "GOPEN", "GCLOSE", "TRATTINO", "NOT", "AOPEN", 
			"ACLOSE", "EQUAL", "VIRGOLA", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'|'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'-'", "'^'", "'<'", "'>'", "'::='", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "QUANTIFICATORE", "LETTERA", "CIFRA", "METACHAR", "SHORTCUT", "OR", 
			"TOPEN", "TCLOSE", "QOPEN", "QCLOSE", "GOPEN", "GCLOSE", "TRATTINO", 
			"NOT", "AOPEN", "ACLOSE", "EQUAL", "VIRGOLA", "WS"
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
		"\u0004\u0000\u0013V\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0004\u0012Q\b\u0012\u000b\u0012"+
		"\f\u0012R\u0001\u0012\u0001\u0012\u0000\u0000\u0013\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\u0001\u0000\u0006\u0002\u0000*+??\u0002\u0000AZ"+
		"az\u0001\u000009\u0005\u0000(+-.??[^{}\u0006\u0000DDSSWWddssww\u0003\u0000"+
		"\t\n\r\r  V\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003)\u0001"+
		"\u0000\u0000\u0000\u0005+\u0001\u0000\u0000\u0000\u0007-\u0001\u0000\u0000"+
		"\u0000\t0\u0001\u0000\u0000\u0000\u000b3\u0001\u0000\u0000\u0000\r5\u0001"+
		"\u0000\u0000\u0000\u000f7\u0001\u0000\u0000\u0000\u00119\u0001\u0000\u0000"+
		"\u0000\u0013;\u0001\u0000\u0000\u0000\u0015=\u0001\u0000\u0000\u0000\u0017"+
		"?\u0001\u0000\u0000\u0000\u0019A\u0001\u0000\u0000\u0000\u001bC\u0001"+
		"\u0000\u0000\u0000\u001dE\u0001\u0000\u0000\u0000\u001fG\u0001\u0000\u0000"+
		"\u0000!I\u0001\u0000\u0000\u0000#M\u0001\u0000\u0000\u0000%P\u0001\u0000"+
		"\u0000\u0000\'(\u0007\u0000\u0000\u0000(\u0002\u0001\u0000\u0000\u0000"+
		")*\u0007\u0001\u0000\u0000*\u0004\u0001\u0000\u0000\u0000+,\u0007\u0002"+
		"\u0000\u0000,\u0006\u0001\u0000\u0000\u0000-.\u0005\\\u0000\u0000./\u0007"+
		"\u0003\u0000\u0000/\b\u0001\u0000\u0000\u000001\u0005\\\u0000\u000012"+
		"\u0007\u0004\u0000\u00002\n\u0001\u0000\u0000\u000034\u0005|\u0000\u0000"+
		"4\f\u0001\u0000\u0000\u000056\u0005(\u0000\u00006\u000e\u0001\u0000\u0000"+
		"\u000078\u0005)\u0000\u00008\u0010\u0001\u0000\u0000\u00009:\u0005[\u0000"+
		"\u0000:\u0012\u0001\u0000\u0000\u0000;<\u0005]\u0000\u0000<\u0014\u0001"+
		"\u0000\u0000\u0000=>\u0005{\u0000\u0000>\u0016\u0001\u0000\u0000\u0000"+
		"?@\u0005}\u0000\u0000@\u0018\u0001\u0000\u0000\u0000AB\u0005-\u0000\u0000"+
		"B\u001a\u0001\u0000\u0000\u0000CD\u0005^\u0000\u0000D\u001c\u0001\u0000"+
		"\u0000\u0000EF\u0005<\u0000\u0000F\u001e\u0001\u0000\u0000\u0000GH\u0005"+
		">\u0000\u0000H \u0001\u0000\u0000\u0000IJ\u0005:\u0000\u0000JK\u0005:"+
		"\u0000\u0000KL\u0005=\u0000\u0000L\"\u0001\u0000\u0000\u0000MN\u0005,"+
		"\u0000\u0000N$\u0001\u0000\u0000\u0000OQ\u0007\u0005\u0000\u0000PO\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000"+
		"RS\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0006\u0012\u0000"+
		"\u0000U&\u0001\u0000\u0000\u0000\u0002\u0000R\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}