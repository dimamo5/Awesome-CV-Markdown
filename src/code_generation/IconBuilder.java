package code_generation;

import data.Icon;

/**
 * Created by diogo on 01/06/2016.
 */
public class IconBuilder implements TexBuilder {
    private Icon icon;
    private String iconCode;

    public IconBuilder(Icon icon) {
        this.icon = icon;
    }

    public String getIconCode() {
        if (iconCode == null || iconCode.isEmpty())
            buildTex();
        return iconCode;
    }

    @Override
    public void buildTex() {
        String s = "";
        if (icon.name.equals("star")) {
            s = "\\star[" + icon.attr2 + "]{" + icon.attr1 + "}";
        } else if (icon.name.equals("date") || icon.name.equals("place")) {
            s = "";
        } else {
            s = "\\fa" + Character.toUpperCase(icon.name.charAt(0)) + icon.name.substring(1, icon.name.length());
        }

        iconCode = s;
    }
}
