/*
        Práctica 18: Crear un programa que introduzca 5 números y muestre cuáles son los dos
        números más cercanos. Por ej. Si:
        14,11,2,10,17 => 11,10
 */
package practicasut3;

import java.util.Random;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica18EnClase {

    /*
        En esta caso vamos a realizar un array con las distancias
     */
    public static int[] generarArray(int size, int limInf, int limSup) {
        int[] array = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            int aleatorio = rnd.nextInt(limSup - limInf + 1) + limInf;
            array[i] = aleatorio;
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

    /**
     *
     * @param array
     * @param posicion
     * @return
     */
    public static int[] obtenerDistancia(int[] array, int posicion) {
        int[] distancia = new int[array.length];
        for (int i = 0; i < distancia.length; i++) {
            distancia[i] = Math.abs(array[i] - array[posicion]);
        }
        distancia[posicion] = -1;
        return distancia;
    }

    public static int menorDistancia(int[] array) {
        int posicionMenor;
        if (array[0] > -1) {
            posicionMenor = 0;
        } else {
            posicionMenor = 1;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[posicionMenor] && array[i] >= 0) {
                posicionMenor = i;
            }
        }
        return posicionMenor;

    }

    public static void main(String[] args) {
        int distanciaMenorActual;
        int posNum1= 0;
        int posNum2= 0;

        int[] array = generarArray(5, 1, 100);
        mostrarArray(array);
        int distanciaMenorAnterior = 1000;

        for (int i = 0; i < array.length; i++) {
            int[] distancias = obtenerDistancia(array, i);

            int posicionMenor = menorDistancia(distancias);

            distanciaMenorActual = distancias[posicionMenor];
            if (distanciaMenorActual < distanciaMenorAnterior) {
                posNum1 = i;
                posNum2 = posicionMenor;
                distanciaMenorAnterior = distanciaMenorActual;
            }

        }

        System.out.println("números mas cercanos para esta iteracion:");
        System.out.println(array[posNum1] + " " + array[posNum2]);
        System.out.println("Tiene una distancia de: " + distanciaMenorAnterior);

    }
}
