/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author david
 */
public class VentanasIndividuales {
    @FXML
    private Button btndescripcion;
    @FXML
    private ScrollPane scroll;
    @FXML
    private Button btnespecifificacion;

    @FXML
    private Pane panelespecificacion;
    @FXML
    private Pane paneldescripcion;
    public void openFXML(String ruta) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(ruta+".fxml"));
        Parent root = (BorderPane) loader.load(getClass().getResource(ruta+".fxml").openStream());
        Stage stage = new Stage(StageStyle.DECORATED);
        
        Scene scene = new Scene(root);
        stage.setResizable(false);
        stage.sizeToScene();
        stage.setScene(scene);
        stage.getIcons().add(new Image(VentanasIndividuales.class.getResourceAsStream("/imagenes/Iconos/FAVICON.png")));

        stage.centerOnScreen();
        stage.show();
    }
    
    //Método para agregar el nombre de la ventana
    //Se agrega la variable nombreVentana
    public void openFXML(String ruta, String nombreVentana) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(ruta+".fxml"));
        Parent root = (BorderPane) loader.load(getClass().getResource(ruta+".fxml").openStream());
        Stage stage = new Stage(StageStyle.DECORATED);
        
        Scene scene = new Scene(root);
        stage.setTitle(nombreVentana);
        stage.setResizable(false);
        stage.sizeToScene();
        stage.setScene(scene);
        stage.getIcons().add(new Image(VentanasIndividuales.class.getResourceAsStream("/imagenes/Iconos/FAVICON.png")));

        stage.centerOnScreen();
        stage.show();
    }
    
    
    @FXML
    void mouseHandled(MouseEvent event) {
        if(event.getSource()==btndescripcion){
            panelespecificacion.toFront();
        }else if(event.getSource()==btnespecifificacion){
            paneldescripcion.toFront();
        }
    }

    @FXML
    void cerrardescripcion(MouseEvent event) {
        paneldescripcion.toBack();
    }

    @FXML
    void cerrarespecificacion(MouseEvent event) {
        panelespecificacion.toBack();
    }
}
