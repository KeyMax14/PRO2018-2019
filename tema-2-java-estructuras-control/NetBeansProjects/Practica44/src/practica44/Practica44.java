/*
    Práctica 44: Programa generador de potencias. El usuario introduce un número entero de 1
        a 20. Se le mostrará en pantalla las 5 primeras potencias de ese número.
        Ej. número introducido 2
        2^1 = 2
        2^2 = 4
        2^3 = 8
        2^4 = 16
        2^5 = 32
 */
package practica44;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: [1,20]");
        boolean flag = true;
        int num;
        
        while (flag){
            num = sc.nextInt();
            if (num < 1 || num >20){
                System.out.println("El número no está entre 1 y 20, prueba otra vez: [1,20]"); 
            }else{
                flag = false;
                for (int i = 1; i < 6; i++) {
                    System.out.println(num+"^"+i+" = "+(int)(Math.pow(num, i))+".");
                }
            }
        }
        
    }
    
}
