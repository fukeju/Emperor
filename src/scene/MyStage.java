package scene;

import javafx.stage.Stage;


public class MyStage extends Stage {

    public static MyStage myStage = new MyStage();

    static {
        MyScene myScene = new MyScene();
        myStage.setResizable(false);
        myStage.setTitle("keju");
        myStage.setScene(myScene.getScene("/fxml/index.fxml"));
    }

    public void setMyScene(String src) {
        MyScene myScene = new MyScene();
        myStage.setScene(myScene.getScene(src));

    }


}
