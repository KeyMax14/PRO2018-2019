/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generararrayaleatorio;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class GenerarArrayAleatorio {

    /**
     * @param args the command line arguments
     */
    public static int[] generarArray(int size, int posIni, int posFin) {
        Random rnd = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(posFin - posIni + 1) + posIni;
        }
        return array;

    }

    public static void mostrarArray(int[] array) {
        System.out.println("Estos son los números: ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1]);

    }

    public static void modificarArray(int[] array) {
        int j = 0;
        for (int i = 0; i < array.length-1; i += 2) {
            if (j % 2 == 0) {
                if (array[i] >= array[i + 1]) {
                    array[i + 1] = array[i];
                } else {
                    array[i] = array[i + 1];
                }
            } else {
                if (array[i] <= array[i + 1]) {
                    array[i + 1] = array[i];
                } else {
                    array[i] = array[i + 1];
                }
            }

            j++;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cuantos numeros quieres:");
//        int n = sc.nextInt();
//        System.out.println("Introduce numero menor:");
//        int inicioNum = sc.nextInt();
//        System.out.println("Introduce numero mayor:");
//        int finalNum = sc.nextInt();
        int array[] = generarArray(10, 1, 30);

        mostrarArray(array);
        modificarArray(array);
        mostrarArray(array);

    }

}
