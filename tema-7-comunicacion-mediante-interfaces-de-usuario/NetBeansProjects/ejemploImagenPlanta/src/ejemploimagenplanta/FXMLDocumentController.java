/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploimagenplanta;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private ImageView ivPlanta;
    @FXML
    private Button btnPlanta;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ejecutar(MouseEvent event) {
        System.out.println(ivPlanta.getLayoutX());
        System.out.println(ivPlanta.getLayoutY());
        ivPlanta.setLayoutX(0);
        ivPlanta.setLayoutY(0);
    }

    @FXML
    private void mover(KeyEvent event) {
        double paso = 50;
        KeyCode kc = event.getCode();
        switch (kc) {
            case UP:
            case W:
                ivPlanta.setLayoutY(ivPlanta.getLayoutY()-paso);
                break;
            case DOWN:
            case S:
                ivPlanta.setLayoutY(ivPlanta.getLayoutY()+paso);
                break;
            case LEFT:
            case A:
                ivPlanta.setLayoutX(ivPlanta.getLayoutX()-paso);
                break;
            case RIGHT:
            case D:
                ivPlanta.setLayoutX(ivPlanta.getLayoutX()+paso);
                break;
            default:
                String letra = kc.getName();
                System.out.println("La letra es: " + letra);
                /*Apartir de aqui se puede hacer otro switch con lo que quieras.*/
        }
    }
    
}
