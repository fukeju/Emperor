package contrlloer;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import pojo.Empire;
import scene.MyStage;

public class big {

    @FXML
    private Button hu;

    @FXML
    private Button gong;

    @FXML
    private Button li;

    @FXML
    private Button bing;

    @FXML
    private Label text;


    @FXML
    private VBox hubo;
    @FXML
    private VBox gongbu;
    @FXML
    private VBox bingbu;
    @FXML
    private VBox libu;

    public void jianS() {
        if (Empire.getEmpire().getBeilv() != 0.5) {
            Empire.getEmpire().setBeilv(0.5);
            text.setText("当前税收倍率:" + Empire.getEmpire().getBeilv());
            Empire.getEmpire().setDignified(Empire.getEmpire().getDignified() + 100);
        } else {
            text.setText("今年已经减过税收了!");
        }
    }

    public void addP() {
        if (Empire.getEmpire().getDignified() > 200) {
            if (Empire.getEmpire().getBeilv() != 1.5) {
                Empire.getEmpire().setBeilv(1.5);
                text.setText("当前税收倍率:" + Empire.getEmpire().getBeilv());
                Empire.getEmpire().setDignified(Empire.getEmpire().getDignified() - 200);
            } else {
                text.setText("今年已经增加过税收了！");
            }
        } else {
            text.setText("你当前的皇威不支持你增加税收！");
        }
    }

    public void qingzhi() {
        if (Empire.getEmpire().getDignified() > 400) {
            if (Empire.getEmpire().isQiang()) {
                Empire.getEmpire().setProperty(Empire.getEmpire().getProperty() + Empire.getEmpire().getPoperies());
                Empire.getEmpire().setQiang(false);
                Empire.getEmpire().setDignified(Empire.getEmpire().getDignified() - 400);
                text.setText("征收完毕！！");
            } else {
                text.setText("今年已经强制征收过了！");
            }
        } else {
            text.setText("你当前的皇威不支持你强制税收！");
        }
    }

    public void renkou() {
        text.setText("当前全国人口数:" + Empire.getEmpire().getPoperies().toString() + "户");
    }

    public void disli() {
        hubo.setStyle("visibility: hidden");
        libu.setStyle("visibility: visible");
        bingbu.setStyle("visibility: hidden");
        gongbu.setStyle("visibility: hidden");
    }

    public void disbing() {
        hubo.setStyle("visibility: hidden");
        libu.setStyle("visibility: hidden");
        bingbu.setStyle("visibility: visible");
        gongbu.setStyle("visibility: hidden");
    }
    public void disgong() {
        hubo.setStyle("visibility: hidden");
        libu.setStyle("visibility: hidden");
        bingbu.setStyle("visibility: hidden");
        gongbu.setStyle("visibility: visible");
    }
    public void dishu() {
        hubo.setStyle("visibility: visible");
        libu.setStyle("visibility: hidden");
        bingbu.setStyle("visibility: hidden");
        gongbu.setStyle("visibility: hidden");
    }

    public void backs() {
        MyStage.myStage.setScene(fxml.towfxml);
        text.setText("");
    }

}