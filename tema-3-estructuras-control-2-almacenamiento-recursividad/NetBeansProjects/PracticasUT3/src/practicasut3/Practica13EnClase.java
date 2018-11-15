/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasut3;

import java.util.Random;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica13EnClase {

    public static void mostrarArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + " ]");
    }

    public static int[] generarAleatorios(int size) {
        Random rnd = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (rnd.nextInt(100) + 1);
        }
        return array;
    }

    public static int[] obtenerMenores(int size, int[] array) {
        int resultado[] = new int[size];

// Si solo hay 5 números, eso quiere decir que tienes los 5 más pequeños.
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = i;
        }
        
        for (int i = resultado.length; i < array.length; i++) {
            int posMaxResultado= posMaximoArray(resultado, array);
            if (array[resultado[posMaxResultado]] > array[i]) {
                resultado[posMaxResultado] = i;
            }
        }
        return resultado;
    }

    public static int posMaximoArray(int[] resultadoPos, int[] array) {
        int posMax = 0;
        if (resultadoPos != null) {
            for (int i = 1; i < resultadoPos.length; i++) {
                if (array[resultadoPos[posMax]] < array[resultadoPos[i]]) {
                    posMax = i;
                }
            }
        } else {
            posMax = -1;
        }
        return posMax;

    }

    public static void main(String[] args) {
        int cantidad = 20;
        int array[] = generarAleatorios(cantidad);

        int cantMenores = 5;
        int menores[] = obtenerMenores(cantMenores, array);

        mostrarArray(array);
        mostrarArray(menores);
    }
}
