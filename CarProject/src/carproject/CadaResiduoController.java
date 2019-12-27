/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author david
 */
public class CadaResiduoController extends VentanasIndividuales implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    void abrirCanadePescar(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CADA RESIDUO EN SU LUGAR\\caña de pescar.pdf");
    }

    @FXML
    void abrirFIchasPendon(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CADA RESIDUO EN SU LUGAR\\1. Fichas Pendon.v1.pdf");

    }

    @FXML
    void abrirFichas(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CADA RESIDUO EN SU LUGAR\\10. Fichas.v7.pdf");
    }

    @FXML
    void abrirGuiaAgropecuarios(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CADA RESIDUO EN SU LUGAR\\6. Guia Agropecuarios.v5.pdf");
    }

    @FXML
    void abrirGuiaDomicialrios(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CADA RESIDUO EN SU LUGAR\\7. Guia Domiciliarios.pdf");
    }

    @FXML
    void abrirGuiaINdustriales(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CADA RESIDUO EN SU LUGAR\\9. Guia Industriales.v2.pdf");
    }

    @FXML
    void abrirGuisaHospitalarios(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CADA RESIDUO EN SU LUGAR\\8. Guia Hospitalarios.pdf");
    }

    @FXML
    void abrirJuegoConcentrese(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CADA RESIDUO EN SU LUGAR\\13. Juego - Concentrese.v2.pdf");
    }

    @FXML
    void abrirJuegoRompecabezas(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CADA RESIDUO EN SU LUGAR\\14. Juego - Rompecabezas.v3.pdf");
    }

    @FXML
    void abrirJuegoSeparacion(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CADA RESIDUO EN SU LUGAR\\15. Juego - Separación.v2.pdf");
    }

    @FXML
    void abrirManualCadaResiduo(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CADA RESIDUO EN SU LUGAR\\Manual - Cada residuo en su lugar.v7.pdf");
    }

    @FXML
    void abrirPendon(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CADA RESIDUO EN SU LUGAR\\1. Pendón.v2.pdf");
    }

    @FXML
    void abrirPirinola(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CADA RESIDUO EN SU LUGAR\\11. Pirinola.pdf");
    }

    @FXML
    void abrirTableroAgropecuario(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CADA RESIDUO EN SU LUGAR\\2. Tablero Agropecuarios.pdf");
    }

    @FXML
    void abrirTableroDOmicilario(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CADA RESIDUO EN SU LUGAR\\3. Tablero Domiciliarios.pdf");
    }

    @FXML
    void abrirTableroHospitalario(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CADA RESIDUO EN SU LUGAR\\4. Tablero Hospitalarios.pdf");
    }

    @FXML
    void abrirTableroIndustriales(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CADA RESIDUO EN SU LUGAR\\5. Tablero Industriales.v2.pdf");
    }

    @FXML
    void abrirTarjetas(ActionEvent event) {
        Procedimiento.cargarArchivo("\\CADA RESIDUO EN SU LUGAR\\12. Tarjetas.v4.pdf");
    }
  
}
