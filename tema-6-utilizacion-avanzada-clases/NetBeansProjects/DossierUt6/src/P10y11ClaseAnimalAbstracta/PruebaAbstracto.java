/*
    Práctica 10: Utiliza el código del ejemplo de abstract Animal en el IDE y ejecútalo. Toma
        captura de pantalla ¿hay alguna salida de pantalla ? ¿se puede utilizar el constructor de una
        clase abstracta ? Ahora trata de crear un objeto: new Animal() y toma captura de pantalla
        del error que da el IDE ¿ qué significa el error ?
 */
package P10y11ClaseAnimalAbstracta;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class PruebaAbstracto {

    public static void main(String[] args) {
        Pajaro p = new Pajaro();
//        Animal a = new Animal();
    }
}

abstract class Animal {

    protected String nombre;
    protected int edad;
    protected int peso;

    public Animal() {
        System.out.println("jajaja! soy un animal!!!!");
    }

    public abstract String emitirSonido();
}

class Perro extends Animal {

    int dientes;

    @Override
    public String emitirSonido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class Pajaro extends Animal {

    @Override
    public String emitirSonido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    double ala;
}
