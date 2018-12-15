/*
    Práctica 14: Modifica la clase Camion de la práctica 12 de tal forma que los diferentes
        constructores se apoyen en uno solo haciendo uso de: this()
 */
package p14;

import p12.*;

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
        this(marca,null);
    }

    public Camion(String marca, String matricula) {
        this(marca,0,matricula);
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

