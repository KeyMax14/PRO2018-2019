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
public class Perro extends Animal{
    int dientes;

    public Perro(int dientes, String nombre, int edad, int peso) {
        super(nombre, edad, peso);
        this.dientes = dientes;
    }

}
