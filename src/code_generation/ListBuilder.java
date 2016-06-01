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
                listCode = buildSimpleList();
                break;
            case HONOR:
                listCode = buildQualificationList();
                break;
            case QUALIFICATIONS:
                break;
            case OTHER:
                break;
        }
    }

    public String buildSimpleList() {
        String s;
        s = "\\begin{multicols}{1}\n" +
                "\\begin{cvkeyval}\n";
        ArrayList<String> listHeader = list.listHeader;
        for (int i = 0; i < listHeader.size(); i++) {
            String header = listHeader.get(i);
            s += "\\cvkeyvalitem{" + header + "}{" + list.listBody.get(i).get(0).text + "}\n";
        }
        s += "\\end{cvkeyval}\n" +
                "\\end{multicols}";
        return s;
    }

    public String buildQualificationList() {
        String s;
        s = "\\begin{cventries}\n";
        for (int i = 0; i < this.list.listBody.size(); i++) {
            ArrayList<IconText> list = this.list.listBody.get(i);
            s += "  \\cventry\n";
            s += "{" + this.list.listHeader.get(i) + "}";
            s += "{" + list.get(0) + "}";
            s += "{" + this.list.getPlace(list) + "}";
            s += "{" + this.list.getDate(list) + "}";
            // TODO: 01/06/2016 resto da lista
            s = "{}";
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
