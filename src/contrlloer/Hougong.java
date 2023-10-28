package contrlloer;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import pojo.FeiZi;
import scene.MyStage;

public class Hougong {


    public void exit(){
        MyStage.myStage.setScene(fxml.towfxml);
    }
    public void select(){
        FeiZi.getFeiZi().setName("nana");
        MyStage.myStage.setScene(fxml.selectFeiZi);
    }

}
