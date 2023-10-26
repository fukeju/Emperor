package contrlloer;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import scene.MyScene;
import scene.MyStage;

public class big {

    @FXML
    private Button hu;

    @FXML
    private Button gong;

    @FXML
    private Button li;

    @FXML
    private Button xing;

    @FXML
    private Button back;

    @FXML
    private VBox hubo;

    public void dishu(){
        hubo.setStyle("visibility: visible");
    }
    public void backs(){
        MyStage.myStage.setScene(new MyScene().getScene("/fxml/tow.fxml"));
    }

}