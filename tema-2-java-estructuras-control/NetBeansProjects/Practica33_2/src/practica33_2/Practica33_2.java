/*
    Práctica 33: Se pretende imitar el comportamiento de un sistema de control por pin. El
    usuario tiene 3 intentos para acertar con el pin, cada vez de esos tres intentos que falle se le
    informa y se le dice el número de intentos que le queda. Si acierta se le muestra un mensaje
    que diga: “El código es correcto. Bienvenido” Si no acierta en los tres intentos el programa
    termina
    Hacer 3 versiones de este código una con while, otra con do while y finalmente for
 */
package practica33_2;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica33_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Bucle for
        
        Scanner sc = new Scanner(System.in);

            int pin = 1234;
            int num=0;
            System.out.println("Introduce el número pin: ");
            
            for (int i = 0; i < 3 && num != pin; i++) {
                if (i>0)
                    System.out.println("Te quedan "+ (3-i)+" intento/s: ");
                num = sc.nextInt();
            }
            
            if (pin == num){
                System.out.println("El código es correcto.");
            }else{
                System.out.println("Demasiados intentos.");
            }
    }
    
}
