package pojo;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.lang.reflect.Method;

public class FeiZi {

    private static FeiZi feiZi=new FeiZi();
    private FeiZi(){}




    private StringProperty name= new SimpleStringProperty("feizi");

    public static FeiZi getFeiZi() {
        return feiZi;
    }

    public static void setFeiZi(FeiZi feiZi) {
        FeiZi.feiZi = feiZi;
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }
}
