/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicionalnumeropatasif;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class AdicionalNumeroPatasIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /*
            Al usuario se le va a preguntar de cuantas patas quiere el animal
        
            2 patas: Gallina, persona
            0 Patas : Serpiente
            4 patas: Perro, Gato
            8 patas: araña
            1 pata: caracol
            >100 patas: cienpies.
         */
        System.out.println("Introduce un número de patas");
        Scanner sc = new Scanner(System.in);
        int numPatas = sc.nextInt();

        // Usando if else if

        if (numPatas == 0) {
            System.out.println("Serpiente");
        } else if (numPatas == 1) {
            System.out.println("Caracol");
        } else if (numPatas == 2) {
            System.out.println("Persona\nGallina");
        } else if (numPatas == 4) {
            System.out.println("Perro\nGato");
        } else if (numPatas == 8) {
            System.out.println("Araña");
        } else if (numPatas >= 100) {
            System.out.println("Cienpies");
        } else {
            System.out.println("No tenemos animales con esas patas.");
        }
    }
    
}
