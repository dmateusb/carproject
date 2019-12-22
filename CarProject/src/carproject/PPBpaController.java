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
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
public class PPBpaController implements Initializable {

    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void openFXML() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PPBpa.fxml"));
        Parent root = (BorderPane) loader.load(getClass().getResource("PPBpa.fxml").openStream());
        Stage stage = new Stage(StageStyle.DECORATED);
        Scene scene = new Scene(root);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    private void abrirCuaderno(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BPA SUBSECTOR CAFETERO\\AGENDA\\PP2BPA HP1 Cuaderno.pdf");
    }

    @FXML
    private void abrirPortada(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BPA SUBSECTOR CAFETERO\\AGENDA\\PP2BPA HP1 Cuaderno portada.pdf");
    }

    @FXML
    private void abrirPlegable(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BPA SUBSECTOR CAFETERO\\PLEGABLE\\PP2BPA HP3 Plegable sombrio.pdf");
    }

    @FXML
    private void abrirMultimedia(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP BPA SUBSECTOR CAFETERO\\MULTIMEDIA\\PP2 BPA HP2 Multimedia sombrio.pdf");
    }

    
    
}
