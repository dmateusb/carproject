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
import javafx.scene.ImageCursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.swing.*;

/**
 * FXML Controller class
 *
 * @author david
 */
public class LasCartasController extends VentanasIndividuales implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    void abrirAzules(ActionEvent event) {
        Procedimiento.cargarArchivo("\\LAS CARTAS DE DON NARANJO\\Naranjo Azules.v3.pdf");
    }

    @FXML
    void abrirVerdes(ActionEvent event) {
        Procedimiento.cargarArchivo("\\LAS CARTAS DE DON NARANJO\\Naranjo Verdes.v5.pdf");

    }




}
