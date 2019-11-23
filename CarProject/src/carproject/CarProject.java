/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;

import com.sun.javafx.cursor.CursorFrame;
import com.sun.javafx.scene.paint.GradientUtils.Point;
import java.awt.MouseInfo;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.ImageCursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author david
 */
public class CarProject extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        HomeController controller= new HomeController();
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
