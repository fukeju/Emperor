package contrlloer;



import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import pojo.Empire;
import scene.MyScene;
import scene.MyStage;

import java.net.URL;
import java.util.ResourceBundle;

public class Tow implements Initializable {

    @FXML
    private Label day;

    @FXML
    private Label state;


    public void nextDay() {
        Empire.getEmpire().setRounds(Empire.getEmpire().getRounds() + 1);
        Empire.getEmpire().setDay(Empire.getEmpire().getRounds() / 8);

    }

    static MyStage stateStage;

    {
        stateStage = new MyStage();
        MyScene stateScene = new MyScene();
        stateStage.setResizable(false);
        stateStage.setTitle("State");
        stateStage.setScene(stateScene.getScene("/fxml/emprie.fxml"));
    }

    public void onNext() {
        MyStage.myStage.setScene(fxml.bigfxml);
        nextDay();
    }

    public void onState() {
        stateStage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        day.textProperty().bind(Empire.getEmpire().tianqiProperty());
    }

    public void taihe() {        //太和殿
        MyStage.myStage.setScene(fxml.taihe);
    }

    public void yangxin() {      //养心殿
        MyStage.myStage.setScene(fxml.yangxin);
    }

    public void hou() {         //后宫
        MyStage.myStage.setScene(fxml.hougong);
    }

    public void other() {        //其它殿宇

        nextDay();
    }

    public void bing() {        //兵营

        nextDay();
    }
}
