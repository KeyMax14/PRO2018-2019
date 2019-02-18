/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalOperacionesSumar;

import java.util.ArrayList;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Operaciones {

    interface Ordenable<T> {

        // No permite static 
        boolean esMayorQue(T obj, T obj2);
    }

    static void ordenar(Object[] arr, Ordenable o) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (o.esMayorQue(arr[i], arr[j])) {
                    Object aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }

            }

        }
    }

    static void ordenar(ArrayList arrayL, Ordenable o) {
        Object[] array = arrayL.toArray();
        ordenar(array, o);
        arrayL.clear();
        for (Object object : array) {
            arrayL.add(object);
        }

    }

    @FunctionalInterface
    interface Reducible<T> {
        T reducir(T o1, T o2);
    }

    public static Object reducir(ArrayList arr, Reducible s) {
        
        Object acumulado = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            acumulado = s.reducir(acumulado, arr.get(i));
            
        }
        return acumulado;
    }
}
