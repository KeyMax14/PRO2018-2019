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
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
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

    Dialog crearDialogoInputTextArea(String notasLabel, double ponderacion) {

        Dialog dialog = new Dialog<>();
        dialog.setTitle("input notas ponderadas");
        dialog.setHeaderText("ver/editar notas de la ponderación elegida");

        dialog.getDialogPane().getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);
        TextArea txaNotas = new TextArea();

        txaNotas.setText(notasLabel);
        dialog.getDialogPane().setContent(txaNotas);
        dialog.setResultConverter(button -> {
            if (button == ButtonType.OK) {
                return txaNotas.getText();
            } else {
                return null;
            }
        });
        return dialog;
    }

    @FXML
    private void introPonderacion(MouseEvent event) {
        if (autoIncremental >= 8) {
            txtPonderacion.setText("Límite Superado.");
        } else {

            if (txtPonderacion.getText().matches("^(([0-9]+([\\.,][0-9]+)?)|([\\.,][0-9]+))$")) {
//            ArrayList<ObjetosEnGrid> objetosGrid = new ArrayList<>(mapaGrid.values());
//            if (objetosGrid.stream().anyMatch(p -> p.btn.getText().equals(txtPonderacion.getText()))) {
                if (Arrays.stream(mapaGrid.values().toArray())
                        .map(p -> (ObjetosEnGrid) p)
                        .anyMatch(p -> {
                            String ponderacionNueva = "" + Double.parseDouble(txtPonderacion.getText().replaceAll(",", "."));
                            return ponderacionNueva.equals(p.btn.getText());
                        })) {

                    txtPonderacion.setText("Ponderación duplicada.");
                } else {
                    Label lbl = new Label("        ");
                    lbl.setAlignment(Pos.CENTER_RIGHT);
                    lbl.addEventHandler(MouseEvent.MOUSE_CLICKED, evt -> pulsarNotas(evt));
                    TextField txt = new TextField("");
                    txt.addEventHandler(KeyEvent.KEY_PRESSED, evt -> enterNotas(evt));
                    Button btn = new Button();
                    btn.setText("" + Double.parseDouble(txtPonderacion.getText().replaceAll(",", ".")));
//                btn.setText("" + txtPonderacion.getText());
                    btn.addEventHandler(MouseEvent.MOUSE_CLICKED, evt -> pulsarBotonPonderacion(evt));
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

    }

    private void enterNotas(KeyEvent event) {
        KeyCode kc = event.getCode();
        if (kc == KeyCode.ENTER) {
            TextField textoSeleccionado = (TextField) event.getSource();
            System.out.println("Intro PULSADO!!!");
            Button botonAPulsar = Arrays.stream(mapaGrid.values().toArray())
                    .map(p -> (ObjetosEnGrid) p)
                    .filter(p -> p.txt.equals(textoSeleccionado))
                    .findFirst()
                    .get().btn;
            
//            botonAPulsar.fireEvent(new Event(MouseEvent.MOUSE_PRESSED));
            
        }
    }

    private void pulsarNotas(MouseEvent event) {
        Label etiquetaPulsada = (Label) event.getSource();

        ObjetosEnGrid objetosActuales = Arrays.stream(mapaGrid.values().toArray())
                .map(p -> (ObjetosEnGrid) p)
                .filter(p -> p.lbl.equals(etiquetaPulsada))
                .findFirst()
                .get();

        Dialog dialog = crearDialogoInputTextArea(objetosActuales.lbl.getText(), Double.parseDouble(objetosActuales.btn.getText()));
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()) {
            //codigo en el caso de que la ventana emergente devuelva algo
            objetosActuales.lbl.setText(result.get());
            objetosActuales.txt.setText("");
            agregarNotas(objetosActuales);
        }

    }

    private void pulsarBotonPonderacion(MouseEvent event) {
//        System.out.println("Evento Creado en tiempo de ejecución.");

        Button btnPulsado = ((Button) event.getSource());
        ObjetosEnGrid objetosActuales = mapaGrid.get(btnPulsado);
        objetosActuales.lbl.setText(objetosActuales.lbl.getText() + " " + objetosActuales.txt.getText());
        objetosActuales.txt.setText("");
        agregarNotas(objetosActuales);
    }

    private void agregarNotas(ObjetosEnGrid objetosActuales) {
        calificaciones.restartNotas();
        for (ObjetosEnGrid value : mapaGrid.values()) {
            if (!value.lbl.getText().equals("")) {
                calificaciones.agregarNota(Double.parseDouble(value.btn.getText()), value.lbl.getText().replaceAll(",", "."));
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
