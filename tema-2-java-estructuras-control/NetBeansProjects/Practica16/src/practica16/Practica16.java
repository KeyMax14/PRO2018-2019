/*
Práctica 16: Cálculo del área de una Finca. La finca es rectangular así que el usuario
introducirá el número de metros de cada lado y se le mostrará el área calculada tanto en
metros cuadrados como en centímetros cuadrados
 */
package practica16;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce los valores de los lados de la finca: ");
        Scanner sc = new Scanner(System.in);
        double lado1 = sc.nextDouble();
        double lado2 = sc.nextDouble();
        System.out.println("El aréa de la finca es "+(lado1*lado2)+" m2.");
        System.out.println("El aréa de la finca es "+(lado1*lado2*100)+" cm2.");
    }
    
}
