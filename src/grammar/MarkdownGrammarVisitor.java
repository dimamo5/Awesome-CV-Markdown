// Generated from C:/Users/inesa/Documents/GitHub/markdown-dsl/src/grammar\MarkdownGrammar.g4 by ANTLR 4.5.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MarkdownGrammar}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MarkdownGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(MarkdownGrammar.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#subHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubHeader(MarkdownGrammar.SubHeaderContext ctx);
}