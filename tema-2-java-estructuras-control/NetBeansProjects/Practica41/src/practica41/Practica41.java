/*
    Práctica 41: Escribir un programa que el usuario escriba una cadena de texto y se le
        muestre el texto al revés. Ej “cabello” mostraría: “ollebac”
        Nota: “cabello”.substring(2,3) devuelve: “b” que es la tercera letra de ese texto
 */
package practica41;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra o frase: ");
        String frase = sc.nextLine();
        
        
        for (int i = frase.length()-1; i >=0; i--) {
            System.out.print(frase.substring(i, i+1));
        }
        System.out.println("");
    }
    
}
