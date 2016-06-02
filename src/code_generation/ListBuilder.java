package code_generation;

import data.IconText;
import data.List;

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
                //listCode = buildSimpleList();
                break;
            case HONOR:
                break;
            case QUALIFICATIONS:
                listCode = buildQualificationList();
                break;
            case OTHER:
                break;
        }
    }

    /*public String buildSimpleList() {
        String s;
        s = "\\begin{multicols}{1}\n" +
                "\\begin{cvkeyval}\n";
        ArrayList<String> listHeader = list.listHeader;
        for (int i = 0; i < listHeader.size(); i++) {
            String header = listHeader.get(i);
            s += "\\cvkeyvalitem{" + header + "}{" + list.list.get(i).get(0).text + "}\n";
        }
        s += "\\end{cvkeyval}\n" +
                "\\end{multicols}";
        return s;
    }*/

    public String buildQualificationList() {
        String s;
        s = "\\begin{cventries}\n";
        for (int i = 0; i < this.list.list.size(); i++) {
            ArrayList<IconText> list = this.list.list.get(i);
            s += "  \\cventry\n";
            s += "{" + list.get(0).text + "}";
            s += "{" + new IconTextBuilder(this.list.getFirstElem(list)).getIconTextCode() + "}";
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

    public String getListCode() {
        if (listCode == null || listCode.isEmpty()) {
            buildTex();
        }
        return listCode;
    }
}
