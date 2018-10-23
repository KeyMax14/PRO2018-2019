/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicionalpropuestos1tema1;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Propuesta7 {
    public static void main(String[] args) {
        /*
        Práctica 07: Diseña un algoritmo que, dado un número entero, determine si éste es el doble
		de un número impar. (Ejemplo: 14 es el doble de 7, que es impar.)
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entero para saber si es el doble de un número impar:");
        int num = sc.nextInt();
        
        if (num%2==0.0) {
            int mitad = num/2;
            if (mitad%2!=0) {
                System.out.println("El número "+ num +" es el doble de un numero impar ("+mitad+").");
            }else{
               System.out.println("El número "+ num +" NO es el doble de un numero impar ("+mitad+").");
            }
                
        }else{
            System.out.println("El número resultante es un número decimal,"
                    + " no tiene paridad.");
        }
    }
}
