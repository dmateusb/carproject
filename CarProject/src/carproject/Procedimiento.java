/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.scene.ImageCursor;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author david
 */
public class Procedimiento {

    public static void cargarArchivo(String ruta) {

        Desktop desktop = Desktop.getDesktop();

        try {
            String basePath = new File("").getAbsolutePath();
            if (basePath.substring(basePath.length() - 5).equals("\\dist")) {
                String aux = basePath.substring(0, basePath.length() - 5);
                basePath = aux;
            }
            /*Ruta ejemplo
            basePath = basePath + "\\src\\pdf\\guiawet.pdf";
             */
            basePath = basePath + ruta;
            desktop.getDesktop().open(new java.io.File(basePath));

        } catch (IOException ex) {
            Logger.getLogger(PPHumedalesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Image retornarImagen(String ruta) {

        Desktop desktop = Desktop.getDesktop();

        String basePath = new File("").getAbsolutePath();
        if (basePath.substring(basePath.length() - 5).equals("\\dist")) {
            String aux = basePath.substring(0, basePath.length() - 5);
            basePath = aux;
        }
        basePath = basePath + ruta;
        return new Image("file:" + basePath);
    }

    public static void cambiarPuntero(Stage stage) {
        Image image = Procedimiento.retornarImagen("\\src\\imagenes\\puntero.png");
        stage.getScene().setCursor(new ImageCursor(image, image.getWidth() / 2,
                image.getHeight() / 2));
    }
    
}