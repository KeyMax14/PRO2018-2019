/*
    Práctica 29: sin usar bucles for, while, do while obtener el número menor de un array
 */
package practicasut3;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica29 {

    public static int menorArrayRec(int[] array, int inicial) {
        int resultado = 0;
        int resDelSubarray = 0;
        if (inicial < array.length - 1) {
            resDelSubarray = menorArrayRec(array, inicial + 1);

            if (array[inicial] < resDelSubarray) {
                resultado = array[inicial];
            } else {
                resultado = resDelSubarray;
            }
        } else { // Inicial es array.length -1, para iniciar la vuelta de la recursividad.
            resultado = array[inicial];
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[] array = {6, 8, 9, 4};
        System.out.println(menorArrayRec(array, 0));
    }
}
