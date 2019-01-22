/*
    Prácticas propuestas: Arrays bidimensionales

1.- Escriba una clase que permita guardar las notas numéricas de cada estudiante en las asignaturas de un ciclo. La clase asume que el ciclo tiene un máximo de 10 asignaturas y un máximo de 40 estudiantes.

* La clase permitirá Introducir notas, Mostrar las notas y obtener el promedio por clase.


2.- Realice una clase que ayude a almacenar y gestionar al Centro Meteorológico de España las lluvias que han caído en cada mes del año para cada uno de las Comunidades Autónomas. La clase deberá permitir guardar los datos, consultarlos y obtener para cada comunidad el mes donde llueve menos y el mes donde llueve más, también deberá obtener la comunidad donde más llueve y el que menos llueve.


3.- Supongamos que en una elección hubo 12 candidatos (Con identificadores 1,2,3,...12). Por otra parte, los votos para cada candidato se capturará de manera desorganizada como se muestra a continuación. 1 5 7 5 1 12 10 7 5 8 1 5 -1. Diseñar una clase que mantenga esta información y permita, además:

a) obtener el número de votos de cada candidato al final de la elección

b) candidato ganador

c) total de votos nulos (son los que tienen -1)
 */
package practicaspropuestas;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
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

    HashMap<String, HashMap<String, Integer>> estudiantes;

    public Ciclo() {
        estudiantes = new HashMap<String, HashMap<String, Integer>>();
    }

    public boolean agregarEstudiante(String dni) {
        boolean resultado = false;
        if (estudiantes.size() < 41) {
            estudiantes.put(dni, new HashMap<String, Integer>());
            resultado = true;
        }
        return resultado;
    }

    public boolean introducirNotas(String dni, String nombreAsignatura, int nota) {
        boolean resultado = false;
        HashMap<String, Integer> estudiante = estudiantes.get(dni);

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
        for (Map.Entry<String, HashMap<String, Integer>> estudiante : estudiantes.entrySet()) {
            resultado += estudiante.getKey() + ":\n";
            for (Map.Entry<String, Integer> nota : estudiante.getValue().entrySet()) { //   estudiante.getValue().entrySet())
                resultado += nota.getKey() + ": " + nota.getValue() + "\t";
            }
            resultado += "\n";
        }
        return resultado;
    }
//    @Override
//    public String toString() {
//        String resultado = "";
//        for (Map.Entry<String, HashMap<String, Integer>> estudiante : estudiantes.entrySet()) {
//            resultado += estudiante.getKey() + ":\n";
//            for (Map.Entry<String, Integer> nota : estudiante.getValue().entrySet()) { //   estudiante.getValue().entrySet())
//                resultado += nota.getKey() + ": " + nota.getValue() + "\t";
//            }
//            resultado += "\n";
//        }
//        return resultado;
//    }
    
    // Calcular el promedio 
    
    public double promedio() {
        double promedio = 0;
        int i = 0;
        for (HashMap<String,Integer> estudiante : estudiantes.values()) {
            for (Integer nota : estudiante.values()) {
                promedio += nota;
                i++;
            }
        }
        return promedio/(double)i;
    }

}

public class ArraysBidimensionales01 {


    public static void main(String[] args) {
        // TODO code application logic here
    }

}
