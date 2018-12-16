/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p20Falta;



/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class p20 {
    public static void main(String[] args) throws Exception {
        Reloj re = new Reloj(20, 61, 25);
        System.out.println(re.mostrar());
        re.agregarSegundos(6000);
        System.out.println(re.mostrar());
        
    }
}
