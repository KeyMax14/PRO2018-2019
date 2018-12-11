/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia11_12;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class usoDeClase {
    public static void main(String[] args) {
        Persona p = new Persona("Adan","Mar",35);
//        p.setEdad(-4);
//        System.out.println(p.getEdad());
//        p.mostrarInfo();
        System.out.println(p.mostrarInfo());
        Persona.inicio();
    }
}
