/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalVotosPartidosEscanios;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Partido {
    String nombre;
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
