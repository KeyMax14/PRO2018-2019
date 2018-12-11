/*
    Práctica 7: Define una clase Profesor con atributos: nombre (String), apellidos (String),
        edad (int), soltero (boolean), especialista (boolean). Define un constructor que reciba los
        parámetros necesarios para la inicialización y otro constructor que no reciba parámetros.
        Crea los métodos getter y setter para poder establecer y obtener los valores de los atributos.
 */
package p07;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Profesor {
    private String nombre;
    private String apellidos;
    private int edad;
    private boolean soltero;
    private boolean especialista;
    
    public Profesor(String nom, String ape, int ed, boolean solte, boolean espe){
        nombre = nom;
        apellidos = ape;
        edad = ed;
        soltero = solte;
        especialista = espe;
    }

    public Profesor() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isSoltero() {
        return soltero;
    }

    public void setSoltero(boolean soltero) {
        this.soltero = soltero;
    }

    public boolean isEspecialista() {
        return especialista;
    }

    public void setEspecialista(boolean especialista) {
        this.especialista = especialista;
    }
    
    
}
