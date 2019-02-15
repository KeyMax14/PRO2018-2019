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
public class Cuadrado extends FigurasGeometricas{
    double tamanioLado;

    public Cuadrado(double tamanioLado) {
        super(4, tamanioLado*tamanioLado);
        this.tamanioLado = tamanioLado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "tamanioLado=" + tamanioLado + ' '+ super.toString();
    }
    
    
    
    
}
