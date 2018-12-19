/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalFraccion;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) throws Exception {
        if (denominador == 0) {
            throw new Exception("No permitido valores por 0.");
        }
        
        int mcd = Fraccion.mcd(numerador,denominador);
        this.numerador = numerador/mcd;
        this.denominador = denominador/mcd;
    }

    public Fraccion(int numerador) throws Exception {
        this(numerador,1);
    }

    public Fraccion() throws Exception {
        this(0,1);
    }
    
    public static int mcd(int dividendo, int divisor){
        int resto = 1, cociente = 0;
        while (resto!=0) {
            cociente = dividendo/divisor;
            resto = dividendo%divisor;
            dividendo=divisor;
            divisor=resto;
        }
        return dividendo;
    }
    
    
    public static Fraccion suma(Fraccion fr1, Fraccion fr2) throws Exception{
        int numerador= (fr1.numerador*fr2.denominador) + (fr1.denominador*fr2.numerador);
        int denominador = fr1.denominador*fr2.denominador;
        return new Fraccion(numerador,denominador); 
    }
    
    public Fraccion suma(Fraccion fr) throws Exception{
        return suma(this, fr);
    }
    
    public Fraccion opuesto() throws Exception{
        return new Fraccion(-1*numerador, denominador);
    }
    
    public Fraccion invertir() throws Exception{
        return new Fraccion(denominador, numerador);
    }
    
    public static Fraccion resta(Fraccion fr1, Fraccion fr2) throws Exception{
        return suma(fr1, fr2.opuesto());
    }
    
    public Fraccion resta(Fraccion fr) throws Exception{
        return resta(this, fr);
    }
    
    public static Fraccion multiplicacion(Fraccion fr1, Fraccion fr2) throws Exception{
        int numerador = fr1.numerador*fr2.numerador;
        int denominador = fr1.denominador*fr2.denominador;
        return new Fraccion(numerador,denominador);
    }
    
    public Fraccion multiplicacion(Fraccion fr) throws Exception{
        return multiplicacion(this, fr);
    }
    
    public static Fraccion division(Fraccion fr1, Fraccion fr2) throws Exception{
        return multiplicacion(fr1, fr2.invertir());
    }
    
    
    
    public boolean equals(Fraccion frac) {
        return this.toDouble()==frac.toDouble(); 
    }
    
    public boolean mayorQue(Fraccion frac) {
        return this.toDouble()>frac.toDouble(); 
    }
    
    public boolean mayorIgualQue(Fraccion frac) {
        return this.toDouble()>=frac.toDouble(); 
    }
    
    public boolean menorQue(Fraccion frac) {
//        return this.toDouble()<frac.toDouble(); 
        return frac.mayorQue(this);
    }
    
    public boolean menorIgualQue(Fraccion frac) {
        return this.toDouble()<=frac.toDouble(); 
    }
    
    public double toDouble(){
        return numerador/(double)denominador;
    }
    
    @Override
    public String toString(){
        return ""+numerador+"/"+denominador;
    }
}
