/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoacertarnumero;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class JuegoAcertarNumero {

    class Partida {

        int numeroSecreto;
        String nombreJugador;
        LinkedHashSet<String> listaFallos;
        int numIntentos;
        final int limiteIntentos = 7;
        boolean juegoFinalizado;
        boolean ganador;

        public Partida(String nombreJugador) {
            Random rnd = new Random();
            numeroSecreto = rnd.nextInt(100);
            this.nombreJugador = nombreJugador;
            listaFallos = new LinkedHashSet<>();
            numIntentos = 0;
            juegoFinalizado = false;
            ganador = false;
        }

        public Partida() {
            this("Anonimo");
        }

        public String apuesta(int numApostado) {
            String resultado;
            if (juegoFinalizado) {
                resultado = "Juego finalizado. " + nombreJugador + " ha " + ((ganador) ? "ganado." : "perdido.");
            } else {
                if (numApostado > numeroSecreto || numApostado < numeroSecreto) {
                    numIntentos++;
                    if (numIntentos >= limiteIntentos) {
                        juegoFinalizado = true;
                        ganador = false;
                        resultado = "" + nombreJugador + " ha perdido. Número secreto: " + numeroSecreto;
                    } else {
                        listaFallos.add("" + numApostado);
                        resultado = "" + numApostado + " es " + ((numApostado > numeroSecreto) ? "mayor" : "menor") + " que el número secreto. Intento: " + numIntentos;
                    }
                } else {
                    juegoFinalizado = true;
                    ganador = true;
                    resultado = "" + nombreJugador + " ha ganado. Número intentos: " + numIntentos + " Número secreto: " + numeroSecreto;
                }
            }
            return resultado;
        }

        public int getNumFallos() {
            return numIntentos;
        }

        public int getNumeroSecreto() {
            return numeroSecreto;
        }

        public String getNombreJugador() {
            return nombreJugador;
        }

        public LinkedHashSet<String> getListaFallos() {
            return listaFallos;
        }

        public int getNumIntentos() {
            return numIntentos;
        }

        public int getLimiteIntentos() {
            return limiteIntentos;
        }

        public boolean isJuegoFinalizado() {
            return juegoFinalizado;
        }

        public boolean isGanador() {
            return ganador;
        }

        @Override
        public String toString() {
            String resultado = "";
            if (juegoFinalizado) {
                resultado = "" + nombreJugador + ((ganador) ? " ha ganado. " : " ha perdido. ") + "Número de intentos: " + numIntentos
                        + " Número secreto: " + numeroSecreto;
            } else {
                resultado = "" + nombreJugador + " no ha terminado la partida. Intentos restantes: " + (limiteIntentos - numIntentos);
            }
            return resultado;
        }
    }

    ArrayList<Partida> listaPartidas;

    public JuegoAcertarNumero() {
        listaPartidas = new ArrayList<>();
    }

    public Partida nuevaPartida(String nombreJugador) {
        Partida partida = new Partida(nombreJugador);
        listaPartidas.add(partida);
        return partida;
    }

    public Partida nuevaPartida() {
        return this.nuevaPartida("Anonimo");
    }

    public String resumenPartidas() {
        String resultado = "No hay partidas.";
        if (listaPartidas.size() >= 1) {
            resultado = "";
            for (Partida partida : listaPartidas) {
                resultado += partida + "\n";
            }
        }
        return resultado;
    }

}
