/*
    Práctica 23: Crear un ArrayList con objetos Jugador (práctica 16) y ordenarlos utilizando
        una clase anónima que implemente Comparator<Jugador> la comparación será mediante el
        atributo partidosJugados
 */
package P23OrdenarArrayListJugadorProfesionalBaloncestoConComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P23Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador(Jugador.Posicion.ALERO, 20, "Phoenix Suns", "Juan", "1", 18, 10000, 1));
        jugadores.add(new Jugador(Jugador.Posicion.BASE, 10, "Phoenix Suns", "Jose", "2", 18, 10000, 2));
        jugadores.add(new Jugador(Jugador.Posicion.ESCOLTA, 1, "Phoenix Suns", "Pepe", "3", 18, 10000, 3));
        jugadores.add(new Jugador(Jugador.Posicion.PIVOT, 50, "Phoenix Suns", "Alfredo", "4", 18, 10000, 4));
        
        Comparator<Jugador> cm = new Comparator<Jugador>() {
            @Override
            public int compare(Jugador j1, Jugador j2) {
                return Integer.compare(j1.partidosJugados, j2.partidosJugados);
            }
        };
        
        Collections.sort(jugadores, cm);
        
        for (Jugador jugador : jugadores) {
            System.out.println(jugador);
        }
        
    }
}
