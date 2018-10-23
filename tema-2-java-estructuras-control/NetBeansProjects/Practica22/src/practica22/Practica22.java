/*
    Práctica 22: Hacer un programa que haga uso de estructuras if else if para que dado un
    número entero x muestre en pantalla:
        - x es menor de 0
        - x es igual a 0
        - x es mayor que 0 y menor que 10
        - x es igual a 10
        - x es mayor que 10 y menor que 20
        - x es mayor o igual a 20
 */
package practica22;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce un número entero: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if (num < 0 ){ // Caso menor que 0
            System.out.println(num + " es menor que 0.");
        }else if (num == 0){ // Caso igual a 0
            System.out.println(num + " es igual a 0.");
        }else if (num < 10){ // Caso menor que 10
            System.out.println(num + " es mayor que 0 y menor que 10.");
        }else if (num == 10){ // Caso igual a 10
            System.out.println(num + " es igual a 10.");
        }else if (num < 20){ // Caso menor que 20
            System.out.println(num + " es mayor que 10 y menor que 20.");
        }else{ // Caso mayor o igual a 20
            System.out.println(num + " es mayor o igual a 20.");
        }
    }
    
}
