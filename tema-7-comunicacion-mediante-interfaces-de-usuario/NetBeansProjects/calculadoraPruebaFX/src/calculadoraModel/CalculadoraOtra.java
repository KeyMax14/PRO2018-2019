/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraModel;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class CalculadoraOtra {

    double numEnMemoria;
    double numeroAux;
    String operador;
    boolean operacionEnCurso;
    boolean haySegundoValor;

    public CalculadoraOtra() {
        numEnMemoria = 0;
        numeroAux = 0;
        operador = "";
        operacionEnCurso = false;
        haySegundoValor = false;
    }

    public void limpiar() {
        numEnMemoria = 0;
        numeroAux = 0;
        operador = "";
        operacionEnCurso = false;
    }

    public void operar(String operacion) {
        operador = operacion;
        if (!operacion.equals("=")) {
            haySegundoValor = true;
        } else {
            haySegundoValor = false;
        }

    }

    public void cargarNumero(int num) {
        if (!operacionEnCurso) {
            numEnMemoria = num;
            operacionEnCurso = true;
        } else {
            if (!haySegundoValor) {
                switch (operador) {
                    case "":
                        numEnMemoria = (numEnMemoria * 10) + num;
                        break;
                    case "+":
                        numEnMemoria += num;
                        operador = "";
                        break;
                    case "-":
                        numEnMemoria -= num;
                        operador = "";
                        break;
                    case "*":
                        numEnMemoria *= num;
                        operador = "";
                        break;
                    case "/":
                        numEnMemoria /= num;
                        operador = "";
                        break;
                    case "=":
                        operador = "";
                        operacionEnCurso = false;
                        break;
                    default:
                        throw new AssertionError();
                }
            } else {
                double aux = numeroAux;
                numeroAux = numEnMemoria;
                numEnMemoria = aux;
                switch (operador) {
                    case "":
                        numEnMemoria = (numEnMemoria * 10) + num;
                        aux = numeroAux;
                        numeroAux = numEnMemoria;
                        numEnMemoria = aux;
                        break;
                    case "+":
                        numeroAux += numEnMemoria;
                        numEnMemoria = numeroAux;
                        numeroAux = 0;
                        operador = "";
                        break;
                    case "-":
                        numeroAux -= numEnMemoria;
                        numEnMemoria = numeroAux;
                        numeroAux = 0;
                        operador = "";
                        break;
                    case "*":
                        numeroAux *= numEnMemoria;
                        numEnMemoria = numeroAux;
                        numeroAux = 0;
                        operador = "";
                        break;
                    case "/":
                        numeroAux /= numEnMemoria;
                        numEnMemoria = numeroAux;
                        numeroAux = 0;
                        operador = "";
                        break;
                    case "=":

                        operador = "";
                        operacionEnCurso = false;
                        break;
                    default:
                        throw new AssertionError();
                }
            }

        }
    }

    public String getResultado() {
        return "" + numEnMemoria;
    }

}
