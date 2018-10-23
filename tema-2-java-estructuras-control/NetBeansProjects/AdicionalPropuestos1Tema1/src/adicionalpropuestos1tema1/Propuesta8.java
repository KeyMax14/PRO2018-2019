/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicionalpropuestos1tema1;

import java.util.Scanner;


/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Propuesta8 {
    public static void main(String[] args) {
        /*
        Práctica 08: Diseña un algoritmo que, dados dos números enteros, muestre por pantalla uno
	de estos mensajes: "El segundo es el cuadrado exacto del primero.", "El segundo es menor
		que el cuadrado del primero." o "El segundo es mayor que el cuadrado del primero.",
		dependiendo de la verificación de la condición correspondiente al significado de cada
		mensaje.
        */
        
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos números enteros: (Separados por enter.)");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        if (num2 == num1*num1) {
            System.out.println("El segundo es el cuadrado exacto del primero.");
        }else if (num2 < num1*num1) {
            System.out.println("El segundo es menor que el cuadrado del primero.");
        }else{
            System.out.println("El segundo es mayor que el cuadrado del primero.");
        }
    }
}
