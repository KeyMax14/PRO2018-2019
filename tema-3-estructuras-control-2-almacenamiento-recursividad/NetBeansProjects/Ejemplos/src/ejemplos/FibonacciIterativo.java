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
public class FibonacciIterativo {

    public static void fibonacciVentana(int limInf, int limSup) {
        boolean parar = false;
        int an = 1;
        int anMenos1 = 1;
        do {
            int anMas1 = anMenos1 + an;
            if (an >= limInf && an <=limSup) {
                System.out.print(an + " ");
            }
            anMenos1 = an;
            an = anMas1;
        } while (an <= limSup);
        System.out.println("");

    }

    public static void main(String[] args) {
        fibonacciVentana(34, 144);
    }

}


