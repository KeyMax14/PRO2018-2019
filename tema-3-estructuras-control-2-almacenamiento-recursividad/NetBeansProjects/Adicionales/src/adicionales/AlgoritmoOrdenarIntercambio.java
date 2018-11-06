/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicionales;

import java.util.Random;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class AlgoritmoOrdenarIntercambio {

    public static void ordenarArray(int[] array) {
        int posMin;

        for (int i = 0; i < array.length - 1; i++) {
            posMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[posMin] > array[j]) {
                    posMin = j;
                }
            }
            int temp = array[i];
            array[i] = array[posMin];
            array[posMin] = temp;
        }
    }

    public static int[] generarAleatorios(int size) {
        Random rnd = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (rnd.nextInt(100) + 1);
        }
        return array;
    }

    public static void mostrarArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + " ]");
    }

    public static void main(String[] args) {
//        int[] array = {9,8,7,6,5,4,3,2,1};
        int[] array = generarAleatorios(10);
        mostrarArray(array);
        ordenarArray(array);
        System.out.println("\nOrdenado: ");
        mostrarArray(array);
    }
}

