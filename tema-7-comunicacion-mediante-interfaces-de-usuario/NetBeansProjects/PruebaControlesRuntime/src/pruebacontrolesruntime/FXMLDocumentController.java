/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacontrolesruntime;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class FXMLDocumentController implements Initializable {
    
    
    @FXML
    private GridPane gridContenedorRuntime;
    @FXML
    private Button bntPrueba;
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ejecutar(MouseEvent event) {
        Label lbl = new Label("hola amigos");
        Button btn = new Button();
        btn.setText("Soy un botón.");
        btn.addEventHandler(MouseEvent.MOUSE_CLICKED, evt -> miMetodo(evt));
//        btn.setId("btn"+i);
//        lbl.setId("btn"+i);
//        txt.setId("btn"+i);

        // map<Button, ArrayList<Contenedor>> contenedor es una clase con Button, Label, TextField
        gridContenedorRuntime.add(lbl, 1, 0);
        gridContenedorRuntime.add(btn, 1, 1);
        
    }
    
    private void miMetodo(MouseEvent event){
        System.out.println("Evento Creado en tiempo de ejecución.");
    }
    
}
