/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenkevin;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ahorcado juego = new Ahorcado();
        String num;
        do {
            System.out.println("¿Que desea hacer?");
            System.out.println("1) Nueva partida.");
            System.out.println("2) listar partidas.");
            System.out.println("3) revisar estadisticas de una partida.");
            System.out.println("4) Salir.");

            num = sc.nextLine();
            switch (num) {
                case "1":
                    System.out.println("Intro nombre: ");
                    String nombre = sc.nextLine();
                    Ahorcado.Partida partida = juego.nuevaPartida(nombre);
                    System.out.println(partida.tuPalabra);
                    char letra;
                    do {
                        System.out.println("apueste una letra:");
                        letra = sc.nextLine().toLowerCase().charAt(0);
                        partida.apostarLetra(letra);
                    } while (!partida.juegoFinalizado);

                    break;

                case "2":
                    System.out.println(juego.listadoPartidas());
                    break;
                case "3":
                    System.out.println("¿De que partida desea obtener las estadisticas?");
                    int numPartida = sc.nextInt();
                    sc.nextLine();
                    if (numPartida < juego.partidas.size() && numPartida > -1) {
                        Ahorcado.Partida partidaEstadisticas = juego.obtenerPartida(numPartida);
                        System.out.println(partidaEstadisticas.resumenSituacionJuego());
                    } else {
                        System.out.println("Partida no encontrada.");
                    }
                    break;
                case "4":
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        } while (!num.equals("4"));
    }

}
