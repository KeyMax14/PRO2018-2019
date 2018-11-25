/*
    Práctica 30: Partamos de la siguiente serie:
        1 - 1/2 + 1/3 - 1/4 + 1/5 - ... - 1/2*n + 1/2*n+1 - ...
        Podemos diseñar un procedimiento recursivo para calcular la suma de los n primeros
        elementos de la serie, de modo que usemos una función diferente para los elementos pares e
        impares.
 */
package practicasut3;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica30 {

    public static double sumaPar(double num) {
        double resultado = 0;

        if (num <= 0) {
            resultado = 0;
        } else {
            if (num % 2 != 0) {
                resultado = sumaImpar(num);
            } else {

                resultado = sumaImpar(num-1) - 1/(double)num;
            }
        }
        return resultado;
    }

    public static double sumaImpar(double num) {
        double resultado = 0;
        if (num % 2 == 0) {
            resultado = sumaPar(num);
        } else {
            if (num == 1) {
                resultado = num;
            } else {
                resultado = sumaPar(num-1) + 1 /(double)num;
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(sumaImpar(12));
    }
}
