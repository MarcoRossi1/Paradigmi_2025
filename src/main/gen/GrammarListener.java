// Generated from C:/Universita/Magistrale/Paradigmi/Paradigmi_2025/src/main/antlr4/Grammar.g4 by ANTLR 4.13.2
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
	 * Enter a parse tree produced by {@link GrammarParser#token}.
	 * @param ctx the parse tree
	 */
	void enterToken(GrammarParser.TokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#token}.
	 * @param ctx the parse tree
	 */
	void exitToken(GrammarParser.TokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(GrammarParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(GrammarParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#quantificatore}.
	 * @param ctx the parse tree
	 */
	void enterQuantificatore(GrammarParser.QuantificatoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#quantificatore}.
	 * @param ctx the parse tree
	 */
	void exitQuantificatore(GrammarParser.QuantificatoreContext ctx);
}