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
public class Propuesta16 {
    public static void main(String[] args) {
        /*
        
 16. Haz un algoritmo que vaya leyendo números y mostrándolos por pantalla hasta que el usuario introduzca un número negativo. 
 En ese momento, el algoritmo mostrará un mensaje de despedida y finalizará su ejecución.
        */
        Scanner sc = new Scanner(System.in);
        int num;
        String numCad="";
        System.out.println("Intro nums: (Para salir introduce un número negativo)");
        do {
            System.out.println(numCad);
            num = sc.nextInt();
            numCad += num +" ";
        } while (num >=0);
        System.out.println("Hasta luego.");
        
    }
}
