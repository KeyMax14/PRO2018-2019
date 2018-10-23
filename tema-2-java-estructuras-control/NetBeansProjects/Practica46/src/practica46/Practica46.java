/*
    Práctica 46: Convertir un número a binario. El usuario introduce un número entero
        decimal y el programa muestra en pantalla como es su forma en binario
 */
package practica46;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num = sc.nextInt();
        String binario = "";
        if (num > 0){
            while (num >= 1){
                if (num % 2 == 0){
                    binario = "0" + binario;
                }else{
                    binario = "1" + binario;
                }
                num /= 2;
            }
            System.out.println("El número en binario es: "+binario);
        }else if (num == 0){
            System.out.println("El número en binario es: 0");
        }else
            System.out.println("Introduce un número positivo.");
        
    }
    
}
