/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public interface Posicionable {
    public double getX();
    public double getY();
    public double getRadio();
    public void setRadio(double radio);
    public Punto getPosicion();
    public void setPosicion(Punto posicion);
}
