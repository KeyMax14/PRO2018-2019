/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenkevin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/**
 *
 * @author Kevin Hernández García
 */
public class Ahorcado {

    class Partida {

        protected String nombreJugador;
        protected final String[] palabras = {"Acacias", "Hola", "Adios", "Palabra", "Juego"};
        protected String palabraSecreta;
        protected String tuPalabra;
        protected HashSet<String> letrasFalladas;
        protected int numFallos;
        protected boolean juegoFinalizado;
        protected boolean ganador;

        public Partida(String nombreJugador) {
            Random rnd = new Random();
            tuPalabra = "";
            palabraSecreta = palabras[rnd.nextInt(palabras.length)];
            for (int i = 0; i < palabraSecreta.length(); i++) {
                tuPalabra += "-";
            }
            letrasFalladas = new HashSet<String>();
            numFallos = 0;
            this.nombreJugador = nombreJugador;
            juegoFinalizado = false;
            ganador = false;

        }

        public void apostarLetra(char letra) {
            if (juegoFinalizado) {
                System.out.println("Juego acabado.");
            } else {
                boolean hayLetra = false;
                String palabraNueva = "";
                for (int i = 0; i < palabraSecreta.length(); i++) {
                    if (palabraSecreta.toLowerCase().charAt(i) == letra) {
                        palabraNueva += palabraSecreta.charAt(i);
                        hayLetra = true;
                    } else {
                        palabraNueva += tuPalabra.charAt(i);
                    }
                }
                tuPalabra = palabraNueva;
                if (!hayLetra) {
                    numFallos += 1;
                    letrasFalladas.add("" + letra);
                }
                if (numFallos >= 5) {
                    System.out.println("Error. " + nombreJugador + " ha perdido. Palabra Secreta: " + palabraSecreta);
                    ganador = false;
                    juegoFinalizado = true;
                } else {
                    if (tuPalabra.equals(palabraSecreta)) {
                        System.out.println("Acierto. " + nombreJugador + " ha ganado. Palabra Secreta: " + palabraSecreta);
                        ganador = true;
                        juegoFinalizado = true;
                    } else {
                        System.out.println(((hayLetra) ? "Acierto. " : "Error. ") + resumenSituacionJuego());
                    }
                }
            }
        }

        public String resumenSituacionJuego() {
            String resultado = "Palabra: " + tuPalabra + ". Intentos fallidos: " + numFallos + ". Errores:";
            for (String letraFallada : letrasFalladas) {
                resultado += " " + letraFallada;
            }
            return resultado;
        }

        public boolean juegoActivo() {
            return juegoFinalizado;
        }

    }

    ArrayList<Partida> partidas;

    public Ahorcado() {
        partidas = new ArrayList<>();
    }

    public Partida nuevaPartida(String nombreUsuario) {
        Partida nuevaPartida = new Partida(nombreUsuario);
        partidas.add(nuevaPartida);
        return nuevaPartida;
    }

    public Partida obtenerPartida(int num) {
        Partida obPartida = null;
        if (num >= 0 && num < partidas.size()) {
            obPartida = partidas.get(num);
        }
        return obPartida;
    }

    public String listadoPartidas() {
        String resultado = "";
        for (int i = 0; i < partidas.size(); i++) {
            resultado += i + ". jugador: " + partidas.get(i).nombreJugador + " resultado: "+ ((partidas.get(i).ganador)?"GANÓ":"PERDIÓ")+"\n";
        }
        return resultado;
    }

}
