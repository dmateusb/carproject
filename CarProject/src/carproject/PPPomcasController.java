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
public class PPPomcasController extends VentanasIndividuales implements Initializable {
   
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }


    @FXML
    private void abrirPortafolio(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP POMCAS\\PORTAFOLIO POMCAS\\PORTAFOLIO_POMCA.pdf");
    }

    @FXML
    private void abrirCaja(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP POMCAS\\RECORRIENDO EL TERRITORIO\\caja(FILEminimizer).pdf");
    }

    @FXML
    private void abrirFichas(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP POMCAS\\RECORRIENDO EL TERRITORIO\\fichas(FILEminimizer).pdf");
    }

    @FXML
    private void abrirInstructivo(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP POMCAS\\RECORRIENDO EL TERRITORIO\\instructivo(FILEminimizer).pdf");
    }

    @FXML
    private void abrirPistasBosqueAndino(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP POMCAS\\RECORRIENDO EL TERRITORIO\\pistas-BOSQUE ANDINO(FILEminimizer).pdf");
    }

    @FXML
    private void abrirPistasBosqueHumedo(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP POMCAS\\RECORRIENDO EL TERRITORIO\\pistas-Bosque Humedo(FILEminimizer).pdf");
    }

    @FXML
    private void abrirPistasBosqueSeco(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP POMCAS\\RECORRIENDO EL TERRITORIO\\pistas-Bosque seco(FILEminimizer).pdf");
    }

    @FXML
    private void abrirPistasHumedal(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP POMCAS\\RECORRIENDO EL TERRITORIO\\pistas-HUMEDAL(FILEminimizer).pdf");
    }

    @FXML
    private void abrirPistasParamo(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP POMCAS\\RECORRIENDO EL TERRITORIO\\pistas-Paramos(FILEminimizer).pdf");
    }

    @FXML
    private void abrirPistasRio(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP POMCAS\\RECORRIENDO EL TERRITORIO\\pistas-Rio(FILEminimizer).pdf");
    }

    @FXML
    private void abrirTablero(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP POMCAS\\RECORRIENDO EL TERRITORIO\\TABLERORECORRIENDO EL TERRITORIO CAR(FILEminimizer).pdf");
    }

  
    
}
