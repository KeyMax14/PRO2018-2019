/*
    Práctica 21: Crear un programa que reciba dos números del usuario. Si el primer número
        no es un entero entre 1 y 100 lanzará una excepción que mostrará en pantalla “El número
        debe ser un entero entre 1 y 100”
 */
package practicasut3;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica21 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: [1,100]");
        int n1 = sc.nextInt();
        if (!(n1>0 && n1 < 101)) {
            throw new Exception("Número fuera de rango");
        }
        System.out.println("Introduce un número entero:");
        int n2 = sc.nextInt();
    }
}
