/*
    Práctica 4: Utilizando bucles crear un array de dos dimensiones donde la primera fila haya
        un elemento, en la segunda fila 2 elementos, en la tercera fila 3 elementos … Llegar así
        hasta 20.
 */
package dossierut5;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P04 {
    public static void main(String[] args) {
        int[][] arr = new int[20][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i+1];
        }
    }
    
}
