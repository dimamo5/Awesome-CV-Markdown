package code_generation;

import data.*;
import parser.Markdown;
import parser.Settings;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by diogo on 29/05/2016.
 */
public class BlockBuilder implements TexBuilder {
    private Block block;
    private String fileName;
    private String blockCode;

    public BlockBuilder(Block block) {
        this.block = block;
        this.fileName = FILES_LOCATION + Markdown.settings.getFileName() + "/" + Utils.formatAuxFile(block
                .getBlockName()) + ".tex";

    }

    @Override
    public void buildTex() {
        DataOutputStream out = null;
        try {
            out = new DataOutputStream(new FileOutputStream(fileName));
        } catch (FileNotFoundException e) {
            System.err.println("File " + fileName + " not found!!!");
            e.printStackTrace();
        }
        try {
            String blockName = "\\cvsection{" + block.getBlockName() + "}\n\n";
            out.write(blockName.getBytes("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (SubBlock subBlock : this.block.subBlocks) {
            if (out != null && subBlock.isSelected()) {
                try {
                    out.write(getCodeSubBlock(subBlock, Settings.LanguageOutput.TEX).getBytes("UTF-8"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    @Override
    public void buildHtml() {
        blockCode = "<section>\n" + "<h2 class=\"section\">" + "<span style=\"color:" + Markdown.settings.getColorCode
                (Settings.LanguageOutput.HTML) + "\">" + block
                .getBlockName
                        ().substring(0, 3) +
                "</span>" + block.getBlockName().substring(3) + "</h2><hr>\n";

        for (SubBlock subBlock : this.block.subBlocks) {
            if (subBlock.isSelected())
                blockCode += getCodeSubBlock(subBlock, Settings.LanguageOutput.HTML) + "\n";
        }

        blockCode += "</section>\n";
    }

    public String getBlockCode() {
        if (blockCode == null || blockCode.isEmpty())
            buildHtml();
        return blockCode;
    }

    private String getCodeSubBlock(SubBlock subBlock, Settings.LanguageOutput lang) {
        String generatedCode = "";
        if (subBlock.getSubBlockName() != null) {
            if (lang == Settings.LanguageOutput.TEX)
                generatedCode += "\\cvsubsection{" + subBlock.getSubBlockName() + "}\n\n";
            else if (lang == Settings.LanguageOutput.HTML)
                generatedCode += "<h3>" + subBlock.getSubBlockName() + "</h3>\n";
        }
        switch (subBlock.getType()) {
            case LIST:
                generatedCode += new ListBuilder((List) subBlock.getContent()).getListCode(lang);
                break;
            case TABLE:
                generatedCode += new TableBuilder((Table) subBlock.getContent()).getTableCode(lang);
                break;
            case TEXT:
                if (lang == Settings.LanguageOutput.HTML)
                    generatedCode += "<p>" + (String) subBlock.getContent() + "</p>";
                else if (lang == Settings.LanguageOutput.TEX)
                    generatedCode += "\\begin{cvparagraph}" + (String) subBlock.getContent() + "\\end{cvparagraph}\n";
                break;
        }
        return generatedCode;
    }
}
