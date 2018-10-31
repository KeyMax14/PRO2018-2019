/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasut3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica09EnClase {

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
        
        int max=-1, min=101, posMax=0, posMin=0;
        
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                posMax = i;
            }
            if (min > array[i]) {
                min = array[i];
                posMin = i;
            }
        }
        // Mostrar todas las posiciones donde esta el maximo y el minimo.
        mostrarArray(array);
        System.out.println("Maximo= "+max+" posMax= "+posMax);
        System.out.println("Minimo= "+min+" posMin= "+posMin);
    }
}
