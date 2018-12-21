/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p30;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class PruebasMain {
    public static void main(String[] args) {
        Punto p1 = new Punto(3, 2);
        Punto p2 = new Punto(6, 4);
        
        VectorLibre vConstruct1 = new VectorLibre(p1, p2);
        VectorLibre vConstruct2 = new VectorLibre(p2);
        
        System.out.println(vConstruct1);
        System.out.println(vConstruct2);
        
        // Operaciones de prueba.
        System.out.println("\nMódulo: ");
        System.out.println(vConstruct1.modulo());
        
        System.out.println("\nMultiplicación: ");
        System.out.println(vConstruct1.multiplicar(2));
        
        System.out.println("\nDivisión: ");
        System.out.println(vConstruct1.division(2));
        
        
        System.out.println("\nNormalización: ");
        System.out.println(vConstruct1.normalizacion());
        
        System.out.println("\nOpuesto: ");
        System.out.println(vConstruct1.opuesto());
        
        System.out.println("\nSuma: ");
        System.out.println(vConstruct1.suma(vConstruct2));

        System.out.println("\nResta: ");
        System.out.println(vConstruct1.resta(vConstruct2));
        
        System.out.println("\nequals():");
        
        // En este caso son distintos.
        System.out.println((vConstruct1.equals(vConstruct2)?"Es igual.":"No es igual."));
        
        // En este caso son iguales.
        System.out.println((vConstruct1.equals(new VectorLibre(p1))?"Es igual.":"No es igual."));
        
        
    }
}
