package code_generation;

import data.*;
import parser.Markdown;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by diogo on 29/05/2016.
 */
public class BlockBuilder implements TexBuilder, Runnable {
    private Block block;
    private String fileName;

    public BlockBuilder(Block block) {
        this.block = block;
        this.fileName = FILES_LOCATION + Markdown.settings.getPdfName() + "/" + Utils.formatAuxFile(block.getBlockName()) + ".tex";

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
            if (out != null) {
                try {
                    out.write(getCodeSubBlock(subBlock).getBytes("UTF-8"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    @Override
    public void buildHtml() {

    }

    private String getCodeSubBlock(SubBlock subBlock) {
        String generatedCode = "";
        if (subBlock.getSubBlockName() != null) {
            generatedCode += "\\cvsubsection{" + subBlock.getSubBlockName() + "}\n\n";
        }
        switch (subBlock.getType()) {
            case LIST:
                generatedCode += new ListBuilder((List) subBlock.getContent()).getListCode();
                break;
            case TABLE:
                generatedCode += new TableBuilder((Table) subBlock.getContent()).getTableCode();
                break;
            case TEXT:
                generatedCode += "\\begin{cvparagraph}" + (String) subBlock.getContent() + "\\end{cvparagraph}\n";
                break;
        }
        return generatedCode;
    }

    @Override
    public void run() {
        buildTex();
    }
}
