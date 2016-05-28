package parser;

/**
 * Created by diogo on 28/05/2016.
 */
public class Settings {
    public enum Color {RED,GREEN,BLUE,GREY};
    private Color currentColor;
    private boolean printTree;
    private String pdfName;

    public Settings(Color c,String name){
        this.currentColor=c;
        printTree=false;
        pdfName=name;
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


}
