/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorapruebafx;

import calculadoraModel.Calculadora;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class FXMLDocumentController implements Initializable {

    Calculadora calc;

    private Label label;
    @FXML
    private TextField txtResultado;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btnAc;
    @FXML
    private Button btn3;
    @FXML
    private Button btnSuma;
    @FXML
    private Button btn6;
    @FXML
    private Button btn5;
    @FXML
    private Button btn4;
    @FXML
    private Button btnIgual;
    @FXML
    private Button btnDividir;
    @FXML
    private Button btnMultiplicar;
    @FXML
    private Button btn0;
    @FXML
    private Button btnResta;
    @FXML
    private Button btn9;
    @FXML
    private Button btn8;
    @FXML
    private Button btn7;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        calc = new Calculadora();
    }

    @FXML
    private void getNumber(ActionEvent event) {
//        Button btnNumerico = (Button)event.getSource();
//        int num = Integer.parseInt(btnNumerico.getText());
//        calc.cargarNumero(num);
//        txtResultado.setText(calc.getResultado());
        Button btnNumero = (Button) event.getSource();
        txtResultado.setText(txtResultado.getText() + btnNumero.getText());
    }

    @FXML
    private void introOperador(ActionEvent event) {
        int num = Integer.parseInt(txtResultado.getText());
        calc.cargarNumero(num);
        txtResultado.setText("");
        calc.operar(((Button) event.getSource()).getText());
    }

    @FXML
    private void introLimpiar(ActionEvent event) {
        calc.limpiar();
//        txtResultado.setText(calc.getResultado());
        txtResultado.setText("");
    }

    @FXML
    private void introIgual(ActionEvent event) {
        int num = Integer.parseInt(txtResultado.getText());
        calc.cargarNumero(num);
        calc.operar(((Button) event.getSource()).getText());
        txtResultado.setText(calc.getResultado());
    }

}
