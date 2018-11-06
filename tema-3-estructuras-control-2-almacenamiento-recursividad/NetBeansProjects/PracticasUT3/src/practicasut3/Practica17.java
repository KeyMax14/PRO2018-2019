/*
    Práctica 17: Crear un programa que reproduzca el algoritmo anterior

        Imaginemos un bucle que vaya comparando la posición i con la i+1 y si el número de la posición i
        es mayor que el de la posición i+1 los intercambia
        Ej. Veamos todos los pasos del bucle con el array anterior:

        i=0. En i y i+1 tenemos 5 y 2 En este caso 5 > 2 entonces intercambia los dos números

        [ 5 , 2, 12, 14, 8, 9, 11 ] //array antes de comparar posición 0 con 1
        [ 2, 5, 12, 8, 14, 9, 11 ] //array después de comparar posición 0 con 1

        i=1. En i y i+1 tenemos 5 y 12 En este caso 5 ≤ 12 entonces no hace nada

        [ 2, 5, 12, 8, 14, 9, 11 ] //array antes de comparar posición 1 con 2
        [ 2, 5, 12, 8, 14, 9, 11 ] //array después de comparar posición 1 con 2

        ...

        i=6 En este momento el bucle terminaría porque ya no es posible comparar con i+1
        Lo que haremos es volver a repetir todo el bucle una y otra vez hasta que se detecte que no
        se ha cambiado ningún elemento del array. Caso en el cuál ya estará ordenado
        Veamos como quedaría el array después de la segunda ejecución completa del bucle:
        [ 2, 5, 8, 9, 11,12, 14 ]
        El array ya está ordenado y cuando realice una tercera ejecución completa del bucle se dará cuenta
        y termina.
 */
package practicasut3;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica17 {

    public static void main(String[] args) {
        int[] array = {5, 2, 12, 14, 8, 9, 11};
        mostrarArray(array);
        ordenarArray(array);
        System.out.println("\nOrdenado: ");
        mostrarArray(array);
    }

    public static void ordenarArray(int[] array) {
        boolean repetidos = true;
        while (repetidos) {
            repetidos = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    repetidos = true;
                }
            }
        }
    }

    public static void mostrarArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + " ]");
    }
}
