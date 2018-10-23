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
public class Propuesta02 {
    public static void main(String[] args) {
        /*
            02: Implementa un algoritmo que muestre todos los múltiplos de n entre n y m·n,
                    ambos inclusive, donde n y m son números introducidos por el usuario.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe dos números enteros: (Separados por enter.)");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Estos son los multiplos de "+ n+" desde "+n+" a "+(n*m)+".");
        
        // Primer método
        
        for (int i = n; i <= n*m; i+=n) {
            System.out.println(i);
        }
        
        // Segundo método
        
//        for (int i = 1; i <= m ; i++) {
//            System.out.println(i*n);
//        }
    }
}
