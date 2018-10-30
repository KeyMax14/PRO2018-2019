/*
    Práctica 9: Crear un programa que guarde en un array 10 números aleatorios entre 1 y 99
        que sean pares. Luego mostrar en pantalla los 10 números, así como el máximo y el mínimo
        de esos 10 números y las respectivas posiciones que ocupan en el array
 */
package practicasut3;

import java.util.Random;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica09 {

    static int aleatorioPar(int n1, int n2) {
        Random rnd = new Random();
        if (n1 > n2) {
            int temp = n2;
            n2 = n1;
            n1 = temp;
        }
        int resultado;
        
        do {
            resultado = (rnd.nextInt(n2 - n1) + 1) + (n1);
        } while (resultado%2 != 0);
              
        return resultado;
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        
        for (int i = 0; i < 10; i++) {
            array[i] = aleatorioPar(1, 99);
        }
        int max = array[0], maxPos = 0;
        int min = array[0], minPos = 0;
        
        System.out.println("Los valores son: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i]+" ");
            
            if (array[i] > max) {
                max = array[i];
                maxPos = i;
            }
            
            if (array[i] < min) {
                min = array[i];
                minPos = i;
            }
        }
        
        System.out.println("\nEl valor máximo es: "+max+" pos("+maxPos+")");
        System.out.println("El valor mínimo es: "+min+" pos("+minPos+")");
        
    }
}
