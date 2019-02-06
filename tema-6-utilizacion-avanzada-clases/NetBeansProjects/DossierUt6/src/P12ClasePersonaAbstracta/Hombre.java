/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P12ClasePersonaAbstracta;

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
        return altura - 100 - ( (100 - 150)/4 );
    }

    @Override
    public String toString() {
        return super.toString()+" "+this.pesoIdeal();
    }
    
    
    
}
