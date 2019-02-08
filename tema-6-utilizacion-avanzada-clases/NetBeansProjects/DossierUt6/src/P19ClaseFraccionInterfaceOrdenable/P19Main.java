/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P19ClaseFraccionInterfaceOrdenable;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P19Main {
    public static void main(String[] args) {
        Ordenable fr1 = new Fraccion(1, 2);
        Ordenable fr2 = new Fraccion(2, 3);
        Ordenable fr3 = new Fraccion(2, 4);
        
        System.out.println(fr1.esIgualQue(fr3));
        
        System.out.println(fr1.esMayorQue(fr2));
        
        System.out.println(fr2.esMenorQue(fr3));
    }
}
