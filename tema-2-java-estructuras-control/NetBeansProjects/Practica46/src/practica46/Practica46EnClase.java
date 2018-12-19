/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica46;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica46EnClase {
    public static void main(String[] args) {
        int numero = 19;
        
        String binario = "";
        int temporal = numero;
        while (temporal >0) {
            binario= ""+temporal%2+binario;
            temporal/=2;
        }
        System.out.println(binario);
    }
}
