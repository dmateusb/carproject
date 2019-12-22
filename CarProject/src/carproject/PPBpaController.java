/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author david
 */
public class PPBpaController extends  VentanasIndividuales implements Initializable {

    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }



    @FXML
    private void abrirCuaderno(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BPA SUBSECTOR CAFETERO\\AGENDA\\PP2BPA HP1 Cuaderno.pdf");
    }

    @FXML
    private void abrirPortada(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BPA SUBSECTOR CAFETERO\\AGENDA\\PP2BPA HP1 Cuaderno portada.pdf");
    }

    @FXML
    private void abrirPlegable(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BPA SUBSECTOR CAFETERO\\PLEGABLE\\PP2BPA HP3 Plegable sombrio.pdf");
    }

    @FXML
    private void abrirMultimedia(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BPA SUBSECTOR CAFETERO\\MULTIMEDIA\\PP2 BPA HP2 Multimedia sombrio.pdf");
    }

    
    
}
