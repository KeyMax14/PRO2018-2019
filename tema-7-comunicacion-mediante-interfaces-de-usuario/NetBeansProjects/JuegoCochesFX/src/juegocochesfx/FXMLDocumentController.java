/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegocochesfx;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import modelo.Coche;
import modelo.Escenario;
import modelo.Posicionable;
import modelo.Punto;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
enum CocheSeleccionado {
    COCHE1,
    COCHE2
}

public class FXMLDocumentController implements Initializable {

    CocheSeleccionado cocheSeleccionado;
    Escenario escenario;
    ArrayList<Posicionable> vehiculos;

    @FXML
    /*
        Cambiado accesibleRol en properties -> accesiblerol a Button
     */
    private TextArea txaCajaInformacion;
    @FXML
    private Button btnInstrucciones;
    @FXML
    private Pane paneEscenario;
    @FXML
    private ImageView ivCoche1;
    @FXML
    private ImageView ivCoche2;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cocheSeleccionado = cocheSeleccionado.COCHE1;
        // ¿Como le digo el layout del pane, para puntoIni puntoFin de escenario?
//        escenario = new Escenario(new Punto(paneEscenario., 0), fin)
       

        // Mirar en clase.
//        Punto aleatorio = escenario.puntoAleatorio();
//        ivCoche1.setLayoutX(aleatorio.getX());
//        ivCoche1.setLayoutX(aleatorio.getY());
//        Punto aleatorio2;
//        do {
//            aleatorio2 = escenario.puntoAleatorio();
//        } while (aleatorio.equals(aleatorio2));
//        ivCoche2.setLayoutX(aleatorio2.getX());
//        ivCoche2.setLayoutX(aleatorio2.getY());
//        vehiculos.add(new Coche("Coche1", escenario, new Punto(ivCoche1.getLayoutX(), ivCoche1.getLayoutY())));
//        vehiculos.add(new Coche("Coche2", escenario, new Punto(ivCoche2.getLayoutX(), ivCoche2.getLayoutY())));
//        escenario.vehiculos.addAll(vehiculos);
    }

    @FXML
    private void getInstrucciones(MouseEvent event) {
        txaCajaInformacion.appendText("Instrucciones: \n");
        txaCajaInformacion.appendText("pulsa \"e\" para arrancar motor coche.\n");
        txaCajaInformacion.appendText("pulsa \"a\" para apagar coche.\n");
        txaCajaInformacion.appendText("pulsa \"b\" para bajar freno de mano.\n");
        txaCajaInformacion.appendText("pulsa \"s\" para subir freno de mano.\n");
        txaCajaInformacion.appendText("pulsa \"ARROWS KEYS\" para mover coche.\n\n");

    }

    @FXML

    private void seleccionarCoche(MouseEvent event) {
        ImageView coche = (ImageView) event.getSource();
        if (coche.getId().equals("ivCoche1")) {
            cocheSeleccionado = cocheSeleccionado.COCHE1;
            txaCajaInformacion.appendText("\nCoche 1 seleccionado.\n");
        } else {
            cocheSeleccionado = cocheSeleccionado.COCHE2;
            txaCajaInformacion.appendText("\nCoche 2 seleccionado.\n");
        }
    }

    private CocheSeleccionado getCocheSeleccionado() {
        return cocheSeleccionado;
    }

    @FXML
    private void mover(KeyEvent event) {
        double paso = 50;
        ImageView ivSeleccionado;
        if (cocheSeleccionado == CocheSeleccionado.COCHE1) {
            ivSeleccionado = ivCoche1;
        } else {
            ivSeleccionado = ivCoche2;
        }
        KeyCode kc = event.getCode();
        switch (kc) {
            case UP:
                ivSeleccionado.setLayoutY(ivSeleccionado.getLayoutY() - paso);
                break;
            case DOWN:
                ivSeleccionado.setLayoutY(ivSeleccionado.getLayoutY() + paso);
                break;
            case LEFT:
                ivSeleccionado.setLayoutX(ivSeleccionado.getLayoutX() - paso);
                break;
            case RIGHT:
                ivSeleccionado.setLayoutX(ivSeleccionado.getLayoutX() + paso);
                break;
            case A:
                break;
            case E:
                break;
            case B:
                break;
            case S:
                break;
            default:
                String letra = kc.getName();
                System.out.println("La letra es: " + letra);
            /*Apartir de aqui se puede hacer otro switch con lo que quieras.*/
        }
    }



}
