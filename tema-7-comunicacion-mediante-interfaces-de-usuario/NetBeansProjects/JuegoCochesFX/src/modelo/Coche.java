/*

 */
package modelo;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Coche implements Posicionable {

    private String nombre;
    private boolean encendido;
    private boolean frenoDeManoPuesto;
    private Punto posicion;
    private Escenario escenario;

    public String arrancar() {
        String resultado = nombre + ": ";
        if (encendido) {
            resultado = "Dañas el coche. Ya estaba encendido";
        } else {
            resultado = "Ok. Coche ha arrancado";
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
    public String toString() {

        return "" + nombre + ": Esta " + ((encendido) ? " encendido," : " apagado,")
                + ((frenoDeManoPuesto) ? " Freno puesto. " : " Freno quitado. ")
                + "Pos: " + posicion;
    }

    public String bajarFrenoMano() {
        String respuesta = nombre + ": ";
        if (frenoDeManoPuesto) {
            frenoDeManoPuesto = false;
            respuesta = "Freno mano quitado.";
        } else {
            respuesta = "Freno de mano ya estaba quitado.";
        }
        return respuesta;
    }

    public String subirFrenoMano() {
        String respuesta = nombre + ": ";
        if (frenoDeManoPuesto) {
            respuesta = "Freno mano ya estaba puesto.";
        } else {
            frenoDeManoPuesto = true;
            respuesta = "Freno de mano puesto.";
        }
        return respuesta;
    }

    public String moverIzquierda(double pasos) {
        pasos *= -1;
        return moverCocheEjeX(pasos);
    }

    public String moverDerecha(double pasos) {
        return moverCocheEjeX(pasos);
    }

    private String moverCocheEjeX(double pasos) {
        String respuesta = "" + nombre + ": ";
        if (!encendido) {
            respuesta = "El coche esta apagado. No se puede mover.";
        } else if (frenoDeManoPuesto) {
            respuesta = "Freno de mano puesto. Coche apagado.";
            encendido = false;
        } else {
            if (posicion.getX() + pasos < escenario.inicio.getX()) {
                posicion = new Punto(escenario.inicio.getX(), posicion.getY());
                respuesta = "Llegamos al limite.";

            } else if (posicion.getX() + pasos > escenario.fin.getX()) {
                posicion = new Punto(escenario.fin.getX(), posicion.getY());
                respuesta = "Llegamos al limite.";
            } else {
                this.posicion = new Punto(this.posicion.getX() + pasos, this.posicion.getY());
                respuesta = "Ok, coche avanzo hasta: " + posicion;
            }
        }
        return respuesta;
    }

    public String moverAbajo(double pasos) {
        return moverCocheEjeY(pasos);
    }

    public String moverArriba(double pasos) {
        pasos *= -1;
        return moverCocheEjeY(pasos);
    }

    private String moverCocheEjeY(double pasos) {
        String respuesta = "" + nombre + ": ";
        if (!encendido) {
            respuesta = "El coche esta apagado. No se puede mover.";
        } else if (frenoDeManoPuesto) {
            respuesta = "Freno de mano puesto. Coche apagado.";
            encendido = false;
        } else {
            if (posicion.getY() + pasos < escenario.inicio.getY()) {
                posicion = new Punto(posicion.getX(), escenario.inicio.getY());
                respuesta = "Llegamos al limite:" + posicion;

            } else if (posicion.getY() + pasos > escenario.fin.getY()) {
                posicion = new Punto(posicion.getX(), escenario.fin.getY());
                respuesta = "Llegamos al limite: " + posicion;
            } else {
                this.posicion = new Punto(this.posicion.getX(), this.posicion.getY() + pasos);
                respuesta = "Ok, coche avanzo hasta: " + posicion;
            }
        }
        return respuesta;
    }

    public Coche(Escenario escenario) {
        this("Anonimo", escenario);
    }

    public Coche(String nombre, Escenario escenario) {
        this(nombre, escenario, escenario.puntoAleatorio());

    }

    public Coche(String nombre, Escenario escenario, Punto posicion1) {
        this.nombre = nombre;
        this.posicion = posicion1;
        this.encendido = false;
        this.frenoDeManoPuesto = true;
        this.escenario = escenario;
    }

    // El siguiente constructor es un constructor de copia.
    // Así se pueden clonar objetos.
    public Coche(Coche otroCoche) {
        this.nombre = otroCoche.nombre;
        this.posicion = otroCoche.posicion;
        this.escenario = otroCoche.escenario;
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

    public Punto getPosicion() {
        return posicion;
    }

    public void setPosicion(Punto posicion) {
        this.posicion = posicion;
    }

    public Escenario getEscenario() {
        return escenario;
    }

    public void setEscenario(Escenario escenario) {
        this.escenario = escenario;
    }
}
