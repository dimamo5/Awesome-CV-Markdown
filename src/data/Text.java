package data;

import java.util.ArrayList;

/**
 * Created by diogo on 29/06/2016.
 */
public class Text {
    public ArrayList<TextBlock> textBlocks;

    public Text() {
        textBlocks = new ArrayList<>();
    }

    public void addBoldText(String s) {
        textBlocks.add(new TextBlock(MODIFIER_TYPE.BOLD, s));
    }

    public void addItalicText(String s) {
        textBlocks.add(new TextBlock(MODIFIER_TYPE.ITALIC, s));
    }

    public void addText(String s) {
        textBlocks.add(new TextBlock(MODIFIER_TYPE.NORMAL, s));
    }

    private enum MODIFIER_TYPE {NORMAL, ITALIC, BOLD}

    class TextBlock {
        public String text;
        public MODIFIER_TYPE modifierType;

        public TextBlock(String s) {
            this.text = s;
            this.modifierType = MODIFIER_TYPE.NORMAL;
        }

        public TextBlock(MODIFIER_TYPE mod, String s) {
            this.text = s;
            this.modifierType = mod;
        }
    }
}
