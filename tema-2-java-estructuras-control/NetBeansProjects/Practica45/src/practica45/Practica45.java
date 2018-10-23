/*
    Práctica 45: Crear un programa que reciba un número entero y que muestre su
        descomposición en números primos:
        300 = 2*2*3*5*5
 */
package practica45;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: (Mayor que 1) ");
        int num = sc.nextInt(), primo;
        
        if (num <= 1){
            System.out.println("Prueba con un número mayor que 1 la próxima vez.");
        }else{
            System.out.print(num+" = ");

            for (primo = 2; primo <= num && num != 1; primo++){
                while(num%primo==0){
                    System.out.print(primo);
                    num/=primo;
                    if (num != 1)
                        System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
    
}
