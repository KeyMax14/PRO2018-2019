/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p06;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class p06main {

    public static void main(String[] args) {
        Conversor objeto1 = new Conversor();
        Conversor objeto2 = new Conversor(0.89);
        
        System.out.println(objeto1.dolarToEuro(20));
        System.out.println(objeto2.euroToDolar(30));
    }

}
