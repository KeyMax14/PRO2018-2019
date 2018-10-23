/*
Práctica 21: Hacer un programa que se le pase un número entero y determine si es
múltiplo de 3 y de 5. Un módelo de mensajes a mostrar sería:
- x es multiplo de 3 pero no es múltiplo de 5
- x no es múltiplo de 3 pero sí es múltiplo de 5
- x no es múltiplo de 3 ni de 5
- x es múltiplo de 3 y de 5
 */
package practica21;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce un número entero: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if (num%3 == 0){ // Caso Multiplo de 3
            if (num%5 == 0){ // Caso Multiplo de 5
                System.out.println(num+" es múltiplo de 3 y de 5.");
            }else{ // Caso no multiplo de 5
                System.out.println(num+" es multiplo de 3 pero no es múltiplo de 5.");
            }
        }else{ // Caso No Multiplo de 3
            if (num%5 == 0){ // Caso Multiplo de 5
                System.out.println(num+" no es múltiplo de 3 pero sí es múltiplo de 5.");
            }else{ // Caso no multiplo de 5
                System.out.println(num+" no es múltiplo de 3 ni de 5.");
            }
        }
    }
    
}
