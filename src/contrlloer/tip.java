package contrlloer;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import pojo.Empire;

import java.net.URL;
import java.util.ResourceBundle;

public class tip implements Initializable {

    @FXML
    private Label age=new Label();


    @FXML
    private Label day=new Label();


    @FXML
    private Label property=new Label();


    @FXML
    private Label dignified=new Label();


    @FXML
    private Button close=new Button();


    public void close(){
        Tow.stateStage.close();
    }


    public Label getAge() {
        return age;
    }

    public void setAge(Label age) {
        this.age = age;
    }

    public Label getDay() {
        return day;
    }

    public void setDay(Label day) {
        this.day = day;
    }

    public Label getProperty() {
        return property;
    }

    public void setProperty(Label property) {
        this.property = property;
    }

    public Label getDignified() {
        return dignified;
    }

    public void setDignified(Label dignified) {
        this.dignified = dignified;
    }

    public Button getClose() {
        return close;
    }

    public void setClose(Button close) {
        this.close = close;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        day.textProperty().bind(Empire.getEmpire().dayProperty().asString());
        age.textProperty().bind(Empire.getEmpire().ageProperty().asString());
        property.textProperty().bind(Empire.getEmpire().propertyProperty().asString());
        dignified.textProperty().bind(Empire.getEmpire().dignifiedProperty().asString());
    }
}