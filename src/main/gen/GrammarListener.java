// Generated from C:/Users/fullm/IdeaProjects/Paradigmi_2025/src/main/antlr4/Grammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#s_section}.
	 * @param ctx the parse tree
	 */
	void enterS_section(GrammarParser.S_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#s_section}.
	 * @param ctx the parse tree
	 */
	void exitS_section(GrammarParser.S_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#s_rule}.
	 * @param ctx the parse tree
	 */
	void enterS_rule(GrammarParser.S_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#s_rule}.
	 * @param ctx the parse tree
	 */
	void exitS_rule(GrammarParser.S_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#s_expr}.
	 * @param ctx the parse tree
	 */
	void enterS_expr(GrammarParser.S_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#s_expr}.
	 * @param ctx the parse tree
	 */
	void exitS_expr(GrammarParser.S_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#s_term}.
	 * @param ctx the parse tree
	 */
	void enterS_term(GrammarParser.S_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#s_term}.
	 * @param ctx the parse tree
	 */
	void exitS_term(GrammarParser.S_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#s_group}.
	 * @param ctx the parse tree
	 */
	void enterS_group(GrammarParser.S_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#s_group}.
	 * @param ctx the parse tree
	 */
	void exitS_group(GrammarParser.S_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#l_section}.
	 * @param ctx the parse tree
	 */
	void enterL_section(GrammarParser.L_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#l_section}.
	 * @param ctx the parse tree
	 */
	void exitL_section(GrammarParser.L_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#l_assegn}.
	 * @param ctx the parse tree
	 */
	void enterL_assegn(GrammarParser.L_assegnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#l_assegn}.
	 * @param ctx the parse tree
	 */
	void exitL_assegn(GrammarParser.L_assegnContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#l_reg_exp}.
	 * @param ctx the parse tree
	 */
	void enterL_reg_exp(GrammarParser.L_reg_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#l_reg_exp}.
	 * @param ctx the parse tree
	 */
	void exitL_reg_exp(GrammarParser.L_reg_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#l_quant}.
	 * @param ctx the parse tree
	 */
	void enterL_quant(GrammarParser.L_quantContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#l_quant}.
	 * @param ctx the parse tree
	 */
	void exitL_quant(GrammarParser.L_quantContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#l_atom}.
	 * @param ctx the parse tree
	 */
	void enterL_atom(GrammarParser.L_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#l_atom}.
	 * @param ctx the parse tree
	 */
	void exitL_atom(GrammarParser.L_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#l_interval}.
	 * @param ctx the parse tree
	 */
	void enterL_interval(GrammarParser.L_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#l_interval}.
	 * @param ctx the parse tree
	 */
	void exitL_interval(GrammarParser.L_intervalContext ctx);
}