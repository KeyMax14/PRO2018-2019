/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.HashSet;
import java.util.Random;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Escenario {

    Punto inicio;
    Punto fin;
    public HashSet<Posicionable> vehiculos;

    // Quizas mejor el hashSet
//    ArrayList<Coche> coches;
    public Escenario(Punto inicio, Punto fin) {
        this.inicio = inicio;
        this.fin = fin;
        vehiculos = new HashSet<>();
    }
    
    public Escenario(double iniX, double iniY, double finX, double finY){
        this(new Punto(iniX, iniY), new Punto(finX, finY));
    }

    public Escenario() {
        this(new Punto(0, 0), new Punto(0, 0));
    }

    public void set(Punto inicio, Punto fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    public void set(double iniX, double iniY, double finX, double finY) {
        set(new Punto(iniX, iniY), new Punto(finX, finY));
    }

    public boolean hayChoque(Posicionable vehiculo, double distancia) {
        boolean resultado = false;
        if (vehiculos.stream()
                .map(p -> (Posicionable) p)
                .filter(p -> !p.equals(vehiculo))
                .anyMatch(p -> {
                    
                    return p.getPosicion().distancia(vehiculo.getPosicion()) < distancia;
                })) {
            resultado = true;
        }
        return resultado;
    }

    public Punto puntoAleatorio() {
        Random rnd = new Random();
        Punto puntoAleatorio = new Punto(inicio.getX() + rnd.nextInt((int) fin.getX() - (int) inicio.getX() + 1),
                 inicio.getY() + rnd.nextInt((int) fin.getY() - (int) inicio.getY() + 1));
        return puntoAleatorio;
    }

}
