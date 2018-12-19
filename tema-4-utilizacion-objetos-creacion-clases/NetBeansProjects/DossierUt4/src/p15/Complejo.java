/*
    Práctica 15: Crea la clase Complejo que sirva para utilizar números complejos. Estos
        números disponen de una parte real y una parte imaginaria ( atritubos double real, double
        imag ) Dispondrá de tres constructores:
        Complejo(double real, double imag)
        Complejo(double real) → aquí se establecerá la parte imaginaria a 0
        Complejo() → aquí se establecerán tanto la parte real como la imaginaria a 0
 */
package p15;

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
