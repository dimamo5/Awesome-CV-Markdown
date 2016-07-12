package data;

import java.util.ArrayList;

/**
 * Created by diogo on 29/06/2016.
 */
public class Text {
    private ArrayList<String> textBlocks;
    private ArrayList<MODIFIER_TYPE> modifiers;

    public Text() {
        textBlocks = new ArrayList<>();
        modifiers = new ArrayList<>();
    }

    public void addBoldText(String s) {
        textBlocks.add(s);
        modifiers.add(MODIFIER_TYPE.BOLD);
    }

    public void addItalicText(String s) {

        textBlocks.add(s);
        modifiers.add(MODIFIER_TYPE.ITALIC);
    }

    public void addText(String s) {

        textBlocks.add(s);
        modifiers.add(MODIFIER_TYPE.NORMAL);
    }

    public ArrayList<String> getTextBlocks() {
        return textBlocks;
    }

    public ArrayList<MODIFIER_TYPE> getModifiers() {
        return modifiers;
    }

    public enum MODIFIER_TYPE {NORMAL, ITALIC, BOLD}
}
