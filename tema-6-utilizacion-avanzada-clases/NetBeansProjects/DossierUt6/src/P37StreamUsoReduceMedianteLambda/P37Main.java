/*
    Práctica 37: Calcular el máximo utilizando reduce() pero sin usar Integer::max , esto es:
        mediante una función lambda que generemos nosotros
 */
package P37StreamUsoReduceMedianteLambda;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P37Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,68,7));
        
        // Método usando Integer::max
        
        int maxNumIntegerMax = numbers.stream().reduce(0, Integer::max);
        
        System.out.println(maxNumIntegerMax);
        
        // Usando reduce no si especificamos el 0 y este es el mayor valor nos devuelve el 0.
        
        int maxNum1 = numbers.stream().reduce(0,(p, q) -> (p > q)?p:q);
        
        // De esta forma reduce no devuelve un int, sino un Optional<Integer>
        //      pero nos aseguramos de que empiece por el valor correcto la iteracion.
        
        
        int maxNum2 = numbers.stream().reduce((p, q) -> (p > q)?p:q).get();
        
        System.out.println(maxNum2);
        
    }
}
