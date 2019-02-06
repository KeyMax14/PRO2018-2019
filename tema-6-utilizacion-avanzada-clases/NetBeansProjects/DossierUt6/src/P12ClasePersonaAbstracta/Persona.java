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
public abstract class Persona {
    String nombre;
    String apellido1;
    String apellido2;
    int edad;
    int altura;
    double peso;

    public Persona(String nombre, String apellido1, String apellido2, int edad, int altura, double peso) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }
    
    protected double calcularIMC(){
        return this.peso/(Math.pow(altura/(double)100, 2));
    }
    
    protected abstract double pesoIdeal();

    @Override
    public String toString() {
        return nombre + " " + apellido1 + " " + apellido2 + ", Edad:" + edad + " años, Altura:" + altura + " cm, Peso:" + peso;
    }
    
    
    
    
}
