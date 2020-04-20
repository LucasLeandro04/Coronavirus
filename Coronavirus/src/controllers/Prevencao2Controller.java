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
import coronavirus.Prevencao;
import coronavirus.Prevencao2;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author Lucas
 */
public class Prevencao2Controller implements Initializable {

    @FXML
    private Button btnVoltar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnVoltar_Click(ActionEvent event) throws Exception {
        Prevencao2.getStage().close();
        Prevencao prevencao = new Prevencao();
        prevencao.start(new Stage());
    }
    
}
