// Generated from C:/Universita/Magistrale/Paradigmi/Paradigmi_2025/src/main/antlr4/Grammar.g4 by ANTLR 4.13.2
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
		QUANTIFICATORE=1, LETTERA=2, CIFRA=3, METACHAR=4, SHORTCUT=5, OR=6, TOPEN=7, 
		TCLOSE=8, QOPEN=9, QCLOSE=10, GOPEN=11, GCLOSE=12, TRATTINO=13, NOT=14, 
		AOPEN=15, ACLOSE=16, EQUAL=17, VIRGOLA=18, WS=19;
	public static final int
		RULE_start = 0, RULE_token = 1, RULE_atom = 2, RULE_quantificatore = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "token", "atom", "quantificatore"
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

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public List<TokenContext> token() {
			return getRuleContexts(TokenContext.class);
		}
		public TokenContext token(int i) {
			return getRuleContext(TokenContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 700L) != 0)) {
				{
				{
				setState(8);
				token();
				}
				}
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class TokenContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public QuantificatoreContext quantificatore() {
			return getRuleContext(QuantificatoreContext.class,0);
		}
		public TokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenContext token() throws RecognitionException {
		TokenContext _localctx = new TokenContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_token);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			atom();
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUANTIFICATORE || _la==GOPEN) {
				{
				setState(15);
				quantificatore();
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
	public static class AtomContext extends ParserRuleContext {
		public List<TerminalNode> LETTERA() { return getTokens(GrammarParser.LETTERA); }
		public TerminalNode LETTERA(int i) {
			return getToken(GrammarParser.LETTERA, i);
		}
		public List<TerminalNode> CIFRA() { return getTokens(GrammarParser.CIFRA); }
		public TerminalNode CIFRA(int i) {
			return getToken(GrammarParser.CIFRA, i);
		}
		public TerminalNode METACHAR() { return getToken(GrammarParser.METACHAR, 0); }
		public TerminalNode SHORTCUT() { return getToken(GrammarParser.SHORTCUT, 0); }
		public TerminalNode QOPEN() { return getToken(GrammarParser.QOPEN, 0); }
		public TerminalNode QCLOSE() { return getToken(GrammarParser.QCLOSE, 0); }
		public TerminalNode NOT() { return getToken(GrammarParser.NOT, 0); }
		public List<TerminalNode> TRATTINO() { return getTokens(GrammarParser.TRATTINO); }
		public TerminalNode TRATTINO(int i) {
			return getToken(GrammarParser.TRATTINO, i);
		}
		public TerminalNode TOPEN() { return getToken(GrammarParser.TOPEN, 0); }
		public TerminalNode TCLOSE() { return getToken(GrammarParser.TCLOSE, 0); }
		public List<TokenContext> token() {
			return getRuleContexts(TokenContext.class);
		}
		public TokenContext token(int i) {
			return getRuleContext(TokenContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(GrammarParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(GrammarParser.OR, i);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atom);
		int _la;
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTERA:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				match(LETTERA);
				}
				break;
			case CIFRA:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				match(CIFRA);
				}
				break;
			case METACHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				match(METACHAR);
				}
				break;
			case SHORTCUT:
				enterOuterAlt(_localctx, 4);
				{
				setState(21);
				match(SHORTCUT);
				}
				break;
			case QOPEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(22);
				match(QOPEN);
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(23);
					match(NOT);
					}
				}

				setState(38);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(27); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(26);
						_la = _input.LA(1);
						if ( !(_la==LETTERA || _la==CIFRA) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(29); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LETTERA || _la==CIFRA );
					}
					break;
				case 2:
					{
					setState(34); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(31);
						_la = _input.LA(1);
						if ( !(_la==LETTERA || _la==CIFRA) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(32);
						match(TRATTINO);
						setState(33);
						_la = _input.LA(1);
						if ( !(_la==LETTERA || _la==CIFRA) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(36); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LETTERA || _la==CIFRA );
					}
					break;
				}
				setState(40);
				match(QCLOSE);
				}
				break;
			case TOPEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(41);
				match(TOPEN);
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(42);
					token();
					}
					}
					setState(45); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 700L) != 0) );
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
					{
					setState(47);
					match(OR);
					setState(48);
					token();
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(54);
				match(TCLOSE);
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
	public static class QuantificatoreContext extends ParserRuleContext {
		public TerminalNode QUANTIFICATORE() { return getToken(GrammarParser.QUANTIFICATORE, 0); }
		public TerminalNode GOPEN() { return getToken(GrammarParser.GOPEN, 0); }
		public TerminalNode GCLOSE() { return getToken(GrammarParser.GCLOSE, 0); }
		public List<TerminalNode> CIFRA() { return getTokens(GrammarParser.CIFRA); }
		public TerminalNode CIFRA(int i) {
			return getToken(GrammarParser.CIFRA, i);
		}
		public TerminalNode VIRGOLA() { return getToken(GrammarParser.VIRGOLA, 0); }
		public QuantificatoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantificatore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterQuantificatore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitQuantificatore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitQuantificatore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantificatoreContext quantificatore() throws RecognitionException {
		QuantificatoreContext _localctx = new QuantificatoreContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_quantificatore);
		int _la;
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUANTIFICATORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(QUANTIFICATORE);
				}
				break;
			case GOPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(GOPEN);
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(60);
					match(CIFRA);
					}
					}
					setState(63); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CIFRA );
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VIRGOLA) {
					{
					setState(65);
					match(VIRGOLA);
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==CIFRA) {
						{
						{
						setState(66);
						match(CIFRA);
						}
						}
						setState(71);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(74);
				match(GCLOSE);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0013N\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0005\u0000\n\b"+
		"\u0000\n\u0000\f\u0000\r\t\u0000\u0001\u0001\u0001\u0001\u0003\u0001\u0011"+
		"\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u0019\b\u0002\u0001\u0002\u0004\u0002\u001c\b\u0002"+
		"\u000b\u0002\f\u0002\u001d\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002"+
		"#\b\u0002\u000b\u0002\f\u0002$\u0003\u0002\'\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0004\u0002,\b\u0002\u000b\u0002\f\u0002-\u0001\u0002"+
		"\u0001\u0002\u0005\u00022\b\u0002\n\u0002\f\u00025\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u00029\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0004\u0003>\b\u0003\u000b\u0003\f\u0003?\u0001\u0003\u0001\u0003\u0005"+
		"\u0003D\b\u0003\n\u0003\f\u0003G\t\u0003\u0003\u0003I\b\u0003\u0001\u0003"+
		"\u0003\u0003L\b\u0003\u0001\u0003\u0000\u0000\u0004\u0000\u0002\u0004"+
		"\u0006\u0000\u0001\u0001\u0000\u0002\u0003Z\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0002\u000e\u0001\u0000\u0000\u0000\u00048\u0001\u0000\u0000\u0000"+
		"\u0006K\u0001\u0000\u0000\u0000\b\n\u0003\u0002\u0001\u0000\t\b\u0001"+
		"\u0000\u0000\u0000\n\r\u0001\u0000\u0000\u0000\u000b\t\u0001\u0000\u0000"+
		"\u0000\u000b\f\u0001\u0000\u0000\u0000\f\u0001\u0001\u0000\u0000\u0000"+
		"\r\u000b\u0001\u0000\u0000\u0000\u000e\u0010\u0003\u0004\u0002\u0000\u000f"+
		"\u0011\u0003\u0006\u0003\u0000\u0010\u000f\u0001\u0000\u0000\u0000\u0010"+
		"\u0011\u0001\u0000\u0000\u0000\u0011\u0003\u0001\u0000\u0000\u0000\u0012"+
		"9\u0005\u0002\u0000\u0000\u00139\u0005\u0003\u0000\u0000\u00149\u0005"+
		"\u0004\u0000\u0000\u00159\u0005\u0005\u0000\u0000\u0016\u0018\u0005\t"+
		"\u0000\u0000\u0017\u0019\u0005\u000e\u0000\u0000\u0018\u0017\u0001\u0000"+
		"\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019&\u0001\u0000\u0000"+
		"\u0000\u001a\u001c\u0007\u0000\u0000\u0000\u001b\u001a\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\'\u0001\u0000\u0000\u0000"+
		"\u001f \u0007\u0000\u0000\u0000 !\u0005\r\u0000\u0000!#\u0007\u0000\u0000"+
		"\u0000\"\u001f\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\"\u0001"+
		"\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%\'\u0001\u0000\u0000\u0000"+
		"&\u001b\u0001\u0000\u0000\u0000&\"\u0001\u0000\u0000\u0000\'(\u0001\u0000"+
		"\u0000\u0000(9\u0005\n\u0000\u0000)+\u0005\u0007\u0000\u0000*,\u0003\u0002"+
		"\u0001\u0000+*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-+\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.3\u0001\u0000\u0000\u0000"+
		"/0\u0005\u0006\u0000\u000002\u0003\u0002\u0001\u00001/\u0001\u0000\u0000"+
		"\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000"+
		"\u0000\u000046\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000067\u0005"+
		"\b\u0000\u000079\u0001\u0000\u0000\u00008\u0012\u0001\u0000\u0000\u0000"+
		"8\u0013\u0001\u0000\u0000\u00008\u0014\u0001\u0000\u0000\u00008\u0015"+
		"\u0001\u0000\u0000\u00008\u0016\u0001\u0000\u0000\u00008)\u0001\u0000"+
		"\u0000\u00009\u0005\u0001\u0000\u0000\u0000:L\u0005\u0001\u0000\u0000"+
		";=\u0005\u000b\u0000\u0000<>\u0005\u0003\u0000\u0000=<\u0001\u0000\u0000"+
		"\u0000>?\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@H\u0001\u0000\u0000\u0000AE\u0005\u0012\u0000\u0000BD\u0005"+
		"\u0003\u0000\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000"+
		"EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000"+
		"\u0000GE\u0001\u0000\u0000\u0000HA\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0005\f\u0000\u0000K:\u0001\u0000"+
		"\u0000\u0000K;\u0001\u0000\u0000\u0000L\u0007\u0001\u0000\u0000\u0000"+
		"\r\u000b\u0010\u0018\u001d$&-38?EHK";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}