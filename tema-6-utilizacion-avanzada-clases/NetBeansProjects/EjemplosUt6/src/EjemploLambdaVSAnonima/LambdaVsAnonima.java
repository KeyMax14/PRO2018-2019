/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploLambdaVSAnonima;

import java.util.ArrayList;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
@FunctionalInterface
interface AcumularEnteros {

    Integer acumular(Integer a, Integer b);

    default Integer sumar(ArrayList<Integer> array) {
        Integer resultado = 0;
        for (Integer integer : array) {
            resultado += integer;
        }
        return resultado;
    }
}

@FunctionalInterface
interface Prueba {

    int miPruebita();
}

public class LambdaVsAnonima {

    public static void main(String[] args) {

        Prueba prueba = () -> {
//            datito *= 2;
//            return datito;
            return 5;
        };
        AcumularEnteros objetoAnonimo = new AcumularEnteros() {
            @Override
            public Integer acumular(Integer a, Integer b) {
                Integer resultado = 0;
                ArrayList<Integer> arr = new ArrayList<Integer>();
                arr.add(a);
                arr.add(b);
//                resultado = this.sumar(arr); //esta línea no posible con lambda
                return resultado;
            }
        };
    }
}
