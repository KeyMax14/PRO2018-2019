/*
    Práctica 11: Modificar el programa anterior para que calcule también la varianza
 */
package practicasut3;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica11 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos números desea?");
        int arrayLen = sc.nextInt();
        int[] nums = new int[arrayLen];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Introduzca el num " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        int suma = 0;
        System.out.println("\nLos números introducidos son: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
            suma += nums[i];
        }
        double media = suma / (double) nums.length;
        System.out.println("\nLa media es : " + media);

        // Aqui añadimos la varianza, según internet sigue la formula ∑(xi-xm)²/(n-1), donde xm es la media.
        double sumatorioVarianza = 0;
        for (int i = 0; i < nums.length; i++) {
            sumatorioVarianza += Math.pow(nums[i] - media, 2);
        }
        double varianza = sumatorioVarianza / (nums.length - 1); // Esto es la varianza para una muestra, en una población sería sumatorioVarianza / (nums.length).
        System.out.println("La varianza es: " + varianza);
    }
}
