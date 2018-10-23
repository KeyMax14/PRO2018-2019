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
public class Propuesta9 {
    public static void main(String[] args) {
            /*        
            9: Diseña un algoritmo que, dados cinco números enteros, determine cuál de los
		cuatro últimos números es más cercano al primero. (Por ejemplo, si el usuario introduce los
			números 2, 6, 4, 1 y 10, el programa responderá que el número más cercano al 2 es el 1.)
            */
        int n1,n2,distancia,min,dmin;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el 1º número: ");
        n1 = sc.nextInt();
        
        System.out.println("Introduzca el 2º número:");
        n2 = sc.nextInt();
        dmin = Math.abs(n2-n1);
        min = n2;
        
        for (int i = 3; i < 6; i++) {
            System.out.println("Introduzca el "+i+"º número:");
            n2 = sc.nextInt();
            distancia = Math.abs(n2-n1);
            if (dmin > distancia) {
                dmin = distancia;
                min = n2;
            }
        }
        
        System.out.println("El número más cercano a "+n1+" es "+min+","
                + " con una distancia de "+dmin+ ".");
    }
}
