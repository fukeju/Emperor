package contrlloer;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import pojo.Empire;
import scene.MyScene;
import scene.MyStage;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.TimerTask;


public class Index implements Initializable {

    @FXML
    private Button stater;

    @FXML
    private Button counter;

    @FXML
    private Button config;

    @FXML
    private Button button;

    @FXML
    private Button exit;


    public void OnStater() {
        System.out.println("这是开始按钮......");
        MyStage.myStage.setScene(fxml.towfxml);
    }

    public void onExit() {
        Platform.exit();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
