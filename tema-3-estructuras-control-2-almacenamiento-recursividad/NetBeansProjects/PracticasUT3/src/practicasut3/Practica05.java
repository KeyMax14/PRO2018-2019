/*
Práctica 5: Crear un método llamado factorial() que obtenga el factorial de un número.
Hacer uso de él en un programa que el usuario introduzca por teclado un número y se le
muestre el factorial de ese número
 */
package practicasut3;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica05 {

    public static double factorial(int num) {
        double resultado = 1;
        for (int i = num; i > 0; i--) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Intro num: ");
        int num = sc.nextInt();
        double resultado = factorial(num);
        System.out.println("Factorial: "+resultado);
    }
}
