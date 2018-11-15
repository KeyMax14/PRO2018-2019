/*
    Práctica 19: Crear un programa que incluya el código anterior e introducir texto en lugar
        de un número cuando el programa lo solicite ¿ qué ocurre, hay un error ? Si es así ¿ cuál es
        el tipo de error/excepción que se desencandena ? ( tomar captura de pantalla del error y
        escribir el tipo de la excepción que se pudiera generar de haberla )
 */
package practicasut3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica19 {

    public static void main(String[] args) {
        System.out.println("Introducir un número: ");
        Scanner sc = new Scanner(System.in);
        int numero = 0, division = 0;
        boolean salir = false;
        while (!salir) {
            try {
                numero = sc.nextInt();
                salir = true;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Introduce un número válido.");
            }
        }
        division = 5 / numero;
        System.out.println("El número introducido es: " + numero
                + " y la división de 5/" + numero + " da: " + division);
    }
}
