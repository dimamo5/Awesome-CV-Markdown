package data;

/**
 * Created by inesa on 14/05/2016.
 */

public class IconText {
    public Icon icon;
    public String text;

    public IconText() {
        this.text = "";
        this.icon = new Icon();
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "IconText{" +
                "icon=" + icon +
                ", text='" + text + '\'' +
                '}';
    }
}
