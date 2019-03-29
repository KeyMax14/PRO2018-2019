/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
class NotasPonderadas {

    double nota;
    double ponderacion;

    public NotasPonderadas(double ponderacion, double nota) {
        this.nota = nota;
        this.ponderacion = ponderacion;
    }
};

public class Ponderaciones {

    public ArrayList<NotasPonderadas> notas;

    public Ponderaciones() {
        notas = new ArrayList<>();
    }

    // Hacerlo con un Stream
    public void agregarNota(double valorPonderacion, String valores) {

        notas.addAll((ArrayList<NotasPonderadas>) Arrays.stream(valores.split("\\s"))
                .filter(p -> p.matches("^(([0-9])(\\.[0-9]{1,2})?)|(10(\\.[0]+)?)$"))
                .map(p -> {
                    NotasPonderadas dato = new NotasPonderadas(valorPonderacion, Double.parseDouble(p));
                    return dato;
                })
                .collect(Collectors.toList()));
    }

    public void restartNotas() {
        notas.clear();
    }
    
    public String obtenerNotasPorPonderacion(double ponderacion){
        String resultado = "";
        for (NotasPonderadas nota : notas) {
            if (Double.compare(nota.ponderacion, ponderacion) == 0) {
                resultado += nota.nota+" ";
            }
        }
        return resultado;
    }

    public String getResultado() {
        String resultado = "";
        if (!notas.equals(null)) {
            double suma = notas.stream()
                    .mapToDouble(p -> p.ponderacion)
                    .sum();

            double nota = notas.stream()
                    .mapToDouble(p -> p.nota * p.ponderacion)
                    .sum();
            resultado = "" + nota / suma;

        }else{
            resultado = "No hay notas";
        }
        return resultado;
    }
}
