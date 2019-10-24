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
        stage.initStyle(StageStyle.TRANSPARENT);
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        Screen screen = Screen.getPrimary();
        javafx.geometry.Rectangle2D bounds = screen.getVisualBounds();
        cambiarPuntero(stage);
        stage.setX(bounds.getMinX());
        stage.setY(bounds.getMinY());
        stage.setWidth(bounds.getWidth());
        stage.setHeight(bounds.getHeight());
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public void cambiarPuntero(Stage stage) {
        Image image = new Image("file:./res/img/puntero.png");
        stage.getScene().setCursor(new ImageCursor(image, image.getWidth() / 2,
                image.getHeight() / 2));
    }

}
