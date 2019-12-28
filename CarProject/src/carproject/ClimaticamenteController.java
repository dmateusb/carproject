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

/**
 * FXML Controller class
 *
 * @author david
 */
public class ClimaticamenteController extends VentanasIndividuales implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    void abrirFichas(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CLIMATICAMENTE\\4. Fichas.v3.pdf");
    }

    @FXML
    void abrirGuiadeMani(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CLIMATICAMENTE\\2. Guia de Manifestaciones.pdf");
    }

    @FXML
    void abrirManualdeUso(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CLIMATICAMENTE\\9. Manual de Uso - Climá\u0081ticaMente.v3.pdf");
    }

    @FXML
    void abrirRuleta(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CLIMATICAMENTE\\3. Ruleta.v4.pdf");
    }

    @FXML
    void abrirTablero(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CLIMATICAMENTE\\1. Tablero.v28.pdf");
    }

    @FXML
    void abrirTableroConNumeros(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CLIMATICAMENTE\\10. Tablero con numeros ubicando los ejemplos.pdf");
    }

    @FXML
    void abrirTablonesAdaptacion(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CLIMATICAMENTE\\5. Tablones Adaptación.pdf");
    }

    @FXML
    void abrirTablonesCausas(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CLIMATICAMENTE\\6. Tablones Causas.pdf");
    }

    @FXML
    void abrirTablonesPrevencion(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CLIMATICAMENTE\\7. Tablones Prevención.pdf");
    }


    @FXML
    void abrirTarjetasPersonajes(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CLIMATICAMENTE\\8. Tarjetas personajes.pdf");

    }

  
    
}
