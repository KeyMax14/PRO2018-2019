/*
    Práctica 15: Crear un programa que muestre al azar una carta de la baraja española. Por ej.
        “sota de copas” Para ello se usarán dos array En el primero se registra:
        1,2,3,4,5,6,7,sota,caballo,rey
        En el segundo
        oros,copas,bastos,espadas
        Mediante dos aleatorios se toma un dato del primer array y un dato del segundo array para
        componer el nombre de la carta a mostrar
 */
package practicasut3;

import java.util.Random;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica15 {

    public static String cartaAleatoria() {
        Random rnd = new Random();
        String[] valorCarta = {"1", "2", "3", "4", "5", "6", "7", "sota", "caballo", "rey"};
        String[] paloCarta = {"oros", "copas", "bastos", "espadas"};

        String valorCartaFinal = valorCarta[rnd.nextInt(valorCarta.length)];
        String paloCartaFinal = paloCarta[rnd.nextInt(paloCarta.length)];
        String resultado = "" + valorCartaFinal + " de " + paloCartaFinal;
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(cartaAleatoria());
    }
}
