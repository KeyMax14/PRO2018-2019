/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalFraccion;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class fraccionMain {
    public static void main(String[] args) {
        Fraccion fr1 = new Fraccion(1, 3);
        Fraccion fr2 = new Fraccion(1, 2);
        
        Fraccion suma = Fraccion.suma(fr1, fr2);
        Fraccion resta = Fraccion.resta(fr1, fr2);
        Fraccion multi = Fraccion.multiplicacion(fr1, fr2);
        
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multi);
        
        
    }
}
