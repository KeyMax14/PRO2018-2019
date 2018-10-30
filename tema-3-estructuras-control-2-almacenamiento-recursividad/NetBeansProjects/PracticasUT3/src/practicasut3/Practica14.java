/*
    Práctica 14: Crear un programa que introduzca 10 números por teclado y mostrarlos
        ordenados de menor a mayor al finalizar
 */
package practicasut3;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica14 {

    public static int[] ordenarArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("introduce el num " + (i+1) + ": ");
            array[i] = sc.nextInt();
        }

        ordenarArray(array); // Como los métodos modifican el array, no hace falta guardarlo.
        
        System.out.println("Esto son los números ordenados: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        
        

    }
}
