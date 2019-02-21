/*
    Práctica 28: Crear un ArrayList de Personas que incluya objetos Hombre y Mujer. Crea una
        variable:
        Comparator<Persona> cmtPersona;
        asigna a cmtPersona una expresión lambda que ordena las personas por peso ( igual tienes
        que agregar un getter para peso en Persona ) y luego usa Collections.sort() para ordenar
        mediante cmtPersona el ArrayList
 */
package P28OrdenarPersonasComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P28Main {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Hombre("Pepe", "1", "", 18, 170, 80));
        personas.add(new Mujer("Ana", "2", "", 18, 170, 60));
        personas.add(new Mujer("Juana", "3", "", 18, 170, 57));
        personas.add(new Hombre("Jose", "4", "", 18, 170, 105));
        
        Comparator<Persona> cmtPersona;
        
        cmtPersona = (p1, p2) -> Double.compare(p1.peso, p2.peso);
        
        Collections.sort(personas,cmtPersona);
        
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
