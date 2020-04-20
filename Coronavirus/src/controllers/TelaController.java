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
import coronavirus.Origem;
import coronavirus.Transmissao;
import coronavirus.Tratamento;
import coronavirus.Prevencao;
import coronavirus.Sobre;

/**
 * FXML Controller class
 *
 * @author l.dantas
 */
public class TelaController implements Initializable {

    @FXML
    private Button btnOrigem;
    @FXML
    private Button btnSintomas;
    @FXML
    private Button btnTratamento;
    @FXML
    private Button btnTransmissao;

    private static Stage stage;
    @FXML
    private Button btnPrevencao;
    @FXML
    private Button btnSobre;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void btnOrigem_Click(ActionEvent event) throws Exception {
        fecharTela();
        Origem origem = new Origem();
        origem.start(new Stage());

    }

    @FXML
    private void btnSintomas_Click(ActionEvent event) throws Exception {
        Sintomas sintomas = new Sintomas();
        sintomas.start(new Stage());
        fecharTela();

    }

    @FXML
    private void btnTratamento_Click(ActionEvent event) throws Exception {
        Tratamento tratamento = new Tratamento();
        tratamento.start(new Stage());
        fecharTela();

    }

    @FXML
    private void btnTransmissao_Click(ActionEvent event) throws Exception {
        Transmissao transmissao = new Transmissao();
        transmissao.start(new Stage());
        fecharTela();
    }

    @FXML
    private void btnPrevencao_Click(ActionEvent event) throws Exception {
        Prevencao prevencao = new Prevencao();
        prevencao.start(new Stage());
        fecharTela();
    }

    public void fecharTela() {
        Coronavirus.getStage().close();
    }

    @FXML
    private void btnSobre(ActionEvent event) throws Exception {
        Coronavirus.getStage().close();
        Sobre sobre = new Sobre();
        sobre.start(new Stage());
 
    }
}
