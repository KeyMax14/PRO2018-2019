/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicionalpropuestos2tema1;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Propuesta01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            01: Implementa un algoritmo que muestre todos los múltiplos de 6 entre 6 y 150,
                    ambos inclusive.
        */
        System.out.println("Estos son los multiplos de 6 desde 6 a 150");
        
        for (int i = 6; i <= 150; i+=6) {
            System.out.println(i);
        }
    }
    
}
