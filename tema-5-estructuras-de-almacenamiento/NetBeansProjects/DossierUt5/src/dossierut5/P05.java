/*
    Práctica 5: Observa la siguiente salida de programa:
    
    1
    1 1
    1 2 1
    1 3 3 1
    1 4 6 4 1
    1 5 10 10 5 1
    1 6 15 20 15 6 1

    Siempre el primer y el último elemento de cada fila es 1. Fijémonos ahora en la fila:
    1 4 6 4 1
    el 4 se obtiene sumando 1 3 que tiene encima.
    el 6 se obtiene sumando 3 3 que tiene encima.
    Si nos fijamos todos los elementos intermedios se generan así:
    array[i][j] = array[i-1][j-1] + array[i-1][j]
    Utiliza el array que creaste en la práctica anterior para rellenarlo y posteriormente mostrarlo
    en pantalla de la forma que acabamos de describir
 */
package dossierut5;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P05 {

    public static void mostrarArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[arr.length-1].length - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
//    public static void mostrarArray(int[][] arr) {
//        for (int[] fila : arr) {
//            for (int i : fila) {
//                System.out.print(i + " ");
//            }
//            System.out.println("");
//        }
//    }

    public static void main(String[] args) {
        int[][] arr = new int[20][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
        }
        arr[0][0] = 1;
        for (int i = 1; i < arr.length; i++) {
            arr[i][0] = 1;
            arr[i][arr[i].length - 1] = 1;
            for (int j = 1; j < arr[i].length - 1; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        mostrarArray(arr);
    }

}
