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
		T__9=10, T__10=11, L_START=12, L_END=13, SKIP_CHARS=14, TERM=15, S_START=16, 
		S_END=17, NON_TERM=18, S_CHAR=19, QUANTIFICATORE=20, CIFRA=21, CHAR=22, 
		METACHAR=23, SHORTCUT=24, ESCAPE=25, EQUAL=26, WS=27;
	public static final int
		RULE_start = 0, RULE_s_section = 1, RULE_s_rule = 2, RULE_s_expr = 3, 
		RULE_s_seq = 4, RULE_s_expr_aux = 5, RULE_s_term = 6, RULE_s_atom = 7, 
		RULE_s_brackets_atom = 8, RULE_l_section = 9, RULE_l_skip = 10, RULE_l_rule = 11, 
		RULE_l_reg_exp = 12, RULE_l_reg_exp_part = 13, RULE_l_quant = 14, RULE_l_atom = 15, 
		RULE_l_simple_atom = 16, RULE_l_atom_group = 17, RULE_l_interval = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "s_section", "s_rule", "s_expr", "s_seq", "s_expr_aux", "s_term", 
			"s_atom", "s_brackets_atom", "l_section", "l_skip", "l_rule", "l_reg_exp", 
			"l_reg_exp_part", "l_quant", "l_atom", "l_simple_atom", "l_atom_group", 
			"l_interval"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'|'", "'('", "')'", "'['", "']'", "'{'", "'}'", "','", 
			"'^'", "'-'", "'LEXER_START'", "'LEXER_END'", "'SKIP_CHARS'", null, "'PARSER_START'", 
			"'PARSER_END'", null, null, null, null, null, null, null, null, "'::='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"L_START", "L_END", "SKIP_CHARS", "TERM", "S_START", "S_END", "NON_TERM", 
			"S_CHAR", "QUANTIFICATORE", "CIFRA", "CHAR", "METACHAR", "SHORTCUT", 
			"ESCAPE", "EQUAL", "WS"
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
			setState(38);
			s_section();
			setState(39);
			l_section();
			setState(40);
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
			setState(50);
			match(NON_TERM);
			setState(51);
			match(EQUAL);
			setState(52);
			s_expr();
			setState(53);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			((S_exprContext)_localctx).e1 = s_seq();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(56);
				((S_exprContext)_localctx).e2 = s_expr_aux();
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
	public static class S_seqContext extends ParserRuleContext {
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			((S_seqContext)_localctx).e1 = s_term();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 819368L) != 0)) {
				{
				setState(60);
				((S_seqContext)_localctx).e2 = s_seq();
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
	public static class S_expr_auxContext extends ParserRuleContext {
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__1);
			setState(64);
			((S_expr_auxContext)_localctx).e1 = s_seq();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(65);
				((S_expr_auxContext)_localctx).e2 = s_expr_aux();
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
	public static class S_termContext extends ParserRuleContext {
		public S_atomContext e;
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
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case TERM:
			case NON_TERM:
			case S_CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				((S_termContext)_localctx).e = s_atom();
				}
				break;
			case T__4:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				s_brackets_atom();
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
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NON_TERM:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(NON_TERM);
				}
				break;
			case TERM:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(TERM);
				}
				break;
			case S_CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(S_CHAR);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				match(T__2);
				setState(76);
				((S_atomContext)_localctx).e = s_expr();
				setState(77);
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
	public static class S_brackets_atomContext extends ParserRuleContext {
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
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(T__4);
				setState(82);
				((S_brackets_atomContext)_localctx).e = s_atom();
				setState(83);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(T__6);
				setState(86);
				((S_brackets_atomContext)_localctx).e = s_atom();
				setState(87);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				match(T__6);
				setState(90);
				match(T__4);
				setState(91);
				((S_brackets_atomContext)_localctx).e = s_atom();
				setState(92);
				match(T__5);
				setState(93);
				match(T__7);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				match(T__4);
				setState(96);
				match(T__6);
				setState(97);
				((S_brackets_atomContext)_localctx).e = s_atom();
				setState(98);
				match(T__7);
				setState(99);
				match(T__5);
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
		public L_skipContext l_skip() {
			return getRuleContext(L_skipContext.class,0);
		}
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
			setState(103);
			match(L_START);
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104);
				l_rule();
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TERM );
			setState(109);
			l_skip();
			setState(110);
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
	public static class L_skipContext extends ParserRuleContext {
		public TerminalNode SKIP_CHARS() { return getToken(GrammarParser.SKIP_CHARS, 0); }
		public List<L_ruleContext> l_rule() {
			return getRuleContexts(L_ruleContext.class);
		}
		public L_ruleContext l_rule(int i) {
			return getRuleContext(L_ruleContext.class,i);
		}
		public L_skipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_skip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterL_skip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitL_skip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitL_skip(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_skipContext l_skip() throws RecognitionException {
		L_skipContext _localctx = new L_skipContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_l_skip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(SKIP_CHARS);
			setState(114); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(113);
				l_rule();
				}
				}
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TERM );
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
		enterRule(_localctx, 22, RULE_l_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(TERM);
			setState(119);
			match(EQUAL);
			setState(120);
			l_reg_exp();
			setState(121);
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
		enterRule(_localctx, 24, RULE_l_reg_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(123);
				((L_reg_expContext)_localctx).part1 = l_reg_exp_part();
				}
				}
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 65011752L) != 0) );
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(128);
				match(T__1);
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(129);
					((L_reg_expContext)_localctx).part2 = l_reg_exp_part();
					}
					}
					setState(132); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 65011752L) != 0) );
				}
				}
				setState(138);
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
	public static class L_reg_exp_partContext extends ParserRuleContext {
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
		enterRule(_localctx, 26, RULE_l_reg_exp_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			l_atom();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6 || _la==QUANTIFICATORE) {
				{
				setState(140);
				l_quant();
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
		enterRule(_localctx, 28, RULE_l_quant);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(T__6);
				setState(145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(144);
					((L_quantContext)_localctx).cifra1 = match(CIFRA);
					}
					}
					setState(147); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CIFRA );
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(149);
					match(T__8);
					setState(151); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(150);
						((L_quantContext)_localctx).cifra2 = match(CIFRA);
						}
						}
						setState(153); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CIFRA );
					}
				}

				setState(157);
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
				setState(159);
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
		enterRule(_localctx, 30, RULE_l_atom);
		try {
			setState(164);
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
				setState(162);
				l_simple_atom();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				l_atom_group();
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
		enterRule(_localctx, 32, RULE_l_simple_atom);
		int _la;
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(CHAR);
				}
				break;
			case CIFRA:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(CIFRA);
				}
				break;
			case ESCAPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(ESCAPE);
				}
				break;
			case METACHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				match(METACHAR);
				}
				break;
			case SHORTCUT:
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				match(SHORTCUT);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 6);
				{
				setState(171);
				match(T__4);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(172);
					match(T__9);
					}
				}

				setState(180); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(180);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(175);
						l_interval();
						}
						break;
					case 2:
						{
						setState(176);
						match(CHAR);
						}
						break;
					case 3:
						{
						setState(177);
						match(CIFRA);
						}
						break;
					case 4:
						{
						setState(178);
						match(ESCAPE);
						}
						break;
					case 5:
						{
						setState(179);
						match(METACHAR);
						}
						break;
					}
					}
					setState(182); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 48234496L) != 0) );
				setState(184);
				match(T__5);
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
		enterRule(_localctx, 34, RULE_l_atom_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__2);
			setState(188);
			((L_atom_groupContext)_localctx).s1 = l_reg_exp();
			setState(189);
			match(T__3);
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
		enterRule(_localctx, 36, RULE_l_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(191);
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
			setState(192);
			match(T__10);
			setState(193);
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
		"\u0004\u0001\u001b\u00c6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0004\u0001-\b\u0001\u000b\u0001\f\u0001.\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0003\u0003:\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004"+
		">\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005C\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0003\u0006G\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007P\b"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\bf\b\b\u0001\t\u0001\t\u0004\tj\b\t\u000b"+
		"\t\f\tk\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0004\ns\b\n\u000b\n\f"+
		"\nt\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0004\f}\b\f\u000b\f\f\f~\u0001\f\u0001\f\u0004\f\u0083\b\f\u000b\f"+
		"\f\f\u0084\u0005\f\u0087\b\f\n\f\f\f\u008a\t\f\u0001\r\u0001\r\u0003\r"+
		"\u008e\b\r\u0001\u000e\u0001\u000e\u0004\u000e\u0092\b\u000e\u000b\u000e"+
		"\f\u000e\u0093\u0001\u000e\u0001\u000e\u0004\u000e\u0098\b\u000e\u000b"+
		"\u000e\f\u000e\u0099\u0003\u000e\u009c\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00a1\b\u000e\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00a5\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u00ae\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u00b5\b\u0010\u000b\u0010"+
		"\f\u0010\u00b6\u0001\u0010\u0003\u0010\u00ba\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0000\u0000\u0013\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$\u0000\u0001\u0001\u0000\u0015\u0016\u00d3\u0000&\u0001\u0000\u0000"+
		"\u0000\u0002*\u0001\u0000\u0000\u0000\u00042\u0001\u0000\u0000\u0000\u0006"+
		"7\u0001\u0000\u0000\u0000\b;\u0001\u0000\u0000\u0000\n?\u0001\u0000\u0000"+
		"\u0000\fF\u0001\u0000\u0000\u0000\u000eO\u0001\u0000\u0000\u0000\u0010"+
		"e\u0001\u0000\u0000\u0000\u0012g\u0001\u0000\u0000\u0000\u0014p\u0001"+
		"\u0000\u0000\u0000\u0016v\u0001\u0000\u0000\u0000\u0018|\u0001\u0000\u0000"+
		"\u0000\u001a\u008b\u0001\u0000\u0000\u0000\u001c\u00a0\u0001\u0000\u0000"+
		"\u0000\u001e\u00a4\u0001\u0000\u0000\u0000 \u00b9\u0001\u0000\u0000\u0000"+
		"\"\u00bb\u0001\u0000\u0000\u0000$\u00bf\u0001\u0000\u0000\u0000&\'\u0003"+
		"\u0002\u0001\u0000\'(\u0003\u0012\t\u0000()\u0005\u0000\u0000\u0001)\u0001"+
		"\u0001\u0000\u0000\u0000*,\u0005\u0010\u0000\u0000+-\u0003\u0004\u0002"+
		"\u0000,+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.,\u0001\u0000"+
		"\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000001\u0005"+
		"\u0011\u0000\u00001\u0003\u0001\u0000\u0000\u000023\u0005\u0012\u0000"+
		"\u000034\u0005\u001a\u0000\u000045\u0003\u0006\u0003\u000056\u0005\u0001"+
		"\u0000\u00006\u0005\u0001\u0000\u0000\u000079\u0003\b\u0004\u00008:\u0003"+
		"\n\u0005\u000098\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:\u0007"+
		"\u0001\u0000\u0000\u0000;=\u0003\f\u0006\u0000<>\u0003\b\u0004\u0000="+
		"<\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>\t\u0001\u0000\u0000"+
		"\u0000?@\u0005\u0002\u0000\u0000@B\u0003\b\u0004\u0000AC\u0003\n\u0005"+
		"\u0000BA\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\u000b\u0001"+
		"\u0000\u0000\u0000DG\u0003\u000e\u0007\u0000EG\u0003\u0010\b\u0000FD\u0001"+
		"\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000G\r\u0001\u0000\u0000\u0000"+
		"HP\u0005\u0012\u0000\u0000IP\u0005\u000f\u0000\u0000JP\u0005\u0013\u0000"+
		"\u0000KL\u0005\u0003\u0000\u0000LM\u0003\u0006\u0003\u0000MN\u0005\u0004"+
		"\u0000\u0000NP\u0001\u0000\u0000\u0000OH\u0001\u0000\u0000\u0000OI\u0001"+
		"\u0000\u0000\u0000OJ\u0001\u0000\u0000\u0000OK\u0001\u0000\u0000\u0000"+
		"P\u000f\u0001\u0000\u0000\u0000QR\u0005\u0005\u0000\u0000RS\u0003\u000e"+
		"\u0007\u0000ST\u0005\u0006\u0000\u0000Tf\u0001\u0000\u0000\u0000UV\u0005"+
		"\u0007\u0000\u0000VW\u0003\u000e\u0007\u0000WX\u0005\b\u0000\u0000Xf\u0001"+
		"\u0000\u0000\u0000YZ\u0005\u0007\u0000\u0000Z[\u0005\u0005\u0000\u0000"+
		"[\\\u0003\u000e\u0007\u0000\\]\u0005\u0006\u0000\u0000]^\u0005\b\u0000"+
		"\u0000^f\u0001\u0000\u0000\u0000_`\u0005\u0005\u0000\u0000`a\u0005\u0007"+
		"\u0000\u0000ab\u0003\u000e\u0007\u0000bc\u0005\b\u0000\u0000cd\u0005\u0006"+
		"\u0000\u0000df\u0001\u0000\u0000\u0000eQ\u0001\u0000\u0000\u0000eU\u0001"+
		"\u0000\u0000\u0000eY\u0001\u0000\u0000\u0000e_\u0001\u0000\u0000\u0000"+
		"f\u0011\u0001\u0000\u0000\u0000gi\u0005\f\u0000\u0000hj\u0003\u0016\u000b"+
		"\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000ki\u0001\u0000"+
		"\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0003"+
		"\u0014\n\u0000no\u0005\r\u0000\u0000o\u0013\u0001\u0000\u0000\u0000pr"+
		"\u0005\u000e\u0000\u0000qs\u0003\u0016\u000b\u0000rq\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000"+
		"\u0000\u0000u\u0015\u0001\u0000\u0000\u0000vw\u0005\u000f\u0000\u0000"+
		"wx\u0005\u001a\u0000\u0000xy\u0003\u0018\f\u0000yz\u0005\u0001\u0000\u0000"+
		"z\u0017\u0001\u0000\u0000\u0000{}\u0003\u001a\r\u0000|{\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001"+
		"\u0000\u0000\u0000\u007f\u0088\u0001\u0000\u0000\u0000\u0080\u0082\u0005"+
		"\u0002\u0000\u0000\u0081\u0083\u0003\u001a\r\u0000\u0082\u0081\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0087\u0001\u0000"+
		"\u0000\u0000\u0086\u0080\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000"+
		"\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000"+
		"\u0000\u0000\u0089\u0019\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008b\u008d\u0003\u001e\u000f\u0000\u008c\u008e\u0003\u001c"+
		"\u000e\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e\u001b\u0001\u0000\u0000\u0000\u008f\u0091\u0005\u0007"+
		"\u0000\u0000\u0090\u0092\u0005\u0015\u0000\u0000\u0091\u0090\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u009b\u0001\u0000"+
		"\u0000\u0000\u0095\u0097\u0005\t\u0000\u0000\u0096\u0098\u0005\u0015\u0000"+
		"\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0095\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0005\b\u0000\u0000\u009e\u00a1\u0006\u000e\uffff\uffff"+
		"\u0000\u009f\u00a1\u0005\u0014\u0000\u0000\u00a0\u008f\u0001\u0000\u0000"+
		"\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u001d\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a5\u0003 \u0010\u0000\u00a3\u00a5\u0003\"\u0011\u0000"+
		"\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a5\u001f\u0001\u0000\u0000\u0000\u00a6\u00ba\u0005\u0016\u0000\u0000"+
		"\u00a7\u00ba\u0005\u0015\u0000\u0000\u00a8\u00ba\u0005\u0019\u0000\u0000"+
		"\u00a9\u00ba\u0005\u0017\u0000\u0000\u00aa\u00ba\u0005\u0018\u0000\u0000"+
		"\u00ab\u00ad\u0005\u0005\u0000\u0000\u00ac\u00ae\u0005\n\u0000\u0000\u00ad"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae"+
		"\u00b4\u0001\u0000\u0000\u0000\u00af\u00b5\u0003$\u0012\u0000\u00b0\u00b5"+
		"\u0005\u0016\u0000\u0000\u00b1\u00b5\u0005\u0015\u0000\u0000\u00b2\u00b5"+
		"\u0005\u0019\u0000\u0000\u00b3\u00b5\u0005\u0017\u0000\u0000\u00b4\u00af"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b0\u0001\u0000\u0000\u0000\u00b4\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b8\u00ba\u0005\u0006\u0000\u0000\u00b9\u00a6"+
		"\u0001\u0000\u0000\u0000\u00b9\u00a7\u0001\u0000\u0000\u0000\u00b9\u00a8"+
		"\u0001\u0000\u0000\u0000\u00b9\u00a9\u0001\u0000\u0000\u0000\u00b9\u00aa"+
		"\u0001\u0000\u0000\u0000\u00b9\u00ab\u0001\u0000\u0000\u0000\u00ba!\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0005\u0003\u0000\u0000\u00bc\u00bd\u0003"+
		"\u0018\f\u0000\u00bd\u00be\u0005\u0004\u0000\u0000\u00be#\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0007\u0000\u0000\u0000\u00c0\u00c1\u0005\u000b"+
		"\u0000\u0000\u00c1\u00c2\u0007\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0006\u0012\uffff\uffff\u0000\u00c4%\u0001\u0000"+
		"\u0000\u0000\u0016.9=BFOekt~\u0084\u0088\u008d\u0093\u0099\u009b\u00a0"+
		"\u00a4\u00ad\u00b4\u00b6\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}