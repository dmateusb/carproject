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
public class PPPromocionLegalidadController extends VentanasIndividuales implements Initializable {
   
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void abrirFichasEscalera(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP PROMOCIÓN DE LA LEGALIDAD\\ESCALERA\\Fichas juego Escalera de la legalidad.pdf");
    }

    @FXML
    private void abrirTableroEscalera(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP PROMOCIÓN DE LA LEGALIDAD\\ESCALERA\\Tablero_escalera.pdf");
    }

    @FXML
    private void abrirPiramide(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP PROMOCIÓN DE LA LEGALIDAD\\PIRÁMIDE\\Piramide de la Legalidad CAR.pdf");
    }


    
    
}
