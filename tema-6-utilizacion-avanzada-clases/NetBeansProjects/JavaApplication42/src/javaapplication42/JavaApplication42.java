/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class JavaApplication42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        Integer[] a1 = {4,5,6,78,6};
        
        ArrayList<Integer> a1L = new ArrayList<>(Arrays.asList(a1));
        
        
        LinkedList<Integer> a2 = new LinkedList<Integer>();
        
        a2.addAll(a1L);
        
        HashMap<String, ArrayList<Integer>> numeros = new HashMap<>();
        numeros.put("1", new ArrayList(Arrays.asList(1,2,3,4)));
        numeros.entrySet().iterator();
        
        for (Map.Entry<String, ArrayList<Integer>> entry : numeros.entrySet()) {
        }
        
        Iterator it = numeros.get("1").iterator();
        
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        a.add(1);
        a.add(2);
        a.add(3);
        
        System.out.println("");
        
        List<Integer> numericos = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
Optional<Integer> opcional=numericos.stream().filter(x->x>3 && x<6).findFirst();
opcional.ifPresent(System.out::println);
        
        
        
        Integer[] f = a.toArray(new Integer[a.size()]);
        
        a1L.stream()
                .filter(p -> p > 7)
                .forEach(System.out::println);
    }
    
}
