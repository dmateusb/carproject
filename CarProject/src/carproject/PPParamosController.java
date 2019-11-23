/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;

import java.net.URI;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.ImageCursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.jpedal.exception.PdfException;

/**
 * FXML Controller class
 *
 * @author david
 */
public class PPParamosController implements Initializable {
   
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void openFXML() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PPParamos.fxml"));
        Parent root = (BorderPane) loader.load(getClass().getResource("PPParamos.fxml").openStream());
        Stage stage = new Stage(StageStyle.DECORATED);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        Procedimiento.cambiarPuntero(stage);
        stage.centerOnScreen();
        stage.show();
    }
    
    private void min(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }
    private void closed(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    
    @FXML
    private void abrirJuego(MouseEvent event) throws URISyntaxException, IOException {
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(new URI("http://sigci.car.gov.co/DocCurados/DetalleDocCurados.aspx?idDoc=51&volver=1"));
    }

    @FXML
    private void abrirMultimedia(MouseEvent event) throws URISyntaxException, IOException {
         Desktop desktop = Desktop.getDesktop();
        desktop.browse(new URI("http://sigci.car.gov.co/DocCurados/DetalleDocCurados.aspx?idDoc=52&volver=1"));
    }

    @FXML
    private void pruebaPdf(MouseEvent event) throws URISyntaxException, IOException {
        
        Desktop desktop = Desktop.getDesktop();
        
//        try {
//            desktop.getDesktop().open(new java.io.File("./src/pdf/guiawet.pdf"));
//        } catch (IOException ex) {
//            Logger.getLogger(HumedalesController.class.getName()).log(Level.SEVERE, null, ex);
//        } 
        String ruta= "./src/pdf/guiawet.pdf";
        desktop.getDesktop().open(new File(getClass().getResource(ruta).getPath()));

    }

  
    
}
