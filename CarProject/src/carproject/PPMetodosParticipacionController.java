/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author david
 */
public class PPMetodosParticipacionController extends VentanasIndividuales implements Initializable {
   
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }


    @FXML
    private void abrirPendon(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP MÉTODOS DE PARTICIPACIÓN\\PENDÓN DE LA PARTICIPACIÓN\\Pendón.pdf");
    }

    @FXML
    private void abrirRuleta(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP MÉTODOS DE PARTICIPACIÓN\\RULETA DE LA PARTICIPACIÓN\\ruleta (1).pdf");
    }

    @FXML
    private void abrirTarjetasInformativas(ActionEvent event) {
        Procedimiento.cargarArchivo("");
    }
    
   
    
}
