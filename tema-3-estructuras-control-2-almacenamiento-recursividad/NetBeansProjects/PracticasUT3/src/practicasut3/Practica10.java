/*
    Práctica 10: Hacer un programa que primero solicita la cantidad de números que se van a
        introducir. Después de haberlos introducido muestra la media y los números que se han
        introducido
 */
package practicasut3;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos números desea?");
        int arrayLen = sc.nextInt();
        int[] nums = new int[arrayLen];
        
        
        for (int i = 0; i < nums.length ; i++) {
            System.out.print("Introduzca el num "+(i+1)+": ");
            nums[i] = sc.nextInt();
        }
        
        int suma = 0;
        System.out.println("\nLos números introducidos son: ");
        for (int i = 0; i < nums.length ; i++) {
            System.out.print(nums[i]+" ");
            suma += nums[i];
        }
        double media = suma/(double)nums.length;
        System.out.println("\nLa media es: "+media);
        
    }
}
