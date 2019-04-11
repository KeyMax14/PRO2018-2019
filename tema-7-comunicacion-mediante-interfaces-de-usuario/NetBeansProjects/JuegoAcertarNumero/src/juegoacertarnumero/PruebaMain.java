/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoacertarnumero;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class PruebaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JuegoAcertarNumero maquina = new JuegoAcertarNumero();
        
        JuegoAcertarNumero.Partida partida = maquina.nuevaPartida("Juan");
        System.out.println("Di tu apuesta: (0-99)");
        do {
            boolean valorValido = false;
            int numElegido;
            do {
                try {
                    numElegido = sc.nextInt();
                    System.out.println(partida.apuesta(numElegido));
                    valorValido = true;
                } catch (Exception e) {
                    sc.nextLine();
                    System.out.println("Introduce un número: (0-99)");
                }
            } while (!valorValido);
        } while (!partida.juegoFinalizado);
        
        System.out.println(maquina.resumenPartidas());
    }
}
