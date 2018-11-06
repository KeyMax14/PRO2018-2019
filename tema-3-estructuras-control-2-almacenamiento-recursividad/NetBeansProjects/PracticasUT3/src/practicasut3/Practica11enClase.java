/*
    Práctica 11: Modificar el programa anterior para que calcule también la varianza
 */
package practicasut3;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica11enClase {

    public static double mediaArray(int[] nums) {
        int suma = 0;
        System.out.println("\nLos números introducidos son: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
            suma += nums[i];
        }
        return (suma / (double) nums.length);
    }

    public static double varianzaArray(int[] nums) {
        double sumatorioVarianza = 0;
        double media = mediaArray(nums);
        for (int i = 0; i < nums.length; i++) {
            sumatorioVarianza += Math.pow(nums[i] - media, 2);
        }
        return (sumatorioVarianza / (nums.length)); // Esto es la varianza para una muestra, en una población sería sumatorioVarianza / (nums.length).
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos números desea?");
        int arrayLen = sc.nextInt();
        int[] nums = new int[arrayLen];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Introduzca el num " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }


        System.out.println("\nLa media es : " + mediaArray(nums));

        System.out.println("La varianza es: " + varianzaArray(nums));
        
    }
}
