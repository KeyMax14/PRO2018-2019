/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalPersonaPolimorfismo;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class MainPersonaPolimorfismo {
    public static void main(String[] args) {
        Hombre h = new Hombre("Hombre", "Macho", "Macho", 18, 175, 73);
        Mujer m = new Mujer("Mujer", "Hembra", "Hembra", 20, 180, 60);
        
        
        Persona personas[] = new Persona[5];
        personas[0] = new Hombre("Pepe", "Alvarez", "J", 30, 180, 78);
        personas[1] = new Mujer("Juana", "Alvarez", "J", 30, 180, 78);
        personas[2] = new Hombre("Juan", "Alvarez", "J", 30, 180, 78);
        personas[3] = h;
        personas[4] = m;
        
        for (Persona persona : personas) {
            System.out.println(persona);
        }
//        System.out.println(m);
//        System.out.println(h);
    }
}
