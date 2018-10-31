/*
    Práctica 16: Crear un programa que genere 10 números aleatorios enteros entre 1 y 100. Se
        deben mostrar esos 10 números, la media de esos 10 números y decir cuáles de esos 10
        números son mayores que la media calculada.
 */
package practicasut3;

import java.util.Random;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica16 {

    public static void mostrarArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + " ]");
    }

    public static double mediaArray(int[] nums) {
        int suma = 0;
        for (int i = 0; i < nums.length; i++) {
            suma += nums[i];
        }
        double media = suma / (double) nums.length;
        return media;
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        int[] numsRandom = new int[10];

        for (int i = 0; i < numsRandom.length; i++) {
            numsRandom[i] = rnd.nextInt(100) + 1;
        }

        mostrarArray(numsRandom);

        System.out.println("La media es: "+mediaArray(numsRandom));
        
        System.out.println("Los números que superan la media son: ");
        
        for (int i = 0; i < numsRandom.length ; i++) {
            if (numsRandom[i] > mediaArray(numsRandom)) {
                System.out.print(numsRandom[i]+" ");
            }
        }
        System.out.println("");

    }

}
