/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P38PruebaUsoSumStreams;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P38Main {
    public static void main(String[] args) {
        ArrayList<Integer> numericos = new ArrayList<>(Arrays.asList(1,2,3,4,5,68,7));

        // Ejemplo que no funciona usando stream().sum
        
//        int suma = numericos.stream().sum();

        // Ejemplo que funciona usando stream().sum
        
        int sumaBien = numericos.stream().mapToInt(Integer::new).sum();
        System.out.println(numericos);
        System.out.println(sumaBien);
    }
}
