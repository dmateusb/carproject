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
public class CalendulitaController extends VentanasIndividuales implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }


    @FXML
    void abrirCartilla(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CALENDULITA Y SUS AMIGOS\\calendulitaVfinal_16jul12.pdf");
    }

    @FXML
    void abrirPortada(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CALENDULITA Y SUS AMIGOS\\Portada y legal sangrado y cortes.pdf");

    }

  
    
}
