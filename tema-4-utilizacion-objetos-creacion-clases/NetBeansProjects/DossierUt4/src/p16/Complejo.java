/*
    Práctica 16: Crear un constructor de copia para la clase Camion de la práctica 14 y un
        constructor de copia para la clase Complejo de la práctica 15
 */
package p16;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Complejo {

    private double real;
    private double imag;

    public Complejo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complejo(double real) {
        this(real, 0);
    }

    // Mod p16
    public Complejo(Complejo otroComplejo) {
        this.real = otroComplejo.real;
        this.imag = otroComplejo.imag;
    }

    public Complejo() {
        this(0, 0);
    }

    // Mod p24 - toString
    @Override
    public String toString() {
        return real + ", " + imag + "i";
    }

    public String mostrarNum() {
        return real + ", " + imag + "i";
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
}
