import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public interface MyVisitorInterface extends ParseTreeVisitor<String> {

    String visitStart(GrammarParser.StartContext ctx);

    String visitS_section(GrammarParser.S_sectionContext ctx);

    String visitS_rule(GrammarParser.S_ruleContext ctx);

    String visitS_expr(GrammarParser.S_exprContext ctx);

    String visitS_seq(GrammarParser.S_seqContext ctx);

    String visitS_expr_aux(GrammarParser.S_expr_auxContext ctx);

    String visitS_term(GrammarParser.S_termContext ctx);

    String visitS_atom(GrammarParser.S_atomContext ctx);

    String visitS_brackets_atom(GrammarParser.S_brackets_atomContext ctx);

    String visitL_section(GrammarParser.L_sectionContext ctx);

    String visitL_rule(GrammarParser.L_ruleContext ctx);

    String visitL_reg_exp(GrammarParser.L_reg_expContext ctx);

    String visitL_reg_exp_part(GrammarParser.L_reg_exp_partContext ctx);

    String visitL_quant(GrammarParser.L_quantContext ctx);

    String visitL_atom(GrammarParser.L_atomContext ctx);

    String visitL_simple_atom(GrammarParser.L_simple_atomContext ctx);

    String visitL_atom_group(GrammarParser.L_atom_groupContext ctx);

    String visitL_interval(GrammarParser.L_intervalContext ctx);

}