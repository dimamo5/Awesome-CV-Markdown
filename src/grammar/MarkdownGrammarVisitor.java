// Generated from C:/Users/Utilizador/Desktop/MIEIC/3º ano/2º semestre/COMP/markdown-dsl/src/grammar\MarkdownGrammar.g4 by ANTLR 4.5.1
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
	 * Visit a parse tree produced by {@link MarkdownGrammar#cv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCv(MarkdownGrammar.CvContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MarkdownGrammar.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfo(MarkdownGrammar.InfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#subHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubHeader(MarkdownGrammar.SubHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(MarkdownGrammar.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#address}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress(MarkdownGrammar.AddressContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#contacts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContacts(MarkdownGrammar.ContactsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#icon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIcon(MarkdownGrammar.IconContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#any}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny(MarkdownGrammar.AnyContext ctx);
}