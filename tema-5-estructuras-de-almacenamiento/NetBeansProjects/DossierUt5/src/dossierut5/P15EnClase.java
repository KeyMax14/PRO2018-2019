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
public class P15EnClase {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        
        arr.add("pablo");
        arr.add("cabrera");
        arr.add("Hola");
        
        
        
        for (Iterator it = arr.iterator() ;  it.hasNext();) {
            String aux = (String)it.next();
            if (aux.equals("pablo")) {
                it.remove();
            }
        }
        
        for (String string : arr) {
            System.out.println(string);
        }
    }
}
