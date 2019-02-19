/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalOperacionesSumar;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class main {
    public static void main(String[] args) {
        ArrayList<Integer> enteros = new ArrayList<Integer>();
        enteros.add(3);
        enteros.add(5);
        enteros.add(4);
        enteros.add(2);
        
        
        Operaciones.Reducible sum = new Operaciones.Reducible<Integer>() {
            @Override
            public Integer reducir(Integer o1, Integer o2) {
                return o1 + o2;
            }

        };
        
        System.out.println(Operaciones.reducir(enteros, sum));
        
        
        String[] cadena1 = {"hola", "amigos", "buenos", "dias"};
        
        ArrayList<String> alCadena = new ArrayList<>(Arrays.asList(cadena1));
        
//        ArrayList<String> cadena = new ArrayList<>();
//        
//        cadena.add("a");
//        cadena.add("b");
//        cadena.add("c");
//        cadena.add("d");

        Operaciones.Reducible<String> st = (String o1, String o2) -> o1+o2;
        
        System.out.println(Operaciones.reducir(alCadena, st));
        
        
        Operaciones.Reducible<Integer> r = (Integer o1, Integer o2) -> {
            if (o1 > o2) {
                return o1;
            }else{
                return o2;
            }
        };
        
        System.out.println(Operaciones.reducir(enteros, r));
        
        
        ArrayList<Integer> res;
        ArrayList<Integer> res1;
        
        // Filtrar números mayores de 4
        
        res = Operaciones.filtrar(enteros, (p) -> (int)p >4);
        
        System.out.println(res);
        
        // Filtrar numeros pares
        
        
        res1 = Operaciones.filtrar(enteros, (p) -> (int)p%2 == 0);
        
        System.out.println(res1);
        
        // Filtrar por los textos que empiezan por 'a'
        
        ArrayList<String> ress = Operaciones.filtrar(alCadena, p -> ((String)p).charAt(0)=='a');
        
        System.out.println(ress);
        
        // Filtratr mayor que 18
        
        ArrayList<Persona> personas = new ArrayList<>();
        
        personas.add(new Hombre("Tio", "1", "", 20, 158, 250));
        personas.add(new Hombre("Tio", "2", "", 1, 158, 250));
        personas.add(new Hombre("Tio", "3", "", 50, 158, 250));
        personas.add(new Hombre("Tio", "4", "", 20, 158, 250));
        
        ArrayList<Persona> nuevo = Operaciones.filtrar(personas, p -> ((Persona)p).edad>18);
        
        System.out.println(nuevo);
        
    }
}
