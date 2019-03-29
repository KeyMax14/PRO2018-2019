/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcadofx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Canvas canvas;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.TOMATO);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.setLineWidth(5.0);
        // establecer el color para dibujar lineas:
        gc.setStroke(Color.BLUE);
        //dibujar línea
        gc.strokeLine(200, 50, 200, 75);
        
        gc.setStroke(Color.GREEN);
        
        gc.strokeLine(200, 75, 75, 75);
        
    }

}
