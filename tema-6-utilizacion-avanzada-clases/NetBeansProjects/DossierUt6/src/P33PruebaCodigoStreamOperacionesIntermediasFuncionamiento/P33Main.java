/*
    Práctica 33: Probar el código anterior. Agrega el código para mostrar lista que se obtuvo
        como resultado en pantalla Toma captura de pantalla del código y la ejecución
 */
package P33PruebaCodigoStreamOperacionesIntermediasFuncionamiento;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P33Main {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> lista = numeros.stream()
                .filter(n -> {
                    System.out.println("filtrando " + n);
                    return n % 2 == 0;
                })
                .map(n -> {
                    System.out.println("mapping " + n);
                    return n * n;
                })
                .limit(2)
                .collect(toList());
        
        lista.stream()
                .forEach(System.out::println);
        
    }
}
