/*
    Práctica 12: Completar la clase Camion con varios constructores. Uno para cuando no se
        le pasan paramentros, otro para únicamente la marca, otro con todos,… Se deberá usar la
        palabra reservada this para cada vez que nombremos un atributo en los constructores o en
        los métodos.
 */
package p12;

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
        this.marca = marca;
    }

    public Camion(String marca, String matricula) {
        this.marca = marca;
        this.matricula = matricula;
    }

    public Camion(String marca, double potencia, String matricula) {
        this.marca = marca;
        this.potencia = potencia;
        this.matricula = matricula;
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

