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
public class CuencaHidrogaficaController extends VentanasIndividuales implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }


    @FXML
    void abrirFichas(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CUENCA HIDROGRÁFICA- VERTIENTES DE VIDA\\BOGOTÁ\\Fichas Bogotá.pdf");
    }



    @FXML
    void abrirPendon(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CUENCA HIDROGRÁFICA- VERTIENTES DE VIDA\\BOGOTÁ\\Pendón Bogotá.pdf");

    }

    @FXML
    void abrirReglasde(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CUENCA HIDROGRÁFICA- VERTIENTES DE VIDA\\BOGOTÁ\\Reglas del juego Bogotá.pdf");

    }

    @FXML
    void abrirRompecabezas(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CUENCA HIDROGRÁFICA- VERTIENTES DE VIDA\\BOGOTÁ\\Rompecabezas Bogotá.pdf");

    }


    @FXML
    void abrirTarjetasIlustrativas(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CUENCA HIDROGRÁFICA- VERTIENTES DE VIDA\\BOGOTÁ\\Tarjetas Ilustrativas Bogotá final.pdf");

    }

    @FXML
    void abrirTarjetasProblema(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CUENCA HIDROGRÁFICA- VERTIENTES DE VIDA\\BOGOTÁ\\Tarjetas Problema Solución Bogotá.pdf");

    }

    @FXML
    void abrirFichasNegro(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CUENCA HIDROGRÁFICA- VERTIENTES DE VIDA\\RÍO NEGRO\\Fichas Río Negro.pdf");
    }
    @FXML
    void abrirPendonNegro(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CUENCA HIDROGRÁFICA- VERTIENTES DE VIDA\\RÍO NEGRO\\Pendón Río Negro.pdf");

    }
    @FXML
    void abrirReglasdeNegro(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CUENCA HIDROGRÁFICA- VERTIENTES DE VIDA\\RÍO NEGRO\\Reglas del juego Río Negro.pdf");

    }
    @FXML
    void abrirRompecabezasNegro(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CUENCA HIDROGRÁFICA- VERTIENTES DE VIDA\\RÍO NEGRO\\Rompecabezas Río Negro.pdf");

    }
    @FXML
    void abrirTarjetasIlustrativasNegro(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CUENCA HIDROGRÁFICA- VERTIENTES DE VIDA\\RÍO NEGRO\\Tarjetas Ilustrativas Río Negro.pdf");

    }

    @FXML
    void abrirTarjetasProblemaNegro(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CUENCA HIDROGRÁFICA- VERTIENTES DE VIDA\\RÍO NEGRO\\Tarjetas Problema Solución Río Negro.pdf");

    }
    @FXML
    void abrirFichasSeco(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CUENCA HIDROGRÁFICA- VERTIENTES DE VIDA\\RÍO SECO\\Fichas Río Seco.pdf");
    }
    @FXML
    void abrirPendonNegroSeco(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CUENCA HIDROGRÁFICA- VERTIENTES DE VIDA\\RÍO SECO\\Pendón Río Seco.pdf");

    }
    @FXML
    void abrirReglasdeSeco(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CUENCA HIDROGRÁFICA- VERTIENTES DE VIDA\\RÍO SECO\\Reglas del juego Río Seco.pdf");

    }
    @FXML
    void abrirRompecabezasSeco(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CUENCA HIDROGRÁFICA- VERTIENTES DE VIDA\\RÍO SECO\\Rompecabezas Río Seco.pdf");

    }

    @FXML
    void abrirTarjetasIlustrativasSeco(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CUENCA HIDROGRÁFICA- VERTIENTES DE VIDA\\RÍO SECO\\tarjetas ilustrativas RIO SECO.pdf");

    }
    @FXML
    void abrirTarjetasProblemaSeco(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CUENCA HIDROGRÁFICA- VERTIENTES DE VIDA\\RÍO SECO\\Tarjetas Problema Solución Río Seco.pdf");

    }
}
