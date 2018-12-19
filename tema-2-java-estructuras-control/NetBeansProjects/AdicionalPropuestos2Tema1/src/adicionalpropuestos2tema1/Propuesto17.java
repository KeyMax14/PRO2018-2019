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
public class Propuesto17 {
    public static void main(String[] args) {
        /*
             17. Haz un algoritmo que vaya leyendo números hasta que el usuario introduzca un número negativo. 
                En ese momento, el algoritmo mostrará por pantalla el número mayor de cuantos ha visto
        */
        Scanner sc = new Scanner(System.in);
        int num, max;
        System.out.println("Intro número entero: (PAra salir que sea negativo)");
        num = sc.nextInt();
        max = num;
        
        while (num >= 0) {
            System.out.println("Intro next num: ");
            num=sc.nextInt();
            if (num > max) {
                max = num;
            }
        }
        
        System.out.println("El mayor número introducido es "+max+".");
    }
}
