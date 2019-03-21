/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularcalificacion;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import modelo.Ponderaciones;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class FXMLDocumentController implements Initializable {
    
    Ponderaciones calificaciones;
    
    @FXML
    private Label lblResultado;
    @FXML
    private Label lblPonderacion;
    @FXML
    private TextField txtResultados;
    @FXML
    private TextField txtPonderacion;
    @FXML
    private Button btnElegirPonderacion;
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        calificaciones = new Ponderaciones();
    }    

    @FXML
    private void introPonderacion(MouseEvent event) {
    }
    
}
