// Generated from C:/Users/diogo/IdeaProjects/markdown-cv/src/grammar\MarkdownGrammar.g4 by ANTLR 4.5.1
package grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MarkdownGrammar}.
 */
public interface MarkdownGrammarListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link MarkdownGrammar#cv}.
     *
     * @param ctx the parse tree
     */
    void enterCv(MarkdownGrammar.CvContext ctx);

    /**
     * Exit a parse tree produced by {@link MarkdownGrammar#cv}.
     *
     * @param ctx the parse tree
     */
    void exitCv(MarkdownGrammar.CvContext ctx);

    /**
     * Enter a parse tree produced by {@link MarkdownGrammar#info}.
     *
     * @param ctx the parse tree
     */
    void enterInfo(MarkdownGrammar.InfoContext ctx);

    /**
     * Exit a parse tree produced by {@link MarkdownGrammar#info}.
     *
     * @param ctx the parse tree
     */
    void exitInfo(MarkdownGrammar.InfoContext ctx);

    /**
     * Enter a parse tree produced by {@link MarkdownGrammar#subHeader}.
     *
     * @param ctx the parse tree
     */
    void enterSubHeader(MarkdownGrammar.SubHeaderContext ctx);

    /**
     * Exit a parse tree produced by {@link MarkdownGrammar#subHeader}.
     *
     * @param ctx the parse tree
     */
    void exitSubHeader(MarkdownGrammar.SubHeaderContext ctx);

    /**
     * Enter a parse tree produced by {@link MarkdownGrammar#name}.
     *
     * @param ctx the parse tree
     */
    void enterName(MarkdownGrammar.NameContext ctx);

    /**
     * Exit a parse tree produced by {@link MarkdownGrammar#name}.
     *
     * @param ctx the parse tree
     */
    void exitName(MarkdownGrammar.NameContext ctx);

    /**
     * Enter a parse tree produced by {@link MarkdownGrammar#address}.
     *
     * @param ctx the parse tree
     */
    void enterAddress(MarkdownGrammar.AddressContext ctx);

    /**
     * Exit a parse tree produced by {@link MarkdownGrammar#address}.
     *
     * @param ctx the parse tree
     */
    void exitAddress(MarkdownGrammar.AddressContext ctx);

    /**
     * Enter a parse tree produced by {@link MarkdownGrammar#contacts}.
     *
     * @param ctx the parse tree
     */
    void enterContacts(MarkdownGrammar.ContactsContext ctx);

    /**
     * Exit a parse tree produced by {@link MarkdownGrammar#contacts}.
     *
     * @param ctx the parse tree
     */
    void exitContacts(MarkdownGrammar.ContactsContext ctx);

    /**
     * Enter a parse tree produced by {@link MarkdownGrammar#block}.
     *
     * @param ctx the parse tree
     */
    void enterBlock(MarkdownGrammar.BlockContext ctx);

    /**
     * Exit a parse tree produced by {@link MarkdownGrammar#block}.
     *
     * @param ctx the parse tree
     */
    void exitBlock(MarkdownGrammar.BlockContext ctx);

    /**
     * Enter a parse tree produced by {@link MarkdownGrammar#subBlock}.
     *
     * @param ctx the parse tree
     */
    void enterSubBlock(MarkdownGrammar.SubBlockContext ctx);

    /**
     * Exit a parse tree produced by {@link MarkdownGrammar#subBlock}.
     *
     * @param ctx the parse tree
     */
    void exitSubBlock(MarkdownGrammar.SubBlockContext ctx);

    /**
     * Enter a parse tree produced by {@link MarkdownGrammar#list}.
     *
     * @param ctx the parse tree
     */
    void enterList(MarkdownGrammar.ListContext ctx);

    /**
     * Exit a parse tree produced by {@link MarkdownGrammar#list}.
     *
     * @param ctx the parse tree
     */
    void exitList(MarkdownGrammar.ListContext ctx);

    /**
     * Enter a parse tree produced by {@link MarkdownGrammar#blockList}.
     *
     * @param ctx the parse tree
     */
    void enterBlockList(MarkdownGrammar.BlockListContext ctx);

    /**
     * Exit a parse tree produced by {@link MarkdownGrammar#blockList}.
     *
     * @param ctx the parse tree
     */
    void exitBlockList(MarkdownGrammar.BlockListContext ctx);

    /**
     * Enter a parse tree produced by {@link MarkdownGrammar#blockListCell}.
     *
     * @param ctx the parse tree
     */
    void enterBlockListCell(MarkdownGrammar.BlockListCellContext ctx);

    /**
     * Exit a parse tree produced by {@link MarkdownGrammar#blockListCell}.
     *
     * @param ctx the parse tree
     */
    void exitBlockListCell(MarkdownGrammar.BlockListCellContext ctx);

    /**
     * Enter a parse tree produced by {@link MarkdownGrammar#table}.
     *
     * @param ctx the parse tree
     */
    void enterTable(MarkdownGrammar.TableContext ctx);

    /**
     * Exit a parse tree produced by {@link MarkdownGrammar#table}.
     *
     * @param ctx the parse tree
     */
    void exitTable(MarkdownGrammar.TableContext ctx);

    /**
     * Enter a parse tree produced by {@link MarkdownGrammar#tableBody}.
     *
     * @param ctx the parse tree
     */
    void enterTableBody(MarkdownGrammar.TableBodyContext ctx);

    /**
     * Exit a parse tree produced by {@link MarkdownGrammar#tableBody}.
     *
     * @param ctx the parse tree
     */
    void exitTableBody(MarkdownGrammar.TableBodyContext ctx);

    /**
     * Enter a parse tree produced by {@link MarkdownGrammar#icon}.
     *
     * @param ctx the parse tree
     */
    void enterIcon(MarkdownGrammar.IconContext ctx);

    /**
     * Exit a parse tree produced by {@link MarkdownGrammar#icon}.
     *
     * @param ctx the parse tree
     */
    void exitIcon(MarkdownGrammar.IconContext ctx);

    /**
     * Enter a parse tree produced by {@link MarkdownGrammar#boldText}.
     *
     * @param ctx the parse tree
     */
    void enterBoldText(MarkdownGrammar.BoldTextContext ctx);

    /**
     * Exit a parse tree produced by {@link MarkdownGrammar#boldText}.
     *
     * @param ctx the parse tree
     */
    void exitBoldText(MarkdownGrammar.BoldTextContext ctx);

    /**
     * Enter a parse tree produced by {@link MarkdownGrammar#tableHeader}.
     *
     * @param ctx the parse tree
     */
    void enterTableHeader(MarkdownGrammar.TableHeaderContext ctx);

    /**
     * Exit a parse tree produced by {@link MarkdownGrammar#tableHeader}.
     *
     * @param ctx the parse tree
     */
    void exitTableHeader(MarkdownGrammar.TableHeaderContext ctx);

    /**
     * Enter a parse tree produced by {@link MarkdownGrammar#tableCell}.
     *
     * @param ctx the parse tree
     */
    void enterTableCell(MarkdownGrammar.TableCellContext ctx);

    /**
     * Exit a parse tree produced by {@link MarkdownGrammar#tableCell}.
     *
     * @param ctx the parse tree
     */
    void exitTableCell(MarkdownGrammar.TableCellContext ctx);

    /**
     * Enter a parse tree produced by {@link MarkdownGrammar#tableLine}.
     *
     * @param ctx the parse tree
     */
    void enterTableLine(MarkdownGrammar.TableLineContext ctx);

    /**
     * Exit a parse tree produced by {@link MarkdownGrammar#tableLine}.
     *
     * @param ctx the parse tree
     */
    void exitTableLine(MarkdownGrammar.TableLineContext ctx);

    /**
     * Enter a parse tree produced by {@link MarkdownGrammar#blockName}.
     *
     * @param ctx the parse tree
     */
    void enterBlockName(MarkdownGrammar.BlockNameContext ctx);

    /**
     * Exit a parse tree produced by {@link MarkdownGrammar#blockName}.
     *
     * @param ctx the parse tree
     */
    void exitBlockName(MarkdownGrammar.BlockNameContext ctx);

    /**
     * Enter a parse tree produced by {@link MarkdownGrammar#blockSubName}.
     *
     * @param ctx the parse tree
     */
    void enterBlockSubName(MarkdownGrammar.BlockSubNameContext ctx);

    /**
     * Exit a parse tree produced by {@link MarkdownGrammar#blockSubName}.
     *
     * @param ctx the parse tree
     */
    void exitBlockSubName(MarkdownGrammar.BlockSubNameContext ctx);

    /**
     * Enter a parse tree produced by {@link MarkdownGrammar#any}.
     *
     * @param ctx the parse tree
     */
    void enterAny(MarkdownGrammar.AnyContext ctx);

    /**
     * Exit a parse tree produced by {@link MarkdownGrammar#any}.
     *
     * @param ctx the parse tree
     */
    void exitAny(MarkdownGrammar.AnyContext ctx);

    /**
     * Enter a parse tree produced by {@link MarkdownGrammar#tablecontent}.
     *
     * @param ctx the parse tree
     */
    void enterTablecontent(MarkdownGrammar.TablecontentContext ctx);

    /**
     * Exit a parse tree produced by {@link MarkdownGrammar#tablecontent}.
     *
     * @param ctx the parse tree
     */
    void exitTablecontent(MarkdownGrammar.TablecontentContext ctx);

    /**
     * Enter a parse tree produced by {@link MarkdownGrammar#word_space}.
     *
     * @param ctx the parse tree
     */
    void enterWord_space(MarkdownGrammar.Word_spaceContext ctx);

    /**
     * Exit a parse tree produced by {@link MarkdownGrammar#word_space}.
     *
     * @param ctx the parse tree
     */
    void exitWord_space(MarkdownGrammar.Word_spaceContext ctx);
}