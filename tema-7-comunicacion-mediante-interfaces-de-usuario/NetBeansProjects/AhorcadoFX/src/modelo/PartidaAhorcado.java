/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.HashSet;
import java.util.Random;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class PartidaAhorcado {

    protected final String[] palabras = {"Acacias", "Hola", "Adios", "Palabra", "Juego"};
    protected String palabraSecreta;
    protected String tuPalabra;
    protected HashSet<String> letrasFalladas;
    protected int numIntentosRestantes;
    protected boolean juegoFinalizado;
    protected boolean ganador;

    public PartidaAhorcado() {
        Random rnd = new Random();
        tuPalabra = "";
        palabraSecreta = palabras[rnd.nextInt(palabras.length)];
        for (int i = 0; i < palabraSecreta.length(); i++) {
            tuPalabra += "-";
        }
        letrasFalladas = new HashSet<String>();
        numIntentosRestantes = 7;
        juegoFinalizado = false;
        ganador = false;

    }

    public String apostarLetra(char letra) {
        String res;
        if (juegoFinalizado) {
            res = "Juego acabado.";
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
                numIntentosRestantes -= 1;
                letrasFalladas.add("" + letra);
            }

            if (numIntentosRestantes == 0) {
                res = "Has Perdido. Palabra: " + palabraSecreta;
                System.out.println("Error. Has perdido. Palabra Secreta: " + palabraSecreta);
                ganador = false;
                juegoFinalizado = true;
            } else {
                if (tuPalabra.equals(palabraSecreta)) {
                    res = "Has ganado. Palabra: " + palabraNueva;
                    System.out.println("Acierto. Has ganado. Palabra Secreta: " + palabraSecreta);
                    ganador = true;
                    juegoFinalizado = true;
                } else {
                    res = ((hayLetra) ? "Acierto. " : "Error. ");
                    System.out.println(((hayLetra) ? "Acierto. " : "Error. ") + resumenSituacionJuego());
                }
            }
        }
        return res;
    }

    public String resumenSituacionJuego() {
        String resultado = "Palabra: " + tuPalabra + ". Intentos fallidos: " + numIntentosRestantes + ". Errores:";
        for (String letraFallada : letrasFalladas) {
            resultado += " " + letraFallada;
        }
        return resultado;
    }

    public String getTuPalabra() {
        return tuPalabra;
    }

    public String getLetrasFalladas() {
        String resultado = "";
        for (String letraFallada : letrasFalladas) {
            resultado += letraFallada +" ";
        }
        return resultado;
    }

    public int getNumIntentosRestantes() {
        return numIntentosRestantes;
    }

    public boolean isGanador() {
        return ganador;
    }

    public String getPalabraSecreta() {
        return palabraSecreta;
    }

    public boolean isJuegoFinalizado() {
        return juegoFinalizado;
    }

}
