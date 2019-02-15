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
public class Main {
    public static void main(String[] args) {
        FigurasGeometricas figuras[] = new FigurasGeometricas[3];
        
        figuras[0] = new Cuadrado(4);
        figuras[1] = new Triangulo(4, 3);
        figuras[2] = new Circulo(5);
        
        FigurasGeometricas.ordenar(figuras);
        
        for (FigurasGeometricas figura : figuras) {
            System.out.println(figura);
        }
        
    }
}
