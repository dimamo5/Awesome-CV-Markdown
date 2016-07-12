package code_generation;

import data.Text;
import parser.Settings;

/**
 * Created by diogo on 29/06/2016.
 */
public class TextBuilder implements TexBuilder {
    private Text text;
    private String textCode;

    public TextBuilder(Text t) {
        text = t;
        textCode = "";
    }


    @Override
    public void buildTex() {
        textCode += "\\begin{cvparagraph}";
        for (int i = 0; i < text.getTextBlocks().size(); i++) {
            if (text.getModifiers().get(i) == Text.MODIFIER_TYPE.BOLD) {
                textCode += " \\textbf{" + text.getTextBlocks().get(i) + "} ";
            } else if (text.getModifiers().get(i) == Text.MODIFIER_TYPE.ITALIC) {
                textCode += " \\textit{" + text.getTextBlocks().get(i) + "} ";
            } else
                textCode += text.getTextBlocks().get(i);
        }
        textCode += "\\end{cvparagraph}\n";
    }

    @Override
    public void buildHtml() {

        textCode += "<p style=\"text-align: justify;\">";
        for (int i = 0; i < text.getTextBlocks().size(); i++) {
            if (text.getModifiers().get(i) == Text.MODIFIER_TYPE.BOLD) {
                textCode += " <strong>" + text.getTextBlocks().get(i) + "</strong> ";
            } else if (text.getModifiers().get(i) == Text.MODIFIER_TYPE.ITALIC) {
                textCode += " <i>" + text.getTextBlocks().get(i) + "</i> ";
            } else
                textCode += text.getTextBlocks().get(i);
        }
        textCode += "</p>\n";

    }

    public String getTextCode(Settings.LanguageOutput lang) {
        if (textCode == null || textCode.isEmpty()) {
            if (lang == Settings.LanguageOutput.TEX)
                buildTex();
            else
                buildHtml();
        }
        return textCode;
    }
}
