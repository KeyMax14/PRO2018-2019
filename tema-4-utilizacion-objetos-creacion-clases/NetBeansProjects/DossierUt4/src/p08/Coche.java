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

    public String encender() {
        String resultado = nombre + ": ";
        if (encendido) {
            resultado = "me hace daño!";
        } else {
            resultado = "Encender ok.";
            this.encendido = true;
        }
        return resultado;
    }


    public String apagar() {
        String respuesta = nombre + ": ";
        if (encendido) {
            respuesta = "Coche Apagado.";
            encendido = false;
        } else {
            respuesta = "Vas a partir la llave.";
        }

        return respuesta;
    }
    
    // mod p24

    @Override
    public String toString(){
        
        return ""+nombre+": Esta " + ((encendido)?" encendido,":" apagado,")+
                ((frenoDeManoPuesto)?" Freno puesto. ":" Freno quitado. ")+
                "Pos: "+posicion;
    }

    public String quitarFrenoMano() {
        String respuesta = nombre + ": ";
        if (frenoDeManoPuesto) {
            frenoDeManoPuesto = false;
            respuesta = "Freno mano quitado.";
        } else {
            respuesta = "Freno de mano ya estaba quitado.";
        }
        return respuesta;
    }

    public String ponerFrenoMano() {
        String respuesta = nombre + ": ";
        if (frenoDeManoPuesto) {
            respuesta = "Freno mano ya estaba puesto.";
        } else {
            frenoDeManoPuesto = true;
            respuesta = "Freno de mano puesto.";
        }
        return respuesta;
    }

    public String moverIzquierda(int pasos) {
        pasos *= -1;

        return moverCoche(pasos);
    }

    public String moverDerecha(int pasos) {
        return moverCoche(pasos);
    }

    private String moverCoche(int pasos) {
        String respuesta = "" + nombre + ": ";
        if (!encendido) {
            respuesta = "El coche esta apagado. No se puede mover.";
        } else if (frenoDeManoPuesto) {
            respuesta = "Freno de mano puesto. Coche apagado.";
            encendido = false;
        } else {
            if (posicion + pasos < 0) {
                posicion = 0;
                respuesta = "Llegamos al limite.";
            } else {
                this.posicion -= pasos;
                respuesta = "Ok, coche avanzo hasta: " + posicion;
            }
        }
        return respuesta;
    }

    public Coche() {
        this("Anonimo");
    }

    public Coche(String nombre) {
        this(nombre, 0);

    }

    public Coche(String nombre, int posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.encendido = false;
        this.frenoDeManoPuesto = true;
    }
    
    // El siguiente constructor es un constructor de copia.
    // Así se pueden clonar objetos.
    
    public Coche(Coche otroCoche){
        this.nombre= otroCoche.nombre;
        this.posicion = otroCoche.posicion;
        this.encendido = otroCoche.encendido;
        this.frenoDeManoPuesto = otroCoche.frenoDeManoPuesto;
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
