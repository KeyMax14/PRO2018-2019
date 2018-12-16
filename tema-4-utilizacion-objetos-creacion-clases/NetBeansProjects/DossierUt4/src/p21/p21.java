/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p21;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class p21 {

    public static void main(String[] args) {
        Complejo c1 = new Complejo(2, 0);
        Complejo c2 = new Complejo(0, 2);
        Complejo c1mas10 = c1.sumar(10);
        Complejo c1masc2 = c1.sumar(c2);
        System.out.println(c1mas10.mostrar());
        System.out.println(c1masc2.mostrar());
    }
}
