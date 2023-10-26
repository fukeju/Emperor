package scene;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
public class MyScene {
    Parent root;

    public Scene getScene(String src) {
        try {
            root = FXMLLoader.load(getClass().getResource(src));
        } catch (IOException e) {
            System.out.println("文件加载失败。。。。");
        }
        return new Scene(root);
    }


}
