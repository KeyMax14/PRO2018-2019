/*
    Práctica 43: Escribir un programa donde se genera un número secreto mayor o igual a 1 y
        menor o igual a 99 El jugador intentará acertar el número si se equivoca el programa le
        informa de si el número secreto es mayor o menor que el que él ha introducido. El
        programa finaliza cuando el jugador acierte en cuyo caso se le mostrará elnúmero de
        intentos que ha necesitado para acertar.
        Nota: se puede utilizar Random para el número aleatorio:
        Random rnd = new Random();
        rnd.nextInt(30); //genera un aleatorio desde 0 hasta 29
 */
package practica43;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int numSecreto = rnd.nextInt(99)+1, num, intentos = 0;
        boolean flag = true;
        
        System.out.println("Acierta el número secreto: [1,99]");
        while (flag){
            num = sc.nextInt();
            intentos++;
            if (num < numSecreto) {
                System.out.println("El número secreto es MAYOR que el introducido.");
            }else if (num > numSecreto){
                System.out.println("El número secreto es MENOR que el introducido.");
            }else{
                System.out.println("¡Has acertado!\nNúmero de intentos: "+intentos);
                flag = false;
            }
        }
    }
    
}
