/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author david
 */
public class PPParamosController extends VentanasIndividuales implements Initializable {
   
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }



    @FXML
    private void abrirCartillaAprendeCon(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP PÁRAMOS\\CARTILLA APRENDE CON NOSOTROS SOBRE PÁRAMOS\\CAR páramos 11-04-17 A (1).pdf");
    }
    
    @FXML
    private void abrirCartilla(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP PÁRAMOS\\CARTILLA APRENDE CON NOSOTROS SOBRE PÁRAMOS\\Cartilla.pdf");
        
    }

    @FXML
    private void abrirExtinciones(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP PÁRAMOS\\CONSTRUYENDO ECOSISTEMAS\\extinciones(FILEminimizer) (1).pdf");
    }

    @FXML
    private void abrirTapaCajaTorres(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP PÁRAMOS\\CONSTRUYENDO ECOSISTEMAS\\TAPA CAJA TORRES(FILEminimizer) (1).pdf");
    }

    @FXML
    private void abrirTarjetasBosqueAndino(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP PÁRAMOS\\CONSTRUYENDO ECOSISTEMAS\\TARJETAS BOSQUE_ANDINO(FILEminimizer) (2).pdf");
    }

    @FXML
    private void abrirTarjetasBosqueHumedo(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP PÁRAMOS\\CONSTRUYENDO ECOSISTEMAS\\TARJETAS BOSQUE_HUMEDO(FILEminimizer) (1).pdf");
    }

    @FXML
    private void abrirTarjetasBosqueSeco(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP PÁRAMOS\\CONSTRUYENDO ECOSISTEMAS\\TARJETAS BOSQUE_SECO(FILEminimizer) (1).pdf");
    }

    @FXML
    private void abrirTarjetasParamo(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP PÁRAMOS\\CONSTRUYENDO ECOSISTEMAS\\TARJETAS PÁRAMO(FILEminimizer) (1).pdf");
    }

    @FXML
    private void abrirCajaInstructivoLoteria(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP PÁRAMOS\\LOTERÍA DE PÁRAMOS\\caja-instructivo loteria.pdf");
    }

    @FXML
    private void abrirCaracteristicasFisica(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP PÁRAMOS\\LOTERÍA DE PÁRAMOS\\caracteristicas_fichas.pdf");
    }

    @FXML
    private void abrirFichasLaHistoria(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP PÁRAMOS\\LOTERÍA DE PÁRAMOS\\la_historia_fichas.pdf");
    }

    @FXML
    private void abrirTableroLaImportancia(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP PÁRAMOS\\LOTERÍA DE PÁRAMOS\\la importancia_tablero.pdf");
    }

    @FXML
    private void abrirFIchasLaImportancia(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP PÁRAMOS\\LOTERÍA DE PÁRAMOS\\la_importancia_fichas.pdf");
    }

    @FXML
    private void abrirCaracteristicasTablero(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP PÁRAMOS\\LOTERÍA DE PÁRAMOS\\caracteristicas_tablero.pdf");
    }

    @FXML
    private void abrirTableroElHombre(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP PÁRAMOS\\LOTERÍA DE PÁRAMOS\\el hombre_tablero.pdf");
    }

    @FXML
    private void abrirFichasHombre(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP PÁRAMOS\\LOTERÍA DE PÁRAMOS\\el_hombre_fichas.pdf");
    }

    @FXML
    private void abrirTableroFLorayFauna(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP PÁRAMOS\\LOTERÍA DE PÁRAMOS\\flora y fauna_tablero.pdf");
    }

    @FXML
    private void abrirFIchasFlorayFauna(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP PÁRAMOS\\LOTERÍA DE PÁRAMOS\\flora_y_fauna_fichas.pdf");
    }

    @FXML
    private void abrirTableroLaHistoria(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP PÁRAMOS\\LOTERÍA DE PÁRAMOS\\la historia_tablero.pdf");
    }

    
    
    
    
}
