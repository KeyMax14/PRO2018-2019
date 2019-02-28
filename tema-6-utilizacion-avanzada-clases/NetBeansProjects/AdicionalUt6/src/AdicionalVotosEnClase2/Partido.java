/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalVotosEnClase2;

import java.util.HashMap;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Partido {

    String nombre;
    int votos;
    int diputados;

    public Partido(String nombre, int votos) {
        this.nombre = nombre;
        this.votos = votos;
        this.diputados = 0;
    }

    @Override
    public String toString() {
        return nombre + ":  votos=" + votos + "  Escaños=" + diputados;
    }
}

class Elecciones {

    int diputados = 350;

    HashMap<String, Partido> resultados;

    void agregarVotos(String nombre, int v) {
        Partido p = resultados.get(nombre);
        if (p == null) {
            p = new Partido(nombre, v);
        } else {
            p.votos += v;
        }
        resultados.put(nombre, p);
    }

    void calcularDiputados() {
        int totalVotos = 0;
        int diputadosRestantes = diputados;

        int totalVotosStream = (int) resultados.values().stream()
                .mapToInt(p -> p.votos)
                .sum();

//        for (Partido partido : resultados.values()) {
//            totalVotos += partido.votos;
//        }
        double votosPorDiputados = totalVotos / (double) diputados;

        diputadosRestantes -=  resultados.values().stream()
                .peek((p) -> {
                    p.diputados = (int) (p.votos / votosPorDiputados);
                })
                .mapToInt(p->p.diputados)
                .sum();

//        for (Partido p : resultados.values()) {
//            p.diputados = (int) (p.votos / votosPorDiputados);
//            diputadosRestantes -= p.diputados;
//        }

        while (diputadosRestantes > 0) {
            resultados.values().stream()
                    .max((p, q) -> {
                        double restoP = (p.votos / votosPorDiputados) - p.diputados;
                        double restoQ = (q.votos / votosPorDiputados) - q.diputados;
                        return Double.compare(restoP, restoQ); 
                    })
                    .ifPresent((p) -> {
                        p.diputados++;
                    });
            diputadosRestantes--;
        }

//        while (diputadosRestantes > 0) {
//            Partido p = calcularRestoMayor(votosPorDiputados);
//            p.diputados++;
//            diputadosRestantes--;
//        }
    }

    Partido calcularRestoMayor(double votosPorDiputados) {
        Partido resultado = null;
        double mayorDecimal = 0;
        for (Partido p : resultados.values()) {
            if (mayorDecimal < (p.votos / votosPorDiputados) - p.diputados) { //Esta resta en la siguiente iteracion daria negativa.
                resultado = p;
                mayorDecimal = (p.votos / votosPorDiputados) - p.diputados;
            }
        }
        return resultado;
    }
}
