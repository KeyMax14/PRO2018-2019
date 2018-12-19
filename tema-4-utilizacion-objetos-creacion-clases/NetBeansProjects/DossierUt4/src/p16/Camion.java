/*
    Práctica 16: Crear un constructor de copia para la clase Camion de la práctica 14 y un
        constructor de copia para la clase Complejo de la práctica 15
 */
package p16;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Camion {

    private String marca;
    private double potencia;
    private String matricula;

    public Camion() {
    }

    public Camion(String marca) {
        this(marca, null);
    }

    public Camion(String marca, String matricula) {
        this(marca, 0, matricula);
    }

    // Mod p16
    public Camion(Camion otroCamion) {
        marca = otroCamion.marca;
        potencia = otroCamion.potencia;
        matricula = otroCamion.matricula;
    }

    public Camion(String marca, double potencia, String matricula) {
        this.marca = marca;
        this.potencia = potencia;
        this.matricula = matricula;
    }

    // Mod p24 - toString
    @Override
    public String toString() {
        return "Marca: " + marca + " Potencia: " + potencia + " Matricula: " + matricula;
    }

    public String getMatricula() {
        return this.matricula; // return matricula; valdria tambien
    }

    public void setMatricula(String matricula) {
        //como matricula es un parametro que recibe el método se puede confundir
        //con el atributo matricula. Aqui es necesario this para diferenciar
        this.matricula = matricula;
    }
}
