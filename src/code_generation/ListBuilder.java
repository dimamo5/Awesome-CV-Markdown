package code_generation;

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
                buildSimpleList();
                break;
            case HONOR:
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

    public String getListCode() {
        if (listCode == null) {
            buildTex();
        }
        return listCode;
    }
}
