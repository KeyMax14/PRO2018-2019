/*
    Práctica 2: Poner los atributos de la clase persona a private. Tratar de acceder desde la
        clase Alumno a esos atributos que antes heredaba. Toma captura de pantalla de los mensajes
        del IDE. Para ello, por ejemplo, puedes crear un método en alumno y llamar a this.nombre
        desde el método.
 */
package P03PersonaGetterSetter;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
enum Curso {
    DAW1,
    DAW2,
    ASIR1,
    ASIR2,
    DAM1,
    DAM2,
    DAM3
}

public class Persona {

    protected String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}

class Alumno extends Persona {

    Curso curso;
    double notaMedia;

    public Alumno(String nombre, String apellido, Curso curso, double notaMedia) {
        super(nombre, apellido);
        this.curso = curso;
        this.notaMedia = notaMedia;
    }
}

class Profesor extends Persona {

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
