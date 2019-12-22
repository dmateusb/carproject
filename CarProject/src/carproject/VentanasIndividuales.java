/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author david
 */
public class VentanasIndividuales {
    public void openFXML(String ruta) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(ruta+".fxml"));
        Parent root = (BorderPane) loader.load(getClass().getResource(ruta+".fxml").openStream());
        Stage stage = new Stage(StageStyle.DECORATED);
        Scene scene = new Scene(root);
        stage.setResizable(false);
        stage.sizeToScene();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }
}
