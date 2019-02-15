/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiagramaClaseACodigo;

import java.util.ArrayList;
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
    ArrayList<Titulaciones> titulaciones;
    Universidad universidad;
    HashMap<String, EstudianteDeGrado> estudiantes;

    public Departamento(String nombre, Universidad universidad) {
        this.nombre = nombre;
        this.titulaciones = new ArrayList<>();
        this.universidad = universidad;
        estudiantes = new HashMap<>();
    }
    
    public String listadoTitulaciones(){
        String resultado = "";
        int i = 0;
        for (Titulaciones titulacion : titulaciones) {
            resultado+=(i++) + ") " + titulacion+"\n";
        }
        return resultado;
    }
    
    public String listadoEstudiantes(){
        String resultado = "";
        
        for (EstudianteDeGrado estudiante : estudiantes.values()) {
            resultado += estudiante+"\n";
        }
        return resultado;
    }
    
    
    public void agregarTitulaciones(Titulaciones t){
        titulaciones.add(t);
    }

    @Override
    public String toString() {
        String tit= "Titulaciones: ";
        
        for (int i = 0; i < titulaciones.size()-1; i++) {
            tit += titulaciones.get(i)+", ";
        }
        tit += titulaciones.get(titulaciones.size()-1);
        
        return "Departamento{" + "nombre= " + nombre + ", " + tit + '}';
    }
    
    
}
