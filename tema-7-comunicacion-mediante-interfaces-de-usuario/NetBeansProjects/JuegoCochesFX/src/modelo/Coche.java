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
    private double radio;

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
            this.posicion = new Punto(this.posicion.getX() + pasos, this.posicion.getY());
            if (!escenario.pertenece(posicion)) {
                posicion = new Punto(escenario.recolocarPuntoDentroDelEscenario(posicion));
                respuesta = "Llegamos al limite." + posicion;
            } else {
                respuesta = "Ok, coche avanzo hasta: " + posicion;
            }

            /*
                Estructura antes de pertenece.
             */
//            if (posicion.getX() + pasos < escenario.inicio.getX()) {
//                posicion = new Punto(escenario.inicio.getX(), posicion.getY());
//                respuesta = "Llegamos al limite." + posicion;
//
//            } else if (posicion.getX() + pasos > escenario.fin.getX()) {
//                posicion = new Punto(escenario.fin.getX(), posicion.getY());
//                respuesta = "Llegamos al limite." + posicion;
//            } else {
//                this.posicion = new Punto(this.posicion.getX() + pasos, this.posicion.getY());
//                respuesta = "Ok, coche avanzo hasta: " + posicion;
//            }
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
            this.posicion = new Punto(this.posicion.getX(), this.posicion.getY() + pasos);
            if (!escenario.pertenece(posicion)) {
                posicion = new Punto(escenario.recolocarPuntoDentroDelEscenario(posicion));
                respuesta = "Llegamos al limite." + posicion;
            } else {
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
        this.radio = 3.0;
    }

    // El siguiente constructor es un constructor de copia.
    // Así se pueden clonar objetos.
    public Coche(Coche otroCoche) {
        this.nombre = otroCoche.nombre;
        this.posicion = otroCoche.posicion;
        this.escenario = otroCoche.escenario;
        this.encendido = otroCoche.encendido;
        this.frenoDeManoPuesto = otroCoche.frenoDeManoPuesto;
        this.radio = otroCoche.radio;
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

    @Override
    public Punto getPosicion() {
        return posicion;
    }

    @Override
    public double getX() {
        return posicion.getX();
    }

    ;

    @Override
    public double getY() {
        return posicion.getY();
    }

    ;

    @Override
    public double getRadio() {
        return radio;
    }

    @Override
    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
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
