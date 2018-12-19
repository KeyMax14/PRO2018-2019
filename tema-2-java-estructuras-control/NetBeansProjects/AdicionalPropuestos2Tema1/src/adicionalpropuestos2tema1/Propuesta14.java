/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicionalpropuestos2tema1;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Propuesta14 {
    public static void main(String[] args) {
        /*
             14. Haz un algoritmo que calcule el máximo común divisor (mcd) de 
             dos enteros positivos. 
                El mcd es el número más grande que divide exactamente a ambos números.
        */
        Scanner sc = new Scanner(System.in);
        int dividendo, divisor, cociente, resto;
        
        System.out.println("Introduce el 1er número: ");
        dividendo = sc.nextInt();
        System.out.println("Introduce el 2do número: ");
        divisor = sc.nextInt();
        
        do {
            cociente = dividendo/divisor;
            
            resto = dividendo%divisor;
            dividendo = divisor;
            divisor = resto;
        } while (resto != 0);
        
        System.out.println("El MCD es: "+dividendo);
        
    }
}
