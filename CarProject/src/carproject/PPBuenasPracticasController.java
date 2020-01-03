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
public class PPBuenasPracticasController extends VentanasIndividuales implements Initializable {

   
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void abrirCaja(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\BINGO\\BINGO CAJA.pdf");
    }
    @FXML
    private void abrirCarton(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\BINGO\\BINGO CARTON.pdf");
    }
    @FXML

    private void abrirInstructivo(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\BINGO\\BINGO INSTRUCTIVO.pdf");
    }
    @FXML

    private void abrirTablero(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\BINGO\\BINGO TABLERO CONTROL.pdf");
    }
    @FXML

    private void abrirTableroPuntosRana(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\Gestionemos conocimiento\\TABLERO PUNTOS RANA.pdf");
    }
    @FXML

    private void abrirTableroInstructivo(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\Gestionemos conocimiento\\TABLERO INSTRUCTIVO.pdf");
    }
    @FXML

    private void abrirTapaRana(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\Gestionemos conocimiento\\TAPARANA.pdf");
    }
    @FXML

    private void abrirTarjetasBombillos(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\Gestionemos conocimiento\\TARJETASBOMBILLO.pdf");
    }
    @FXML

    private void abrirTarjetasCamara(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\Gestionemos conocimiento\\TARJETASCAMARA.pdf");
    }
        @FXML


    private void abrirTarjetasCerebro(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\Gestionemos conocimiento\\TARJETASCEREBRO.pdf");
    }
    @FXML

    private void abrirTarjetasEngranaje(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\Gestionemos conocimiento\\TARJETASENGRANAJE.pdf");
    }
    @FXML

    private void abrirTarjetasFicha(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\Gestionemos conocimiento\\TARJETASFICHA.pdf");
    }
    @FXML

    private void abrirTarjetasGrupo(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\Gestionemos conocimiento\\TARJETASGRUPO.pdf");
    }
    @FXML

    private void abrirTarjetasLibro(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\Gestionemos conocimiento\\TARJETASLIBRO.pdf");
    }
    @FXML

    private void abrirTarjetasPersonas(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\Gestionemos conocimiento\\TARJETASPERSONAS.pdf");
    }
    @FXML

    private void abrirTarjetasRana(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\Gestionemos conocimiento\\TARJETASRANA.pdf");
    }
    @FXML

    private void abrirRotulos(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\Señalización\\Rotulos.pdf");
    }
    @FXML

    private void abrirStickersCaja(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\Señalización\\Stickers caja.pdf");
    }


}
