package data;

/**
 * Created by inesa on 14/05/2016.
 */
public class IconText {
    public Icon icon;
    public String object;

    public IconText() {
        this.object = "";
        this.icon = new Icon();
    }

    public void setObject(String object){
        this.object = object;
    }

    @Override
    public String toString() {
        return "IconText{" +
                "icon=" + icon +
                ", object='" + object + '\'' +
                '}';
    }
}
