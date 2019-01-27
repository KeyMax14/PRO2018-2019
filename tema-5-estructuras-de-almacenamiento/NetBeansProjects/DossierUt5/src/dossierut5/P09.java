/*
    Práctica 9: Hacer un programa que el usuario introduzca un texto por teclado y mediante
        expresiones regulares se determine si es un número válido. Observa que esto significa que
        debe empezar por una cifra o por los símbolos +- Que después aparezcan cifras y sólo
        cifras salvo la coma: “,” la cuál nos serviría para delimitar los decimales.
        Hacer dos versiones, en la primera debe haber una coincidencia completa en el String que el
        usuario nos pase, en la segunda basta con que lo primero que muestre la cadena sea un
        número válido aunque después aparezca más texto.
 */
package dossierut5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P09 {
    public static void main(String[] args) {
        //    ^([+-]?[0-9]+(,[0-9]+)?)|([+-]?,[0-9]+)$
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        String num = sc.next();
        Pattern p=Pattern.compile("([+-]?[0-9]+(,[0-9]+)?)|([+-]?,[0-9]+)");
        Matcher m=p.matcher(num);
        
        if (m.matches()) {
            System.out.println("Es válido.");
        }else{
            System.out.println("No es válido.");
        }
        
        // Segunda version;
        
        System.out.println("\nIncluyendolo: ");
        
        if (m.find()) {
            System.out.println("Es válido");
        }else{
            System.out.println("No es válido.");
        }
        
        
        
        
    }
}
