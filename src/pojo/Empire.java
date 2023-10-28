package pojo;


import javafx.beans.property.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class Empire {
    private static Empire empire = new Empire();
    private StringProperty name = new SimpleStringProperty("empire");         //姓名
    private IntegerProperty age = new SimpleIntegerProperty(16);         //年龄
    private IntegerProperty day = new SimpleIntegerProperty(0);          //在位
    private DoubleProperty property = new SimpleDoubleProperty(999);   //资产
    private IntegerProperty dignified = new SimpleIntegerProperty(999);  //威严
    private IntegerProperty Rounds = new SimpleIntegerProperty(0);   //回合数
    private Integer poperies = new Integer(1000);
    private StringProperty tianqi = new SimpleStringProperty("清晨");


    Random random = new Random();
    Double beilv = new Double(1.0);     //征收税率
    boolean isQiang=true;                      //是否能强制征收



    private Empire() {
    }


    static {
        empire.roundsProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                if (empire.getRounds() % 8 < 2) {
                    empire.setTianqi("清晨");
                } else if (empire.getRounds() % 8 < 4) {
                    empire.setTianqi("上午 ");
                } else if (empire.getRounds() % 8 < 6) {
                    empire.setTianqi("下午");
                } else if (empire.getRounds() % 8 < 8) {
                    empire.setTianqi("晚上");
                }

                if (empire.getRounds() % 32 == 0) {
                    empire.setAge(empire.getAge() + 1);
                    empire.setProperty(empire.getProperty() + empire.getPoperies() * empire.getBeilv());
                    empire.setPoperies(empire.getPoperies() + empire.getDignified() / 5);
                    empire.setPoperies(empire.getPoperies() - empire.random.nextInt(empire.getPoperies() / 3));
                    empire.setBeilv(1.0);
                    empire.setQiang(true);
                }
            }
        });
    }

    public Integer getPoperies() {
        return poperies;
    }

    public void setPoperies(Integer poperies) {
        this.poperies = poperies;
    }

    public int getRounds() {
        return Rounds.get();
    }

    public IntegerProperty roundsProperty() {
        return Rounds;
    }

    public Double getBeilv() {
        return beilv;
    }

    public void setBeilv(Double beilv) {
        this.beilv = beilv;
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

    public double getProperty() {
        return property.get();
    }

    public DoubleProperty propertyProperty() {
        return property;
    }

    public void setProperty(double property) {
        this.property.set(property);
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
    public boolean isQiang() {
        return isQiang;
    }

    public void setQiang(boolean qiang) {
        isQiang = qiang;
    }
}
