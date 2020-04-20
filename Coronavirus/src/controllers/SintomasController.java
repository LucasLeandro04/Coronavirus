/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import coronavirus.Sintomas;
import coronavirus.Coronavirus;

/**
 * FXML Controller class
 *
 * @author l.dantas
 */
public class SintomasController implements Initializable {

    @FXML
    private Button btnVoltar;

    private static Stage stage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void btnVoltar_Click(ActionEvent event) throws Exception {
        Sintomas.getStage().close();
        Coronavirus coronavirus = new Coronavirus();
        coronavirus.start(new Stage());
    }

}
