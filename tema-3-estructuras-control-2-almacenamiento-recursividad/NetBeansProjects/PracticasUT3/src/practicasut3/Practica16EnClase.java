/*
        Práctica 16: Crear un programa que genere 10 números aleatorios enteros entre 1 y 100. Se
        deben mostrar esos 10 números, la media de esos 10 números y decir cuáles de esos 10
        números son mayores que la media calculada.
 */
package practicasut3;

import java.util.Random;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica16EnClase {

    /*
        Realizado en clase con otros metodos.
        También se ve como se crea un javadoc para el método generar array.
     */
    /**
     * Este método genera un array con números enteros aleatorios, de tamaño de
     * parametro size y los números que genera en el rango linInf hasta limSup.
     *
     * @param size Tamaño del array deseado.
     * @param limInf El tope de abajo.
     * @param limSup El valor que no pueden superar los números generados.
     * @return Un array con size aleatorios generados.
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

    public static String mayoresDelArray(int[] array, double valorASuperar) {

        String resultado = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] > valorASuperar) {
                resultado += array[i] + " ";
            }

        }
        return resultado;
    }

    public static double media(int[] array) {
        double suma = 0.0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma / array.length;
    }

    public static void mostrarArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + " ]");
    }

    public static void main(String[] args) {
        int[] array = generarArray(10, 1, 100);
        mostrarArray(array);
        double media = media(array);
        System.out.println("Media: "+media);
        System.out.println("Mayores que la media: "+mayoresDelArray(array, media));
    }
}
