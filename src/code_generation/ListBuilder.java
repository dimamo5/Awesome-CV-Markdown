package code_generation;

import data.Cv;
import data.IconText;
import data.List;
import data.Utils;
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
        }
    }


    private String buildQualificationListHtml() {
        String s = "";
        for (int i = 0; i < this.list.list.size(); i++) {
            ArrayList<IconText> list = this.list.list.get(i);
            boolean hasplace = this.list.hasPlace(list);
            boolean hasdate = this.list.hasDate(list);
            int size = (hasdate) ? 0 : 1;
            size += (hasplace) ? 0 : 1;

            s += "<div class=\"row\">";
            s += "<div class=\"col-md-9\">";
            s += "<strong>" + list.get(0).text + "</strong><br>";
            IconText it = this.list.getFirstElem(list);
            if (it != null)
                s += new IconTextBuilder(it).getIconTextCode(Settings.LanguageOutput.HTML);

            if (list.size() > 4 - size) {
                s += "<ul>\n";
            }
            for (int m = 4 - size; m < list.size(); m++) {
                s += "<li>" + new IconTextBuilder(list.get(m)).getIconTextCode(Settings.LanguageOutput.HTML) +
                        "</li>\n";
            }
            if (list.size() > 4 - size) {
                s += "</ul>\n";
            }
            s += "</div>\n";

            s += "<div class=\"col-md-3 text-right\">";
            if (this.list.hasPlace(list))
                s += "<span style=\"color:#dc3522\">" + new IconTextBuilder(this.list.getPlace(list)).getIconTextCode
                        (Settings.LanguageOutput.HTML) + "</span><br>";
            if (this.list.hasDate(list))
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
            //DATE
            s += "<div class=\"col-md-2\">";
            if (this.list.hasDate(list))
                s += new IconTextBuilder(this.list.getDate(list)).getIconTextCode(Settings
                        .LanguageOutput.HTML);
            s += "</div>";
            //POSITION
            s += "<div class=\"col-md-8\"><strong>";
            if (this.list.hasPos(list))
                s += new IconTextBuilder(this.list.getPos(list)).getIconTextCode(Settings.LanguageOutput
                        .HTML) + "</strong>,";
            //DESCRIPTION
            if (this.list.hasDescription(list))
                s += new IconTextBuilder(this.list.getDescription(list)).getIconTextCode(Settings.LanguageOutput
                        .HTML);
            s += "</div>";

            //DATE
            s += "<div class=\"col-md-2 text-right\">";
            if (this.list.hasPlace(list))
                s += "<span style=\"color:#dc3522\">" + new IconTextBuilder(this.list.getPlace(list)).getIconTextCode
                        (Settings.LanguageOutput.HTML) + "</span>";
            s += "</div></div>";
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
            s += "<td><strong>" + header + "</strong></td>\n<td>" + new IconTextBuilder(list.list.get(i).get(1))
                    .getIconTextCode(Settings.LanguageOutput.HTML) +
                    "</td>";
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
            s += "\\cvitem[" + Utils.analyseAny(header, Cv.getVariables()) + "]{" + new IconTextBuilder(list.list.get
                    (i).get(1))
                    .getIconTextCode(Settings.LanguageOutput.TEX) + "}\n";
        }
        s += "\\end{cvitemskv}\n";
        return s;
    }

    public String buildQualificationList() {
        String s;
        s = "\\begin{cventries}\n";
        for (int i = 0; i < this.list.list.size(); i++) {
            ArrayList<IconText> list = this.list.list.get(i);
            boolean hasplace = this.list.hasPlace(list);
            boolean hasdate = this.list.hasDate(list);
            int size = (hasdate) ? 0 : 1;
            size += (hasplace) ? 0 : 1;

            s += "  \\cventry\n";
            IconText it = this.list.getFirstElem(list);

            if (it != null)
                s += "{" + new IconTextBuilder(it).getIconTextCode(Settings.LanguageOutput.TEX) + "}";
            else
                s += "{}";
            s += "{" + list.get(0).text + "}";

            //PLACE
            if (hasplace)
                s += "{" + new IconTextBuilder(this.list.getPlace(list)).getIconTextCode(Settings.LanguageOutput.TEX) +
                        "}";
            else
                s += "{}";

            //DATE
            if (hasdate)
                s += "{" + new IconTextBuilder(this.list.getDate(list)).getIconTextCode(Settings.LanguageOutput.TEX) +
                        "}\n";
            else
                s += "{}";

            if (list.size() > 4 - size) {
                s += "{\\begin{cvitems}\n";
            } else
                s += "{";

            for (int m = 4 - size; m < list.size(); m++) {
                s += "\\item {" + new IconTextBuilder(list.get(m)).getIconTextCode(Settings.LanguageOutput.TEX) +
                        "}\n";
            }

            if (list.size() > 4 - size) {
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
            if (this.list.hasPos(list))
                s += "  {" + new IconTextBuilder(this.list.getPos(list)).getIconTextCode(Settings.LanguageOutput
                        .TEX) + "}\n";
            else
                s += "{}\n";

            if (this.list.hasDescription(list))
                s += "  {" + new IconTextBuilder(this.list.getDescription(list)).getIconTextCode(Settings.LanguageOutput
                        .TEX) + "}\n";
            else
                s += "{}\n";

            if (this.list.hasPlace(list))
                s += "  {" + new IconTextBuilder(this.list.getPlace(list)).getIconTextCode(Settings.LanguageOutput
                        .TEX) +
                        "}\n";
            else
                s += "{}\n";

            if (this.list.hasDate(list))
                s += "  {" + new IconTextBuilder(this.list.getDate(list)).getIconTextCode(Settings.LanguageOutput.TEX) +
                        "}\n";
            else
                s += "{}\n";
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
