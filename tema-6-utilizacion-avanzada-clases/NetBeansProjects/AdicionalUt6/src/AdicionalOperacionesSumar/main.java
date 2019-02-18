/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalOperacionesSumar;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class main {
    public static void main(String[] args) {
        ArrayList<Integer> enteros = new ArrayList<Integer>();
        enteros.add(3);
        enteros.add(5);
        enteros.add(4);
        enteros.add(2);
        
        
        Operaciones.Reducible sum = new Operaciones.Reducible<Integer>() {
            @Override
            public Integer reducir(Integer o1, Integer o2) {
                return o1 + o2;
            }

        };
        
        System.out.println(Operaciones.reducir(enteros, sum));
        
        
        String[] cadena1 = {"hola", "amigos", "buenos", "dias"};
        
        ArrayList<String> alCadena = new ArrayList<>(Arrays.asList(cadena1));
        
//        ArrayList<String> cadena = new ArrayList<>();
//        
//        cadena.add("a");
//        cadena.add("b");
//        cadena.add("c");
//        cadena.add("d");

        Operaciones.Reducible<String> st = (String o1, String o2) -> o1+o2;
        
        System.out.println(Operaciones.reducir(alCadena, st));
        
        
        Operaciones.Reducible<Integer> r = (Integer o1, Integer o2) -> {
            if (o1 > o2) {
                return o1;
            }else{
                return o2;
            }
        };
        
        System.out.println(Operaciones.reducir(enteros, r));
    }
}
