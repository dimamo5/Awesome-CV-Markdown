package parser;

/**
 * Created by diogo on 28/05/2016.
 */
public class Settings {

    public enum Color {RED,GREEN,BLUE,GREY};
    private Color currentColor;
    private boolean printTree;

    public Settings(Color c){
        this.currentColor=c;
        printTree=false;
    }

    public Color getColor() {
        return currentColor;
    }

    public boolean isPrintTree() {
        return printTree;
    }

}
