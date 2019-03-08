/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnolambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author carlos
 */


class Prueba3{
    static void pruebita(Object a){
        System.out.println(a);
    }
    
    static int pruebito(Object a, Object b){
        return 1;
    }
}
public class EjerciciosHacerEnClaseStream {

    static String apellidos[] = {"Hernández", "Pérez", "González", "García", "Rodríguez"};

    public static Hombre crearHombre() {
        String nombres[] = {"Luis","Marcos", "Andrés", "Ramón", "Ricardo", "Jorge", "Armando"};
        Random rnd = new Random();

        int altura = rnd.nextInt(40) + 155;
        int edad = rnd.nextInt(90);
        int peso = rnd.nextInt(40) + 65;
        String apellido = apellidos[rnd.nextInt(apellidos.length)];
        String nombre = nombres[rnd.nextInt(nombres.length)];

        return new Hombre(nombre, apellido, edad, altura, peso);
    }

    public static Mujer crearMujer() {
        String nombres[] = {"Ana", "María", "Marta", "Luz", "Silvia", "Sandra"};
        Random rnd = new Random();

        int altura = rnd.nextInt(25) + 150;
        int edad = rnd.nextInt(90) ;
        int peso = rnd.nextInt(30) + 50;
        String apellido = apellidos[rnd.nextInt(apellidos.length)];
        String nombre = nombres[rnd.nextInt(nombres.length)];

        return new Mujer(nombre, apellido, edad, altura, peso);
    }

    
    
    public static void generarCodigoParaGrupoPersonas(ArrayList<Persona> personas){
        System.out.println("\n\n\n");
        for (Persona persona : personas) {
            String genero="Mujer";
            String n = persona.nombre;
            String a= persona.apellido1;
            String e= ""+persona.edad;
            String alt= "" + persona.alturaEnCm;
            String p= "" + persona.pesoEnKg;
            if( persona instanceof Hombre)
                genero="Hombre";
            System.out.println("personas.add(new "+genero+"(\""+n+"\",\""+
                    a+"\","+e+","+alt+","+p+"));");
        }
    }
    
    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList<Persona>();

        for (int i = 0; i < 10; i++) {
            Random rnd = new Random();
            if (rnd.nextInt(2) == 0) {
                personas.add(crearMujer());
            } else {
                personas.add(crearHombre());
            }
        }

        
        generarCodigoParaGrupoPersonas(personas);
        
   
        
  
    }

}
