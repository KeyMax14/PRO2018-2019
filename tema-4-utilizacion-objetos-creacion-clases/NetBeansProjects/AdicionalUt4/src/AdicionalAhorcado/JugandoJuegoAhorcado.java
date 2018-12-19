/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalAhorcado;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */

class Juego{
    private static String[] posibilidades = {"amarillo","azul","blanco","rojo","gris","negro","verde","naranja"};
    private int numeroIntentos;
    public boolean partidaActivada;
    private char[] palabraSecreta;
    private char[] respuesta;
    private String letrasFalladas;

    public Juego(int numeroIntentos) {
        Random rnd = new Random();
        this.numeroIntentos = numeroIntentos;
        this.partidaActivada = true;
        this.palabraSecreta = posibilidades[rnd.nextInt(posibilidades.length)].toCharArray();
        this.respuesta = new char[palabraSecreta.length];
        for (int i = 0; i < respuesta.length; i++) {
            respuesta[i]='-';
        }
        this.letrasFalladas = "";
//        System.out.println(palabraSecreta);
        System.out.println(respuesta);
    }

    public Juego() {
        this(5);
    }
    
    public String apuesta(char apuesta){
        boolean letraAcertada = false;
        String resultado = "";
        for (int i = 0; i < palabraSecreta.length; i++) {
            if (apuesta == palabraSecreta[i]){
                respuesta[i]=apuesta;
                letraAcertada = true;
            }
        }
        if (!letraAcertada) {
            letrasFalladas += apuesta;
        }
        if (Arrays.equals(respuesta, palabraSecreta)) {
            resultado= "Has ganado. ¡Enhorabuena!";
            partidaActivada = false;
        }else{
            if (letrasFalladas.length()==numeroIntentos) {
                resultado = "Has perdido. La palabra secreta era ";
                for (int i = 0; i < palabraSecreta.length; i++) {
                    resultado += palabraSecreta[i];
                }
                resultado += ".";
                partidaActivada = false;
            }else{
                System.out.println(respuesta);
                System.out.print("Fallos: ");
                System.out.println(letrasFalladas);
            }
        }
        return resultado;
    }
    
    
    
    
    
}

public class JugandoJuegoAhorcado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Juego j = new Juego();
        
        while (j.partidaActivada) {
            System.out.println("Introduce una letra: ");
            String respuesta = j.apuesta(sc.next().charAt(0));
            System.out.println(respuesta);
        }
        

    }
}
