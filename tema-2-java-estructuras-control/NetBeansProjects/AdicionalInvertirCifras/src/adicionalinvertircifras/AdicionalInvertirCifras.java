/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicionalinvertircifras;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class AdicionalInvertirCifras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("dame un numero:");
        Scanner sc= new Scanner(System.in);
        String numIntro = sc.nextLine();
        
        for (int i = numIntro.length()-1; i > -1; i--) {
            System.out.print(numIntro.charAt(i));
        }
        System.out.println("");
    }
    
}
