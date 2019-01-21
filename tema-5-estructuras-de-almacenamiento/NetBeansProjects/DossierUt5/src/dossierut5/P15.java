/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossierut5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P15 {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        String s0 = "yea";
        String s1 = "yea1";
        String s2 = "yea2";
        String s3 = "yea3";
        String s4 = "yea4";
        al.add(s0);
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
//Se recorre el arraylist y si se encuentra lo que quiere se borra
        
        Iterator it = al.iterator();
        
//        for (String elemento : al) {
//            if (elemento.equals(s2)) {
//                al.remove(s2);
//            }
//        }
        while (it.hasNext()) {
            if (it.next().equals(s2)) { // next() devuelve el valor, por eso se tiene que comparar con el valor devuelto
                it.remove(); // remove() borra el ultimo valor devuelto, no el valor actual de la iteracion.
            }
        }
        for (String elemento : al) {
            System.out.println(elemento);
        }
    }
}
