/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P17InterfaceOrdenable;

import P12ClasePersonaAbstracta.*;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Hombre extends Persona{

    public Hombre(String nombre, String apellido1, String apellido2, int edad, int altura, double peso) {
        super(nombre, apellido1, apellido2, edad, altura, peso);
    }

    @Override
    protected double pesoIdeal() {
        // A – 100 – [ ( A – 150 ) / 4 ] + [ ( E – 20 ) / k ]
        return altura - 100 -(( altura -150 ) / (double)4) +(( edad - 20 ) / (double)4) ;
    }

    @Override
    public String toString() {
        return super.toString()+" Peso ideal: "+this.pesoIdeal();
    }



    
    
    
    
}
