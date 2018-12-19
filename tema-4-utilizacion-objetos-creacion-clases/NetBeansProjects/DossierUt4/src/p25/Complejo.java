/*
    Práctica 25: crear el método boolean equals(Complejo) para la clase Complejo Que
        determinará que son iguales si las partes reales son iguales y las partes imaginarias son
        iguales.
 */
package p25;

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

    public String mostrar() {
        return "" + real + ", " + imag + "i";
    }

    public Complejo sumar(double real) {
        return new Complejo(this.real + real, this.imag);
    }
    // Nota: Si se modifica el propio complejo, se podría devolver usando return this;

    public Complejo sumar(Complejo complejo) {
        return new Complejo(this.real + complejo.real, this.imag + complejo.imag);
    }

    public Complejo multiplicar(double real) {
        return new Complejo(this.real * real, this.imag * real);
    }

    public Complejo multiplicar(Complejo complejo) {
        double real = this.real * complejo.real - this.imag * complejo.imag;
        double imag = this.real * complejo.real + this.imag * complejo.imag;
        return new Complejo(real, imag);
    }

    // Mod p25
    public boolean equals(Complejo comp) {
        return ((this.imag == comp.imag) && (this.real == comp.real));
    }

//    public double getReal() {
//        return real;
//    }
//
//    public void setReal(double real) {
//        this.real = real;
//    }
//
//    public double getImag() {
//        return imag;
//    }
//
//    public void setImag(double imag) {
//        this.imag = imag;
//    }
}
