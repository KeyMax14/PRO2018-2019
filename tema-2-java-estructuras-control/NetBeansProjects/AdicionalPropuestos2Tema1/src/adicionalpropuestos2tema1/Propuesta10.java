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
public class Propuesta10 {
    public static void main(String[] args) {
        /*
            Escribe un programa que muestre los números pares que hay entre 
                dos números que introduzca el usuario por teclado.
        */
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos números enteros: ");
        n = sc.nextInt();
        m = sc.nextInt();
        
        if (n > m) {
            int temp = n;
            n = m;
            m = temp;
        }
        System.out.println("\nEstos son los números pares entres ambos: ");
        for (int i = n; i <= m; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }
    }
}
