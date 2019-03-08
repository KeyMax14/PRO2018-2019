/*
    Práctica 32: Basándose en el código anterior Crear la clase OperacionesArray y todo lo
        necesario para que el código funcione
 */
package P32OperacionesArrayFuncionalInterfaces;

import java.util.ArrayList;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class FuncionalInterfaceOperacionesArray {

    public static void main(String[] args) {
        Integer array[] = {2, 3, 523, 7, 1, 9, 0, 4};
//OperacionesArray tiene varios métodos:
//arrayToText() devuelve una String con todos los elementos del array.
//reduccion() devuelve un elemento del mismo tipo que el array
//que sirve de: sumario, reductor, acumulador del array. Por ejemplo
//se puede sumar todo el array pasándole una lambda: (a,b)->a+b
//también se puede obtener el máximo del array, etc.
        OperacionesArray<Integer> ra = new OperacionesArray<Integer>();
//arrayToText() recibe un array y devuelve un texto
//compuesto por cada objeto del array separados por salto de línea
        System.out.println(ra.arrayToText(array));
//ReduceArray.reduccion() recibe un FunctionalInterface Convert2to1
//vamos a crear uno que obtenga la suma de dos números:
        Convert2to1<Integer> oa = (a, b) -> a + b;
//reduccion() aplica la anterior lambda a todos los elementos del
//array obteniendo la suma total de todos los elementos del array:
        System.out.println(ra.reduccion(array, oa));
//ahora pasar un Convert2to1 que obtenga el máximo entre dos números.
//así el método reduccion() devolverá el número mayor del array:
        int resultado = ra.reduccion(array, (a, b) -> {
            int c = (int) a;
            int d = (int) b;
            return (c > d) ? c : d;
        }
        );
        System.out.println(resultado);
//Obtener un arraylist de los números pares
        ArrayList<Integer> pares = new ArrayList<Integer>();
        Filtrar<Integer> lambda = num -> num % 2 == 0;
        pares = ra.filtrado(array, lambda);
        System.out.println(pares);
//Obtener un arraylist con los números al cuadrado
        ArrayList<Integer> cuadrados = new ArrayList<Integer>();
//        ra.porCadaUno(array, a -> cuadrados.add((int) a * (int) a));
//        System.out.println(cuadrados.toString());
    }
}
