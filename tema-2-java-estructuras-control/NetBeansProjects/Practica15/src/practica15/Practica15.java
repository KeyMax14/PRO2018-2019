/*
Práctica 15: Hacer un programa que lea una línea de texto entrada por teclado y la muestre
en pantalla
 */
package practica15;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduzca texto");
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        System.out.println(texto);
    }
    
}
