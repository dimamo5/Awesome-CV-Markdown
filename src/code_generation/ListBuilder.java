package code_generation;

import data.IconText;
import data.List;
import data.Utils;

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

    private String buildOtherList() {
        String s = "";
        s += "\\begin{cventries}\n";
        s += "\\cventry\n";

        for (int i = 0; i < list.list.size(); i++) {

            String header = list.list.get(i).get(0).text;
            ArrayList<IconText> l = this.list.list.get(i);

            s += "{"+ Utils.analyzeEscape(header) + "}\n";
            s += "{" + new IconTextBuilder(this.list.getPlace(l)).getIconTextCode() + "}\n";
            s += "{" + new IconTextBuilder(this.list.getDate(l)).getIconTextCode() + "}\n";

            if(list.list.get(i).size() < 5 ){
                for(int k = 0; k < 5-list.list.get(i).size(); k++ ){
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
            s += "{" + new IconTextBuilder(this.list.getFirstElem(list)).getIconTextCode() + "}";
            s += "{" + list.get(0).text + "}";
            s += "{" + new IconTextBuilder(this.list.getPlace(list)).getIconTextCode() + "}";
            s += "{" + new IconTextBuilder(this.list.getDate(list)).getIconTextCode() + "}\n";

            if (list.size() > 4) {
                s += "{\\begin{cvitems}\n";
            } else
                s += "{";

            for (int m = 4; m < list.size(); m++) {
                s += "\\item {" + new IconTextBuilder(list.get(m)).getIconTextCode() + "}\n";
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
            s += "  {" + new IconTextBuilder(this.list.getFirstElem(list)).getIconTextCode() + "}\n";
            s += "  {" + new IconTextBuilder(this.list.getSecondElem(list)).getIconTextCode() + "}\n";
            s += "  {" + new IconTextBuilder(this.list.getPlace(list)).getIconTextCode() + "}\n";
            s += "  {" + new IconTextBuilder(this.list.getDate(list)).getIconTextCode() + "}\n";
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
