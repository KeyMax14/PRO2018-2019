/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlumnoLambda;

import java.util.ArrayList;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class AdicionalMaximo3 {

    interface Ordenable<T> {

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

    public static void main(String[] args) {
        /*
        Hacer ejercicio donde calcular el tercero mas alto de un array de personas sin repetirse.
         */

        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Hombre("kevin", "h", "g", 25, 185, 78));
        personas.add(new Hombre("Juan", "h", "g", 25, 175, 78));
        personas.add(new Hombre("Juan", "h", "g", 25, 176, 78));
        personas.add(new Hombre("Pepe", "h", "g", 25, 176, 78));
        
        Ordenable o = new Ordenable<Persona>() {
            @Override
            public boolean esMayorQue(Persona obj, Persona obj2) {
                return obj.altura > obj2.altura;
            }
        };
        
        Persona[] personasA = personas.toArray(new Persona[personas.size()]);
        
        
        ordenar(personasA, o);
        
        Persona maximo3;
        
        if (personasA.length >= 3) {
           maximo3 = personasA[personasA.length-3];
            System.out.println(maximo3);
        }else{
            maximo3 = null;
        }
        

    }
}
