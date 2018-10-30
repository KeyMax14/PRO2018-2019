/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicionales;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class MenuMultiplicarSumarRestar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, resultado=0;

        System.out.print("Introduce primer número: ");
        numero1 = sc.nextInt();
        System.out.print("Introduce segundo número: ");
        numero2 = sc.nextInt();
        
        
        System.out.println("*****************");
        System.out.println("****  Menu  *****");
        System.out.println("*****************");
        System.out.println("1)Sumar\n2)Multiplicar\n3)Restar");
        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                resultado = sumar(numero1, numero2);
                System.out.println("Suma: " + resultado);
                break;        
            case 2:
                resultado = multiplicar(numero1, numero2);
                System.out.println("Multiplicación: " + resultado);
                break;
            case 3:
                resultado = restar(numero1, numero2);
                System.out.println("Resta: " + resultado);
                break;
        }
        
        
    }

    public static int multiplicar(int a, int b) {
        int c;
        c = a * b;
        return c;
    }
    public static int sumar(int a, int b) {
        int c;
        c = a + b;
        return c;
    }
    public static int restar(int a, int b) {
        int c;
        c = a - b;
        return c;
    }
}
