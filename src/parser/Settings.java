package parser;

/**
 * Created by diogo on 28/05/2016.
 */
public class Settings {
    private Color currentColor;
    private boolean printTree;
    private String pdfName;
    private LanguageOutput output;

    public Settings(Color c, String name, LanguageOutput out) {
        this.currentColor = c;
        printTree = false;
        pdfName = name;
        output = out;
    }

    public Settings(String name) {
        this.currentColor = Color.RED;
        printTree = false;
        pdfName = name;
        output = LanguageOutput.TEX;
    }

    public LanguageOutput getOutput() {
        return output;
    }

    public Color getColor() {
        return currentColor;
    }

    public boolean isPrintTree() {
        return printTree;
    }

    public String getPdfName() {
        return pdfName;
    }

    public String getColorCode(LanguageOutput lang) {
        String colorCode = "";
        switch (this.currentColor) {
            case RED:
                colorCode = (lang == LanguageOutput.TEX) ? "awesome-red" : "#DC3522";
                break;
            case GREEN:
                colorCode = (lang == LanguageOutput.TEX) ? "awesome-emerald" : "#00A388";
                break;
            case BLUE:
                colorCode = (lang == LanguageOutput.TEX) ? "awesome-skyblue" : "#0395DE";
                break;
            case PINK:
                colorCode = (lang == LanguageOutput.TEX) ? "awesome-pink" : "#EF4089";
                break;
            case ORANGE:
                colorCode = (lang == LanguageOutput.TEX) ? "awesome-orange" : "#FF6138";
                break;
            case GREY:
                colorCode = (lang == LanguageOutput.TEX) ? "awesome-concrete" : "#95A5A6";
                break;
            case DARK:
                colorCode = (lang == LanguageOutput.TEX) ? "awesome-darknight" : "#131A28";
                break;
        }
        return colorCode;
    }

    public enum LanguageOutput {HTML, TEX}


    public enum Color {RED, GREEN, BLUE, PINK, ORANGE, GREY, DARK}
}
