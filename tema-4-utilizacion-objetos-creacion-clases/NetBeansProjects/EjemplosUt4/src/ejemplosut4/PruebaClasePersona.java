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

/*
    La clase no es publica si no se pone public, si es publica, 
        debe obligatoriamente pertenecer a un fichero independiente.
 */
public class PruebaClasePersona {
//    public static void main(String[] args) {
//        Persona p = new Persona();
//        System.out.println(p);
//        // Esto solo te muestra el espacio en memoria.
//        
//        System.out.println(p.getNombreCompleto());
//        // En este caso no pone ningun nombre, porque no estan inicializados
//        // saldra null null.
//        
//        p.setNombre("Armando");
//        p.setApellido("Escandalo");
//        System.out.println(p.getNombreCompleto());
//        
//       
//        // Colocamos uno de los atributos(propiedades) como publico, para ver que tambien te permite cambiar
//        // los valores.
//        
//        // al pulsar . y ver las diferentes acciones, podemos ver que los cuadrados son propiedades, y los circulos metodos.
//        
//        p.edad = 20;
//        System.out.println(p.getEdad());
//        //p.nombre = "Eustaquio";  // Haciendo esto vemos que no se puede hacer porque es privado, y no porque no exista.
//     }

    public static void main(String[] args) {
        Persona p = new Persona();
        p.nombre = "Ana";
        p.apellido = "Martín";

        Persona q;

        q = p;
        q.nombre = "Pepe";
        System.out.println(p.nombre);
        Persona a = new Persona();
        a.setDatos("Antonio", "Machado", 62);
        a.mostrar();
    }
}

class Persona {

    public String nombre;
    public String apellido;
    public int edad;

    // alt+insert puedes lanzar getter and setters.
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String txt) {
        nombre = txt;
    }

    public void setApellido(String txt) {
        apellido = txt;
    }

    public void setEdad(int n) {
        edad = n;
    }

    public void setDatos(String nombre, String apellido, int edad) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void mostrar() {
        String salida = "** "+nombre + " " + apellido + " edad " + edad + " años **";
        String asteriscos ="";
        for (int i = 0; asteriscos.length() < salida.length(); i++) {
            
            asteriscos+="* ";
        }
        
        System.out.println(asteriscos);
        System.out.println(salida);
        System.out.println(asteriscos);
    }
}
