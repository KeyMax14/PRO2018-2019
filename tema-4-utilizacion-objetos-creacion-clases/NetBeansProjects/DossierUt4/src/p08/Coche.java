/*
    Práctica 8: Crear la clase Coche que tenga por atributos: String nombre, boolean
        encendido, boolean frenoDeManoPuesto, int posicion. Con un constructor que reciba el
        nombre: Coche(String n) y otro constructor que reciba el nombre y la posicion:
        Coche(String n, int p) Establecer los getter y los setter
 */
package p08;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Coche {
    private String nombre;
    private boolean encendido;
    private boolean frenoDeManoPuesto;
    private int posicion;
    
    public Coche(String n){
        nombre = n;
    }

    public Coche(String n, int p) {
        nombre = n;
        posicion = p;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public boolean isFrenoDeManoPuesto() {
        return frenoDeManoPuesto;
    }

    public void setFrenoDeManoPuesto(boolean frenoDeManoPuesto) {
        this.frenoDeManoPuesto = frenoDeManoPuesto;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}
