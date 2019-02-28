/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalVotosPartidosEnClase;

import java.util.HashMap;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Partido {

    String nombre;
    String siglas;
    int votos;
    int escanios;

    public Partido(String nombre, int votos) {
        this.nombre = nombre;
        this.votos = votos;
        this.escanios = 0;
    }

    @Override
    public String toString() {
        return nombre + ":  votos=" + votos + "  Escaños=" + escanios;
    }
}

class Partido1 {

    String nombre;
    String siglas;

    public Partido1(String nombre) {
        this.nombre = nombre;
    }
}

class Resultados {

    Partido1 partido;
    int votos;
    int diputados;
}

class Elecciones {

    HashMap<String, Resultados> resultados;

    void agregarVotos(String nombre, int v) {
//        Object o = resultados.get(nombre);
//        if (o == null) {
//            o = new Object() {
//                Partido1 partido = new Partido1(nombre);
//                int votos = v;
//                int diputados;
//            };
//            resultados.put(nombre, o);
        Resultados r = resultados.get(nombre);
        if (r == null) {
            r = new Resultados();
            r.partido = new Partido1(nombre);
            r.votos = v;    
           
            resultados.put(nombre, r);
        } else {
           r.votos += v;
        }
    }

    public static void main(String[] args) {

    }
}
