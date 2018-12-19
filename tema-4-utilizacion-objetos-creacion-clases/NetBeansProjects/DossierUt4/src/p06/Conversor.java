/*
    Práctica 6: Crear un constructor para la clase Conversor que no reciba parámetros y
        especifice un tipo de cambio por defecto de 0.85 Crear dos objetos e instanciarlos
 */
package p06;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Conversor {

    private static double tipoCambio;

    public Conversor() {
        tipoCambio = 0.85;
    }

    public Conversor(double tipoCambio) {
        Conversor.tipoCambio = 0.8615;
        if (tipoCambio > 0) {
            Conversor.tipoCambio = tipoCambio;
        }
    }

    public double euroToDolar(double eur) {
        return eur / tipoCambio;
    }

    public double dolarToEuro(double dol) {
        return dol * tipoCambio;
    }

    public void establecerTipo(double t) {
        tipoCambio = t;
    }

    // Mod p24 - toString 
    @Override
    public String toString() {
        return "Tipo de cambio: " + tipoCambio;
    }

}
