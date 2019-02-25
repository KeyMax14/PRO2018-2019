/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalVotosPartidosEscanios;


import java.util.ArrayList;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Votos {

    public static int totalVotos(ArrayList<Partido> partidos) {
        int total = 0;
        for (Partido partido : partidos) {
            total += partido.votos;
        }
        return total;
    }

    public static void calcularEscanios(int escaniosDisponibles, ArrayList<Partido> partidos) {
        double valorEscanio = totalVotos(partidos) / (double) escaniosDisponibles;

        ArrayList<Double> resto = new ArrayList<>();
        int escaniosRepartidos = 0;
        for (Partido partido : partidos) {
            partido.escanios += (int) (partido.votos / valorEscanio);
            escaniosRepartidos += partido.escanios;
            resto.add((partido.votos / valorEscanio) - partido.escanios);
        }

        while (escaniosRepartidos < escaniosDisponibles) {
            int posMayor = 0;
            for (int i = 1; i < resto.size(); i++) {
                if (resto.get(posMayor) < resto.get(i)) {
                    posMayor = i;
                }
            }
            partidos.get(posMayor).escanios += 1;
            resto.set(posMayor, 0.0);
            escaniosRepartidos += 1;
        }
    }

    public static void main(String[] args) {
        int escaniosDisponibles = 300;

        ArrayList<Partido> partidos = new ArrayList<>();
        partidos.add(new Partido("PP", 2000));
        partidos.add(new Partido("PSOE", 1000));
        partidos.add(new Partido("VOX", 5000));
        
        calcularEscanios(escaniosDisponibles, partidos);

        for (Partido partido : partidos) {
            System.out.println(partido);
        }

    }
}
