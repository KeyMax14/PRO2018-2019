/*
    Práctica 16: Crear la clase ProfesionalBaloncesto que representa a cualesquier profesional
        de baloncesto. Así tiene como atributos: nombre, apellidos, edad, ingresosAnuales,
        numeroFederado, con un constructor como mínimo y un toString()
        La clase Jugador que extiende a ProfesionalBaloncesto con atributos propios: posición
        ( enum para base, pivot,.. ) , partidosJugados , equipo
        La clase Entrenador que extiende a ProfesionalBaloncesto con atributos propios:
        porcentajeVictorias ( un número de 0 a 100)
        La clase Arbitro que extiende a ProfesionalBaloncesto con atributos propios:
        int faltasPitadas
        Todos los datos de los atributos propios hacen referencia a una temporada completa
        Poner en una LinkedList de tipo ProfesionalBaloncesto objetos de tipo Jugador, Entrenador,
        Arbitro. Recorrer la lista y mostrar únicamente los atributos propios de la clase de cada
        objeto ( no los atributos comunes con la superclase)
 */
package P16ClaseProfesionalBaloncesto;

import java.util.LinkedList;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P16Main {
    public static void main(String[] args) throws Exception {
        LinkedList<ProfesionalBaloncesto> pBaloncesto = new LinkedList<>();
        
        pBaloncesto.add(new Jugador(Jugador.Posicion.PIVOT, 15, "Spurs", "Juan", "Lopez", 20, 2000.0, 15));
        pBaloncesto.add(new Jugador(Jugador.Posicion.ALERO, 18, "Rockets", "Miguel", "Alvarez", 25, 200000.0, 16));
        pBaloncesto.add(new Entrenador(99, "Joan", "SSS", 42, 200000.0, 1));
        pBaloncesto.add(new Entrenador(15, "Malo", "FFF", 36, 89.0, 2));
        pBaloncesto.add(new Arbitro(900, "Pepe", "Pepal", 24, 20000.0, 8945));
        pBaloncesto.add(new Arbitro(2, "Pepo", "Pepal", 26, 20000.0, 89555));
        
        for (ProfesionalBaloncesto profesionalBaloncesto : pBaloncesto) {
            if (profesionalBaloncesto instanceof Arbitro) {
                System.out.println("Faltas pitadas: "+((Arbitro) profesionalBaloncesto).faltasPitadas);
            }else if (profesionalBaloncesto instanceof Jugador){
                int pJugados = ((Jugador) profesionalBaloncesto).partidosJugados;
                String equipo = ((Jugador) profesionalBaloncesto).equipo;
                String posicion = ""+((Jugador) profesionalBaloncesto).posicion;
                System.out.println("Partidos jugados: "+pJugados+" Equipo: "+equipo+" Posición: "+posicion);
            }else if (profesionalBaloncesto instanceof Entrenador) {
                System.out.println("Porcentaje de victorias: "+((Entrenador) profesionalBaloncesto).porcentajeVictorias);
            }
        }
        
        /*
            Entiendo que esta práctica esta hecha para realizarse así, 
            sin embargo seria más fácil sobrescribir los métodos toString.
        */
    }
}
