/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalStreamPersona;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class StreamMain {

    static String[] apellidos = {"Hernandez", "Gonzalez", "Perez", "García", "Rodriguez"};

    public static Hombre crearHombre() {
        String[] nombres = {"Paco", "Luis", "Gil", "Marcos", "Ricardo", "Jorge", "Armando"};
        Random rnd = new Random();

        int altura = rnd.nextInt(40) + 160;
        int edad = rnd.nextInt(100) + 1;
        int peso = rnd.nextInt(40) + 65;

        String nombre = nombres[rnd.nextInt(nombres.length)];
        String apellido = apellidos[rnd.nextInt(apellidos.length)];
        String apellido2 = apellidos[rnd.nextInt(apellidos.length)];

        return new Hombre(nombre, apellido, apellido2, edad, altura, peso);
    }

    public static Mujer crearMujer() {
        String[] nombres = {"Pepa", "Juana", "Maria", "Lucia", "Luz", "Silvia", "Sandra", "Monica"};
        Random rnd = new Random();

        int altura = rnd.nextInt(25) + 150;
        int edad = rnd.nextInt(100) + 1;
        int peso = rnd.nextInt(30) + 50;

        String nombre = nombres[rnd.nextInt(nombres.length)];
        String apellido = apellidos[rnd.nextInt(apellidos.length)];
        String apellido2 = apellidos[rnd.nextInt(apellidos.length)];

        return new Mujer(nombre, apellido, apellido2, edad, altura, peso);
    }

    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList<>();
//        personas.add(new Hombre("pepe", "", "", 21, 168, 60));
//        personas.add(new Mujer("ana", "", "", 13, 168, 60));
//        personas.add(new Hombre("Juan", "", "", 50, 168, 60));

        for (int i = 0; i < 10; i++) {
            Random rnd = new Random();
            if (rnd.nextInt(2) == 0) {
                personas.add(crearMujer());
            } else {
                personas.add(crearHombre());
            }
        }

//        for (Persona persona : personas) {
//            System.out.println(persona);
//        }
//        
//        ArrayList<String> resultados;
//        resultados = (ArrayList) personas.stream().filter(x -> x.edad >= 18)
//                .sorted((p1, p2) -> p1.nombre.compareTo(p2.nombre))
//                .map(p -> p.nombre)
//                .collect(Collectors.toList());
//        
//        System.out.println(resultados);
        // Mostrar las 3 personas de más edad (Practica 40)
        System.out.println(personas);

        Stream<Persona> miStream = personas.stream();

        miStream.sorted((o1, o2) -> {
            return Integer.compare(o1.edad, o2.edad);
        })
                .skip(personas.size() - 3)
                .forEach(System.out::println);

        System.out.println("");

        /*
            Los Stream se queman cuando se usan. Son de un solo uso
         */
        personas.stream()
                .sorted((o1, o2) -> {
                    return Integer.compare(o2.edad, o1.edad);
                })
                .limit(3)
                .forEach(System.out::println);

        // Mostrar las personas que tienen menos peso que el que le corresponde idealmente (P41)
        System.out.println("");

        ArrayList<Persona> res1 = new ArrayList<>();
        
        personas.stream()
                .filter((t) -> t.peso < t.pesoIdeal())
                .forEach(p -> {
                    System.out.println(p.nombre + " " + p.apellido1 + " le falta peso.");
                    res1.add(p);
                });
//                .forEach(System.out::println); // El de arriba esta personalizado
        
        // Usando peek


        
//        HashSet res2 = (HashSet)personas.stream() // Asi lo haces en un hashSet
        Set res2 = personas.stream()
                .filter((t) -> t.peso < t.pesoIdeal())
                .peek((p) -> { // Esto permite hacer lo que tu quieras sin modificar el Stream, el forEach es terminal, peek no, puedes escribir collect. (Como un forEach no terminal.)
                    System.out.println(p.nombre + " " + p.apellido1 + " le falta peso.");
                })
                .collect(Collectors.toSet());
        
        
 
        
//                .forEach(p -> {
//                    System.out.println(p.nombre + " " + p.apellido1 + " le falta peso.");
//                    res1.add(p);
//                });
//                .forEach(System.out::println); // El de arriba esta personalizado
       


        
        


        // Obtener con una sola sentencia de Stream un set con las mujeres y una lista con los hombres.
        
        Set<Mujer> mujeres = new HashSet();
        List<Hombre> hombres = new ArrayList();
        
        personas.stream()
                .forEach((p) -> {
                  if (p instanceof Hombre) {
                      hombres.add((Hombre)p);
                  }else if(p instanceof Mujer){
                      mujeres.add((Mujer)p);
                  }
                });
        
        Map<Boolean, List<Persona>> agrupacion =personas.stream()
                .collect(Collectors.groupingBy(p-> p instanceof Mujer));
        
        
        agrupacion.keySet().stream().forEach(p->{
            System.out.println(agrupacion.get(p));
            
        });
        
//        hombres = agrupacion.get(false).;
//        mujeres = agrupacion.get(true);
        
//                .forEach((p) -> {
//                  if (p instanceof Hombre) {
//                      hombres.add((Hombre)p);
//                  }else if(p instanceof Mujer){
//                      mujeres.add((Mujer)p);
//                  }
//                });
    }
}
