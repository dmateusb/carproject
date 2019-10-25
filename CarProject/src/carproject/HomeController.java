/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.ImageCursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.jpedal.exception.PdfException;

/**
 *
 * @author david
 */
public class HomeController implements Initializable {

    private Stage stage;
    @FXML
    private Button btnagua;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    @FXML
    private void min(MouseEvent event) {
        System.out.println("minnn");
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }

    @FXML
    private void closed(MouseEvent event) {
        System.exit(0);
    }

    private void abrirPdf(MouseEvent event) throws IOException, PdfException {
        Desktop.getDesktop().open(new java.io.File("./res/pdf/1.pdf"));
    }
    @FXML
    private void abrirAgua(MouseEvent event) throws IOException {
        AguaEducacionController controller= new AguaEducacionController();
        controller.setStage(this.stage);
        controller.openFXML();
    }
    @FXML
    public void openFXML() throws IOException {
        this.stage.initStyle(StageStyle.TRANSPARENT);
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene scene = new Scene(root);
        this.stage.setScene(scene);
        cambiarPuntero(this.stage);
        Screen screen = Screen.getPrimary();
        javafx.geometry.Rectangle2D bounds = screen.getVisualBounds();
        this.stage.setX(bounds.getMinX());
        this.stage.setY(bounds.getMinY());
        this.stage.setWidth(bounds.getWidth());
        this.stage.setHeight(bounds.getHeight());
        this.stage.show();
    }
    
    public void cambiarPuntero(Stage stage) {
        Image image = new Image("file:./res/img/puntero.png");
        stage.getScene().setCursor(new ImageCursor(image, image.getWidth() / 2,
                image.getHeight() / 2));
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }




    
}
