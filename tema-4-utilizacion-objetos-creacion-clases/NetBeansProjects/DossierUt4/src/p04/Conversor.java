/*
    Práctica 4: Crear la clase: Conversor Esta clase sirve para cambiar de euros a dolares y de
        dolares a euros. Tiene un constructor que recibe el tipo de cambio (utilizar el cambio actual)
        Pongamos por ejemplo: 0.8615 y tiene dos métodos: euroToDolar() y dolarToEuro() que
        reciben un double que representa respetivamente euros y dolares y devuelve la divisa
        transformada. También tiene un método llamado: establecerTipo(double t) que nos
        permitirá modificar posteriormente el tipo de cambio por si cambia con el tiempo
 */
package p04;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Conversor {

    private static double tipoCambio;
    
    //Asi puedes mantener el constructor por defecto
    public Conversor(){}
    
    public Conversor(double tipoCambio){
        Conversor.tipoCambio = 0.8615;
        if (tipoCambio > 0) {
            Conversor.tipoCambio = tipoCambio;
        }
    }
    
    // Mod p24 - toString 

    @Override
    public String toString() {
        return "Tipo de cambio: "+tipoCambio;
    }
    
    
    
    public double euroToDolar(double eur){
        return eur/tipoCambio;
    }
    
    public double dolarToEuro(double dol){
        return dol*tipoCambio;
    }
    
    public void establecerTipo(double t){
        tipoCambio = t;
    }

}
