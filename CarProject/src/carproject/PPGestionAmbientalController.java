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
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.ImageCursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.jpedal.exception.PdfException;

/**
 * FXML Controller class
 *
 * @author david
 */
public class PPGestionAmbientalController implements Initializable {
   
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void openFXML() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PPGestionAmbiental.fxml"));
        Parent root = (BorderPane) loader.load(getClass().getResource("PPGestionAmbiental.fxml").openStream());
        Stage stage = new Stage(StageStyle.DECORATED);
        Scene scene = new Scene(root);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }
    

    @FXML
    private void abrirAguaMarina(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP GESTIÓN AMBIENTAL PARTICIPATIVA\\CONTANDO HISTORIAS\\aguamarina.pdf");
    }

    @FXML
    private void abrirAmarillo(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP GESTIÓN AMBIENTAL PARTICIPATIVA\\CONTANDO HISTORIAS\\Amarillo.pdf");
   
    }

    @FXML
    private void abrirBaraja(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP GESTIÓN AMBIENTAL PARTICIPATIVA\\CONTANDO HISTORIAS\\baraja.pdf");
   
    }

    @FXML
    private void abrirCajaBaraja(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP GESTIÓN AMBIENTAL PARTICIPATIVA\\CONTANDO HISTORIAS\\Caja_Baraja.pdf");
   
    }

    @FXML
    private void abrirFucsia(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP GESTIÓN AMBIENTAL PARTICIPATIVA\\CONTANDO HISTORIAS\\Fucsia.pdf");
   
    }

    @FXML
    private void abrirGris(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP GESTIÓN AMBIENTAL PARTICIPATIVA\\CONTANDO HISTORIAS\\gris.pdf");
   
    }

    @FXML
    private void abrirInstructivo(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP GESTIÓN AMBIENTAL PARTICIPATIVA\\CONTANDO HISTORIAS\\instructivo_baraja.pdf");
   
    }

    @FXML
    private void abrirNaranja(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP GESTIÓN AMBIENTAL PARTICIPATIVA\\CONTANDO HISTORIAS\\Naranja.pdf");
   
    }

    @FXML
    private void abrirRetiro(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP GESTIÓN AMBIENTAL PARTICIPATIVA\\CONTANDO HISTORIAS\\Retiro.pdf");
   
    }

    @FXML
    private void abrirRojo(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP GESTIÓN AMBIENTAL PARTICIPATIVA\\CONTANDO HISTORIAS\\rojo.pdf");
   
    }

    @FXML
    private void abrirVerdeClaro(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP GESTIÓN AMBIENTAL PARTICIPATIVA\\CONTANDO HISTORIAS\\Verde_claro.pdf");
   
    }

    @FXML
    private void abrirVerdeOscuro(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP GESTIÓN AMBIENTAL PARTICIPATIVA\\CONTANDO HISTORIAS\\Verde_oscuro.pdf");
   
    }

    @FXML
    private void abrirAzulOscuro(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP GESTIÓN AMBIENTAL PARTICIPATIVA\\CONTANDO HISTORIAS\\Azul Oscuro.pdf");
   
    }

    @FXML
    private void abrirAzul(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP GESTIÓN AMBIENTAL PARTICIPATIVA\\CONTANDO HISTORIAS\\Azul.pdf");

    }

    @FXML
    private void abrirCajaMochila(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP GESTIÓN AMBIENTAL PARTICIPATIVA\\MOCHILA COMUNITARIA\\Caja_Mochila.pdf");
    }

    @FXML
    private void abrirCartasMochila(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP GESTIÓN AMBIENTAL PARTICIPATIVA\\MOCHILA COMUNITARIA\\Cartas_Mochila.pdf");
    }

    @FXML
    private void abrirInstructivoMochila(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP GESTIÓN AMBIENTAL PARTICIPATIVA\\MOCHILA COMUNITARIA\\instructivo_mochila.pdf");
    }


}
