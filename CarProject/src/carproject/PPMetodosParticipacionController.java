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
public class PPMetodosParticipacionController implements Initializable {
   
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void openFXML() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PPMetodosParticipacion.fxml"));
        Parent root = (BorderPane) loader.load(getClass().getResource("PPMetodosParticipacion.fxml").openStream());
        Stage stage = new Stage(StageStyle.DECORATED);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    private void abrirPendon(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP MÉTODOS DE PARTICIPACIÓN\\PENDÓN DE LA PARTICIPACIÓN\\Pendón.pdf");
    }

    @FXML
    private void abrirRuleta(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP MÉTODOS DE PARTICIPACIÓN\\RULETA DE LA PARTICIPACIÓN\\ruleta (1).pdf");
    }

    @FXML
    private void abrirTarjetasInformativas(ActionEvent event) {
        Procedimiento.cargarArchivo("");
    }
    
   
    
}
