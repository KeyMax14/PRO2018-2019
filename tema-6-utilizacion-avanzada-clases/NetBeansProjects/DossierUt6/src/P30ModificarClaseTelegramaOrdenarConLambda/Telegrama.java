/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P30ModificarClaseTelegramaOrdenarConLambda;

import java.util.Comparator;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */


// Método de ordenacion antes de usar las lambdas.

/*
    class ComparadorTelegrama implements Comparator<Telegrama>{
        @Override
        public int compare(Telegrama t, Telegrama t1) {
            return Double.compare(t.coste(), t1.coste());
        }
    }
*/


public class Telegrama {
    private String texto;
    private String remitente;
    private String receptor;
    private double precioPalabra;

    public Telegrama(String texto, String remitente, String receptor, double precioPalabra) {
        this.texto = texto;
        this.remitente = remitente;
        this.receptor = receptor;
        this.precioPalabra = precioPalabra;
    }

    public Telegrama(String texto, String remitente, String receptor) {
        this(texto, remitente, receptor, 1);
    }
    
    public double coste(){
        return texto.length()*precioPalabra;
    }

    @Override
    public String toString() {
        return "Remitente: "+remitente+
                "\nEmitido a: "+receptor+
                "\n"+texto+"\n";
    }
}
