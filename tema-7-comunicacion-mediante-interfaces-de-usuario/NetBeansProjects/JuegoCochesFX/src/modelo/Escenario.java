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

    public Escenario(double iniX, double iniY, double finX, double finY) {
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

    public boolean pertenece(Punto p) {
        boolean resultado = true;
        if (this.inicio.getX() > p.getX() || this.fin.getX() < p.getX()) {
            resultado = false;
        }

        if (this.inicio.getY() > p.getY() || this.fin.getY() < p.getY()) {
            resultado = false;
        }
        return resultado;
    }

    public Punto recolocarPuntoDentroDelEscenario(Punto p) {
        Punto puntoNuevo;

        if (this.inicio.getX() > p.getX()) {
            puntoNuevo = new Punto(this.inicio.getX(), p.getY());
        } else if (this.fin.getX() < p.getX()) {
            puntoNuevo = new Punto(this.fin.getX(), p.getY());
        } else if (this.inicio.getY() > p.getY()) {
            puntoNuevo = new Punto(p.getX(), this.inicio.getY());
        } else if (this.fin.getY() < p.getY()) {
            puntoNuevo = new Punto(p.getX(), this.fin.getY());
        } else {
            puntoNuevo = p;
        }

        return puntoNuevo;
    }

    public Punto puntoAleatorio() {
        Random rnd = new Random();
        Punto puntoAleatorio = new Punto(inicio.getX() + rnd.nextInt((int) fin.getX() - (int) inicio.getX() + 1),
                inicio.getY() + rnd.nextInt((int) fin.getY() - (int) inicio.getY() + 1));
        return puntoAleatorio;
    }

}
