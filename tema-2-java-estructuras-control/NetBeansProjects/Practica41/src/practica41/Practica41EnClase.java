/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica41;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica41EnClase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una palabra: ");
        
        String palabra = sc.nextLine();
        String resultado = "";
        for (int i = 0; i < palabra.length(); i++) {
            String letra = palabra.substring(i,i+1);
            
            resultado = letra + resultado;
        }
        System.out.println(resultado);

    }
}
