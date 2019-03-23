/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularcalificacion;

import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import modelo.Ponderaciones;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
class ObjetosEnGrid {

    Button btn;
    TextField txt;
    Label lbl;

    public ObjetosEnGrid(Button btn, TextField txt, Label lbl) {
        this.btn = btn;
        this.txt = txt;
        this.lbl = lbl;
    }
}

public class FXMLDocumentController implements Initializable {

    Ponderaciones calificaciones;
    static int autoIncremental;
    Map<Button, ObjetosEnGrid> mapaGrid;

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
    @FXML
    private GridPane gridContenedor;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        calificaciones = new Ponderaciones();
        mapaGrid = new HashMap<>();
        autoIncremental = 0;
        // Prueba de padding
        gridContenedor.setVgap(10);
//        gridContenedor.setPadding(new Insets(10,10,10,10));
    }

    @FXML
    private void introPonderacion(MouseEvent event) {
        if (txtPonderacion.getText().matches("^(([0-9]+(\\.[0-9]+)?)|(\\.[0-9]+))$")) {
//            ArrayList<ObjetosEnGrid> objetosGrid = new ArrayList<>(mapaGrid.values());
//            if (objetosGrid.stream().anyMatch(p -> p.btn.getText().equals(txtPonderacion.getText()))) {
            if (Arrays.stream(mapaGrid.values().toArray())
                    .map(p -> (ObjetosEnGrid) p)
                    .anyMatch(p -> {
                        String ponderacionNueva = "" + Double.parseDouble(txtPonderacion.getText());
                        return ponderacionNueva.equals(p.btn.getText());
                    })
            ){

                txtPonderacion.setText("Ponderación duplicada.");
            } else {
                Label lbl = new Label("");
                TextField txt = new TextField("");
                Button btn = new Button();
                btn.setText("" + Double.parseDouble(txtPonderacion.getText()));
//                btn.setText("" + txtPonderacion.getText());
                btn.addEventHandler(MouseEvent.MOUSE_CLICKED, evt -> agregarNota(evt));
                gridContenedor.addRow(autoIncremental, lbl, txt, btn);
                mapaGrid.put(btn, new ObjetosEnGrid(btn, txt, lbl));
                autoIncremental++;
                txtPonderacion.setText("");
                // Posible método mediante ID
                //        btn.setId("btn"+i);
                //        lbl.setId("btn"+i);
                //        txt.setId("btn"+i);
                //        gridContenedorRuntime.add(lbl, 1, 0);
                //        gridContenedorRuntime.add(btn, 1, 1);
            }

        } else {
            txtPonderacion.setText("Valor no válido.");
        }

    }

    private void agregarNota(MouseEvent event) {
//        System.out.println("Evento Creado en tiempo de ejecución.");

        Button btnPulsado = ((Button) event.getSource());
        ObjetosEnGrid objetosActuales = mapaGrid.get(btnPulsado);
        calificaciones.restartNotas();
        objetosActuales.lbl.setText(objetosActuales.lbl.getText() + " " + objetosActuales.txt.getText());
        objetosActuales.txt.setText("");

        for (ObjetosEnGrid value : mapaGrid.values()) {
            if (!value.lbl.equals("")) {
                calificaciones.agregarNota(Double.parseDouble(value.btn.getText()), value.lbl.getText());
            }
        }
        objetosActuales.lbl.setText(calificaciones
                .obtenerNotasPorPonderacion(Double.parseDouble(objetosActuales.btn.getText()))
        );

        txtResultados.setText(calificaciones.getResultado());
    }

    @FXML
    private void pulsarTxtPonderacion(MouseEvent event) {
        if (!txtPonderacion.getText().matches("^(([0-9]+(\\.[0-9]+)?)|(\\.[0-9]+))$")) {
            txtPonderacion.setText("");
        }
    }

}
