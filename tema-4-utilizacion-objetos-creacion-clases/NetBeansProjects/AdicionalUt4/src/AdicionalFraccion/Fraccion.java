/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalFraccion;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion(int numerador) {
        this(numerador,1);
    }

    public Fraccion() {
        this(0,1);
    }
    
    
    public boolean equals(Fraccion frac) {
        return this.toDouble()==frac.toDouble(); 
    }
    
    public double toDouble(){
        return numerador/(double)denominador;
    }
    
    @Override
    public String toString(){
        return ""+numerador+"/"+denominador;
    }
}
