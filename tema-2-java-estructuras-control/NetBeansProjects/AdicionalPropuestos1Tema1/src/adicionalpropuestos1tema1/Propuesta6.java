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
public class Propuesta6 {
    public static void main(String[] args) {
        /*
        Diseña un algoritmo que, dado un número entero, muestre por pantalla el mensaje 
            "El número es par." cuando el número sea par y el mensaje 
            "El número es impar." cuando sea impar. 
            (Una pista: un número es par si el resto de dividirlo por 2 es 0, e impar en caso contrario.)
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num = sc.nextInt();
        
        if (num%2==0)
            System.out.println("El número es par.");
        else
            System.out.println("El número es impar.");
            
    }
}
