package contrlloer;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import pojo.FeiZi;

import java.net.URL;
import java.util.ResourceBundle;

public class SelectFeiZi implements Initializable {
    StringProperty name = new SimpleStringProperty();

    @FXML
    private Label texts;

    @FXML
    private ImageView img;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        FeiZi.getFeiZi().nameProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if(newValue.equals("nana")){
                    img.setStyle("-fx-image: url(/img/a.png);");
                }
            }
        });
    }



}
