/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P39Matriz2x2Streams;

import java.util.ArrayList;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P39Main {
    public static void main(String[] args) {
        ArrayList<Matriz2x2> matrices = new ArrayList<>();
        
        matrices.add(new Matriz2x2(1,2,3,4));
        matrices.add(new Matriz2x2(5,7,2,-2));
        matrices.add(new Matriz2x2(4,8,9,0));
        matrices.add(new Matriz2x2(3,4,87,4));
        matrices.add(new Matriz2x2(0,1,9,3));
        
        double maxDeterminante = matrices.stream()
                .mapToDouble(p-> p.determinante())
                .max()
                .getAsDouble();
        
        System.out.println("MaxDeterminante = "+ maxDeterminante);
        
        Matriz2x2 determinante0 = 
                matrices.stream()
                .filter(p-> p.determinante() == 0)
                .findFirst()
                .orElse(null);
        
        System.out.println("Matriz Determinante 0 = "+ determinante0);
    }
}
