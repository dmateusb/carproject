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
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author david
 */
public class AguaEducacionController extends VentanasIndividuales implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void abrirGuia(ActionEvent event) {
        Procedimiento.cargarArchivo("\\AGUA Y EDUCACIÓN GUIA PARA DOCENTES (WET)\\GUIA WET.pdf");
    }
    @FXML
    private Text texto;

    @FXML
    private Pane paneltexto;

    @FXML
    private Button btndescripcion;

    @FXML
    private Button btnespecifificacion;
    @FXML
    void mouseHandled(MouseEvent event) {
        if(event.getSource()==btndescripcion){
            texto.setText("pruebasasasasaspruebasasasasaspruebasasasasaspruebasasasasaspruebasasasas" +
                    "aspruebasasasasaspruebasasasasaspruebasasasasas" +
                    "pruebasasasasaspruebasasasasaspruebasasasasas" +
                    "pruebasasasasaspruebasasasasaspruebasasasasaspruebasasasasas" +
                    "pruebasasasasaspruebasasasasaspruebasasasasas");
            paneltexto.toFront();
        }else if(event.getSource()==btnespecifificacion){
            texto.setText("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq" +
                    "qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq" +
                    "qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq" +
                    "qqqqqqqqqqqvv");
            paneltexto.toFront();
        }
    }

    @FXML
    void cerrarpanel(MouseEvent event) {
        paneltexto.toBack();
        texto.setText("");
    }
   


}
