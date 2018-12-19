/*
    Práctica 13: Crea con el código de ejemplo la clase Coche en el IDE y modifica el segundo
        constructor haciendo que la primera línea no sea la llamada a: this()
        ( por ejemplo declara una variable local, etc ) Toma captura de pantalla del mensaje y
        contesta ¿ qué mensaje muestra el IDE ?
 */
package p13;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
class Coche {

    private String marca;
    private String modelo;
    private double potencia;
    private int puertas;
    private String matricula;

    Coche(String marca, String modelo, double potencia, int puertas, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.puertas = puertas;
        this.matricula = matricula;
    }
    
        // Mod p24 - toString

    @Override
    public String toString() {
        return "Marca: "+marca+" Modelo: "+modelo+" Potencia: "+potencia+
                " n_puerta: "+ puertas+" Matricula: "+matricula;
    }

    Coche(double potencia, int puertas) {
//        int prueba;
        this(null, null, potencia, puertas, null);
    }
}
