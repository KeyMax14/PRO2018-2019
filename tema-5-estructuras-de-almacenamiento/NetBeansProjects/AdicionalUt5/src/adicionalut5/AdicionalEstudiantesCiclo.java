/*
    Prácticas propuestas: Arrays bidimensionales

1.- Escriba una clase que permita guardar las notas numéricas de cada estudiante en las asignaturas de un ciclo. La clase asume que el ciclo tiene un máximo de 10 asignaturas y un máximo de 40 estudiantes.

* La clase permitirá Introducir notas, Mostrar las notas y obtener el promedio por clase.

 */
package adicionalut5;


import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
enum Asignatura{
    LND,
    PRO,
    SSF,
    ETS,
    BAE,
    FOL,
    LNT
}
//    class Ciclo{
//        HashMap<String, Estudiante> estudiantes;
//        
//    }
//    
//    class Estudiante{
//        HashMap<String, Integer> Asignaturas;
//        
//    }

class Ciclo {

    HashMap<String, HashMap<Asignatura, Integer>> estudiantes;

    public Ciclo() {
        estudiantes = new HashMap<String, HashMap<Asignatura, Integer>>();
    }

    public boolean agregarEstudiante(String dni) {
        boolean resultado = false;
        if (estudiantes.size() < 41) {
            estudiantes.put(dni, new HashMap<Asignatura, Integer>());
            resultado = true;
        }
        return resultado;
    }

    public boolean introducirNotas(String dni, Asignatura nombreAsignatura, int nota) {
        boolean resultado = false;
        HashMap<Asignatura, Integer> estudiante = estudiantes.get(dni);

        if (estudiante != null && estudiante.size() <= 10) {
            estudiante.put(nombreAsignatura, nota);
            resultado = true;
        }
        return resultado;
    }

    // Con el toString mostramos todos los valores.
    @Override
    public String toString() {
        String resultado = "";
        for (Map.Entry<String, HashMap<Asignatura, Integer>> estudiante : estudiantes.entrySet()) {
            resultado += estudiante.getKey() + ":\n";
            for (Map.Entry<Asignatura, Integer> nota : estudiante.getValue().entrySet()) { 
                resultado += nota.getKey() + ": " + nota.getValue() + "\t";
            }
            resultado += "\n";
        }
        return resultado;
    }
    
    // Calcular el promedio 
    
    public double promedio() {
        double promedio = 0;
        int i = 0;
        for (HashMap<Asignatura,Integer> estudiante : estudiantes.values()) {
            for (Integer nota : estudiante.values()) {
                promedio += nota;
                i++;
            }
        }
        return promedio/(double)i;
    }

}

public class AdicionalEstudiantesCiclo {


    public static void main(String[] args) {
        // TODO code application logic here
    }

}
