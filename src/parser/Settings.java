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

    ;
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

    public String getColorCode() {
        String colorCode = "";
        switch (this.currentColor) {
            case RED:
                colorCode = "awesome-red";
                break;
            case GREEN:
                colorCode = "awesome-emerald";
                break;
            case BLUE:
                colorCode = "awesome-skyblue";
                break;
            case PINK:
                colorCode = "awesome-pink";
                break;
            case ORANGE:
                colorCode = "awesome-orage";
                break;
            case GREY:
                colorCode = "awesome-concrete";
                break;
            case DARK:
                colorCode = "awesome-darknight";
                break;
        }
        return colorCode;
    }

    public enum LanguageOutput {HTML, TEX}


    public enum Color {RED, GREEN, BLUE, PINK, ORANGE, GREY, DARK}
}
