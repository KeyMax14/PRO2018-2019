/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica39;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean flag = true;
        
        System.out.println("Introduce un número entero: [10,99] ");
        while (flag){
            
            num = sc.nextInt();
            if (num >= 10 && num <=99){
                flag = false;
                String numInv = ""+num;
                System.out.println(""+numInv.charAt(1)+numInv.charAt(0)); 
            }else{
                System.out.println("Número incorrecto, prueba otra vez: [10,99]");
            }
        }
        
        
    }
    
}
