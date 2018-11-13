/*
    Práctica 18: Crear un programa que introduzca 5 números y muestre cuáles son los dos
        números más cercanos. Por ej. Si:
        14,11,2,10,17 => 11,10
 */
package practicasut3;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] nums = {14,11,2,10,17};
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Intro num "+(i+1)+":");
            nums[i]=sc.nextInt();
        }
        int distanciaMinima = Math.abs(nums[1]-nums[0]);
        int pos1 = nums[0];
        int pos2 = nums[1];
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (distanciaMinima > Math.abs(nums[i]-nums[j])) {
                    distanciaMinima = Math.abs(nums[i]-nums[j]);
                    pos1 = i;
                    pos2 = j;
                }
            }  
        }
        for (int i = 0; i < nums.length-1; i++) {
            System.out.print(nums[i]+",");
            
        }
        System.out.println(nums[nums.length-1]+" => "+nums[pos1]+","+nums[pos2]);
    }
}
