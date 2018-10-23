/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica30;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lista de números aleatorios [10-20): ");
        char continua;
        do{
            int aleatorio = (int)(Math.random()*10)+10;
            System.out.println(aleatorio+"\n¿Continuar? [C]");
            continua = sc.next().toLowerCase().charAt(0);
        }while (continua == 'c');
    }
    
}
