/*
    Práctica 9: Crear un programa que guarde en un array 10 números aleatorios entre 1 y 99
        que sean pares. Luego mostrar en pantalla los 10 números, así como el máximo y el mínimo
        de esos 10 números y las respectivas posiciones que ocupan en el array
 */
package practicasut3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica09EnClaseMOD {

    public static void mostrarArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + " ]");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 10;
        int array[] = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            int dato = (rnd.nextInt(49) + 1) * 2;
            array[i] = dato;
        }

        // MOD: Usando unicamente la posición de los valores.
        
        int posMax = 0, posMin = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[posMax] < array[i]) {
                posMax = i;
            }
            if (array[posMin] > array[i]) {
                posMin = i;
            }
        }
        //MOD: Mostrar TODAS las posiciones donde esta el maximo y el minimo.
        mostrarArray(array);
        System.out.print("Maximo= " + array[posMax] + " posMax= ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[posMax]) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\nMinimo= " + array[posMin] + " posMin= ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[posMin]) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
}
