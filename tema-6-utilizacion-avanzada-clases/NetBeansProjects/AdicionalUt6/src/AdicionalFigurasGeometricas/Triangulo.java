/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalFigurasGeometricas;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Triangulo extends FigurasGeometricas{
    double base;
    double altura;

    public Triangulo(double base, double altura) {
        super(3, (base*altura)/2.0);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo: " + "base=" + base + ", altura=" + altura + " "+super.toString();
    }
    
    

    

    
}
