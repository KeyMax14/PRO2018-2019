/*
    Práctica 8: Tomando la clase Coche con atributos marca, modelo, potencia, puertas,
        matricula Crear la clase CocheSEAT Los modelos de esta marca siempre empezarán por
        “se-” agregando ese texto siempre al modelo que se le pase al constructor o al setter ( salvo
        que ya se le esté pasando, cosa que se debe validar )
        Observar que el atributo marca en coche no tiene mucho sentido que sea heredado por
        CocheSEAT
 */
package P08CocheModCocheSeat;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class CocheSeat extends Coche{
    final String marca= "SEAT";
    public CocheSeat(String modelo, double potencia, int puertas, String matricula) {
        super("SEAT", modelo, potencia, puertas, matricula);
        if (!this.modelo.matches("^se-(.)*$")) {
            this.modelo = "se-"+this.modelo;
        }
    }
    
}
