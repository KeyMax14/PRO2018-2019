/*
   Practica 04: Crear un método llamado numeroValido(). El usuario debe introducir un
    número entre 20 y 50 y ser múltiplo de 3. El main() del programa
 */
package practicasut3;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica04 {

    static boolean numeroValido(int num){
        return ((num >= 20 && num <= 50) && num%3==0);
    }
    
    public static void main(String[] args) {
        int num;
        Scanner cin = new Scanner(System.in);
        do {
            System.out.println("Introducir un número: ");
            num = cin.nextInt();
        } while (!numeroValido(num));
        System.out.println("El número cumple los requisitos. Se puede continuar");
    }
}
