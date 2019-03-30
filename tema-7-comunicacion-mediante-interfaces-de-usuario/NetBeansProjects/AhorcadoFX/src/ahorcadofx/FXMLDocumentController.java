/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcadofx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import modelo.PartidaAhorcado;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class FXMLDocumentController implements Initializable {

    PartidaAhorcado partidaAhorcado;
    @FXML
    private Canvas canvas;
    @FXML
    private TextField txaResultado;
    @FXML
    private Label lblCartelErrores;
    @FXML
    private Label lblErrores;
    @FXML
    private Label lblCartelOportunidades;
    @FXML
    private Label lblIntentosRestantes;
    @FXML
    private Label lblCartelApostar;
    @FXML
    private TextField txtApuesta;
    @FXML
    private Button btnApuesta;
    @FXML
    private Button btnReiniciar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        partidaAhorcado = new PartidaAhorcado();
        txaResultado.setText(partidaAhorcado.getTuPalabra());
        lblIntentosRestantes.setText("" + partidaAhorcado.getNumIntentosRestantes());
        btnReiniciar.setVisible(false);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.BEIGE);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.setLineWidth(10.0);
        // establecer el color para dibujar lineas:

        // Hacer horca
        gc.setStroke(Color.BLACK);

        gc.strokeLine(100, 300, 200, 300);      // Base
        gc.strokeLine(150, 75, 150, 300);       // Palo Vertical
        gc.strokeLine(150, 75, 300, 75);        // Palo Horizontal
        gc.strokeLine(150, 125, 210, 75);       // Sujeccion superior

        limpiarPuppet(gc);
        /*
            Con esto se puede usar rango RGB de css
            gc.setStroke(Color.web("#1759c4"));
         */

 /*
        
            gc.setLineWidth(5.0);
            gc.setStroke(Color.BLUE);

            gc.strokeLine(300, 82.5, 300, 135);     // Cuerda

            gc.strokeOval(300, 125, 30, 36);        // Cabeza


            gc.strokeLine(315, 161, 315, 230);      // Cuerpo

            gc.strokeLine(285, 210, 315, 180);      // Brazo Izquierdo

            gc.strokeLine(315, 180, 345, 210);      // Brazo Derecho

            gc.strokeLine(290, 275, 315, 230);      // Pierna Izquierda

            gc.strokeLine(315, 230, 340, 275);      // Pierna Derecha

         */
    }

    private void limpiarPuppet(GraphicsContext gc) {
        gc.setFill(Color.BEIGE);
        gc.fillRect(215, 80, 500, 280);
    }

    @FXML
    private void introApuesta(ActionEvent event) {
        if (!partidaAhorcado.isJuegoFinalizado()) {
            if (txtApuesta.getText().matches("[a-zA-Z]+")) {
                partidaAhorcado.apostarLetra(txtApuesta.getText().toLowerCase().charAt(0));
                txtApuesta.setText("");
                txaResultado.setText(partidaAhorcado.getTuPalabra());
                lblErrores.setText(partidaAhorcado.getLetrasFalladas());
                lblIntentosRestantes.setText("" + partidaAhorcado.getNumIntentosRestantes());
                GraphicsContext gc = canvas.getGraphicsContext2D();
                limpiarPuppet(gc);
                gc.setLineWidth(5.0);
                gc.setStroke(Color.BLUE);

                switch (partidaAhorcado.getNumIntentosRestantes()) {
                    case 0:
                        gc.setStroke(Color.RED);
                        gc.strokeLine(300, 82.5, 300, 135);     // Cuerda
                    case 1:
                        gc.strokeLine(290, 275, 315, 230);      // Pierna Izquierda
                    case 2:
                        gc.strokeLine(315, 230, 340, 275);      // Pierna Derecha
                    case 3:
                        gc.strokeLine(285, 210, 315, 180);      // Brazo Izquierdo
                    case 4:
                        gc.strokeLine(315, 180, 345, 210);      // Brazo Derecho
                    case 5:
                        gc.strokeLine(315, 161, 315, 230);      // Cuerpo
                    case 6:
                        gc.strokeOval(300, 125, 30, 36);        // Cabeza
                    default:
                }
                if (partidaAhorcado.isJuegoFinalizado()) {
                    txaResultado.setText(partidaAhorcado.getPalabraSecreta());
                    txtApuesta.setVisible(false);
                    btnApuesta.setVisible(false);
                    btnApuesta.setDisable(true);
                    btnReiniciar.setDisable(false);
                    btnReiniciar.setVisible(true);
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, ((partidaAhorcado.isGanador()) ? "¡Has ganado! " : "Has perdido... ") + "La palabra secreta era " + partidaAhorcado.getPalabraSecreta());
                    alert.showAndWait();
                }
            } else {
                txtApuesta.setText("");
            }
        }
    }

    @FXML
    private void reiniciarJuego(ActionEvent event) {
        txtApuesta.setVisible(true);
        btnApuesta.setVisible(true);
        btnApuesta.setDisable(false);
        btnReiniciar.setDisable(true);
        btnReiniciar.setVisible(false);
        partidaAhorcado = new PartidaAhorcado();
        txaResultado.setText(partidaAhorcado.getTuPalabra());
        lblIntentosRestantes.setText("" + partidaAhorcado.getNumIntentosRestantes());
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.BEIGE);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        
        /*
            Hacer horca
        */
        gc.setLineWidth(10.0);
        gc.setStroke(Color.BLACK);
        gc.strokeLine(100, 300, 200, 300);      // Base
        gc.strokeLine(150, 75, 150, 300);       // Palo Vertical
        gc.strokeLine(150, 75, 300, 75);        // Palo Horizontal
        gc.strokeLine(150, 125, 210, 75);       // Sujeccion superior

    }
}
