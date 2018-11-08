/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicionales;

import java.util.Random;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class AleatorioClase {
    
    
    public static void main(String[] args) {
        Random rnd = new Random();
        int aleatorio = rnd.nextInt(21)+1;
        System.out.println(aleatorio);
    }
}
