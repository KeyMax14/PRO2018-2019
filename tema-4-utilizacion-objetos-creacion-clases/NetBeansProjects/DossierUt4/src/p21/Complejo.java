/*
    Práctica 21: continuar desarrollando la clase Complejo. Ahora tendrá un método mostrar()
        que devolverá una String representando el número. Y dos métodos: sumar(double)
        sumar(Complejo) que devolverán el complejo correspondiente a la suma
        Nota: la suma de dos números complejos es sumar sus partes reales por un lado y por otro
        sus partes imaginarias
        Ej.
        Complejo c1 = new Complejo(2,0);
        Complejo c2 = new Complejo(0,2);
        Complejo c1mas10 = c1.sumar(10);
        Complejo c1masc2 = c1.sumar(c2);
 */
package p21;



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
    
    // Mod p16
    
    public Complejo(Complejo otroComplejo){
        this.real = otroComplejo.real;
        this.imag = otroComplejo.imag;
    }

    public Complejo() {
        this(0,0);
    }
    
    public String mostrar(){
        return ""+real+", "+imag+"i";
    }
    
    public Complejo sumar(double real){
        return new Complejo(this.real+real,this.imag);
    }
        // Nota: Si se modifica el propio complejo, se podría devolver usando return this;
    public Complejo sumar(Complejo complejo){
        return new Complejo(this.real+complejo.real, this.imag+complejo.imag);
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
