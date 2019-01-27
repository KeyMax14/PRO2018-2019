/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosut5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
class ComparadorPersonas implements Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {
        return Integer.compare(p1.getEdad(), p2.getEdad());
    }
}

class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " edad: " + edad;
    }

}

public class EjSortObjetosPersonaComparator {

    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>(3);
        personas.add(new Persona("Marta", "León", 25));
        personas.add(new Persona("Julián", "Luz", 20));
        personas.add(new Persona("Pilar", "Ramos", 29));
        Collections.sort(personas, new ComparadorPersonas());
        for (Persona p : personas) {
            System.out.println(p);
        }
    }
}
