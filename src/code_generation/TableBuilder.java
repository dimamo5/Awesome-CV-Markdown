package code_generation;

import data.IconText;
import data.Table;
import parser.Markdown;

import java.util.ArrayList;

/**
 * Created by diogo on 28/05/2016.
 */
public class TableBuilder implements TexBuilder {
    private final Table table;
    private final int COLUMN_BOUND = 10;
    private String tableCode;

    public TableBuilder(Table t) {
        table = t;
        tableCode = "";
    }


    @Override
    public void buildTex() {
        //generates code of this 0> { X X s X X }
        tableCode = "\\rowcolors{1}{white}{" + Markdown.settings.getColorCode() + "}\n";
        String columnSizeCode = "{";
        for (int i = 0; i < table.getNrColumns(); i++) {
            if (getColumnClass(i)) {
                columnSizeCode += " X";
            } else {
                columnSizeCode += " s";
            }
        }
        columnSizeCode += " }";

        //generates code of header
        String headerCode = "";
        ArrayList<String> header = table.getHeader();
        for (int i = 0; i < header.size(); i++) {
            String s = header.get(i);
            if (i != header.size() - 1)
                headerCode += "\\multicolumn{1}{c}{" + s + "} &";
            else
                headerCode += "\\multicolumn{1}{c}{" + s + "}";
        }
        headerCode += "\\\\\n";

        //generates code for table body
        String bodyCode = "";
        for (int i = 0; i < table.getBody().size(); i++) {
            ArrayList<IconText> line = table.getBody().get(i);
            for (int m = 0; m < line.size(); m++) {
                if (m != line.size() - 1)
                    bodyCode += line.get(m).text + " & ";
                else
                    bodyCode += line.get(m).text + "\\\\\n";
            }
        }

        tableCode = "\\begin{tabularx}{\\textwidth}" + columnSizeCode + "\n" +
                headerCode + bodyCode + "\\end{tabularx}";
    }

    public String getTableCode() {
        if (tableCode == null) {
            buildTex();
        }
        return tableCode;
    }

    /**
     * Analizes the size of each cell in a specific column
     * It is needed dor the generated code in latex (s or X)
     *
     * @param columnNr Nr of the column to be analyzed
     * @return True: Automatically(X) / False: Small(s)
     */
    public boolean getColumnClass(int columnNr) {
        if (this.table.getHeader().get(columnNr).length() < COLUMN_BOUND) {
            ArrayList<ArrayList<IconText>> bodyTable = this.table.getBody();
            for (ArrayList<IconText> line : bodyTable) {
                if (line.get(columnNr).text.length() > COLUMN_BOUND) {
                    return false;
                }
            }
        }
        return true;
    }
}
