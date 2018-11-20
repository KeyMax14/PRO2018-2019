/*
    Práctica 26: Multiplicar todos los elementos de un array mediante recursión
 */
package practicasut3;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica26 {

    public static int multiplicacionArray(int[] array, int pos) {
        int resultado = 0;
        if (pos >= array.length - 1) { //n+1 > array.length
            resultado = array[pos];
        } else {
            resultado = array[pos] * multiplicacionArray(array, pos + 1);
        }
        return resultado;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(multiplicacionArray(array, 0));
    }
}
