/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;

/**
 *
 * @author david
 */
public class HomeController implements Initializable {

    private static Stage stage;
    @FXML
    private ScrollPane scrollfondo;
    @FXML
    private ImageView bannercentro;
    @FXML
    private ImageView minus;

    @FXML
    private ImageView close;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        scrollfondo.setVvalue(-0.3);
        stage.setTitle("CAR - Herramientas educativas ambientales y paquetes pedagógicos");
    }

    @FXML
    public void mouseHandled(MouseEvent event) {
        if(event.getSource()==close){
            Platform.exit();
        }else if (event.getSource()==minus){
            stage.setIconified(true);
        }
    }

    @FXML
    private void abrirPPHumedales() throws IOException {
        PPHumedalesController controller = new PPHumedalesController();
        controller.openFXML("PPHumedales");
    }

    public void openFXML() throws IOException {
        HomeController.stage.initStyle(StageStyle.UNDECORATED);
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene scene = new Scene(root);
        HomeController.stage.setResizable(false);
        HomeController.stage.setScene(scene);
        Screen screen = Screen.getPrimary();
        javafx.geometry.Rectangle2D bounds = screen.getVisualBounds();
        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            public void handle(WindowEvent we) {
                Platform.exit();
            }
        });
        HomeController.stage.setX(bounds.getMinX());
        HomeController.stage.setY(bounds.getMinY());
        HomeController.stage.setWidth(bounds.getWidth());
        HomeController.stage.setHeight(bounds.getHeight());
        HomeController.stage.getIcons().add(new Image(HomeController.class.getResourceAsStream("/imagenes/Iconos/FAVICON.png")));
        HomeController.stage.show();
    }

   

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    private void abrirPPFauna() throws IOException {
        PPFaunaController controller = new PPFaunaController();
        controller.openFXML("PPFauna","Paquetes pedagógicos");
    }

    @FXML
    private void abrirPPSistemas() throws IOException {
        PPSistemasProduccionController controller = new PPSistemasProduccionController();
        controller.openFXML("PPSistemasProduccion","Paquetes pedagógicos");
    }
    @FXML
    private void abrirClimaticamente() throws IOException {
        ClimaticamenteController controller = new ClimaticamenteController();
        controller.openFXML("Climaticamente");
    }
    @FXML
    private void abrirPPAprovechame() throws IOException {
        PPAprovechameController controller = new PPAprovechameController();
        controller.openFXML("PPAprovechame1","Paquetes pedagógicos");
    }
    @FXML
    private void abrirPPBpa() throws IOException {
        PPBpaController controller = new PPBpaController();
        controller.openFXML("PPBpa","Paquetes pedagógicos");
    }
    @FXML
    private void abrirPPBuenasPracticas() throws IOException {
        PPBuenasPracticasController controller = new PPBuenasPracticasController();
        controller.openFXML("PPBuenasPracticas","Paquetes pedagógicos");
        
    }

    @FXML
    private void abrirPPGestionAmbiental() throws IOException {
        PPGestionAmbientalController controller = new PPGestionAmbientalController();
        controller.openFXML("PPGestionAmbiental","Paquetes pedagógicos");
    }
    @FXML
    private void abrirPPMetodosParticipacion() throws IOException {
        PPMetodosParticipacionController controller = new PPMetodosParticipacionController();
        controller.openFXML("PPMetodosParticipacion","Paquetes pedagógicos");
    }

    @FXML
    private void abrirPPMineria() throws IOException {
        PPMineriaResponsableController controller = new PPMineriaResponsableController();
        controller.openFXML("PPMineriaResponsable","Paquetes pedagógicos");
    }

    @FXML
    private void abrirPPParamos() throws IOException {
        PPParamosController controller = new PPParamosController();
        controller.openFXML("PPParamos","Paquetes pedagógicos");
    }

    @FXML
    private void abrirPPPomcas() throws IOException {
        PPPomcasController controller = new PPPomcasController();
        controller.openFXML("PPPomcas","Paquetes pedagógicos");
    }

    @FXML
    private void abrirPPPromocionLegalidad() throws IOException {
        PPPromocionLegalidadController controller = new PPPromocionLegalidadController();
        controller.openFXML("PPPromocionLegalidad","Paquetes pedagógicos");
    }

    @FXML
    private void abrirPPSistemasProduccionProcas() throws IOException {
        PPSistemasProcasController controller = new PPSistemasProcasController();
        controller.openFXML("PPSistemasProcas","Paquetes pedagógicos");
    }

    @FXML
    private void abrirAguaEducacion() throws IOException {
        System.out.println("entra");
        AguaEducacionController controller=new AguaEducacionController();
        controller.openFXML("AguaEducacion","Herramientas educativas ambientales");
    }

    @FXML
    private void abrirCadaResiduo() throws IOException {
        CadaResiduoController controller=new CadaResiduoController();
        controller.openFXML("CadaResiduo","Herramientas educativas ambientales");
    }

    @FXML
    private void abrirCalendulita() throws IOException {
        CalendulitaController controller=new CalendulitaController();
        controller.openFXML("Calendulita","Herramientas educativas ambientales");
    }

    @FXML
    private void abrirCambioClimatico() throws IOException {
        CambioClimaticoController controller=new CambioClimaticoController();
        controller.openFXML("CambioClimatico","Herramientas educativas ambientales");
    }

    @FXML
    private void abrirCartillaDidactica() throws IOException {
        CartillaDidacticaController controller=new CartillaDidacticaController();
        controller.openFXML("CartillaDidactica","Herramientas educativas ambientales");
    }

    @FXML
    private void abrirCartillaSuper() throws IOException {
        CartillaSuperController controller=new CartillaSuperController();
        controller.openFXML("CartillaSuper","Herramientas educativas ambientales");
    }

    @FXML
    private void abrirConcentreseFauna() throws IOException {
        ConcentreseFaunaController controller=new ConcentreseFaunaController();
        controller.openFXML("ConcentreseFauna","Herramientas educativas ambientales");
    }

    @FXML
    private void abrirCuencaHidrogafica() throws IOException {
        CuencaHidrogaficaController controller=new CuencaHidrogaficaController();
        controller.openFXML("CuencaHidrogafica","Herramientas educativas ambientales");
    }

    @FXML
    private void abrirDigiPack() throws IOException {
        DigiPackController controller=new DigiPackController();
        controller.openFXML("DigiPack","Herramientas educativas ambientales");
    }

    @FXML
    private void abrirElPaisaje() throws IOException {
        ElPaisajeController controller=new ElPaisajeController();
        controller.openFXML("ElPaisaje","Herramientas educativas ambientales");
    }

    @FXML
    private void abrirEscaleraAmbiental() throws IOException {
        EscaleraAmbientalController controller=new EscaleraAmbientalController();
        controller.openFXML("EscaleraAmbiental","Herramientas educativas ambientales");
    }

    @FXML
    private void abrirLasCartas() throws IOException {
        LasCartasController controller=new LasCartasController();
        controller.openFXML("LasCartas","Herramientas educativas ambientales");
    }

    @FXML
    private void abrirLegalizate() throws IOException {
        LegalizateController controller=new LegalizateController();
        controller.openFXML("Legalizate","Herramientas educativas ambientales");
    }

    @FXML
    private void abrirMarthica() throws IOException {
        MarthicaController controller=new MarthicaController();
        controller.openFXML("Marthica","Herramientas educativas ambientales");
    }

    @FXML
    private void abrirPortafolio() throws IOException {
        PortafolioController controller=new PortafolioController();
        controller.openFXML("Portafolio","Herramientas educativas ambientales");
    }

   

}
