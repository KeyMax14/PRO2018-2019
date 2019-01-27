/*
    Práctica 1: Crear una clase Profesor, que hereda de Persona y contará con atributos como
        nombre, apellidos, salario y especialidad
 */
package P01HerenciaProfesor;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
enum Curso{
    DAW1,
    DAW2,
    ASIR1,
    ASIR2,
    DAM1,
    DAM2,
    DAM3
}

public class Persona {
    String nombre;
    String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    
}

class Profesor extends Persona{
    double salario;
    String especialidad;
    Curso[] curso;

    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Profesor(double salario, String especialidad, Curso[] curso, String nombre, String apellido) {
        super(nombre, apellido);
        this.salario = salario;
        this.especialidad = especialidad;
        this.curso = curso;
    }
}
