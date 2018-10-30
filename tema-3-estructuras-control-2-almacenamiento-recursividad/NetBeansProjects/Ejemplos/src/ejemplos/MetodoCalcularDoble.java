/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class MetodoCalcularDoble {
    
    static int calcularDoble(int num) {
        int resultado = num * 2;
        return resultado;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num= 15;
        int resultado = calcularDoble(num);
        System.out.println(resultado);
    }

}
