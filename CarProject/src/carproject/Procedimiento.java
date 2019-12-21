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
        //Para computador jorge--->ubicacion=2
        int ubicacion=1;
        Desktop desktop = Desktop.getDesktop();

        try {
            
            /*Ruta ejemplo
            basePath = basePath + "\\src\\pdf\\guiawet.pdf";
             */
            String basePath="";
            if (ubicacion == 0) {
                basePath = new File("").getAbsolutePath();
            if (basePath.substring(basePath.length() - 5).equals("\\dist")) {
                String aux = basePath.substring(0, basePath.length() - 5);
                basePath = aux;
            }
                basePath = basePath + "\\src\\archivos"+ruta;
            }else if (ubicacion==1){
                basePath="\\D:\\Documentos\\Proyectos\\CAR\\USB\\USB CAR\\FINALES PARA IMPRENTA\\ARTES"+ruta;
            }else{
//                aca poner la ubicacion absoluta de la carpeta ARTES de su computador
//                basePath="\\D:\\Documentos\\Proyectos\\CAR\\USB\\USB CAR\\FINALES PARA IMPRENTA\\ARTES"+ruta;
            }
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

    
}
