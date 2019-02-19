/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalStreamPersona;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class StreamMain {
    
//    public static Hombre crearHombre(){
//        String []nombres = {"Paco","Luis","Gil",Marcos};
//        
//    }

    public static void main(String[] args) {
        
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Hombre("pepe", "", "", 21, 168, 60));
        personas.add(new Mujer("ana", "", "", 13, 168, 60));
        personas.add(new Hombre("Juan", "", "", 50, 168, 60));
        
        ArrayList<String> resultados;
        resultados = (ArrayList) personas.stream().filter(x -> x.edad >= 18)
                .sorted((p1, p2) -> p1.nombre.compareTo(p2.nombre))
                .map(p -> p.nombre)
                .collect(Collectors.toList());
        
        System.out.println(resultados);
    }
}
