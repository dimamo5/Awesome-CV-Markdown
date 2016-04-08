// Generated from C:/Users/inesa/Documents/GitHub/markdown-dsl/src/grammar\MarkdownGrammar.g4 by ANTLR 4.5.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MarkdownGrammar}.
 */
public interface MarkdownGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MarkdownGrammar#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(MarkdownGrammar.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownGrammar#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(MarkdownGrammar.HeaderContext ctx);
}