/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicionalpropuestos1tema1;

import java.util.Scanner;

/**
 *
 * @author daw
 */
public class Propuesta2 {
    public static void main(String[] args) {
        /*
        Práctica 03: Realizar un algoritmo que sirva para convertir pulgadas a centímetros.
        (Recuerda que 1 pulgada = 2.54 centímetros). ( utilizar una variable llamada pulgada )
        */
        
        final double pulgada = 2.54;
        
        System.out.println("Introduce el valor que deseas pasar a pulgadas: ");
        Scanner sc = new Scanner(System.in);
        double cantidad = sc.nextDouble();
        
        double resultado = cantidad * pulgada;
        
        System.out.println("El resultado es " + resultado + " pulgadas.");
        
        
    }
}
