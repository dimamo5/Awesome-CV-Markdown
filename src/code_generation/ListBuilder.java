package code_generation;

import data.IconText;
import data.List;
import data.Utils;
import parser.Markdown;
import parser.Settings;

import java.util.ArrayList;

/**
 * Created by diogo on 01/06/2016.
 */
public class ListBuilder implements TexBuilder {
    private String listCode;
    private List list;

    public ListBuilder(List l) {
        this.list = l;
        listCode = "";
    }


    @Override
    public void buildTex() {
        switch (list.getType()) {
            case SIMPLE:
                listCode = buildSimpleList();
                break;
            case HONOR:
                listCode = buildHonorList();
                break;
            case QUALIFICATIONS:
                listCode = buildQualificationList();
                break;
            case OTHER:
                listCode = buildOtherList();
                break;
        }
    }

    @Override
    public void buildHtml() {
        switch (list.getType()) {
            case SIMPLE:
                listCode = buildSimpleListHtml();
                break;
            case HONOR:
                listCode = buildHonorListHtml();
                break;
            case QUALIFICATIONS:
                listCode = buildQualificationListHtml();
                break;
            case OTHER:
                break;
        }
    }

    private String buildOtherList() {
        String s = "";
        s += "\\begin{cventries}\n";
        s += "\\cventry\n";

        for (int i = 0; i < list.list.size(); i++) {

            String header = list.list.get(i).get(0).text;
            ArrayList<IconText> l = this.list.list.get(i);

            s += "{" + Utils.analyzeEscape(header) + "}\n";
            s += "{" + new IconTextBuilder(this.list.getPlace(l)).getIconTextCode(Settings.LanguageOutput.TEX) + "}\n";
            s += "{" + new IconTextBuilder(this.list.getDate(l)).getIconTextCode(Settings.LanguageOutput.TEX) + "}\n";

            if (list.list.get(i).size() < 5) {
                for (int k = 0; k < 5 - list.list.get(i).size(); k++) {
                    s += "{}\n";
                }
            }

            s += "{\n";
            s += "\\begin{cvitems}\n";

            s += " \\item{" + Utils.analyzeEscape(list.list.get(i).get(1).text) + "}\n";
        }

        s += "\\end{cvitems}\n" + "}";
        s += "\n\\end{cventries}\n";
        return s;
    }


    private String buildQualificationListHtml() {
        String s = "";
        for (int i = 0; i < this.list.list.size(); i++) {
            ArrayList<IconText> list = this.list.list.get(i);
            s += "<div class=\"row\">";
            s += "<div class=\"col-md-9\">";
            s += "<strong>" + list.get(0).text + "</strong><br>";
            s += new IconTextBuilder(this.list.getFirstElem(list)).getIconTextCode(Settings.LanguageOutput.HTML);
            if (list.size() > 4) {
                s += "<ul>\n";
            }
            for (int m = 4; m < list.size(); m++) {
                s += "<li>" + new IconTextBuilder(list.get(m)).getIconTextCode(Settings.LanguageOutput.HTML) +
                        "</li>\n";
            }
            if (list.size() > 4) {
                s += "</ul>\n";
            }
            s += "</div>\n";

            s += "<div class=\"col-md-3 text-right\">";
            s += "<span style=\"color:#dc3522\">" + new IconTextBuilder(this.list.getPlace(list)).getIconTextCode
                    (Settings.LanguageOutput.HTML) + "</span><br>";
            s += new IconTextBuilder(this.list.getDate(list)).getIconTextCode(Settings.LanguageOutput.HTML);
            s += "</div>";


            s += "</div><br>";
        }
        return s;
    }

    private String buildHonorListHtml() {
        String s = "";
        for (int i = 0; i < this.list.list.size(); i++) {
            ArrayList<IconText> list = this.list.list.get(i);
            s += "<div class=\"row\">\n";
            s += "<div class=\"col-md-2\">" + new IconTextBuilder(this.list.getFirstElem(list)).getIconTextCode
                    (Settings.LanguageOutput.HTML) + "</div>\n";
            s += "<div class=\"col-md-8\"><strong>" + new IconTextBuilder(this.list.getSecondElem(list))
                    .getIconTextCode(Settings.LanguageOutput.HTML) + "</strong>";
            s += new IconTextBuilder(this.list.getPlace(list)).getIconTextCode(Settings.LanguageOutput.HTML) +
                    "</div>\n";
            s += "<div class=\"col-md-2\">" + new IconTextBuilder(this.list.getDate(list)).getIconTextCode(Settings
                    .LanguageOutput.HTML) + "</div>";
            s += "</div>";
        }
        return s;
    }

    private String buildSimpleListHtml() {
        String s = "";
        s += "<div class=\"row\"><div class=\"col-md-5\">\n";
        s += "<table class=\"table borderless\">\n";
        for (int i = 0; i < list.list.size(); i++) {
            s += "<tr>";
            String header = list.list.get(i).get(0).text;
            s += "<td><strong>" + header + "</strong></td>\n<td>" + list.list.get(i).get(1).text + "</td>";
            s += "</tr>\n";
        }
        s += "</table></div></div>";
        return s;
    }

    public String buildSimpleList() {

        String s = "";
        s = "\\begin{cvitemskv}\n";
        for (int i = 0; i < list.list.size(); i++) {
            String header = list.list.get(i).get(0).text;
            s += "\\cvitem[" + Utils.analyzeEscape(header) + "]{" + list.list.get(i).get(1).text + "}\n";
        }
        s += "\\end{cvitemskv}\n";
        return s;
    }

    public String buildQualificationList() {
        String s;
        s = "\\begin{cventries}\n";
        for (int i = 0; i < this.list.list.size(); i++) {
            ArrayList<IconText> list = this.list.list.get(i);
            s += "  \\cventry\n";
            s += "{" + new IconTextBuilder(this.list.getFirstElem(list)).getIconTextCode(Settings.LanguageOutput.TEX) + "}";
            s += "{" + list.get(0).text + "}";
            s += "{" + new IconTextBuilder(this.list.getPlace(list)).getIconTextCode(Settings.LanguageOutput.TEX) +
                    "}";
            s += "{" + new IconTextBuilder(this.list.getDate(list)).getIconTextCode(Settings.LanguageOutput.TEX) +
                    "}\n";

            if (list.size() > 4) {
                s += "{\\begin{cvitems}\n";
            } else
                s += "{";

            for (int m = 4; m < list.size(); m++) {
                s += "\\item {" + new IconTextBuilder(list.get(m)).getIconTextCode(Settings.LanguageOutput.TEX) +
                        "}\n";
            }

            if (list.size() > 4) {
                s += "\\end{cvitems}}\n";
            } else
                s += "}";
        }
        s += "\\end{cventries}\n";
        return s;
    }

    public String buildHonorList() {
        String s = "";
        s += "\\begin{cvhonors}\n";
        for (int i = 0; i < this.list.list.size(); i++) {
            ArrayList<IconText> list = this.list.list.get(i);
            s += " \\cvhonor\n";
            s += "  {" + new IconTextBuilder(this.list.getFirstElem(list)).getIconTextCode(Settings.LanguageOutput
                    .TEX) + "}\n";
            s += "  {" + new IconTextBuilder(this.list.getSecondElem(list)).getIconTextCode(Settings.LanguageOutput
                    .TEX) + "}\n";
            s += "  {" + new IconTextBuilder(this.list.getPlace(list)).getIconTextCode(Settings.LanguageOutput.TEX) +
                    "}\n";
            s += "  {" + new IconTextBuilder(this.list.getDate(list)).getIconTextCode(Settings.LanguageOutput.TEX) +
                    "}\n";
        }

        s += "\\end{cvhonors}\n";
        return s;
    }

    public String getListCode(Settings.LanguageOutput lang) {
        if (listCode == null || listCode.isEmpty()) {
            if (lang == Settings.LanguageOutput.TEX)
                buildTex();
            else if (lang == Settings.LanguageOutput.HTML)
                buildHtml();
        }
        return listCode;
    }
}
