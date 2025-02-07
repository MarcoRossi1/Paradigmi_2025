// Generated from C:/Users/fullm/IdeaProjects/Paradigmi_2025/src/main/antlr4/Grammar.g4 by ANTLR 4.13.2

    import java.io.*;
    import java.util.*;
    import java.util.regex.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(GrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#s_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS_section(GrammarParser.S_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#s_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS_rule(GrammarParser.S_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#s_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS_expr(GrammarParser.S_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#s_seq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS_seq(GrammarParser.S_seqContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#s_expr_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS_expr_aux(GrammarParser.S_expr_auxContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#s_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS_term(GrammarParser.S_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#s_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS_atom(GrammarParser.S_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#s_brackets_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS_brackets_atom(GrammarParser.S_brackets_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#l_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_section(GrammarParser.L_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#l_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_rule(GrammarParser.L_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#l_reg_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_reg_exp(GrammarParser.L_reg_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#l_reg_exp_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_reg_exp_part(GrammarParser.L_reg_exp_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#l_quant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_quant(GrammarParser.L_quantContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#l_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_atom(GrammarParser.L_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#l_simple_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_simple_atom(GrammarParser.L_simple_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#l_atom_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_atom_group(GrammarParser.L_atom_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#l_interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_interval(GrammarParser.L_intervalContext ctx);
}