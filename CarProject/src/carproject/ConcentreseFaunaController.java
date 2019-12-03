/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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
public class ConcentreseFaunaController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  

         

    public void openFXML() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ConcentreseFauna.fxml"));
        Parent root = (BorderPane) loader.load(getClass().getResource("ConcentreseFauna.fxml").openStream());
        Stage stage = new Stage(StageStyle.DECORATED);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        //Procedimiento.cambiarPuntero(stage);
        stage.centerOnScreen();
        stage.show();
    }

  
    
}
