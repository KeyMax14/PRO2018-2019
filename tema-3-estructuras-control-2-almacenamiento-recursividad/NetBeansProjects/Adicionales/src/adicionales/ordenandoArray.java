/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicionales;

import java.util.Random;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class ordenandoArray {
    
    public static void mostrarArray(int[] array){
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
            
        }
        System.out.println("]");
    }
    
    public static int[] generarArray(int size, int limInf, int limSup){
        int[] array = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            int aleatorio = rnd.nextInt(limSup-limInf+1)+limInf;
            array[i]=aleatorio;
        }
        return array;
    }
    
    public static int buscarMaximo(int[] array){
        int maximo = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maximo < array[i]){
             maximo = array[i];   
            }
        }
        return maximo;
    }
    
    public static void ordenarArray(int[] array){
        int maximo = buscarMaximo(array);
        int[] helper = new int[maximo+1];
        for (int i = 0; i < array.length; i++) {
            helper[ array[i] ]++;
        }
        System.out.println("el auxiliar");
        mostrarArray(helper);
        int j = 0;
        for (int i = 0; i < helper.length; i++) {
            while (helper[i] > 0 ) {
                array[j] =i;
                j++;
                helper[i]--;
            }
        }
    }
    
    // ordenación 2
    
    /*
        Inicialmente tomamos el primer elemento del array
        [2,11,5,8,4,9]
        
        decimos que ese primer elemento es la parte ordenada del array
        [2,         11,5,8,4,9]
    
        ahora tomamos el siguiente número como el que vamos a tomar al subarray ordenado
        de menor a mayor
    
        Preguntamos, es 11 < 2
        como no lo es, lo incluimos directamente en el nuevo subarrayordenado.
    
        [2,11,     5,8,4,9]
    
        tomamos el siguiente del grupo desordenado que es el 5
        preguntamos, es 5 < 11? 
        si la respuesta es negativa, los intercambiamos,
        [2,5,11,        8,4,9]
        volvemos a preguntar, es 5 < 2? 
        la respuesta es no, asi que no tenemos que seguir intercambiando.
        [2,5,11,        8,4,9]
    
        ...... Y seguimos hasta el final
    
    */
    
    /*
        Algoritmo de orden n².
    */
    
    public static void ordenarArray2(int [] array){
        for (int i = 1; i < array.length-1; i++) {
            int j = i;
            while (array[j] < array[j-1] && j > 0) { // da error de rango si el primero es mayor que el segundo
                int temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
                //j-1--;
                j--;
            }
            mostrarArray(array);
        }
    }
    
    public static void main(String[] args) {
        //generarArray(tamaño, limite inferior, limite superior)
//        int[] aleatorios = generarArray(20, 0, 10); 
//        mostrarArray(aleatorios);
//        ordenarArray(aleatorios);
//        mostrarArray(aleatorios);
        int[] ordenar2 = {11,2,5,8,4,9};
        mostrarArray(ordenar2);
        ordenarArray2(ordenar2);
        mostrarArray(ordenar2);
    }
}
