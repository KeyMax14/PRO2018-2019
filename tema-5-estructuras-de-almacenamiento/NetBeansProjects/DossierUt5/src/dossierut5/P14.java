/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossierut5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P14 {

    public static void main(String[] args) {
//        ArrayList<String> al = new ArrayList<>();
//        String s0 = "yea";
//        String s1 = "yea1";
//        String s2 = "yea2";
//        String s3 = "yea3";
//        String s4 = "yea4";
//        al.add(s0);
//        al.add(s1);
//        al.add(s2);
//        al.add(s3);
//        al.add(s4);
////Se recorre el arraylist y si se encuentra lo que quiere se borra
//        for (String elemento : al) {
//            if (elemento.equals(s2)) {
//                al.remove(s2);
//            }
//        }
//        for (String elemento : al) {
//            System.out.println(elemento);
//        }

        ArrayList<Integer> miArray = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            Random rnd = new Random();
            miArray.add(rnd.nextInt(20));
        }
        for (Iterator it = miArray.iterator(); it.hasNext();) {
            int numero = (int) it.next();
            System.out.println(numero);
            it.remove();
            System.out.println("tamaño array: " + miArray.size());
        }
    }

}
