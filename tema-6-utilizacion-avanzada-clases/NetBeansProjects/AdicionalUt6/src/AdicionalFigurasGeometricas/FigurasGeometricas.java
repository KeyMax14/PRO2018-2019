/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalFigurasGeometricas;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public abstract class FigurasGeometricas {

    int lados;
    double area;

    public FigurasGeometricas(int lados, double area) {
        this.lados = lados;
        this.area = area;
    }

    static boolean esMayorQue(FigurasGeometricas f1, FigurasGeometricas f2) {
        return f1.lados > f2.lados;
    }

    static void ordenar(FigurasGeometricas[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (esMayorQue(arr[i], arr[j])) {
                    FigurasGeometricas aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;

                }

            }
        }
    }

    @Override
    public String toString() {
        return "lados=" + lados + ", area=" + area;
    }
    
}
