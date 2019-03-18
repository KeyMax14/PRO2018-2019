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
public class Calculadora {

    double numEnMemoria;
    String operador;
    boolean operacionEnCurso;

    public Calculadora() {
        numEnMemoria = 0;
        operador = "";
        operacionEnCurso = false;
    }

    public void limpiar() {
        numEnMemoria = 0;
        operador = "";
        operacionEnCurso = false;
    }
    
    public void operar(String operacion){
        operador = operacion;
    }

    public void cargarNumero(int num) {
        if (!operacionEnCurso) {
            numEnMemoria = num;
            operacionEnCurso = true;
        } else {
            switch (operador) {
                case "":
                    numEnMemoria = (numEnMemoria*10)+num;
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
        }
    }
    
    public boolean getEstado(){
        return operacionEnCurso;
    };
    
    public String getResultado(){
        return ""+numEnMemoria;
    }

}
