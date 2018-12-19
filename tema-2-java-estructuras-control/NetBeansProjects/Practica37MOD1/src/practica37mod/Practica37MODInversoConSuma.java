/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica37mod;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica37MODInversoConSuma {
        public static void main(String[] args) {
        /*
         MOD: Se pide una cuantia total, y tenemos que dividirlos en los billetes mas grandes
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad de dinero que quieres cambiar: ");
        int cantidad = sc.nextInt();
        int numBilletes = 0;
        for (int i = 100; i >= 1; i /= 10) {
            for (int j = 5; j >= 1; j /= 2) {
                int billete = i * j;
                if (cantidad >= billete) {
                    while (cantidad >= billete){
                        numBilletes++;
                        cantidad -= billete;
                    }
                    System.out.println(billete+" = "+numBilletes);
                    numBilletes = 0;
                }
            }

        }
    }
}
