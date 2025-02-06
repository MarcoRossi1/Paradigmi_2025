// Generated from C:/Users/fullm/IdeaProjects/Paradigmi_2025/src/main/antlr4/Grammar.g4 by ANTLR 4.13.2

    import java.io.*;
    import java.util.*;

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
		NON_TERM=17, S_CHAR=18, QUANTIFICATORE=19, NUM=20, CHAR=21, METACHAR=22, 
		SHORTCUT=23, EQUAL=24, WS=25;
	public static final int
		RULE_start = 0, RULE_s_section = 1, RULE_s_rule = 2, RULE_s_expr = 3, 
		RULE_s_seq = 4, RULE_s_expr_aux = 5, RULE_s_term = 6, RULE_s_group = 7, 
		RULE_l_section = 8, RULE_l_rule = 9, RULE_l_reg_exp = 10, RULE_l_reg_exp_part = 11, 
		RULE_l_quant = 12, RULE_l_atom = 13, RULE_l_simple_atom = 14, RULE_l_atom_group = 15, 
		RULE_l_interval = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "s_section", "s_rule", "s_expr", "s_seq", "s_expr_aux", "s_term", 
			"s_group", "l_section", "l_rule", "l_reg_exp", "l_reg_exp_part", "l_quant", 
			"l_atom", "l_simple_atom", "l_atom_group", "l_interval"
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
			setState(35);
			s_section();
			setState(36);
			l_section();
			setState(37);
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
			setState(40);
			match(S_START);
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				s_rule();
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NON_TERM );
			setState(46);
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
			setState(48);
			((S_ruleContext)_localctx).NON_TERM = match(NON_TERM);
			setState(49);
			match(EQUAL);
			setState(50);
			((S_ruleContext)_localctx).s_expr = s_expr();
			setState(51);
			match(T__0);

			        String ruleName = (((S_ruleContext)_localctx).NON_TERM!=null?((S_ruleContext)_localctx).NON_TERM.getText():null).replaceAll("[<>]", "");
			        declaredNonTerms.add(ruleName.toLowerCase());
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
			setState(54);
			((S_exprContext)_localctx).e1 = s_seq();
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(55);
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
			setState(67);
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
				setState(60);
				((S_seqContext)_localctx).e1 = s_term();
				setState(62);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(61);
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
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(T__1);
				setState(70);
				((S_expr_auxContext)_localctx).e1 = s_seq();
				setState(72);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(71);
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
		public Token NON_TERM;
		public Token TERM;
		public Token S_CHAR;
		public S_groupContext s_group;
		public TerminalNode NON_TERM() { return getToken(GrammarParser.NON_TERM, 0); }
		public TerminalNode TERM() { return getToken(GrammarParser.TERM, 0); }
		public TerminalNode S_CHAR() { return getToken(GrammarParser.S_CHAR, 0); }
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
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NON_TERM:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				((S_termContext)_localctx).NON_TERM = match(NON_TERM);

				        String tokenName = (((S_termContext)_localctx).NON_TERM!=null?((S_termContext)_localctx).NON_TERM.getText():null).replaceAll("[<>]", "");
				        usedNonTerms.add(tokenName.toLowerCase());
				        ((S_termContext)_localctx).value =  tokenName;
				    
				}
				break;
			case TERM:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				((S_termContext)_localctx).TERM = match(TERM);

				        String tokenName = (((S_termContext)_localctx).TERM!=null?((S_termContext)_localctx).TERM.getText():null).replaceAll("[<>]", "");
				        usedTerms.add(tokenName.toUpperCase());
				        ((S_termContext)_localctx).value =  tokenName;
				    
				}
				break;
			case S_CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				((S_termContext)_localctx).S_CHAR = match(S_CHAR);
				 ((S_termContext)_localctx).value =  (((S_termContext)_localctx).S_CHAR!=null?((S_termContext)_localctx).S_CHAR.getText():null); 
				}
				break;
			case T__2:
			case T__4:
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
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
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(T__2);
				setState(91);
				((S_groupContext)_localctx).e = s_expr();
				setState(92);
				match(T__3);
				 ((S_groupContext)_localctx).value =  "(" + ((S_groupContext)_localctx).e.value + ")"; 
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(T__4);
				setState(96);
				((S_groupContext)_localctx).e = s_expr();
				setState(97);
				match(T__5);
				 ((S_groupContext)_localctx).value =  "(" + ((S_groupContext)_localctx).e.value + ")?"; 
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(T__6);
				setState(101);
				((S_groupContext)_localctx).e = s_expr();
				setState(102);
				match(T__7);
				 ((S_groupContext)_localctx).value =  "(" + ((S_groupContext)_localctx).e.value + ")+"; 
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
			setState(107);
			match(L_START);
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108);
				l_rule();
				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TERM );
			setState(113);
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
		enterRule(_localctx, 18, RULE_l_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			((L_ruleContext)_localctx).TERM = match(TERM);
			setState(116);
			match(EQUAL);
			setState(117);
			((L_ruleContext)_localctx).l_reg_exp = l_reg_exp();
			setState(118);
			match(T__0);

			        String tokenName = (((L_ruleContext)_localctx).TERM!=null?((L_ruleContext)_localctx).TERM.getText():null).replaceAll("[<>]", "");
			        declaredTerms.add(tokenName.toUpperCase());
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
		enterRule(_localctx, 20, RULE_l_reg_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 StringBuilder sb = new StringBuilder(); 
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(122);
				((L_reg_expContext)_localctx).part1 = l_reg_exp_part();
				 sb.append(((L_reg_expContext)_localctx).part1.value).append(" "); 
				}
				}
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 14680104L) != 0) );
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(129);
				match(T__1);
				 sb.append("|"); 
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(131);
					((L_reg_expContext)_localctx).part2 = l_reg_exp_part();
					 sb.append(((L_reg_expContext)_localctx).part2.value).append(" "); 
					}
					}
					setState(136); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 14680104L) != 0) );
				}
				}
				setState(142);
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
		enterRule(_localctx, 22, RULE_l_reg_exp_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			((L_reg_exp_partContext)_localctx).l_atom = l_atom();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6 || _la==QUANTIFICATORE) {
				{
				setState(146);
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
		public Token num1;
		public Token num2;
		public List<TerminalNode> NUM() { return getTokens(GrammarParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(GrammarParser.NUM, i);
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
		enterRule(_localctx, 24, RULE_l_quant);
		int _la;
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(T__6);
				setState(152);
				((L_quantContext)_localctx).num1 = match(NUM);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(153);
					match(T__8);
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NUM) {
						{
						setState(154);
						((L_quantContext)_localctx).num2 = match(NUM);
						}
					}

					}
				}

				setState(159);
				match(T__7);

				        int min = Integer.parseInt((((L_quantContext)_localctx).num1!=null?((L_quantContext)_localctx).num1.getText():null));
				        int max = Integer.parseInt((((L_quantContext)_localctx).num2!=null?((L_quantContext)_localctx).num2.getText():null));
				        if (min > max) {
				            System.err.println("Errore: Quantificatore non valido {" + min + "," + max + "}: il primo numero non può essere maggiore del secondo.");
				        }
				    
				}
				break;
			case QUANTIFICATORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
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
		enterRule(_localctx, 26, RULE_l_atom);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case CHAR:
			case METACHAR:
			case SHORTCUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				((L_atomContext)_localctx).l_simple_atom = l_simple_atom();
				 ((L_atomContext)_localctx).value =  ((L_atomContext)_localctx).l_simple_atom.value; 
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
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
		public Token METACHAR;
		public Token SHORTCUT;
		public List<TerminalNode> CHAR() { return getTokens(GrammarParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(GrammarParser.CHAR, i);
		}
		public TerminalNode METACHAR() { return getToken(GrammarParser.METACHAR, 0); }
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
		enterRule(_localctx, 28, RULE_l_simple_atom);
		int _la;
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				((L_simple_atomContext)_localctx).CHAR = match(CHAR);
				 ((L_simple_atomContext)_localctx).value =  "'" + (((L_simple_atomContext)_localctx).CHAR!=null?((L_simple_atomContext)_localctx).CHAR.getText():null) + "'"; 
				}
				break;
			case METACHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				((L_simple_atomContext)_localctx).METACHAR = match(METACHAR);
				 ((L_simple_atomContext)_localctx).value =  "'" + ((L_simple_atomContext)_localctx).METACHAR.getText().charAt(1) + "'"; 
				}
				break;
			case SHORTCUT:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
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
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				match(T__4);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(179);
					match(T__9);
					}
				}

				setState(184); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(184);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(182);
						l_interval();
						}
						break;
					case 2:
						{
						setState(183);
						match(CHAR);
						}
						break;
					}
					}
					setState(186); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CHAR );
				setState(188);
				match(T__5);

				        String textValue = _input.getText(_localctx.start, _input.LT(-1));
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
		enterRule(_localctx, 30, RULE_l_atom_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__2);
			setState(193);
			((L_atom_groupContext)_localctx).s1 = l_reg_exp();
			setState(194);
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
		enterRule(_localctx, 32, RULE_l_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(197);
			((L_intervalContext)_localctx).char1 = match(CHAR);
			setState(198);
			match(T__10);
			setState(199);
			((L_intervalContext)_localctx).char2 = match(CHAR);
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
		"\u0004\u0001\u0019\u00cc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0004\u0001+\b"+
		"\u0001\u000b\u0001\f\u0001,\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0003\u00039\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0003\u0004?\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004D\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005I\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005N\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006Y\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007j\b\u0007\u0001\b\u0001\b\u0004\bn\b\b\u000b\b"+
		"\f\bo\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0004\n~\b\n\u000b\n\f\n\u007f\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0004\n\u0087\b\n\u000b\n\f\n\u0088"+
		"\u0005\n\u008b\b\n\n\n\f\n\u008e\t\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u0094\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u009c\b\f\u0003\f\u009e\b\f\u0001\f\u0001\f"+
		"\u0001\f\u0003\f\u00a3\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00ab\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00b5\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0004\u000e\u00b9\b\u000e\u000b\u000e\f\u000e\u00ba"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00bf\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \u0000\u0000\u00d4\u0000\"\u0001\u0000\u0000\u0000\u0002(\u0001"+
		"\u0000\u0000\u0000\u00040\u0001\u0000\u0000\u0000\u00066\u0001\u0000\u0000"+
		"\u0000\bC\u0001\u0000\u0000\u0000\nM\u0001\u0000\u0000\u0000\fX\u0001"+
		"\u0000\u0000\u0000\u000ei\u0001\u0000\u0000\u0000\u0010k\u0001\u0000\u0000"+
		"\u0000\u0012s\u0001\u0000\u0000\u0000\u0014y\u0001\u0000\u0000\u0000\u0016"+
		"\u0091\u0001\u0000\u0000\u0000\u0018\u00a2\u0001\u0000\u0000\u0000\u001a"+
		"\u00aa\u0001\u0000\u0000\u0000\u001c\u00be\u0001\u0000\u0000\u0000\u001e"+
		"\u00c0\u0001\u0000\u0000\u0000 \u00c5\u0001\u0000\u0000\u0000\"#\u0006"+
		"\u0000\uffff\uffff\u0000#$\u0003\u0002\u0001\u0000$%\u0003\u0010\b\u0000"+
		"%&\u0005\u0000\u0000\u0001&\'\u0006\u0000\uffff\uffff\u0000\'\u0001\u0001"+
		"\u0000\u0000\u0000(*\u0005\u000f\u0000\u0000)+\u0003\u0004\u0002\u0000"+
		"*)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000"+
		"\u0000,-\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0005\u0010"+
		"\u0000\u0000/\u0003\u0001\u0000\u0000\u000001\u0005\u0011\u0000\u0000"+
		"12\u0005\u0018\u0000\u000023\u0003\u0006\u0003\u000034\u0005\u0001\u0000"+
		"\u000045\u0006\u0002\uffff\uffff\u00005\u0005\u0001\u0000\u0000\u0000"+
		"68\u0003\b\u0004\u000079\u0003\n\u0005\u000087\u0001\u0000\u0000\u0000"+
		"89\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0006\u0003\uffff"+
		"\uffff\u0000;\u0007\u0001\u0000\u0000\u0000<>\u0003\f\u0006\u0000=?\u0003"+
		"\b\u0004\u0000>=\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0001"+
		"\u0000\u0000\u0000@A\u0006\u0004\uffff\uffff\u0000AD\u0001\u0000\u0000"+
		"\u0000BD\u0006\u0004\uffff\uffff\u0000C<\u0001\u0000\u0000\u0000CB\u0001"+
		"\u0000\u0000\u0000D\t\u0001\u0000\u0000\u0000EF\u0005\u0002\u0000\u0000"+
		"FH\u0003\b\u0004\u0000GI\u0003\n\u0005\u0000HG\u0001\u0000\u0000\u0000"+
		"HI\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0006\u0005\uffff"+
		"\uffff\u0000KN\u0001\u0000\u0000\u0000LN\u0006\u0005\uffff\uffff\u0000"+
		"ME\u0001\u0000\u0000\u0000ML\u0001\u0000\u0000\u0000N\u000b\u0001\u0000"+
		"\u0000\u0000OP\u0005\u0011\u0000\u0000PY\u0006\u0006\uffff\uffff\u0000"+
		"QR\u0005\u000e\u0000\u0000RY\u0006\u0006\uffff\uffff\u0000ST\u0005\u0012"+
		"\u0000\u0000TY\u0006\u0006\uffff\uffff\u0000UV\u0003\u000e\u0007\u0000"+
		"VW\u0006\u0006\uffff\uffff\u0000WY\u0001\u0000\u0000\u0000XO\u0001\u0000"+
		"\u0000\u0000XQ\u0001\u0000\u0000\u0000XS\u0001\u0000\u0000\u0000XU\u0001"+
		"\u0000\u0000\u0000Y\r\u0001\u0000\u0000\u0000Z[\u0005\u0003\u0000\u0000"+
		"[\\\u0003\u0006\u0003\u0000\\]\u0005\u0004\u0000\u0000]^\u0006\u0007\uffff"+
		"\uffff\u0000^j\u0001\u0000\u0000\u0000_`\u0005\u0005\u0000\u0000`a\u0003"+
		"\u0006\u0003\u0000ab\u0005\u0006\u0000\u0000bc\u0006\u0007\uffff\uffff"+
		"\u0000cj\u0001\u0000\u0000\u0000de\u0005\u0007\u0000\u0000ef\u0003\u0006"+
		"\u0003\u0000fg\u0005\b\u0000\u0000gh\u0006\u0007\uffff\uffff\u0000hj\u0001"+
		"\u0000\u0000\u0000iZ\u0001\u0000\u0000\u0000i_\u0001\u0000\u0000\u0000"+
		"id\u0001\u0000\u0000\u0000j\u000f\u0001\u0000\u0000\u0000km\u0005\f\u0000"+
		"\u0000ln\u0003\u0012\t\u0000ml\u0001\u0000\u0000\u0000no\u0001\u0000\u0000"+
		"\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000qr\u0005\r\u0000\u0000r\u0011\u0001\u0000\u0000\u0000st\u0005"+
		"\u000e\u0000\u0000tu\u0005\u0018\u0000\u0000uv\u0003\u0014\n\u0000vw\u0005"+
		"\u0001\u0000\u0000wx\u0006\t\uffff\uffff\u0000x\u0013\u0001\u0000\u0000"+
		"\u0000y}\u0006\n\uffff\uffff\u0000z{\u0003\u0016\u000b\u0000{|\u0006\n"+
		"\uffff\uffff\u0000|~\u0001\u0000\u0000\u0000}z\u0001\u0000\u0000\u0000"+
		"~\u007f\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u008c\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005\u0002\u0000\u0000\u0082\u0086\u0006\n\uffff\uffff\u0000\u0083\u0084"+
		"\u0003\u0016\u000b\u0000\u0084\u0085\u0006\n\uffff\uffff\u0000\u0085\u0087"+
		"\u0001\u0000\u0000\u0000\u0086\u0083\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0001\u0000\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0081"+
		"\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008f"+
		"\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0006\n\uffff\uffff\u0000\u0090\u0015\u0001\u0000\u0000\u0000\u0091\u0093"+
		"\u0003\u001a\r\u0000\u0092\u0094\u0003\u0018\f\u0000\u0093\u0092\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0006\u000b\uffff\uffff\u0000\u0096\u0017"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u0007\u0000\u0000\u0098\u009d"+
		"\u0005\u0014\u0000\u0000\u0099\u009b\u0005\t\u0000\u0000\u009a\u009c\u0005"+
		"\u0014\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009b\u009c\u0001"+
		"\u0000\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u0099\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0005\b\u0000\u0000\u00a0\u00a3\u0006\f"+
		"\uffff\uffff\u0000\u00a1\u00a3\u0005\u0013\u0000\u0000\u00a2\u0097\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u0019\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0003\u001c\u000e\u0000\u00a5\u00a6\u0006"+
		"\r\uffff\uffff\u0000\u00a6\u00ab\u0001\u0000\u0000\u0000\u00a7\u00a8\u0003"+
		"\u001e\u000f\u0000\u00a8\u00a9\u0006\r\uffff\uffff\u0000\u00a9\u00ab\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a4\u0001\u0000\u0000\u0000\u00aa\u00a7\u0001"+
		"\u0000\u0000\u0000\u00ab\u001b\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005"+
		"\u0015\u0000\u0000\u00ad\u00bf\u0006\u000e\uffff\uffff\u0000\u00ae\u00af"+
		"\u0005\u0016\u0000\u0000\u00af\u00bf\u0006\u000e\uffff\uffff\u0000\u00b0"+
		"\u00b1\u0005\u0017\u0000\u0000\u00b1\u00bf\u0006\u000e\uffff\uffff\u0000"+
		"\u00b2\u00b4\u0005\u0005\u0000\u0000\u00b3\u00b5\u0005\n\u0000\u0000\u00b4"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b9\u0003 \u0010\u0000\u00b7\u00b9"+
		"\u0005\u0015\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00b8"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u0006\u0000\u0000\u00bd\u00bf"+
		"\u0006\u000e\uffff\uffff\u0000\u00be\u00ac\u0001\u0000\u0000\u0000\u00be"+
		"\u00ae\u0001\u0000\u0000\u0000\u00be\u00b0\u0001\u0000\u0000\u0000\u00be"+
		"\u00b2\u0001\u0000\u0000\u0000\u00bf\u001d\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0005\u0003\u0000\u0000\u00c1\u00c2\u0003\u0014\n\u0000\u00c2\u00c3"+
		"\u0005\u0004\u0000\u0000\u00c3\u00c4\u0006\u000f\uffff\uffff\u0000\u00c4"+
		"\u001f\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0015\u0000\u0000\u00c6"+
		"\u00c7\u0005\u000b\u0000\u0000\u00c7\u00c8\u0005\u0015\u0000\u0000\u00c8"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0006\u0010\uffff\uffff\u0000"+
		"\u00ca!\u0001\u0000\u0000\u0000\u0015,8>CHMXio\u007f\u0088\u008c\u0093"+
		"\u009b\u009d\u00a2\u00aa\u00b4\u00b8\u00ba\u00be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}