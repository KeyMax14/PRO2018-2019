/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosut4;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
class AlumnoIESPuerto{
    public String nombre;
    public String apellido;
    public int edad;
    public static String direccionInstituto;

}

public class ClaseAlumno {
    public static void main(String[] args) {
        AlumnoIESPuerto alu1 = new AlumnoIESPuerto();
        alu1.nombre = "ana";
        alu1.apellido = "Ramirez";
        
        // Esto que viene da un warning, lo mejor para los atributos estaticos se modifica desde la propia clase
        // Sin embargo es algo que es permitido, pero no recomendable.
//        alu1.direccionInstituto = "c/las cabezas nº11";
        AlumnoIESPuerto.direccionInstituto = "c/las cabezas nº11";
        
        
        AlumnoIESPuerto alu2 = new AlumnoIESPuerto();
        System.out.println("nombre: "+alu2.nombre);
        System.out.println("apellido: "+alu2.apellido);
        System.out.println("direccion: "+alu2.direccionInstituto);
    }
}
