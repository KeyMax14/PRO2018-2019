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
public class Propuesta4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Calcula el area de un cuadrado (lado x lado.) 
        */
        System.out.println("Introduce un lado del cuadrado");
        Scanner sc = new Scanner(System.in);
        int lado = sc.nextInt();
        
        int area;
        area = lado * lado;
        int perimetro = lado*4;
        
        System.out.println("El área del cuadrado es: " + area);
        System.out.println("El perimetro del cuadrado es: " + perimetro);
    }
    
}
