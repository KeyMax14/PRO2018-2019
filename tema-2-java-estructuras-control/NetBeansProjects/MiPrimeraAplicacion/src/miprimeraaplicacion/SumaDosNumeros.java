/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraaplicacion;

import java.util.Scanner;

/**
 *
 * @author daw
 */
public class SumaDosNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            En el siguiente programa se solicitan dos numeros y los sume. 
        */
        int a, b, c;
        System.out.println("Introduce el primer número: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        
        System.out.println("Introduce el segundo número: ");
        b = sc.nextInt();
 
        c = a+b;
        
        System.out.println("La suma de " + a + " + " + b + " es igual a: " + c);
        
        // La concatenacion es usando el caracter +
    }
    
}
