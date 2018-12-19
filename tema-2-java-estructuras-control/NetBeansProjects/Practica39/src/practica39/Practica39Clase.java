/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica39;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica39Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        do {
            System.out.println("Introduce un número entero: [10,99] ");
            num = sc.nextInt();
            if (!(num>9 && num <100)) {
                System.out.println("No esta dentro del intervalo.");
            }
        } while (!(num>9 && num <100));
        
        int cifra0 = num %10; // en 19 = 9
        int cifra1 = num /10; // en 19 = 1
        
        int nuevoNum = cifra0 *10;
        nuevoNum += cifra1;
        
        System.out.println(nuevoNum);
        
    }
    
}
