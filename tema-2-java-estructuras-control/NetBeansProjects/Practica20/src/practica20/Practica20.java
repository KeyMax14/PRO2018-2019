/*
Práctica 20: Hacer un programa que se le pase un número entero y que devuelva los
siguientes mensajes:
- Si es impar: “El número: x es impar”
- Si es par: “El número x es par”
Donde x es el número introducido por el usuario
 */
package practica20;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce un número entero: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if (num%2 == 0) {
            System.out.println("El número "+num+" es par.");
        }else{
            System.out.println("El número "+num+" es impar.");
        }
    }
    
}
