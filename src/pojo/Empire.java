package pojo;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class Empire {
    private static Empire empire=new Empire();
    private StringProperty name=new SimpleStringProperty();         //姓名
    private IntegerProperty age=new SimpleIntegerProperty();         //年龄
    private IntegerProperty day=new SimpleIntegerProperty();          //在位
    private IntegerProperty property=new SimpleIntegerProperty();   //资产
    private IntegerProperty dignified=new SimpleIntegerProperty();  //威严
    private IntegerProperty Rounds=new SimpleIntegerProperty();   //回合数

    private StringProperty tianqi=new SimpleStringProperty();

    private Empire(){
    }
    static {
        empire.setName("empire");
        empire.setAge(16);
        empire.setDay(0);
        empire.setProperty(999);
        empire.setDignified(999);
        empire.setRounds(0);
        empire.setTianqi("清晨");
        empire.roundsProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                if(empire.getRounds()%8<2) {
                    empire.setTianqi("清晨");
                }
                else if(empire.getRounds()%8<4){
                    empire.setTianqi("上午 ");
                }else if(empire.getRounds()%8<6){
                    empire.setTianqi("下午");
                }else if(empire.getRounds()%8<8){
                    empire.setTianqi("晚上");
                }
            }
        });
    }



    public int getRounds() {
        return Rounds.get();
    }

    public IntegerProperty roundsProperty() {
        return Rounds;
    }

    public void setRounds(int rounds) {
        this.Rounds.set(rounds);
    }

    public static Empire getEmpire() {
        return empire;
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

    public int getAge() {
        return age.get();
    }

    public IntegerProperty ageProperty() {
        return age;
    }

    public void setAge(int age) {
        this.age.set(age);
    }

    public int getDay() {
        return day.get();
    }

    public IntegerProperty dayProperty() {
        return day;
    }

    public void setDay(int day) {
        this.day.set(day);
    }

    public int getProperty() {
        return property.get();
    }

    public IntegerProperty propertyProperty() {
        return property;
    }

    public void setProperty(int property) {
        this.property.set(property);
    }

    public int getDignified() {
        return dignified.get();
    }

    public IntegerProperty dignifiedProperty() {
        return dignified;
    }

    public void setDignified(int dignified) {
        this.dignified.set(dignified);
    }

    public String getTianqi() {
        return tianqi.get();
    }

    public StringProperty tianqiProperty() {
        return tianqi;
    }

    public void setTianqi(String tianqi) {
        this.tianqi.set(tianqi);
    }

}
