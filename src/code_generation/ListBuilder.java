package code_generation;

import data.IconText;
import data.List;
import parser.Markdown;

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
                break;
        }
    }

    @Override
    public void buildHtml() {

    }

    public String buildSimpleList() {
        String s;
        s = "\\begin{cvitemskv}\n";
        for (int i = 0; i < list.list.size(); i++) {
            String header = list.list.get(i).get(0).text;
            s += "\\cvitem[" + header + "]{" + list.list.get(i).get(1).text + "}\n";
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
            s += "{" + new IconTextBuilder(this.list.getFirstElem(list)).getIconTextCode(Markdown.settings.getOutput()) + "}";
            s += "{" + list.get(0).text + "}";
            s += "{" + new IconTextBuilder(this.list.getPlace(list)).getIconTextCode(Markdown.settings.getOutput()) + "}";
            s += "{" + new IconTextBuilder(this.list.getDate(list)).getIconTextCode(Markdown.settings.getOutput()) + "}\n";

            if (list.size() > 4) {
                s += "{\\begin{cvitems}\n";
            } else
                s += "{";

            for (int m = 4; m < list.size(); m++) {
                s += "\\item {" + new IconTextBuilder(list.get(m)).getIconTextCode(Markdown.settings.getOutput()) + "}\n";
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
            s += "  {" + new IconTextBuilder(this.list.getFirstElem(list)).getIconTextCode(Markdown.settings.getOutput()) + "}\n";
            s += "  {" + new IconTextBuilder(this.list.getSecondElem(list)).getIconTextCode(Markdown.settings.getOutput()) + "}\n";
            s += "  {" + new IconTextBuilder(this.list.getPlace(list)).getIconTextCode(Markdown.settings.getOutput()) + "}\n";
            s += "  {" + new IconTextBuilder(this.list.getDate(list)).getIconTextCode(Markdown.settings.getOutput()) + "}\n";
        }

        s += "\\end{cvhonors}\n";
        return s;
    }

    public String getListCode() {
        if (listCode == null || listCode.isEmpty()) {
            buildTex();
        }
        return listCode;
    }
}
