/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicionalpropuestos2tema1;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Propuesta03 {
    public static void main(String[] args) {
        /*
            03: Implementa un algoritmo que muestre todos los números potencia de 2 entre
		20 y 230, ambos inclusive.
        */
        System.out.println("Estos son los números potencia de 2 "
                + "que están entre 20 y 230, ambos inclusive: ");
        
        int n = 2;
        
        while (n <=230){
            if (n>=20) {
                System.out.println(n);
            }
            n *= 2;
        }
    }
}
