/*
    Práctica 2: crear un programa que lea por teclado números enteros y los guarde en una
        matriz de 5 filas por 4 columnas. Se deberá buscar el número mayor y el número menor
        mostrándolos así como las posiciones que ocupen. Finalmente se mostrará el array
        completo (poner un ‘\n’ en los print al final de cada fila del array) recorriéndolo mediante
        bucles for-each
 */
package dossierut5;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P02 {

    public static void mostrarArray(int[][] arr) {
        for (int[] fila : arr) {
            for (int i : fila) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }

    // Hacerlo con este método, en resultado se guardaran las posiciones.
    // Para casa
    public static void maximoMinimo(int[][] arr, int[] resultado) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[resultado[0]][resultado[1]] > arr[i][j]) {
                    resultado[0] = i;
                    resultado[1] = j;
                }
                if (arr[resultado[2]][resultado[3]] < arr[i][j]) {
                    resultado[2] = i;
                    resultado[3] = j;
                }
            }
        }
        System.out.println("Minimo = " + arr[resultado[0]][resultado[1]] + " Pos: " + resultado[0] + " " + resultado[1]);
        System.out.println("Maximo = " + arr[resultado[2]][resultado[3]] + " Pos: " + resultado[2] + " " + resultado[3]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Introduzca el elemento " + i + " " + j);
                arr[i][j] = sc.nextInt();
            }
        }

//        int min = arr[0][0];
//        int max = arr[0][0];
        int posMinX = 0, posMinY = 0, posMaxX = 0, posMaxY = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[posMinX][posMinY] < arr[i][j]) { //En lugar de min podemos colocar arr[posMinx][posMinY];
//                    min = arr[i][j];
                    posMinX = i;
                    posMinY = j;
                }
                if (arr[posMaxX][posMaxY] > arr[i][j]) { // Igual que con lo de arriba.
//                    max = arr[i][j];
                    posMaxX = i;
                    posMaxY = i;
                }
            }
        }

        System.out.println("Maximo = " + arr[posMaxX][posMaxY] + " Pos: " + posMaxX + " " + posMaxY);
        System.out.println("Minimo = " + arr[posMinX][posMinY] + " Pos: " + posMinX + " " + posMinY);
        mostrarArray(arr);

        // MOD utilizando un método con un array de resultados:
        int[] resultado = {0, 0, 0, 0}; // minX, minY, maxX, maxY Valores iniciales.
        maximoMinimo(arr, resultado);
        

    }

}
