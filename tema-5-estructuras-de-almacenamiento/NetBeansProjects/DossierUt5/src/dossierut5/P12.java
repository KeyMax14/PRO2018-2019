/*
    Práctica 12: Modificar el programa anterior para que lo que muestre sea todas las frases
        que empiecen con la letra a mayúscula: “A”
 */
package dossierut5;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        ArrayList<String> frases = new ArrayList<>(10);
        String frase = "";
        System.out.println("Introduce todas las frases que quieras: (acaba escribiendo fin))");
        
        while(!frase.toLowerCase().equals("fin")){
            frase = sc.nextLine();
            frases.add(frase);
        }
        frases.remove("fin");
        
        System.out.println("Las frases que comienzan por \"A\" son: ");
        boolean hayFrase = false;
        for (String frase1 : frases) {
            if ('A' == frase1.charAt(0)) {
                System.out.println(frase1);
                hayFrase = true;
            }
        }
        if (!hayFrase) {
            System.out.println("No hay ninguna frase.");
        }
        
    }
}
