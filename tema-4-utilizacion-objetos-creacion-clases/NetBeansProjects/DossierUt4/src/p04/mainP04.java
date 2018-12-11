/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p04;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class mainP04 {
    public static void main(String[] args) {
        Conversor c = new Conversor(0);
        System.out.println(c.dolarToEuro(25));
        c.establecerTipo(0.88);
        System.out.println(c.dolarToEuro(25));
    }
}
