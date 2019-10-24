/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;
import com.sun.deploy.config.Config;
import org.jpedal.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.HPos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import org.jpedal.exception.PdfException;

/**
 *
 * @author david
 */
public class HomeController implements Initializable {

    @FXML
    private HBox min;
    @FXML
    private FontAwesomeIcon close;
    @FXML
    private GridPane cuadricula;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    @FXML
    private void min(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }

    @FXML
    private void closed(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    private void abrirPdf(MouseEvent event) throws IOException, PdfException {
        Desktop.getDesktop().open(new java.io.File("./res/pdf/1.pdf"));
    }




    
}
