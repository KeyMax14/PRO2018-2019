/*
    Práctica 6: Crear un método llamado combinacion() que se le pasen dos números y
        obtenga la combinación de esos dos números. Este método debe hacer uso del método
        factorial creado en la práctica anterior. La fórmula de la combinación es:
        combinacion(n,r) = factorial(n) / ( factorial(n-r) * factorial(r))
 */
package practicasut3;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica06 {

    public static double factorial(int num) {
        double resultado = 1;
        for (int i = num; i > 0; i--) {
            resultado *= i;
        }
        return resultado;
    }

    public static double combinacion(int m, int n) {
        double combinacion = factorial(n)/(factorial(n-m)*factorial(m));
        return combinacion;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca m:");
        int m = sc.nextInt();
        System.out.println("Introduzca n:");
        int n = sc.nextInt();
        
        if (n>m) {
            System.out.println("C("+m+","+n+"): "+combinacion(m, n));
        }else{
            System.out.println("N debe ser mayor que M.");
        }
        
    }
}
