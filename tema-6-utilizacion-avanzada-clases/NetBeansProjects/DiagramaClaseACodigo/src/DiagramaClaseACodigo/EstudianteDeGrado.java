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
public class EstudianteDeGrado extends Estudiante{
    Titulaciones titulacion;

    public EstudianteDeGrado(Titulaciones titulacion, Expediente expediente, Dni dni, String nombre) {
        super(expediente, dni, nombre);
        this.titulacion = titulacion;
    }

    
    
    
}
