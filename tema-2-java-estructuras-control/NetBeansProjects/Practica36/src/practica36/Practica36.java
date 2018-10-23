/*
    Práctica 36: Hacer un programa que se emule un juego de lanzar 3 dados. En cada
   iteración se muestra el resultado sacado en cada uno de los dados y cuánto es el acumulado
   de esa tirada de 3 dados. Cuando el usuario pulse en “f” o “F” el programa finaliza y

   muestra el acumulado de puntos de sumar todas las tiradas y el número de tiradas
   Nota: se puede utilizar Random para el número aleatorio:
   Random rnd = new Random();
   rnd.nextInt(6); //genera un aleatorio desde 0 hasta 5
 */
package practica36;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Random rnd = new Random();
        char salir = 's';
        int i = 0;
        int total = 0;
        
        while (salir != 'f'){
            int dado1 = (rnd.nextInt(6)+1);
            int dado2 = (rnd.nextInt(6)+1);
            int dado3 = (rnd.nextInt(6)+1);
            int acumular = dado1+dado2+dado3;
            total += acumular;
            i++;
            System.out.println("\nDado 1: "+dado1+
                    "\nDado 2: "+dado2+
                    "\nDado 3: "+dado3+
                    "\nTotal: "+acumular );
            System.out.println("Desea salir? [F]");
            salir = sc.next().toLowerCase().charAt(0);
        }
        System.out.println("Se han hecho un total de "+i+
                " tiradas\nY el total de las tiradas es "+total+
                ".");
    }
    
}
