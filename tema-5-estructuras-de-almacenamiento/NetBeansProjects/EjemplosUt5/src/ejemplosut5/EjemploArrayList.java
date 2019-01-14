/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosut5;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class EjemploArrayList {

    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> al = new ArrayList<>(10);
        for (int i = 0; i < 18; i++) { // Se puede redimensionar automaticamente, aunque solo se inicie con posiciones.
            al.add(rnd.nextInt(100));
        }
        for (int num : al) {
            System.out.println(num);
        }
        
    }
}
