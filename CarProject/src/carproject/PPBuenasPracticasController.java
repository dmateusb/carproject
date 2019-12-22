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
public class PPBuenasPracticasController implements Initializable {
   
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void openFXML() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PPBuenasPracticas.fxml"));
        Parent root = (BorderPane) loader.load(getClass().getResource("PPBuenasPracticas.fxml").openStream());
        Stage stage = new Stage(StageStyle.DECORATED);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }
    
    private void abrirCaja(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\BINGO\\BINGO CAJA.pdf");
    }

    private void abrirCarton(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\BINGO\\BINGO CARTON.pdf");
    }

    private void abrirInstructivo(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\BINGO\\BINGO INSTRUCTIVO.pdf");
    }

    private void abrirTablero(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\BINGO\\BINGO TABLERO CONTROL.pdf");
    }

    private void abrirTableroPuntosRana(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\Gestionemos conocimiento\\TABLERO PUNTOS RANA.pdf");
    }

    private void abrirTableroInstructivo(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\Gestionemos conocimiento\\TABLERO INSTRUCTIVO.pdf");
    }

    private void abrirTapaRana(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\Gestionemos conocimiento\\TAPARANA.pdf");
    }

    private void abrirTarjetasBombillos(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\Gestionemos conocimiento\\TARJETASBOMBILLO.pdf");
    }

    private void abrirTarjetasCamara(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\Gestionemos conocimiento\\TARJETASCAMARA.pdf");
    }
    

    private void abrirTarjetasCerebro(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\Gestionemos conocimiento\\TARJETASCEREBRO.pdf");
    }

    private void abrirTarjetasEngranaje(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\Gestionemos conocimiento\\TARJETASENGRANAJE.pdf");
    }

    private void abrirTarjetasFicha(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\Gestionemos conocimiento\\TARJETASFICHA.pdf");
    }

    private void abrirTarjetasGrupo(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\Gestionemos conocimiento\\TARJETASGRUPO.pdf");
    }

    private void abrirTarjetasLibro(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\Gestionemos conocimiento\\TARJETASLIBRO.pdf");
    }

    private void abrirTarjetasPersonas(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\Gestionemos conocimiento\\TARJETASPERSONAS.pdf");
    }

    private void abrirTarjetasRana(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\Gestionemos conocimiento\\TARJETASRANA.pdf");
    }

    private void abrirRotulos(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\Señalización\\Rotulos.pdf");
    }

    private void abrirStickersCaja(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BUENAS PRÁCTICAS\\Señalización\\Stickers caja.pdf");
    }


}
