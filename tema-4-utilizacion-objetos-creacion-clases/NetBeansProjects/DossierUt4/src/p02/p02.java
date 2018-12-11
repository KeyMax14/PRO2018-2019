/*
    Práctica 2: Copia el código anterior y toma una captura de pantalla que muestre la salida
        del programa en ejecución. ¿ qué valores muestra para c y d ? Modifica ahora el nombre
        Ana por otro mediante: c.setNombre() y muestra en pantalla el nombre apuntado por c y
        el apuntado por d
 */
package p02;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
class Persona {

    private String nombre;
    private String apellido;
    private int edad;

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

    public String getNombre() {
        return nombre;
    }
}

public class p02 {

    public static void main(String[] args) {
            //declaramos c d como de tipo Persona
        Persona c, d;
            //creamos un objeto y guardamos su referencia en c
        c = new Persona();
            //Le establecemos sus atributos
        c.setNombre("Ana");
        c.setApellido("Hernández");
        c.setEdad(19);
            //tomamos la referencia al objeto que guarda c y se la damos a d
        d = c;
            //Modificamos la edad del objeto apuntado por la variable d:
        d.setEdad(25);
//            //vemos la edad almacenada accediendo con d:
//        System.out.println("Edad accediendo con d: " + d.getEdad());
//            //vemos la edad almacenada accediendo con c:
//        System.out.println("Edad accediendo con c: " + c.getEdad());
        
//        c.setNombre("Andres");
//        System.out.println("Nombre accediendo con c: "+ c.getNombre());
//        System.out.println("Nombre accediendo con d: "+ d.getNombre());
       
        System.out.println(c);
        System.out.println(d);
        Persona e = new Persona();
        System.out.println(e);

    }
}
