/*
    Práctica 3: Crear getter() y setter() en Persona Hacer uso desde desde estos métodos para
        un objeto de la clase Alumno Tomar captura de pantalla del IDE aparte del código
 */
package P03PersonaGetterSetter;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P03Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Jose", "Alvarez", Curso.ASIR1, 9);
        System.out.println(alumno.getNombre());
        System.out.println(alumno.getApellido());
    }
}
