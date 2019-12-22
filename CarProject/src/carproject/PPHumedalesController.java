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
public class PPHumedalesController implements Initializable {
   
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void openFXML() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PPHumedales.fxml"));
        Parent root = (BorderPane) loader.load(getClass().getResource("PPHumedales.fxml").openStream());
        Stage stage = new Stage(StageStyle.DECORATED);
        Scene scene = new Scene(root);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    private void abrirCartilla(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP HUMEDALES\\CARTILLA\\PP1HUMEDALES HP1 Cartilla infantil.pdf");
    }

    @FXML
    private void abrirJuego(ActionEvent event) {
        Procedimiento.cargarArchivo("");
    }

    @FXML
    private void abrirMultimedia(ActionEvent event) {
        Procedimiento.cargarArchivo("");
    }

    
    
    
}
