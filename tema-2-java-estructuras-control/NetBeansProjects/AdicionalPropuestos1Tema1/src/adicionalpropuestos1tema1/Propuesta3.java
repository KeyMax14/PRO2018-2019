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
public class Propuesta3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Calcula el area de un triangulo (Base por altura partido de dos.) 
        */
        System.out.println("Introduce la base del triangulo");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        System.out.println("Introduce la altura del triangulo: ");
        int altura = sc.nextInt();
        
        double area;
        area = base*altura/2.0;
        
        System.out.println("El área del triangulo es: " + area);
    }
    
}
