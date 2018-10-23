/*
    Práctica 33: Se pretende imitar el comportamiento de un sistema de control por pin. El
    usuario tiene 3 intentos para acertar con el pin, cada vez de esos tres intentos que falle se le
    informa y se le dice el número de intentos que le queda. Si acierta se le muestra un mensaje
    que diga: “El código es correcto. Bienvenido” Si no acierta en los tres intentos el programa
    termina
    Hacer 3 versiones de este código una con while, otra con do while y finalmente for
 */
package practica33;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Bucle While
            Scanner sc = new Scanner(System.in);
            int i = 1;
            int pin = 1234;
            
            System.out.println("Introduce el número pin: ");
            int num = sc.nextInt();
            while ( num != pin && i != 3 ){
                System.out.println("Te quedan "+ (3-i)+" intento/s: ");
                num = sc.nextInt();
                i++;
            }
            if (pin == num){
                System.out.println("El código es correcto.");
            }else{
                System.out.println("Demasiados intentos.");
            }
    }
    
}
