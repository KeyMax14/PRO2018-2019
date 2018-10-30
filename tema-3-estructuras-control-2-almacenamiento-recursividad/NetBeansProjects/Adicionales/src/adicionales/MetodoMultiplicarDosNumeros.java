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
public class MetodoMultiplicarDosNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, resultado;
        System.out.print("Introduce primer número: ");
        numero1 = sc.nextInt();
        System.out.print("Introduce segundo número: ");
        numero2 = sc.nextInt();
        resultado = multiplicar(numero1, numero2);
        System.out.println("Multiplicación: " + resultado);
    }

    public static int multiplicar(int a, int b) {
        int c;
        c = a * b;
        return c;
    }
}
