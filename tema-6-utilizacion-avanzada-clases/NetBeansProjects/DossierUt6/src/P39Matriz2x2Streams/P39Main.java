/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P39Matriz2x2Streams;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P39Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Matriz2x2> matrices = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            matrices.add(new Matriz2x2(rnd.nextInt(10),rnd.nextInt(10),rnd.nextInt(10),rnd.nextInt(10)));
        }
        
        // Mostrar matrices aleatorias.
        
        matrices.stream()
                .forEach(System.out::println);
        
        System.out.println("");
        
        System.out.println("\nObtener el maximo determinante: \n");
        
        double maxDeterminante = matrices.stream()
                .mapToDouble(p-> p.determinante())
                .max()
                .getAsDouble();
        
        System.out.println("MaxDeterminante = "+ maxDeterminante);
        
        System.out.println("\nObtener una matriz con determinante 0: (Si no hay devuelve null) \n");
        
        Matriz2x2 determinante0 = 
                matrices.stream()
                .filter(p-> p.determinante() == 0)
                .findFirst()
                .orElse(null);
        
        System.out.println("Matriz Determinante 0: \n"+ determinante0);
    }
}
