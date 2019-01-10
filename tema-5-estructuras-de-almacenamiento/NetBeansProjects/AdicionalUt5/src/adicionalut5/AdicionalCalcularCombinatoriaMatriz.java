/*
    Mediante factorial.
    (7 3) = 7! / (7-3)! -3!
    

    En este no usaremos factorial.
    Vamos a utilizar el triangulo de tartaglia, generado en la practica 5.
    (7 3) = arr[7-1][3-1]; -1 porque en un array comienza desde 0 
 */
package adicionalut5;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class AdicionalCalcularCombinatoriaMatriz {

    public static int[][] generarTrianguloTartaglia(int size) {
        int[][] arr = new int[size][];
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
        return arr;
    }

    public static void mostrarArray(int[][] arr) {
        for (int[] fila : arr) {
            for (int i : fila) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Combinatoria: (n m) n es mayor que m.");
        System.out.println("Introduce n: ");
        int n = sc.nextInt();
        System.out.println("Introduce m: ");
        int m = sc.nextInt();
        int[][] arr = generarTrianguloTartaglia(n);
//        farArray(arr);
        System.out.println("C(" + n + " " + m + ") = " + arr[n-1][m-1]);
    }
}
