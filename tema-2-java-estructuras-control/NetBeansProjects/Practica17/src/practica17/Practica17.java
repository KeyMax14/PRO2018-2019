/*
Práctica 17: Crea un programa que calcule el IGIC (7%) de un producto dado su precio de
venta sin IGIC que introduzca el usuario por teclado.
 */
package practica17;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double IGIC = 0.07;
        System.out.println("Introduzca el precio sin IGIC.");
        Scanner sc = new Scanner(System.in);
        double precio = sc.nextDouble();
        System.out.println("El IGIC de ese precio equivale a "+(IGIC*precio));
    }
    
}
