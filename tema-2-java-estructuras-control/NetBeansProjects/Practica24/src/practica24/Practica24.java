/*
    Práctica 24: Hacer un programa que le pregunte al usuario su idioma preferido. Donde la
    letra ‘c’ será castellano, ‘i’ inglés, ‘f’ francés. Según la opción que haya elegido se le
    mostrará respectivamente: “Buenos días”, “Good morning”, “Bonjour” y termina. 

    Si el usuario escribe cualquier otra cosa el programa mostrara: “no entiendo tu idioma” y termina
    
    Tener en cuenta que Scanner no tiene un método nextChar() en su defecto usar:
    next().charAt(0) que va a tomar el primer carácter de la línea de texto introducida
    
    Ej.
    Scanner cin = new Scanner(System.in);
    char c = cin.next().charAt(0);

 */
package practica24;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce tu idioma preferido: ");
        Scanner sc = new Scanner(System.in);
        char idioma = sc.next().charAt(0);
        
        switch (idioma){
            case 'c':
            case 'C':
                System.out.println("Buenos días."); break;
            case 'i':
            case 'I':
                System.out.println("Good Morning."); break;
            case 'f':
            case 'F':
                System.out.println("Bonjour."); break;
            default:
                System.out.println("No entiendo tu idioma.");
        }
        
    }
    
}
