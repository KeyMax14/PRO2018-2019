/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P32OperacionesArrayFuncionalInterfaces;

import java.util.ArrayList;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
interface Convert2to1<T> {

    T reducir(T t1, T t2);
}

interface Filtrar<T>{
    boolean filtrar(T t);
}

public class OperacionesArray<T> {

    String arrayToText(T[] arr) {
        String resultado = "";
        for (T t : arr) {
            resultado += " "+t;
        }
        return resultado;
    }

    T reduccion(T[] array, Convert2to1<T> c) {
        T acumulado = array[0];
        for (int i = 1; i < array.length; i++) {
            acumulado = c.reducir(acumulado, array[i]);
        }
        return acumulado;
    }
    
    ArrayList<T> filtrado(T[] array, Filtrar c) {
        ArrayList<T> arr = new ArrayList<T>();
        for (int i = 0; i < array.length; i++) {
            if (c.filtrar(array[i])) {
                arr.add(array[i]);
            }
        }
        return arr;
    }


}
