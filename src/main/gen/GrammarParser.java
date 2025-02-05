// Generated from C:/Users/fullm/IdeaProjects/Paradigmi_2025/src/main/antlr4/Grammar.g4 by ANTLR 4.13.2

    import java.io.FileWriter;
    import java.io.IOException;

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
		RULE_s_seq = 4, RULE_s_expr_aux = 5, RULE_s_term = 6, RULE_s_group = 7, 
		RULE_l_section = 8, RULE_l_rule = 9, RULE_l_reg_exp = 10, RULE_l_quant = 11, 
		RULE_l_atom = 12, RULE_l_interval = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "s_section", "s_rule", "s_expr", "s_seq", "s_expr_aux", "s_term", 
			"s_group", "l_section", "l_rule", "l_reg_exp", "l_quant", "l_atom", "l_interval"
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


	    static FileWriter writer;
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
			setState(29);
			s_section();
			setState(30);
			l_section();
			setState(31);
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
			setState(34);
			match(S_START);
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35);
				s_rule();
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==S_TOKEN );
			setState(40);
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
		public Token S_TOKEN;
		public S_exprContext s_expr;
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
			setState(42);
			((S_ruleContext)_localctx).S_TOKEN = match(S_TOKEN);
			setState(43);
			match(EQUAL);
			setState(44);
			((S_ruleContext)_localctx).s_expr = s_expr();
			setState(45);
			match(T__0);

			        String ruleName = (((S_ruleContext)_localctx).S_TOKEN!=null?((S_ruleContext)_localctx).S_TOKEN.getText():null).replaceAll("[<>]", "");
			        writeToFile(ruleName.toLowerCase() + " : " + ((S_ruleContext)_localctx).s_expr.value + ";");
			    
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
			setState(48);
			((S_exprContext)_localctx).e1 = s_seq();
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(49);
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
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__4:
			case T__6:
			case L_TOKEN:
			case S_TOKEN:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				((S_seqContext)_localctx).e1 = s_term();
				setState(56);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(55);
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
			case T__5:
			case T__7:
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
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(T__1);
				setState(64);
				((S_expr_auxContext)_localctx).e1 = s_seq();
				setState(66);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(65);
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
			case T__5:
			case T__7:
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
		public Token S_TOKEN;
		public Token L_TOKEN;
		public Token CHAR;
		public S_groupContext s_group;
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
		enterRule(_localctx, 12, RULE_s_term);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case S_TOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				((S_termContext)_localctx).S_TOKEN = match(S_TOKEN);
				 ((S_termContext)_localctx).value =  (((S_termContext)_localctx).S_TOKEN!=null?((S_termContext)_localctx).S_TOKEN.getText():null).replaceAll("[<>]", ""); 
				}
				break;
			case L_TOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				((S_termContext)_localctx).L_TOKEN = match(L_TOKEN);
				 ((S_termContext)_localctx).value =  (((S_termContext)_localctx).L_TOKEN!=null?((S_termContext)_localctx).L_TOKEN.getText():null).replaceAll("[<>]", ""); 
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				((S_termContext)_localctx).CHAR = match(CHAR);
				 ((S_termContext)_localctx).value =  (((S_termContext)_localctx).CHAR!=null?((S_termContext)_localctx).CHAR.getText():null); 
				}
				break;
			case T__2:
			case T__4:
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				((S_termContext)_localctx).s_group = s_group();
				 ((S_termContext)_localctx).value =  ((S_termContext)_localctx).s_group.value; 
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
		public String value;
		public S_exprContext e;
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
		enterRule(_localctx, 14, RULE_s_group);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(T__2);
				setState(85);
				((S_groupContext)_localctx).e = s_expr();
				setState(86);
				match(T__3);
				 ((S_groupContext)_localctx).value =  "(" + ((S_groupContext)_localctx).e.value + ")"; 
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(T__4);
				setState(90);
				((S_groupContext)_localctx).e = s_expr();
				setState(91);
				match(T__5);
				 ((S_groupContext)_localctx).value =  "(" + ((S_groupContext)_localctx).e.value + ")" + "?"; 
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(T__6);
				setState(95);
				((S_groupContext)_localctx).e = s_expr();
				setState(96);
				match(T__7);
				 ((S_groupContext)_localctx).value =  "(" + ((S_groupContext)_localctx).e.value + ")" + "+"; 
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
		enterRule(_localctx, 16, RULE_l_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(L_START);
			setState(103); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(102);
				l_rule();
				}
				}
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==L_TOKEN );
			setState(107);
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
		public Token L_TOKEN;
		public L_reg_expContext l_reg_exp;
		public TerminalNode L_TOKEN() { return getToken(GrammarParser.L_TOKEN, 0); }
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
		enterRule(_localctx, 18, RULE_l_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			((L_ruleContext)_localctx).L_TOKEN = match(L_TOKEN);
			setState(110);
			match(EQUAL);
			setState(111);
			((L_ruleContext)_localctx).l_reg_exp = l_reg_exp();
			setState(112);
			match(T__0);

			        String tokenName = (((L_ruleContext)_localctx).L_TOKEN!=null?((L_ruleContext)_localctx).L_TOKEN.getText():null).replaceAll("[<>]", "");
			        writeToFile(tokenName.toUpperCase() + " : " + ((L_ruleContext)_localctx).l_reg_exp.value + ";");
			    
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
		public L_atomContext l_atom;
		public L_quantContext l_quant;
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
		enterRule(_localctx, 20, RULE_l_reg_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(115);
				((L_reg_expContext)_localctx).l_atom = l_atom();
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6 || _la==QUANTIFICATORE) {
					{
					setState(116);
					((L_reg_expContext)_localctx).l_quant = l_quant();
					}
				}

				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 31458344L) != 0) );
			 ((L_reg_expContext)_localctx).value =  ((L_reg_expContext)_localctx).l_atom.value + ((((L_reg_expContext)_localctx).l_quant!=null?_input.getText(((L_reg_expContext)_localctx).l_quant.start,((L_reg_expContext)_localctx).l_quant.stop):null) != null ? (((L_reg_expContext)_localctx).l_quant!=null?_input.getText(((L_reg_expContext)_localctx).l_quant.start,((L_reg_expContext)_localctx).l_quant.stop):null) : ""); 
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
		enterRule(_localctx, 22, RULE_l_quant);
		int _la;
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUANTIFICATORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(QUANTIFICATORE);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(T__6);
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(127);
					match(CIFRA);
					}
					}
					setState(130); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CIFRA );
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(132);
					match(T__8);
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==CIFRA) {
						{
						{
						setState(133);
						match(CIFRA);
						}
						}
						setState(138);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(141);
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
		public String value;
		public Token LETTERA;
		public Token CIFRA;
		public Token METACHAR;
		public Token SHORTCUT;
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
		enterRule(_localctx, 24, RULE_l_atom);
		int _la;
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTERA:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				((L_atomContext)_localctx).LETTERA = match(LETTERA);
				 ((L_atomContext)_localctx).value =  "'" + (((L_atomContext)_localctx).LETTERA!=null?((L_atomContext)_localctx).LETTERA.getText():null) + "'"; 
				}
				break;
			case CIFRA:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				((L_atomContext)_localctx).CIFRA = match(CIFRA);
				 ((L_atomContext)_localctx).value =  "'" + (((L_atomContext)_localctx).CIFRA!=null?((L_atomContext)_localctx).CIFRA.getText():null) + "'"; 
				}
				break;
			case METACHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				((L_atomContext)_localctx).METACHAR = match(METACHAR);
				 ((L_atomContext)_localctx).value =  "'" + (((L_atomContext)_localctx).METACHAR!=null?((L_atomContext)_localctx).METACHAR.getText():null) + "'"; 
				}
				break;
			case SHORTCUT:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				((L_atomContext)_localctx).SHORTCUT = match(SHORTCUT);
				 ((L_atomContext)_localctx).value =  "'" + (((L_atomContext)_localctx).SHORTCUT!=null?((L_atomContext)_localctx).SHORTCUT.getText():null) + "'"; 
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				match(T__9);
				 ((L_atomContext)_localctx).value =  "'_'"; 
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				match(T__4);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(155);
					match(T__10);
					}
				}

				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(160);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(158);
						l_interval();
						}
						break;
					case 2:
						{
						setState(159);
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
					setState(162); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 14681088L) != 0) );
				setState(164);
				match(T__5);
				 ((L_atomContext)_localctx).value =  _input.getText(_localctx.start, _input.LT(-1)); 
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 7);
				{
				setState(166);
				match(T__2);
				setState(171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(167);
					l_atom();
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__6 || _la==QUANTIFICATORE) {
						{
						setState(168);
						l_quant();
						}
					}

					}
					}
					setState(173); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 31458344L) != 0) );
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(175);
					match(T__1);
					setState(176);
					l_atom();
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__6 || _la==QUANTIFICATORE) {
						{
						setState(177);
						l_quant();
						}
					}

					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(185);
				match(T__3);
				 ((L_atomContext)_localctx).value =  _input.getText(_localctx.start, _input.LT(-1)); 
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
		enterRule(_localctx, 26, RULE_l_interval);
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTERA:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(190);
				match(LETTERA);
				setState(191);
				match(T__11);
				setState(192);
				match(LETTERA);
				}
				}
				break;
			case CIFRA:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(193);
				match(CIFRA);
				setState(194);
				match(T__11);
				setState(195);
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
		"\u0004\u0001\u001a\u00c7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0004\u0001%\b"+
		"\u0001\u000b\u0001\f\u0001&\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0003\u00033\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0003\u00049\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004>\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005C\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005H\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006S\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007d\b\u0007\u0001\b\u0001\b\u0004\bh\b\b\u000b\b"+
		"\f\bi\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0003\nv\b\n\u0004\nx\b\n\u000b\n\f\ny\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u0081\b\u000b\u000b"+
		"\u000b\f\u000b\u0082\u0001\u000b\u0001\u000b\u0005\u000b\u0087\b\u000b"+
		"\n\u000b\f\u000b\u008a\t\u000b\u0003\u000b\u008c\b\u000b\u0001\u000b\u0003"+
		"\u000b\u008f\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u009d\b\f\u0001\f\u0001"+
		"\f\u0004\f\u00a1\b\f\u000b\f\f\f\u00a2\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0003\f\u00aa\b\f\u0004\f\u00ac\b\f\u000b\f\f\f\u00ad\u0001\f"+
		"\u0001\f\u0001\f\u0003\f\u00b3\b\f\u0005\f\u00b5\b\f\n\f\f\f\u00b8\t\f"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u00bd\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00c5\b\r\u0001\r\u0000\u0000\u000e\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0001"+
		"\u0002\u0000\n\n\u0015\u0017\u00d8\u0000\u001c\u0001\u0000\u0000\u0000"+
		"\u0002\"\u0001\u0000\u0000\u0000\u0004*\u0001\u0000\u0000\u0000\u0006"+
		"0\u0001\u0000\u0000\u0000\b=\u0001\u0000\u0000\u0000\nG\u0001\u0000\u0000"+
		"\u0000\fR\u0001\u0000\u0000\u0000\u000ec\u0001\u0000\u0000\u0000\u0010"+
		"e\u0001\u0000\u0000\u0000\u0012m\u0001\u0000\u0000\u0000\u0014w\u0001"+
		"\u0000\u0000\u0000\u0016\u008e\u0001\u0000\u0000\u0000\u0018\u00bc\u0001"+
		"\u0000\u0000\u0000\u001a\u00c4\u0001\u0000\u0000\u0000\u001c\u001d\u0006"+
		"\u0000\uffff\uffff\u0000\u001d\u001e\u0003\u0002\u0001\u0000\u001e\u001f"+
		"\u0003\u0010\b\u0000\u001f \u0005\u0000\u0000\u0001 !\u0006\u0000\uffff"+
		"\uffff\u0000!\u0001\u0001\u0000\u0000\u0000\"$\u0005\u0010\u0000\u0000"+
		"#%\u0003\u0004\u0002\u0000$#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000"+
		"\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'(\u0001\u0000"+
		"\u0000\u0000()\u0005\u0011\u0000\u0000)\u0003\u0001\u0000\u0000\u0000"+
		"*+\u0005\u0012\u0000\u0000+,\u0005\u0019\u0000\u0000,-\u0003\u0006\u0003"+
		"\u0000-.\u0005\u0001\u0000\u0000./\u0006\u0002\uffff\uffff\u0000/\u0005"+
		"\u0001\u0000\u0000\u000002\u0003\b\u0004\u000013\u0003\n\u0005\u00002"+
		"1\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0001\u0000\u0000"+
		"\u000045\u0006\u0003\uffff\uffff\u00005\u0007\u0001\u0000\u0000\u0000"+
		"68\u0003\f\u0006\u000079\u0003\b\u0004\u000087\u0001\u0000\u0000\u0000"+
		"89\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0006\u0004\uffff"+
		"\uffff\u0000;>\u0001\u0000\u0000\u0000<>\u0006\u0004\uffff\uffff\u0000"+
		"=6\u0001\u0000\u0000\u0000=<\u0001\u0000\u0000\u0000>\t\u0001\u0000\u0000"+
		"\u0000?@\u0005\u0002\u0000\u0000@B\u0003\b\u0004\u0000AC\u0003\n\u0005"+
		"\u0000BA\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0001\u0000"+
		"\u0000\u0000DE\u0006\u0005\uffff\uffff\u0000EH\u0001\u0000\u0000\u0000"+
		"FH\u0006\u0005\uffff\uffff\u0000G?\u0001\u0000\u0000\u0000GF\u0001\u0000"+
		"\u0000\u0000H\u000b\u0001\u0000\u0000\u0000IJ\u0005\u0012\u0000\u0000"+
		"JS\u0006\u0006\uffff\uffff\u0000KL\u0005\u000f\u0000\u0000LS\u0006\u0006"+
		"\uffff\uffff\u0000MN\u0005\u0013\u0000\u0000NS\u0006\u0006\uffff\uffff"+
		"\u0000OP\u0003\u000e\u0007\u0000PQ\u0006\u0006\uffff\uffff\u0000QS\u0001"+
		"\u0000\u0000\u0000RI\u0001\u0000\u0000\u0000RK\u0001\u0000\u0000\u0000"+
		"RM\u0001\u0000\u0000\u0000RO\u0001\u0000\u0000\u0000S\r\u0001\u0000\u0000"+
		"\u0000TU\u0005\u0003\u0000\u0000UV\u0003\u0006\u0003\u0000VW\u0005\u0004"+
		"\u0000\u0000WX\u0006\u0007\uffff\uffff\u0000Xd\u0001\u0000\u0000\u0000"+
		"YZ\u0005\u0005\u0000\u0000Z[\u0003\u0006\u0003\u0000[\\\u0005\u0006\u0000"+
		"\u0000\\]\u0006\u0007\uffff\uffff\u0000]d\u0001\u0000\u0000\u0000^_\u0005"+
		"\u0007\u0000\u0000_`\u0003\u0006\u0003\u0000`a\u0005\b\u0000\u0000ab\u0006"+
		"\u0007\uffff\uffff\u0000bd\u0001\u0000\u0000\u0000cT\u0001\u0000\u0000"+
		"\u0000cY\u0001\u0000\u0000\u0000c^\u0001\u0000\u0000\u0000d\u000f\u0001"+
		"\u0000\u0000\u0000eg\u0005\r\u0000\u0000fh\u0003\u0012\t\u0000gf\u0001"+
		"\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0005\u000e\u0000"+
		"\u0000l\u0011\u0001\u0000\u0000\u0000mn\u0005\u000f\u0000\u0000no\u0005"+
		"\u0019\u0000\u0000op\u0003\u0014\n\u0000pq\u0005\u0001\u0000\u0000qr\u0006"+
		"\t\uffff\uffff\u0000r\u0013\u0001\u0000\u0000\u0000su\u0003\u0018\f\u0000"+
		"tv\u0003\u0016\u000b\u0000ut\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000vx\u0001\u0000\u0000\u0000ws\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{|\u0006\n\uffff\uffff\u0000|\u0015\u0001\u0000\u0000"+
		"\u0000}\u008f\u0005\u0014\u0000\u0000~\u0080\u0005\u0007\u0000\u0000\u007f"+
		"\u0081\u0005\u0016\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0001\u0000\u0000\u0000\u0083\u008b\u0001\u0000\u0000\u0000\u0084"+
		"\u0088\u0005\t\u0000\u0000\u0085\u0087\u0005\u0016\u0000\u0000\u0086\u0085"+
		"\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008c"+
		"\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u0084"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0001\u0000\u0000\u0000\u008d\u008f\u0005\b\u0000\u0000\u008e}\u0001"+
		"\u0000\u0000\u0000\u008e~\u0001\u0000\u0000\u0000\u008f\u0017\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0005\u0015\u0000\u0000\u0091\u00bd\u0006\f\uffff"+
		"\uffff\u0000\u0092\u0093\u0005\u0016\u0000\u0000\u0093\u00bd\u0006\f\uffff"+
		"\uffff\u0000\u0094\u0095\u0005\u0017\u0000\u0000\u0095\u00bd\u0006\f\uffff"+
		"\uffff\u0000\u0096\u0097\u0005\u0018\u0000\u0000\u0097\u00bd\u0006\f\uffff"+
		"\uffff\u0000\u0098\u0099\u0005\n\u0000\u0000\u0099\u00bd\u0006\f\uffff"+
		"\uffff\u0000\u009a\u009c\u0005\u0005\u0000\u0000\u009b\u009d\u0005\u000b"+
		"\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000"+
		"\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u00a1\u0003\u001a"+
		"\r\u0000\u009f\u00a1\u0007\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000"+
		"\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u0006\u0000"+
		"\u0000\u00a5\u00bd\u0006\f\uffff\uffff\u0000\u00a6\u00ab\u0005\u0003\u0000"+
		"\u0000\u00a7\u00a9\u0003\u0018\f\u0000\u00a8\u00aa\u0003\u0016\u000b\u0000"+
		"\u00a9\u00a8\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a7\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b6\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0005\u0002\u0000\u0000\u00b0\u00b2\u0003\u0018\f\u0000\u00b1"+
		"\u00b3\u0003\u0016\u000b\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4"+
		"\u00af\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0005\u0004\u0000\u0000\u00ba\u00bb\u0006\f\uffff\uffff\u0000\u00bb"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bc\u0090\u0001\u0000\u0000\u0000\u00bc"+
		"\u0092\u0001\u0000\u0000\u0000\u00bc\u0094\u0001\u0000\u0000\u0000\u00bc"+
		"\u0096\u0001\u0000\u0000\u0000\u00bc\u0098\u0001\u0000\u0000\u0000\u00bc"+
		"\u009a\u0001\u0000\u0000\u0000\u00bc\u00a6\u0001\u0000\u0000\u0000\u00bd"+
		"\u0019\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u0015\u0000\u0000\u00bf"+
		"\u00c0\u0005\f\u0000\u0000\u00c0\u00c5\u0005\u0015\u0000\u0000\u00c1\u00c2"+
		"\u0005\u0016\u0000\u0000\u00c2\u00c3\u0005\f\u0000\u0000\u00c3\u00c5\u0005"+
		"\u0016\u0000\u0000\u00c4\u00be\u0001\u0000\u0000\u0000\u00c4\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c5\u001b\u0001\u0000\u0000\u0000\u0018&28=BGRci"+
		"uy\u0082\u0088\u008b\u008e\u009c\u00a0\u00a2\u00a9\u00ad\u00b2\u00b6\u00bc"+
		"\u00c4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}