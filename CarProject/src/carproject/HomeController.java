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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.ImageCursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TabPane;
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

    private static Stage stage;
    @FXML
    private ScrollPane scrollfondo;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        scrollfondo.setPrefViewportHeight(0);
    }

    private void min(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }

    private void closed() {
        System.exit(0);
    }

    private void abrirPdf() throws IOException, PdfException {
        Desktop.getDesktop().open(new java.io.File("./res/pdf/1.pdf"));
    }

    @FXML
    private void abrirPPHumedales() throws IOException {
        PPHumedalesController controller = new PPHumedalesController();
        controller.openFXML();
    }

    public void openFXML() throws IOException {
        this.stage.initStyle(StageStyle.DECORATED);
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene scene = new Scene(root);
        this.stage.setScene(scene);
        Procedimiento.cambiarPuntero(HomeController.stage);
        Screen screen = Screen.getPrimary();
        javafx.geometry.Rectangle2D bounds = screen.getVisualBounds();
        this.stage.setX(bounds.getMinX());
        this.stage.setY(bounds.getMinY());
        this.stage.setWidth(bounds.getWidth());
        this.stage.setHeight(bounds.getHeight());
        this.stage.show();
    }

   
    
   /* public void cambiarPuntero(Stage stage) {
        Image image = new Image("file:./res/img/puntero.png");
        stage.getScene().setCursor(new ImageCursor(image, image.getWidth() / 2,
                image.getHeight() / 2));
    }
*/
    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    private void abrirPPFauna() throws IOException {
        PPFaunaController controller = new PPFaunaController();
        controller.openFXML();
    }

    @FXML
    private void abrirPPSistemas() throws IOException {
        PPSistemasProduccionController controller = new PPSistemasProduccionController();
        controller.openFXML();
    }
    @FXML
    private void abrirClimaticamente() throws IOException {
        ClimaticamenteController controller = new ClimaticamenteController();
        controller.openFXML();
    }
    @FXML
    private void abrirPPAprovechame() throws IOException {
        PPAprovechameController controller = new PPAprovechameController();
        controller.openFXML();
    }
    @FXML
    private void abrirPPBpa() throws IOException {
        PPBpaController controller = new PPBpaController();
        controller.openFXML();
    }
    @FXML
    private void abrirPPBuenasPracticas() throws IOException {
        PPBuenasPracticasController controller = new PPBuenasPracticasController();
        controller.openFXML();
    }

    @FXML
    private void abrirPPGestionAmbiental() throws IOException {
        PPGestionAmbientalController controller = new PPGestionAmbientalController();
        controller.openFXML();
    }
    @FXML
    private void abrirPPMetodosParticipacion() throws IOException {
        PPMetodosParticipacionController controller = new PPMetodosParticipacionController();
        controller.openFXML();
    }

    @FXML
    private void abrirPPMineria() throws IOException {
        PPMineriaResponsableController controller = new PPMineriaResponsableController();
        controller.openFXML();
    }

    @FXML
    private void abrirPPParamos() throws IOException {
        PPParamosController controller = new PPParamosController();
        controller.openFXML();
    }

    @FXML
    private void abrirPPPomcas() throws IOException {
        PPPomcasController controller = new PPPomcasController();
        controller.openFXML();
    }

    @FXML
    private void abrirPPPromocionLegalidad() throws IOException {
        PPPromocionLegalidadController controller = new PPPromocionLegalidadController();
        controller.openFXML();
    }

    @FXML
    private void abrirPPSistemasProduccionProcas() throws IOException {
        PPSistemasProcasController controller = new PPSistemasProcasController();
        controller.openFXML();
    }

    @FXML
    private void abrirAguaEducacion() throws IOException {
        System.out.println("entra");
        AguaEducacionController controller=new AguaEducacionController();
        controller.openFXML();
    }

    @FXML
    private void abrirCadaResiduo() throws IOException {
        CadaResiduoController controller=new CadaResiduoController();
        controller.openFXML();
    }

   

}
