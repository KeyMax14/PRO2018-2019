/*
    Práctica 11: Crear un programa para la “frase del día” El usuario introduce al principio
        todas las frases que quiera ( escribirá la palabra “fin” para finalizar la entrada de frases )
        Todas las frases quedarán almacenadas en un ArrayList<String> posteriormente se le
        muestra una frase elegida al azar de entre todas las introducidas. Diciendo: “la frase del día
        es:
        ”
        se debe garantizar que todas puedan ser elegidas ( un aleatorio desde 0 hasta
        arraylist.length() )
 */
package dossierut5;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P11 {
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
        
        System.out.println("La frase del dia es: ");
        System.out.println(frases.get(rnd.nextInt(frases.size())));
        
        
    }
}
