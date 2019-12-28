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
public class PortafolioController extends VentanasIndividuales implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }


    @FXML
    void abrirCalcomanias(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PORTAFOLIO NIÑOS DEFENSORES DEL AGUA\\Calcomanias_2015.pdf");

    }

    @FXML
    void abrirDefensores(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PORTAFOLIO NIÑOS DEFENSORES DEL AGUA\\Defensores_2015.pdf");

    }

    @FXML
    void abrirInterruptor(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PORTAFOLIO NIÑOS DEFENSORES DEL AGUA\\Interruptor_2015.pdf");

    }

    @FXML
    void abrirJuegoDeMesa(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PORTAFOLIO NIÑOS DEFENSORES DEL AGUA\\Juego de Mesa_ 2015.pdf");

    }

    @FXML
    void abrirPortafolio(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PORTAFOLIO NIÑOS DEFENSORES DEL AGUA\\Portafolio_2015.pdf");

    }

    @FXML
    void abrirTableroControl(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PORTAFOLIO NIÑOS DEFENSORES DEL AGUA\\Tablero de Control_2015.pdf");

    }


  
    
}
