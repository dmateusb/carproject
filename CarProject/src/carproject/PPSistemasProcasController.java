/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;

import java.net.URI;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author david
 */
public class PPSistemasProcasController extends  VentanasIndividuales implements Initializable {
   
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void abrirParques(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP SISTEMAS DE PRODUCCIÓN PROCAS\\PARQUÉS\\parques50x50.pdf");
    }

    @FXML
    private void abrirPlegable(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP SISTEMAS DE PRODUCCIÓN PROCAS\\PLEGABLES\\Plegables (9).pdf");
    }

    @FXML
    private void abrirPortafolio(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP SISTEMAS DE PRODUCCIÓN PROCAS\\PORTAFOLIO\\Portafolio.pdf");

    }

    @FXML
    private void abrirHojasMarca(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP SISTEMAS DE PRODUCCIÓN PROCAS\\PORTAFOLIO\\Hojas marca de agua.pdf");
    }

    
    
    
}
