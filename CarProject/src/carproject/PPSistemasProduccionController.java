/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author david
 */
public class PPSistemasProduccionController extends VentanasIndividuales implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void abrirAfiche(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP SISTEMAS DE PRODUCCIÓN\\AFICHE TODO TIENE SU MOMENTO\\Afiche Lo mejor para su familia.pdf");
    }

    @FXML
    private void abrirCartilla(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP SISTEMAS DE PRODUCCIÓN\\CARTILLA LA HUERTA DE PANCOGER\\Cartilla Pancoger.pdf");
    }

    @FXML
    private void abrirTableroPlanificador(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP SISTEMAS DE PRODUCCIÓN\\PLANIFICADOR DE CAMPO\\Planificador\\1tablero_planificador.pdf");
    }

    @FXML
    private void abrirFichasInformativas(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP SISTEMAS DE PRODUCCIÓN\\PLANIFICADOR DE CAMPO\\Planificador\\2fichas_informativas.pdf");
    }

    @FXML
    private void abririFichasCultivos(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP SISTEMAS DE PRODUCCIÓN\\PLANIFICADOR DE CAMPO\\Planificador\\3fichas_cultivos.pdf");
    }

    @FXML
    private void abrirFichasCompartirVerdes(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP SISTEMAS DE PRODUCCIÓN\\PLANIFICADOR DE CAMPO\\Planificador\\4fichas_compartir_verde.pdf");
    }

    @FXML
    private void abrirRetiroVerde(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP SISTEMAS DE PRODUCCIÓN\\PLANIFICADOR DE CAMPO\\Planificador\\5retiro_fichas_compartir_verde.pdf");
    }

    @FXML
    private void abrirFichaCompartirAzul(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP SISTEMAS DE PRODUCCIÓN\\PLANIFICADOR DE CAMPO\\Planificador\\6fichas_compartir_azul.pdf");
    }

    @FXML
    private void abrirRetiroAzul(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP SISTEMAS DE PRODUCCIÓN\\PLANIFICADOR DE CAMPO\\Planificador\\7retiro_fichas_compartir_azul.pdf");
    }

    @FXML
    private void abrirFichasGris(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP SISTEMAS DE PRODUCCIÓN\\PLANIFICADOR DE CAMPO\\Planificador\\8ficha_compartir_gris.pdf");
    }

    @FXML
    private void abrirRetiroGris(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP SISTEMAS DE PRODUCCIÓN\\PLANIFICADOR DE CAMPO\\Planificador\\9retiro_ficha_compartir_gris.pdf");
    }

    @FXML
    private void abrirRetiroCartas(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP SISTEMAS DE PRODUCCIÓN\\PLANIFICADOR DE CAMPO\\Planificador\\retiro_Cartas_planificador.pdf");
    }

    
}
