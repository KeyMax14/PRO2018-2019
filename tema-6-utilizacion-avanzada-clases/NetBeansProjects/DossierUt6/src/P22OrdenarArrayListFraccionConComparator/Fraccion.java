/*
    Práctica 19: Crear la clase Fraccion con atributos: int numerador, int denominador un
        constructor que recibe los dos paramentros y otro que recibe únicamente el numerador ( el
        denominador será 1 ) con métodos: double toDouble() que devuelve el resultado de la
        división y un toString() en el formato: 3/5 donde 3 sería el numerador y 5 el
        denominador. Fraccion implementará la interfaz Ordenable los métodos: esMayorQue() …
        utilizarán la comparación de los double resultantes al hacer la división para comparar dos
        fracciones, siendo mayor una fracción si el double resultante es mayor
 */
package P22OrdenarArrayListFraccionConComparator;

import P20ArrayOrdenablePersonasFracciones.*;



/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Fraccion implements Ordenable<Fraccion>{
    int numerador;
    int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion(int numerador) {
        this(numerador,1);
    }
    
    public double toDouble(){
        return numerador/(double)denominador;
    }

    @Override
    public String toString() {
        return ""+numerador+"/"+denominador;
    }

    @Override
    public boolean esMayorQue(Fraccion elemento) {
        return this.toDouble() > elemento.toDouble();
    }

    @Override
    public boolean esMenorQue(Fraccion elemento) {
        return this.toDouble() < elemento.toDouble();
    }

    @Override
    public boolean esIgualQue(Fraccion elemento) {
        return this.toDouble() == elemento.toDouble();
    }
    
    
    
    
}
