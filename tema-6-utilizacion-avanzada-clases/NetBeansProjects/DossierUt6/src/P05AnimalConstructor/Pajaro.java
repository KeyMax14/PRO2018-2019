/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P05AnimalConstructor;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Pajaro extends Animal{
    double ala;

    public Pajaro(double ala, String nombre, int edad, int peso) {
        super(nombre, edad, peso);
        this.ala = ala;
    }
    
}
