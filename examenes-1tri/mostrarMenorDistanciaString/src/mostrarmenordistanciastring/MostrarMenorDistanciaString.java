/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mostrarmenordistanciastring;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class MostrarMenorDistanciaString {

    /**
     * @param args the command line arguments
     */
    public static void minimaDistancia(String palabra) {

        boolean hayMinimo = false;
        int distanciaMinima = 0;
        int dis1;
        int dis2;
        int dis3;
        String stringDistanciaMinima ="";
        for (int i = 0; i < palabra.length() - 2; i++) {
            if (!hayMinimo) {
                dis1 = Math.abs((int) palabra.charAt(i) - (int) palabra.charAt(i + 1));
                dis2 = Math.abs((int) palabra.charAt(i) - (int) palabra.charAt(i + 2));
                dis3 = Math.abs((int) palabra.charAt(i + 1) - (int) palabra.charAt(i + 2));
                distanciaMinima = dis1 + dis2 + dis3;
                stringDistanciaMinima = palabra.substring(i, i + 2);
                hayMinimo = true;
            } else {
                dis1 = Math.abs((int) palabra.charAt(i) - (int) palabra.charAt(i + 1));
                dis2 = Math.abs((int) palabra.charAt(i) - (int) palabra.charAt(i + 2));
                dis3 = Math.abs((int) palabra.charAt(i + 1) - (int) palabra.charAt(i + 2));
                int distanciaActual = dis1 + dis2 + dis3;
                if (distanciaMinima > distanciaActual) {
                    distanciaMinima = distanciaActual;
                    stringDistanciaMinima = palabra.substring(i, i + 3);
                }
            }
        }
        System.out.println(stringDistanciaMinima);

    }
    
    public static String buscarDistanciaMenor(String cadena){
        String resultado = "";
        int mayorDistancia = 200000;
        for (int i = 0; i < cadena.length()-2; i++) {
            int distancia = Math.abs(cadena.charAt(i)-cadena.charAt(i+1));
            distancia += Math.abs(cadena.charAt(i+1)-cadena.charAt(i+1));
            distancia += Math.abs(cadena.charAt(i)-cadena.charAt(i+2));
            if (distancia < mayorDistancia) {
                resultado = ""+cadena.charAt(i)+cadena.charAt(i+1)+cadena.charAt(i+2);
//                resultado = cadena.substring(i, i+3);
                mayorDistancia = distancia;
            }
            
        }
        return resultado;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String palabra = sc.next().toLowerCase();
//        String palabra = "paquitochocolatero";
        String palabra = "apzzzrthgsdf";
        minimaDistancia(palabra);
        System.out.println(buscarDistanciaMenor(palabra));
        
    }

}
