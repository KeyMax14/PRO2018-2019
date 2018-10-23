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
public class Propuesta06 {
    public static void main(String[] args) {
        /*
         Diseña un algoritmo que solicite la lectura de un número entre 0 y 10 (ambos inclusive).
            Si el usuario teclea un número fuera del rango válido, el programa solicitará 
            nuevamente la introducción del valor cuantas veces sea necesario.
        */
        Scanner sc = new Scanner(System.in);
        int num;
        
        do {
            System.out.println("Introduce un número entero: [0,10]");
            num = sc.nextInt();
        } while (num < 0 && num >10);
        
    }
}
