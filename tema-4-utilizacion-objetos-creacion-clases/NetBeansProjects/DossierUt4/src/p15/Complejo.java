/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        this(real,0);
    }

    public Complejo() {
        this(0,0);
    }
    
    public String mostrarNum(){
        return real+", "+imag+"i";
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
