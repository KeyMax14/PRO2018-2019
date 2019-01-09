/*
    Práctica 3: Se introducirá por teclado las dimensiones de una matriz ( la cantidad de filas y
        la de columnas ) esa matriz se rellenará con números aleatorios enteros desde 1 a 99
        inclusives. Calcular el valor medio de cada fila de la matriz y mostrarlo en pantalla
        especificando a que fila corresponde cada media
 */
package dossierut5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P03 {

    public static int[][] MatrizAleatoria(int fila, int columna) {
        Random rnd = new Random();
        int[][] arr = new int[fila][columna];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rnd.nextInt(100);
            }
        }
        return arr;
    }
    
    public static void mostrarMediaMatriz(int[][] arr){
        System.out.println("Media por filas: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Fila "+(i+1)+": ");
            double suma = 0.0;
            for (int j = 0; j < arr[i].length; j++) {
                suma += arr[i][j];
            }
            suma/=arr[i].length;
            System.out.println(suma);
        }
    }

    public static void mostrarMatriz(int[][] arr) {
        for (int[] fila : arr) {
            for (int i : fila) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número de filas: ");
        int fila = sc.nextInt();
        System.out.println("Introduzca el número de columnas: ");
        int columna = sc.nextInt();
        int[][] arr = MatrizAleatoria(fila, columna);
        
        mostrarMatriz(arr);
        mostrarMediaMatriz(arr);

    }
}
