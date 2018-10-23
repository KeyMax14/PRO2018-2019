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
public class Propuesta5 {
    public static void main(String[] args) {
        /*
            Diseña un algoritmo que pida el valor de los dos lados de un 
                rectángulo y muestre el valor de su perímetro y el de su área.
        */
        System.out.println("Introduce el primer lado del rectangulo: ");
        Scanner sc = new Scanner(System.in);
        int lado1 = sc.nextInt();
        System.out.println("Introduce el segundo lado del rectangulo: ");
        int lado2 = sc.nextInt();
        
        int area;
        area = lado1*lado2;
        int perimetro = (lado1*2)+(lado2*2);
        
        System.out.println("El área del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }
}
