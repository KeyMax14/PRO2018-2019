/*
    Práctica 8: Crear un programa que, mediante un bucle, guarde 10 números en un array
       introducidos por el usuario. Luego, también con un bucle, muestre cada uno de esos
       números y el índice que le corresponde en el array
 */
package practicasut3;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        
        for (int i = 0; i < array.length ; i++) {
            System.out.print("Introduce el num "+(i+1)+": ");
            array[i] = sc.nextInt();
        }
        
        for (int i = 0; i < array.length ; i++) {
            System.out.println("El contenido de array["+i+"] es: "+array[i]);
        }
        
    }
}
