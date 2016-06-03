package code_generation;

import data.Icon;
import parser.Settings;

/**
 * Created by diogo on 01/06/2016.
 */
public class IconBuilder implements TexBuilder {
    private Icon icon;
    private String iconCode;

    public IconBuilder(Icon icon) {
        this.icon = icon;
    }

    public String getIconCode(Settings.LanguageOutput lang) {
        if (iconCode == null || iconCode.isEmpty())
            if (lang == Settings.LanguageOutput.TEX)
                buildTex();
            else if (lang == Settings.LanguageOutput.HTML)
                buildHtml();
        return iconCode;
    }

    @Override
    public void buildTex() {
        String s = "";
        if (icon.name.equals("stars")) {
            s = "\\stars[" + icon.attr2 + "]{" + icon.attr1 + "}";
        } else if (icon.name.equals("date") || icon.name.equals("place") || icon.name.equals("pos") || icon.name.equals("description")) {
            s = "";
        } else {
            s = "\\fa" + Character.toUpperCase(icon.name.charAt(0)) + icon.name.substring(1, icon.name.length());
        }

        iconCode = s;
    }

    @Override
    public void buildHtml() {
        String s = "";
        if (icon.name.equals("stars")) {
            for (int i = 1; i <= this.icon.attr2; i++) {
                if (i <= this.icon.attr1)
                    s += "<i class=\"fa fa-lg fa-star\"></i> ";
                else if ((i - this.icon.attr1) == 0.5)
                    s += "<i class=\"fa fa-lg fa-star-half-o\"></i> ";
                else
                    s += "<i class=\"fa fa-lg fa-star-o\"></i> ";
            }
        } else if (icon.name.equals("date") || icon.name.equals("place")) {
            s = "";
        } else if (icon.name.equals("email")) {
            s = "<i class=\"fa fa-lg fa-fw fa-envelope\"></i> ";
        } else {
            s = "<i class=\"fa fa-lg fa-fw fa-" + icon.name + "\"></i> ";
        }

        iconCode = s;
    }
}
