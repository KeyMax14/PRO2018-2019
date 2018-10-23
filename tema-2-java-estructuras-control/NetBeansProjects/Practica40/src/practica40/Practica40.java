/*
    Práctica 40: Escribir un programa que reciba un número entero mayor o igual a 0 y menor
        o igual a 999 y muestre cuántas cifras tiene
 */
package practica40;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean flag = true;
        
        System.out.println("Introduzca un número entero: [0,999]");
        while (flag){
            num = sc.nextInt();
            if (num >= 0 && num <=999){
                flag = false;
                String numLen = ""+num;
                System.out.println("Tiene "+numLen.length()+" cifra/s."); 
            }else{
                System.out.println("Número incorrecto, prueba otra vez: [0,999]");
            }
        }
    }
    
}
