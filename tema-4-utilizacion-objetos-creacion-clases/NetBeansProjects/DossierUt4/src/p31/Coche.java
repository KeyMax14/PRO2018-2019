/*
    Práctica 31: Basándose en la clase Coche de la práctica 8 se ampliarán las funcionalidades
        de la misma con los métodos:
        String arrancar() → el atributo encendido se pone a true y devuelve un texto que dirá:
        "OK. Coche ha arrancado" o el mensaje:
        "Dañas el coche. Ya estaba encendido"
        String apagar() → similar a la anterior devolviendo mensajes OK o mensaje de que el coche
        ya estaba apagado
        String subirFrenoDeMano() → este método activa el atributo boolean frenoDeManoPuesto
        y sus correspondientes mensajes OK o ya estaba puesto
        String bajarFrenoDeMano() → como el anterior pero al contrario
        String moverIzquierda(int distancia) → modifica el atributo posicion restando la distancia
        que se le pasa. Si bien se tiene que tener en cuenta que si el freno de mano está puesto no se
        moverá y el coche se apagará. Si el coche está apagado tampoco se moverá. Tampoco podrá
        desplazarse a posiciones negativas. En ese caso se quedará en la posición 0 Como mensaje
        devuelve el OK o el motivo por el que no se completó el desplazamiento
        Sting moverDerecha(int distancia) → lo mismo que el anterior pero en lugar de restar la
        distancia, se suma
        Sobreescribir toString() para que informe del estado del coche: freno, posicion, etc
 */
package p31;



/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Coche {

    private String nombre;
    private boolean encendido;
    private boolean frenoDeManoPuesto;
    private int posicion;

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
    public String toString(){
        
        return ""+nombre+": Esta " + ((encendido)?" encendido,":" apagado,")+
                ((frenoDeManoPuesto)?" Freno puesto. ":" Freno quitado. ")+
                "Pos: "+posicion;
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
