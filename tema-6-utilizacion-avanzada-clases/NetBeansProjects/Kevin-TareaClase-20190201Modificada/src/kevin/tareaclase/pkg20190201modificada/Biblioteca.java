/*
    Basándose en la actividad descrita en la práctica9 del dossier Se realizará una clase Biblioteca

La clase biblioteca debe tener como mínimo un constructor que reciba una String que será el nombre de la biblioteca

Como biblioteca que es tiene un conjunto de volumenes de libros biblioteca ( clase VolumenLibroBiblio. Lo lógico es que esta clase herede de VolumenLibro )  ( observar que en esta ocasión el atributo propietario coincidirá con el nombre de la biblioteca y que será necesario un atributo préstamo que estará a null si no está en préstamo o tendrá el nombre de una persona para identificar a quién se le ha prestado )

Para dar con la estructura apropiada para mantener el conjunto de VolumenLibroBiblio pensar que se va a buscar por título y se obtendrá una estructura de VolumenLibroBiblio de los que tienen el mismo título

Se debe crear un método llamado: prestar() que se le pasa un VolumenLibroBiblio y el nombre de la persona que lo va a tener en préstamo. Observar que si el volumen ya está prestado esta operación no se realizará y devolverá false avisando de que no fue posible el préstamo

Crear un método llamado: devolver() que recibe un VolumenLibroBiblio y hace que ya quede liberado y prestable para otro usuario ( el atributo con el nombre del que tenía el préstamo vuelve a ser null )

crear un método llamado agregarLibro() para agregar un VolumenLibroBiblio a nuestra biblioteca


Hacer una clase llamada Main  que va a tener el main() del programa
Este main() tendrá un menú para:

- agregar un libro a la biblioteca

- buscar los volumenes para un título

  Esa última opción nos dejará elegir entre los diferentes volumenes para poder prestar o devolver un volumen
 */
package kevin.tareaclase.pkg20190201modificada;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Biblioteca {

    String nombre;
    HashMap<String, HashMap<Integer, VolumenLibroBiblio>> volumenes;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        volumenes = new HashMap<>();
    }

    public boolean prestar(VolumenLibroBiblio volumen, String nombrePersonaPrestamo) {
        boolean resultado = false;
        if (volumen.prestamo == null) {
            volumen.setPrestamo(nombrePersonaPrestamo);
            resultado = true;
        }
        return resultado;
    }

    public boolean devolver(VolumenLibroBiblio volumen) {
        boolean resultado = false;
        if (volumen.prestamo != null) {
            volumen.setPrestamo(null);
            resultado = true;
        }
        return resultado;
    }

    public HashMap<Integer, VolumenLibroBiblio> buscarTitulo(String titulo) {
//        HashMap<Integer, VolumenLibroBiblio> busqueda = volumenes.get(titulo);
        return volumenes.get(titulo);
    }

    public String listadoTitulo(HashMap<Integer, VolumenLibroBiblio> volumen) {
        StringBuilder resultado = new StringBuilder();
        if (volumen == null) {
            resultado.append("No tenemos ese libro.");
        } else {
            for (Map.Entry<Integer, VolumenLibroBiblio> entry : volumen.entrySet()) {
                String prestamo = entry.getValue().prestamo;
                resultado.append(entry.getKey()).append(") ").append(entry.getValue().titulo)
                        .append(" Prestado a: ").append(((prestamo == null) ? "Nadie" : prestamo)).append("\n");
            }
        }
        return resultado.toString();
    }

    public void agregarLibro(String titulo, String resumen, int paginas, String... autores) {
        VolumenLibroBiblio nuevo = new VolumenLibroBiblio(this.nombre, titulo, resumen, paginas, autores);
        if (null == volumenes.get(titulo)) {
            volumenes.put(titulo, new HashMap<>());
        }
        HashMap<Integer, VolumenLibroBiblio> vol = volumenes.get(nuevo.titulo);
        vol.put(nuevo.id, nuevo);
    }

}
