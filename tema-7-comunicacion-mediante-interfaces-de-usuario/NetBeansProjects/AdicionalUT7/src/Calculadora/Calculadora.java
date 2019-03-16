/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

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

    void limpiar() {
        numEnMemoria = 0;
        operador = "";
        operacionEnCurso = false;
    }
    
    void operar(String operacion){
        operador = operacion;
    }

    void cargarNumero(int num) {
        if (!operacionEnCurso) {
            numEnMemoria = num;
            operacionEnCurso = true;
        } else {
            switch (operador) {
                case "":
                    numEnMemoria = num;
                    break;
                case "+":
                    numEnMemoria += num;
                    break;
                case "-":
                    numEnMemoria -= num;
                    break;
                case "*":
                    numEnMemoria *= num;
                    break;
                case "/":
                    numEnMemoria /= num;
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
    
    String getResultado(){
        return ""+numEnMemoria;
    }

}
