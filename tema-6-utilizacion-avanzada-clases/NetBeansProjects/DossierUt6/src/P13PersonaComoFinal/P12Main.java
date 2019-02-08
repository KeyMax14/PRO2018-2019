/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P13PersonaComoFinal;


/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P12Main {
    public static void main(String[] args) {
        Hombre h = new Hombre("Hombre", "Macho", "Macho", 18, 175, 73);
        Mujer m = new Mujer("Mujer", "Hembra", "Hembra", 20, 180, 60);
        
        System.out.println(m);
        System.out.println(h);
    }
}
