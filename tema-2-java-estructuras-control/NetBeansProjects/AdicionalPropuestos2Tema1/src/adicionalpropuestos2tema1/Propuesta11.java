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
public class Propuesta11 {
    public static void main(String[] args) {
        /*
            Haz un algoritmo que pida el valor de dos enteros n y m y que muestre
                por pantalla el valor del sumatorio desde i=n hasta m de i.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Intro 1er num: ");
        int n = sc.nextInt();
        System.out.println("Intro 2do num: ");
        int m = sc.nextInt();
        
        if (n > m) {
            int temp = n;
            n = m;
            m = temp;
        }
        
        int acumulador = 0;
        
        for (int i = n; i <= m; i++) {
            acumulador += i;
        }
        
        System.out.println("El sumatorio es igual a "+acumulador+".");
    }
}
