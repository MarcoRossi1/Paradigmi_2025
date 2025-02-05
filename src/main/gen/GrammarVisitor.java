// Generated from C:/Universita/Magistrale/Paradigmi/Paradigmi_2025/src/main/antlr4/Grammar.g4 by ANTLR 4.13.2
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
	 * Visit a parse tree produced by {@link GrammarParser#token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken(GrammarParser.TokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(GrammarParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#quantificatore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantificatore(GrammarParser.QuantificatoreContext ctx);
}