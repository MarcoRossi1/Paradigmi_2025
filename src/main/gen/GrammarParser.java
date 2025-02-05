// Generated from C:/Users/fullm/IdeaProjects/Paradigmi_2025/src/main/antlr4/Grammar.g4 by ANTLR 4.13.2
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
		T__9=10, T__10=11, T__11=12, L_START=13, L_END=14, L_TOKEN=15, S_START=16, 
		S_END=17, S_TOKEN=18, CHAR=19, QUANTIFICATORE=20, LETTERA=21, CIFRA=22, 
		METACHAR=23, SHORTCUT=24, EQUAL=25, WS=26;
	public static final int
		RULE_start = 0, RULE_s_section = 1, RULE_s_rule = 2, RULE_s_expr = 3, 
		RULE_s_term = 4, RULE_s_group = 5, RULE_l_section = 6, RULE_l_assegn = 7, 
		RULE_l_reg_exp = 8, RULE_l_quant = 9, RULE_l_atom = 10, RULE_l_interval = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "s_section", "s_rule", "s_expr", "s_term", "s_group", "l_section", 
			"l_assegn", "l_reg_exp", "l_quant", "l_atom", "l_interval"
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
		public L_sectionContext l_section() {
			return getRuleContext(L_sectionContext.class,0);
		}
		public S_sectionContext s_section() {
			return getRuleContext(S_sectionContext.class,0);
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
			setState(24);
			l_section();
			setState(25);
			s_section();
			setState(26);
			match(EOF);
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
			setState(28);
			match(S_START);
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(29);
				s_rule();
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==S_TOKEN );
			setState(34);
			match(S_END);
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
		public TerminalNode S_TOKEN() { return getToken(GrammarParser.S_TOKEN, 0); }
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
			setState(36);
			match(S_TOKEN);
			setState(37);
			match(EQUAL);
			setState(38);
			s_expr();
			setState(39);
			match(T__0);
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
		public List<S_termContext> s_term() {
			return getRuleContexts(S_termContext.class);
		}
		public S_termContext s_term(int i) {
			return getRuleContext(S_termContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				s_term();
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 819368L) != 0) );
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(46);
				match(T__1);
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(47);
					s_term();
					}
					}
					setState(50); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 819368L) != 0) );
				}
				}
				setState(56);
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
	public static class S_termContext extends ParserRuleContext {
		public TerminalNode S_TOKEN() { return getToken(GrammarParser.S_TOKEN, 0); }
		public TerminalNode L_TOKEN() { return getToken(GrammarParser.L_TOKEN, 0); }
		public TerminalNode CHAR() { return getToken(GrammarParser.CHAR, 0); }
		public S_groupContext s_group() {
			return getRuleContext(S_groupContext.class,0);
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
		enterRule(_localctx, 8, RULE_s_term);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case S_TOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(S_TOKEN);
				}
				break;
			case L_TOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(L_TOKEN);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				match(CHAR);
				}
				break;
			case T__2:
			case T__4:
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				s_group();
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
	public static class S_groupContext extends ParserRuleContext {
		public S_exprContext s_expr() {
			return getRuleContext(S_exprContext.class,0);
		}
		public S_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterS_group(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitS_group(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitS_group(this);
			else return visitor.visitChildren(this);
		}
	}

	public final S_groupContext s_group() throws RecognitionException {
		S_groupContext _localctx = new S_groupContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_s_group);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(T__2);
				setState(64);
				s_expr();
				setState(65);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(T__4);
				setState(68);
				s_expr();
				setState(69);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(T__6);
				setState(72);
				s_expr();
				setState(73);
				match(T__7);
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
	public static class L_sectionContext extends ParserRuleContext {
		public TerminalNode L_START() { return getToken(GrammarParser.L_START, 0); }
		public TerminalNode L_END() { return getToken(GrammarParser.L_END, 0); }
		public List<L_assegnContext> l_assegn() {
			return getRuleContexts(L_assegnContext.class);
		}
		public L_assegnContext l_assegn(int i) {
			return getRuleContext(L_assegnContext.class,i);
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
		enterRule(_localctx, 12, RULE_l_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(L_START);
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(78);
				l_assegn();
				}
				}
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==L_TOKEN );
			setState(83);
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
	public static class L_assegnContext extends ParserRuleContext {
		public TerminalNode L_TOKEN() { return getToken(GrammarParser.L_TOKEN, 0); }
		public TerminalNode EQUAL() { return getToken(GrammarParser.EQUAL, 0); }
		public L_reg_expContext l_reg_exp() {
			return getRuleContext(L_reg_expContext.class,0);
		}
		public L_assegnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_assegn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterL_assegn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitL_assegn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitL_assegn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_assegnContext l_assegn() throws RecognitionException {
		L_assegnContext _localctx = new L_assegnContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_l_assegn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(L_TOKEN);
			setState(86);
			match(EQUAL);
			setState(87);
			l_reg_exp();
			setState(88);
			match(T__0);
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
		public List<L_atomContext> l_atom() {
			return getRuleContexts(L_atomContext.class);
		}
		public L_atomContext l_atom(int i) {
			return getRuleContext(L_atomContext.class,i);
		}
		public List<L_quantContext> l_quant() {
			return getRuleContexts(L_quantContext.class);
		}
		public L_quantContext l_quant(int i) {
			return getRuleContext(L_quantContext.class,i);
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
		enterRule(_localctx, 16, RULE_l_reg_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				l_atom();
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6 || _la==QUANTIFICATORE) {
					{
					setState(91);
					l_quant();
					}
				}

				}
				}
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 31458344L) != 0) );
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
		public TerminalNode QUANTIFICATORE() { return getToken(GrammarParser.QUANTIFICATORE, 0); }
		public List<TerminalNode> CIFRA() { return getTokens(GrammarParser.CIFRA); }
		public TerminalNode CIFRA(int i) {
			return getToken(GrammarParser.CIFRA, i);
		}
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
		enterRule(_localctx, 18, RULE_l_quant);
		int _la;
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUANTIFICATORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(QUANTIFICATORE);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(T__6);
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(100);
					match(CIFRA);
					}
					}
					setState(103); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CIFRA );
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(105);
					match(T__8);
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==CIFRA) {
						{
						{
						setState(106);
						match(CIFRA);
						}
						}
						setState(111);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(114);
				match(T__7);
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
		public List<TerminalNode> LETTERA() { return getTokens(GrammarParser.LETTERA); }
		public TerminalNode LETTERA(int i) {
			return getToken(GrammarParser.LETTERA, i);
		}
		public List<TerminalNode> CIFRA() { return getTokens(GrammarParser.CIFRA); }
		public TerminalNode CIFRA(int i) {
			return getToken(GrammarParser.CIFRA, i);
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
		public List<L_atomContext> l_atom() {
			return getRuleContexts(L_atomContext.class);
		}
		public L_atomContext l_atom(int i) {
			return getRuleContext(L_atomContext.class,i);
		}
		public List<L_quantContext> l_quant() {
			return getRuleContexts(L_quantContext.class);
		}
		public L_quantContext l_quant(int i) {
			return getRuleContext(L_quantContext.class,i);
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
		enterRule(_localctx, 20, RULE_l_atom);
		int _la;
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTERA:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(LETTERA);
				}
				break;
			case CIFRA:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(CIFRA);
				}
				break;
			case METACHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(METACHAR);
				}
				break;
			case SHORTCUT:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				match(SHORTCUT);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
				match(T__9);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				match(T__4);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(123);
					match(T__10);
					}
				}

				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(128);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(126);
						l_interval();
						}
						break;
					case 2:
						{
						setState(127);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14681088L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					}
					setState(130); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 14681088L) != 0) );
				setState(132);
				match(T__5);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 7);
				{
				setState(133);
				match(T__2);
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(134);
					l_atom();
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__6 || _la==QUANTIFICATORE) {
						{
						setState(135);
						l_quant();
						}
					}

					}
					}
					setState(140); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 31458344L) != 0) );
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(142);
					match(T__1);
					setState(143);
					l_atom();
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__6 || _la==QUANTIFICATORE) {
						{
						setState(144);
						l_quant();
						}
					}

					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(152);
				match(T__3);
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
	public static class L_intervalContext extends ParserRuleContext {
		public List<TerminalNode> LETTERA() { return getTokens(GrammarParser.LETTERA); }
		public TerminalNode LETTERA(int i) {
			return getToken(GrammarParser.LETTERA, i);
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
		enterRule(_localctx, 22, RULE_l_interval);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTERA:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(156);
				match(LETTERA);
				setState(157);
				match(T__11);
				setState(158);
				match(LETTERA);
				}
				}
				break;
			case CIFRA:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(159);
				match(CIFRA);
				setState(160);
				match(T__11);
				setState(161);
				match(CIFRA);
				}
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
		"\u0004\u0001\u001a\u00a5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0004\u0001\u001f\b\u0001\u000b\u0001\f\u0001 \u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0004\u0003+\b\u0003\u000b\u0003\f\u0003,\u0001\u0003\u0001\u0003\u0004"+
		"\u00031\b\u0003\u000b\u0003\f\u00032\u0005\u00035\b\u0003\n\u0003\f\u0003"+
		"8\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		">\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005L\b\u0005\u0001\u0006\u0001\u0006\u0004\u0006"+
		"P\b\u0006\u000b\u0006\f\u0006Q\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b]\b"+
		"\b\u0004\b_\b\b\u000b\b\f\b`\u0001\t\u0001\t\u0001\t\u0004\tf\b\t\u000b"+
		"\t\f\tg\u0001\t\u0001\t\u0005\tl\b\t\n\t\f\to\t\t\u0003\tq\b\t\u0001\t"+
		"\u0003\tt\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0003\n}\b\n\u0001\n\u0001\n\u0004\n\u0081\b\n\u000b\n\f\n\u0082\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u0089\b\n\u0004\n\u008b\b\n\u000b\n"+
		"\f\n\u008c\u0001\n\u0001\n\u0001\n\u0003\n\u0092\b\n\u0005\n\u0094\b\n"+
		"\n\n\f\n\u0097\t\n\u0001\n\u0001\n\u0003\n\u009b\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00a3"+
		"\b\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0000\u0001\u0002\u0000\n\n\u0015\u0017\u00b6"+
		"\u0000\u0018\u0001\u0000\u0000\u0000\u0002\u001c\u0001\u0000\u0000\u0000"+
		"\u0004$\u0001\u0000\u0000\u0000\u0006*\u0001\u0000\u0000\u0000\b=\u0001"+
		"\u0000\u0000\u0000\nK\u0001\u0000\u0000\u0000\fM\u0001\u0000\u0000\u0000"+
		"\u000eU\u0001\u0000\u0000\u0000\u0010^\u0001\u0000\u0000\u0000\u0012s"+
		"\u0001\u0000\u0000\u0000\u0014\u009a\u0001\u0000\u0000\u0000\u0016\u00a2"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0003\f\u0006\u0000\u0019\u001a\u0003"+
		"\u0002\u0001\u0000\u001a\u001b\u0005\u0000\u0000\u0001\u001b\u0001\u0001"+
		"\u0000\u0000\u0000\u001c\u001e\u0005\u0010\u0000\u0000\u001d\u001f\u0003"+
		"\u0004\u0002\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000"+
		"\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000"+
		"!\"\u0001\u0000\u0000\u0000\"#\u0005\u0011\u0000\u0000#\u0003\u0001\u0000"+
		"\u0000\u0000$%\u0005\u0012\u0000\u0000%&\u0005\u0019\u0000\u0000&\'\u0003"+
		"\u0006\u0003\u0000\'(\u0005\u0001\u0000\u0000(\u0005\u0001\u0000\u0000"+
		"\u0000)+\u0003\b\u0004\u0000*)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000"+
		"\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-6\u0001\u0000"+
		"\u0000\u0000.0\u0005\u0002\u0000\u0000/1\u0003\b\u0004\u00000/\u0001\u0000"+
		"\u0000\u000012\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000023\u0001"+
		"\u0000\u0000\u000035\u0001\u0000\u0000\u00004.\u0001\u0000\u0000\u0000"+
		"58\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000"+
		"\u00007\u0007\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u00009>\u0005"+
		"\u0012\u0000\u0000:>\u0005\u000f\u0000\u0000;>\u0005\u0013\u0000\u0000"+
		"<>\u0003\n\u0005\u0000=9\u0001\u0000\u0000\u0000=:\u0001\u0000\u0000\u0000"+
		"=;\u0001\u0000\u0000\u0000=<\u0001\u0000\u0000\u0000>\t\u0001\u0000\u0000"+
		"\u0000?@\u0005\u0003\u0000\u0000@A\u0003\u0006\u0003\u0000AB\u0005\u0004"+
		"\u0000\u0000BL\u0001\u0000\u0000\u0000CD\u0005\u0005\u0000\u0000DE\u0003"+
		"\u0006\u0003\u0000EF\u0005\u0006\u0000\u0000FL\u0001\u0000\u0000\u0000"+
		"GH\u0005\u0007\u0000\u0000HI\u0003\u0006\u0003\u0000IJ\u0005\b\u0000\u0000"+
		"JL\u0001\u0000\u0000\u0000K?\u0001\u0000\u0000\u0000KC\u0001\u0000\u0000"+
		"\u0000KG\u0001\u0000\u0000\u0000L\u000b\u0001\u0000\u0000\u0000MO\u0005"+
		"\r\u0000\u0000NP\u0003\u000e\u0007\u0000ON\u0001\u0000\u0000\u0000PQ\u0001"+
		"\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000"+
		"RS\u0001\u0000\u0000\u0000ST\u0005\u000e\u0000\u0000T\r\u0001\u0000\u0000"+
		"\u0000UV\u0005\u000f\u0000\u0000VW\u0005\u0019\u0000\u0000WX\u0003\u0010"+
		"\b\u0000XY\u0005\u0001\u0000\u0000Y\u000f\u0001\u0000\u0000\u0000Z\\\u0003"+
		"\u0014\n\u0000[]\u0003\u0012\t\u0000\\[\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000]_\u0001\u0000\u0000\u0000^Z\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000a\u0011\u0001\u0000\u0000\u0000bt\u0005\u0014\u0000\u0000ce\u0005"+
		"\u0007\u0000\u0000df\u0005\u0016\u0000\u0000ed\u0001\u0000\u0000\u0000"+
		"fg\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000hp\u0001\u0000\u0000\u0000im\u0005\t\u0000\u0000jl\u0005\u0016\u0000"+
		"\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000pi\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000rt\u0005\b\u0000\u0000sb\u0001\u0000\u0000\u0000"+
		"sc\u0001\u0000\u0000\u0000t\u0013\u0001\u0000\u0000\u0000u\u009b\u0005"+
		"\u0015\u0000\u0000v\u009b\u0005\u0016\u0000\u0000w\u009b\u0005\u0017\u0000"+
		"\u0000x\u009b\u0005\u0018\u0000\u0000y\u009b\u0005\n\u0000\u0000z|\u0005"+
		"\u0005\u0000\u0000{}\u0005\u000b\u0000\u0000|{\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~\u0081\u0003"+
		"\u0016\u000b\u0000\u007f\u0081\u0007\u0000\u0000\u0000\u0080~\u0001\u0000"+
		"\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u009b\u0005\u0006"+
		"\u0000\u0000\u0085\u008a\u0005\u0003\u0000\u0000\u0086\u0088\u0003\u0014"+
		"\n\u0000\u0087\u0089\u0003\u0012\t\u0000\u0088\u0087\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008b\u0001\u0000\u0000"+
		"\u0000\u008a\u0086\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000"+
		"\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\u0095\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u0002\u0000"+
		"\u0000\u008f\u0091\u0003\u0014\n\u0000\u0090\u0092\u0003\u0012\t\u0000"+
		"\u0091\u0090\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000"+
		"\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u008e\u0001\u0000\u0000\u0000"+
		"\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0098\u0001\u0000\u0000\u0000"+
		"\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u0004\u0000\u0000"+
		"\u0099\u009b\u0001\u0000\u0000\u0000\u009au\u0001\u0000\u0000\u0000\u009a"+
		"v\u0001\u0000\u0000\u0000\u009aw\u0001\u0000\u0000\u0000\u009ax\u0001"+
		"\u0000\u0000\u0000\u009ay\u0001\u0000\u0000\u0000\u009az\u0001\u0000\u0000"+
		"\u0000\u009a\u0085\u0001\u0000\u0000\u0000\u009b\u0015\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0005\u0015\u0000\u0000\u009d\u009e\u0005\f\u0000\u0000"+
		"\u009e\u00a3\u0005\u0015\u0000\u0000\u009f\u00a0\u0005\u0016\u0000\u0000"+
		"\u00a0\u00a1\u0005\f\u0000\u0000\u00a1\u00a3\u0005\u0016\u0000\u0000\u00a2"+
		"\u009c\u0001\u0000\u0000\u0000\u00a2\u009f\u0001\u0000\u0000\u0000\u00a3"+
		"\u0017\u0001\u0000\u0000\u0000\u0016 ,26=KQ\\`gmps|\u0080\u0082\u0088"+
		"\u008c\u0091\u0095\u009a\u00a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}