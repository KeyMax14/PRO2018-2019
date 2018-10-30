/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasut3;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica02 {

    public static int mcd(int dividendo, int divisor) {
        int resto;

        do {
            resto = dividendo % divisor;
            dividendo = divisor;
            divisor = resto;
        } while (resto != 0);
        return dividendo;
    }
    
    static int mcm(int a, int b){
        return (a*b)/mcd(a,b);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Cálculo de mcm para dos números");
        System.out.print("Número 1: ");
        int num1 = cin.nextInt();
        System.out.print("Número 2: ");
        int num2 = cin.nextInt();
        String solucion = "mcm: " + mcm(num1, num2);
        System.out.println(solucion);
    }

}
