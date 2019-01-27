/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosut5;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
class Persona1 implements Comparable<Persona1> {

    private String nombre;
    private String apellido;
    private int edad;

    Persona1(String nombre, String apellido, int edad) {
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

    @Override
    public int compareTo(Persona1 p) {
//        if (this.edad > p.edad) {
//            return 1;
//        } else if (this.edad < p.edad) {
//            return -1;
//        } else {
//            return 0;
//        }

        return this.nombre.compareTo(p.nombre); // Con esto ordenas por nombre.
    }
}

public class EjemploSortObjetosPersonaComparable {

    public static void main(String[] args) {
        ArrayList<Persona1> personas = new ArrayList<>(3);
        personas.add(new Persona1("Marta", "León", 25));
        personas.add(new Persona1("Julián", "Luz", 20));
        personas.add(new Persona1("Pilar", "Ramos", 29));
        Collections.sort(personas);
        for (Persona1 p : personas) {
            System.out.println(p);
        }
    }
}
