/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;

import java.io.File;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author david
 */
public class CarProject extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        HomeController controller= new HomeController();
        String path=new File("").getAbsolutePath();
        String ruta="\\src\\imagenes\\cabezote.jpg";
        
        controller.setStage(stage);
        controller.openFXML();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    
    
    
   

}
