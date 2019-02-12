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
public class Universidad {
    String nombre;
    String ciudad;
    HashMap<String,Departamento> departamentos;
    HashMap<Dni, Estudiante> estudiantes;
    HashMap<Dni ,Trabajador> trabajadores;

    public Universidad(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        departamentos = new HashMap<>();
        estudiantes = new HashMap<>();
        trabajadores = new HashMap<>();
    }

    @Override
    public String toString() {
        return "Universidad: " +nombre + " Ciudad:" + ciudad+ " ";
    }
    
    
    
    
}
