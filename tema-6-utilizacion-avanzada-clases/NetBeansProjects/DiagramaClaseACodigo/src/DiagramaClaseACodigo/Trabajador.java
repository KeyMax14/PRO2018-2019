/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiagramaClaseACodigo;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Trabajador extends Persona{
    String fechaInicio;
//    Universidad universidad;

    public Trabajador(String fechaInicio, /*Universidad universidad,*/ Dni dni, String nombre) {
        super(dni, nombre);
        this.fechaInicio = fechaInicio;
//        this.universidad = universidad;
    }

    
    @Override
    public String toString() {
        return "Trabajador{" + "fechaInicio=" + fechaInicio + super.toString();
    }
    
}
