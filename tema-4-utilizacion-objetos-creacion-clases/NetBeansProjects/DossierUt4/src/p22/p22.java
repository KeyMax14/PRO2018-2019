/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p22;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class p22 {

    public static void main(String[] args) {
        Complejo c1 = new Complejo(2, 4);
        Complejo c2 = new Complejo(6, 2);
        Complejo c1Por10 = c1.multiplicar(10);
        Complejo c1Porc2 = c1.multiplicar(c2);
        System.out.println(c1Por10.mostrar());
        System.out.println(c1Porc2.mostrar());
    }
}
