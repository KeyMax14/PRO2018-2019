/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica44;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica44EnClase {

    public static void main(String[] args) {
        System.out.println("Escribe un número del 1 al 20 y ya verás..");
        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();

        double potenciaGenerada;

        if (base >= 1 && base <= 20) {
            System.out.println("El número no esta entre 1 y 20.");
        } else {
            for (int potencia = 0; potencia < 6; potencia++) {
                System.out.print(base + "^" + potencia + "= ");
                potenciaGenerada = Math.pow(base, potencia);
                System.out.println(potenciaGenerada);
            }
        }
    }
}
