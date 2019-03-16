/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class mainConsola {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.limpiar();
        calc.cargarNumero(2);
        calc.operar("+");
        calc.cargarNumero(3);
        calc.operar("*");
        calc.cargarNumero(7);
        calc.operar("=");
        System.out.println(calc.getResultado());
    }
}
