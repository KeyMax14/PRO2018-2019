/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicionales;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class EjemploArrayMetodoReferencia {

    public static void main(String[] args) {
        int[] array = {9, 9, 9, 9};

        int num = 9;

        System.out.println("num: " + num);
        mostrarArray(array);
        
        ordenarArray(num, array);
        
        System.out.println("num: " + num);
        mostrarArray(array);

    }

    public static void mostrarArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + " ]");
    }
    
    public static void ordenarArray(int num, int[] array){
        num = 5;
        array[0]=7;
    }
}
