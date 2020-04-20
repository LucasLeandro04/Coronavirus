/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coronavirus;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author l.dantas
 */
public class Origem extends Application {

    private static Stage stage;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/views/Origem.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
        setStage(stage);
        stage.setResizable(false);
        
        //Tirar as bordas do pane ao abrir a tela
        stage.sizeToScene();

    }

    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        Origem.stage = stage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
