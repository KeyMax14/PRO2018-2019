/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P23OrdenarArrayListJugadorProfesionalBaloncestoConComparator;

import P16ClaseProfesionalBaloncesto.*;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Jugador extends ProfesionalBaloncesto {

    enum Posicion {
        BASE,
        ESCOLTA,
        ALERO,
        ALAPIVOT,
        PIVOT
    }
    Posicion posicion;
    int partidosJugados;
    String equipo;

    public Jugador(Posicion posicion, int partidosJugados, String equipo, String nombre, String apellidos, int edad, double ingresosAnuales, int numeroFederado) throws Exception {
        super(nombre, apellidos, edad, ingresosAnuales, numeroFederado);
        this.posicion = posicion;
        this.partidosJugados = partidosJugados;
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Posicion:" + posicion + ", Partidos jugados: " + partidosJugados + ", Equipo: " + equipo;
    }

}
