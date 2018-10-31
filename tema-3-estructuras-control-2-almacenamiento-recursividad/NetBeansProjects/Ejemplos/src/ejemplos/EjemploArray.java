/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class EjemploArray {

    // Método mostrar un array


    public static void main(String[] args) {
        int size = 10;
        int[] array;
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        int[] array1 = array;
        int[] array2 = array1;
        
        // Esto es una demostración de que es un objeto, y va por referencia.
        
        System.out.println(array[2]);
        System.out.println(array1[2]);
        System.out.println(array2[2]);

        array[2] = 7;

        System.out.println(array[2]);
        System.out.println(array1[2]);
        System.out.println(array2[2]);

        mostrarArray(array);
        
        int array3[] = {3, 4, 0, 7, 5};
        
        mostrarArray(array3);
        
    }
    // Método mostrar un array (Se puede coger con refactor -> introduce -> method)
    
    public static void mostrarArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + " ]");
    }

}
