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

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class ProfesionalBaloncesto {
    String nombre;
    String apellidos;
    int edad;
    double ingresosAnuales;
    int numeroFederado;

    public ProfesionalBaloncesto(String nombre, String apellidos, int edad, double ingresosAnuales, int numeroFederado) throws Exception {
        this.nombre = nombre;
        this.apellidos = apellidos;
        if (edad<0) {
            throw new Exception("Edad negativa.");
        }
        this.edad = edad;
        if (ingresosAnuales<0.0) {
            throw new Exception("Ingresos negativos.");
        }
        this.ingresosAnuales = ingresosAnuales;
        this.numeroFederado = numeroFederado;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos + " Edad:" + edad + ", IngresosAnuales:" + ingresosAnuales + ", NumeroFederado:" + numeroFederado;
    }
    
    
    
    
}
