/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiagramaClaseACodigo;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */

enum Titulaciones{
    ADE,
    IngInformatica,
//    ArqNaval,
//    BellasArtes,
//    Biologia,
//    Enfermeria,
//    Estadistica,
//    Farmacia,
//    Filologia,
    Fisica, 
    Matematicas, 
    Quimica,
    Veterinaria
}
public class Departamento {
    String nombre;
    HashSet<Titulaciones> titulaciones;
    Universidad universidad;
    HashMap<Dni, EstudianteDeGrado> estudiantes;

    public Departamento(String nombre, Universidad universidad) {
        this.nombre = nombre;
        this.titulaciones = new HashSet<>();
        this.universidad = universidad;
        estudiantes = new HashMap<>();
    }
    
    public void agregarTitulaciones(Titulaciones t){
        titulaciones.add(t);
    }
}
