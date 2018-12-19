/*
    Práctica 38: Hacer un programa que recibe un número de horas, por ejemplo 135.25 y lo
        convierte a un formato de: días, horas, minutos, segundos. Siguiendo el ejemplo anterior:
        5días 15horas 15minutos 0segundos
 */
package practica38;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.UK);
        System.out.println("Introduce un número de horas: ");
        double horasIni = sc.nextDouble(); // Tengo que poner 135,25 y no puedo poner 135.25?? Por que?
        int dias = (int)(horasIni/24);
        int horasFin = (int)(horasIni%24);
        int minutos = (int)((horasIni%24-horasFin)*(double)60);
        int segundos = (int)((((horasIni%24-horasFin)*(double)60)-minutos)*60); // No se como sacar la parte decimal, algún metodo especial?
        System.out.println(dias+" días, "+horasFin+" horas, "+minutos+" minutos, "+segundos+" segundos.");
    }
    
}
