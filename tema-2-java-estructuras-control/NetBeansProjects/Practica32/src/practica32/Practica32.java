/*
    Práctica 32: Hacer un programa que reciba dos números enteros positivos del usuario y
    muestre la suma de todos los números que hay entre esos dos números.
    Ej. Usuario introduce: 10, 5 entonces la secuencia de números es:
    5,6,7,8,9,10
    y la suma de esos números es:
    45
    Hacer uso de un bucle for para este programa
 */
package practica32;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el 1er número entero positivo: ");
        int n1 = sc.nextInt();
        System.out.println("Introduzca el 2do número entero positivo: ");
        int n2 = sc.nextInt();
        
        if (n1 < 0 || n2 < 0)
            System.out.println("Has introducido un número negativo.");
        else{
                if (n1 > n2){
                    int temp = n2;
                    n2 = n1;
                    n1 = temp;
                }
                
                int suma = 0;
                for ( int i = n1; i <= n2; i++) {
                    suma += i;
                }

                System.out.println("La suma de los números y sus valores intermedios es "+suma+".");
        }
    }
    
}
