/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coronavirus;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author l.dantas
 */
public class Coronavirus extends Application {

  private static Stage stage;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/views/Tela.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
        setStage(stage);
        //Deixa a janela do Menu Principal fixa
        stage.setResizable(false);
        
        //Tirar as bordas do pane ao abrir a tela
        stage.sizeToScene();

    }

    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        Coronavirus.stage = stage;
    }

    public static void main(String[] args) {
        launch(args);
    }

}
