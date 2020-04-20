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
import coronavirus.Coronavirus;
import javafx.stage.Stage;
import coronavirus.Prevencao;
import coronavirus.Prevencao2;

/**
 * FXML Controller class
 *
 * @author Lucas
 */
public class PrevencaoController implements Initializable {

    @FXML
    private Button btnProximo;
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
    private void btnProximo_Click(ActionEvent event) throws Exception {
        Prevencao.getStage().close();
        Prevencao2 prevencao2 = new Prevencao2();
        prevencao2.start(new Stage());
    }

    public void voltarPrevencao() throws Exception {
        Prevencao prevencao = new Prevencao();
        prevencao.start(new Stage());

    }

    @FXML
    private void btnVoltar_Click(ActionEvent event) throws Exception {
        Prevencao.getStage().close();
        Coronavirus coronavirus = new Coronavirus();
        coronavirus.start(new Stage());
    }

}
