/*
    Práctica 28: Crear para todos los métodos creados en la clase Complejo documentación
        javadoc de los parámetros, lo que devuelve y lo que hace el método

        Es la misma que la 29 en el dossier.
 */
package p28_29;



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
    /**
     * Método que sirve para mostrar el número complejo. 
     * Similar al método toString().
     * @return Devuelve un String con el formato (n_real), (n_complejo)i.
     */
    public String mostrar() {
        return "" + real + ", " + imag + "i";
    }
    
    /**
     * Método que sirve para sumar un número real con un número complejo.
     * @param real Será un double, este se sumara a la parte real del complejo.
     * @return Devuelve un objeto Complejo, el resultante tras sumar el número real.
     */
    public Complejo sumar(double real) {
        return new Complejo(this.real + real, this.imag);
    }
    // Nota: Si se modifica el propio complejo, se podría devolver usando return this;
    /**
     * Método que sirve para sumar un número complejo con otro.
     * @param complejo complejo que se sumará con el complejo actual.
     * @return Devuelve un complejo, que será la suma de las partes reales y las partes imaginarias
     * de ambos complejos respectivamente.
     */
    public Complejo sumar(Complejo complejo) {
        return new Complejo(this.real + complejo.real, this.imag + complejo.imag);
    }
    /**
     * Método que sirve para multiplicar un número real por un número complejo.
     * @param real double que se multiplicara por la parte real e imaginaria simultaneamente.
     * @return Devuelve un complejo, el resultante de realizar la operación.
     */
    public Complejo multiplicar(double real) {
        return new Complejo(this.real * real, this.imag * real);
    }
    /**
     * Método que sirve para multiplicar un complejo por otro. Esta operación sigue la formula.
     * Multiplicar dos números complejos c1(m,n) * c2(o,p)
     * parte real: m*o – n*p
     * parte imaginaria: m*o + n*p
     * @param complejo complejo que se multiplicara por el complejo de la instancia.
     * @return Devuelve un complejo, el resultante de realizar la operación de multiplicacion entre dos complejos.
     * 
     */
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
