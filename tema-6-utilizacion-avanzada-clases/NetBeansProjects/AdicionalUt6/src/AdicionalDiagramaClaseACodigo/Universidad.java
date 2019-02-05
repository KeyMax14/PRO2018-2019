/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalDiagramaClaseACodigo;

import java.util.HashSet;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Universidad {
    String nombre;
    String ciudad;
    HashSet<Departamento> departamentos;
    HashSet<Estudiante> estudiantes;
    HashSet<Trabajador> trabajadores;
}
