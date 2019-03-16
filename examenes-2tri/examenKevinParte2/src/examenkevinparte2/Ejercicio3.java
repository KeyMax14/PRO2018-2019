/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenkevinparte2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Kevin Hernández García
 */
class Operaciones{
    @FunctionalInterface
    interface Consumidor<T>{
        void consumir(T obj);
    }
    
    public static void porCadaElemento(ArrayList arrL, Consumidor con){
        for (Object object : arrL) {
            con.consumir(object);
        }
    }
    
}

public class Ejercicio3 {
    
    public static void main(String[] args) {
        ArrayList<Integer> listaEnteros = new ArrayList<>(Arrays.asList(3,5,8,1,2,9,4));
        ArrayList<String> listaString = new ArrayList<>(Arrays.asList("n","r","s","p","h"));
        // hacer cuadrado
        Operaciones.porCadaElemento(listaEnteros, p -> System.out.println((int)p*(int)p));
        // Mostrar en mayusculas
        Operaciones.porCadaElemento(listaString, p-> System.out.println(p.toString().toUpperCase()));
        
    }
}
