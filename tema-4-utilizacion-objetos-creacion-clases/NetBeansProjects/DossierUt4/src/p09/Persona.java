/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p09;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Persona {
    public String nombre;
    public String apellido;
    public int edad;
    
    
    /*
        El siguiente método es un constructor, esto significa
        que cuando llamas a la clase puedes pasarle parametros.
    
        Como se ve no se especifica lo que se devuelve, y se usa 
        el nombre de la clase en cuestión.
    */

    
    public Persona(String nom, String ape, int edad){
        nombre = nom;
        apellido = ape;
        this.edad = (int)Math.abs(edad);
    }
    
        // Este seria el constructor por defecto.
//    public Persona(){
//        nombre = null;
//        apellido = null;
//        edad = 0;
//    }
       
    // Lo siguiente no es recomendable, porque println solo serviria para consola.
//    public void mostrarInfo(){
//        System.out.println(nombre+" "+apellido+" "+edad);
//    }
    
    
    
    public String mostrarInfo(){
        return nombre+" "+apellido+" "+edad;
    }

    public static void inicio(){
        System.out.println("Waaaa");
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
        
    }
    
    
}
