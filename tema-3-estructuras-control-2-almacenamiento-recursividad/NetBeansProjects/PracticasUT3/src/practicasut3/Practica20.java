/*
    Práctica 20: Crear un programa que incluya el código anterior e introducir el número 0
        cuando el programa lo solicite ¿ qué ocurre, hay un error ? Si es así ¿ cuál es el tipo de
        error/excepción que se desencandena ? ( tomar captura de pantalla del error y escribir el
        tipo de la excepción que se pudiera generar de haberla ) ¿ es lógico el mensaje recibido?
 */
package practicasut3;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica20 {

    public static void main(String[] args) {
        int numero = 0;
        boolean tengoNumeroValido = false;
        int division = 0;
        do {
            try {
                System.out.println("Introducir un número: ");
                Scanner sc = new Scanner(System.in);
                numero = sc.nextInt();
                division = 5 / numero;
                tengoNumeroValido = true;
            }catch(ArithmeticException ex){
                System.out.println("Division por 0.");
                tengoNumeroValido = false;
            } catch (Exception ex) {
                System.out.println("Se debe introducir un número válido");
                tengoNumeroValido = false;
            }
        } while (!tengoNumeroValido);
        System.out.println("El número introducido es: " + numero
                + " y la división de 5/" + numero + " da: " + division);
    }
}
