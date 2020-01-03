/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author david
 */
public class AguaEducacionController extends VentanasIndividuales implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
    }

    @FXML
    private void abrirGuia(ActionEvent event) {
        Procedimiento.cargarArchivo("\\AGUA Y EDUCACIÓN GUIA PARA DOCENTES (WET)\\GUIA WET.pdf");
    }






   


}
