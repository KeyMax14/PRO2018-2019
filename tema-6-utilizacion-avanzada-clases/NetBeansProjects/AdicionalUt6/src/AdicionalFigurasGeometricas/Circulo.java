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
public class Circulo extends FigurasGeometricas{
    double radio;

    public Circulo(double radio) {
        super(1, 3.14*radio*radio);
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio +" "+super.toString();
    }


    
    
     
}
