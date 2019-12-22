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
import javafx.scene.ImageCursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author david
 */
public class PPFaunaController extends VentanasIndividuales implements Initializable {

    /**
     * Initializes the controller class.
     */

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void abrirBosqueSeco(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP FAUNA EN EL TERRITORIO\\CUENTOS\\bosque_seco-Humedo_curvas(FILEminimizer) (1).pdf");
    }

    @FXML
    private void abrirParamo(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP FAUNA EN EL TERRITORIO\\CUENTOS\\paramo_curvas(FILEminimizer) (1).pdf");

    }

    @FXML
    private void abrirBosqueAndino(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP FAUNA EN EL TERRITORIO\\CUENTOS\\bosque_andino_curvas(FILEminimizer) (1).pdf");
    }

    @FXML
    private void abrirDiseñoCaja(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP FAUNA EN EL TERRITORIO\\DOMINO\\DISEÑO CAJA V1 ENERO 13.pdf");

    }

    @FXML
    private void abrirDominoAdultos(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP FAUNA EN EL TERRITORIO\\DOMINO\\DOMINÓ ADULTOS.pdf");

    }

    @FXML
    private void abrirDominoNinos(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP FAUNA EN EL TERRITORIO\\DOMINO\\DOMINÓ NIÑOS.pdf");

    }

    @FXML
    private void abrirPendonInfografia(ActionEvent event) {
        Procedimiento.cargarArchivo("\\PP FAUNA EN EL TERRITORIO\\INFOGRAMA\\PENDÓN INFOGRAFIA.pdf");

    }
}
