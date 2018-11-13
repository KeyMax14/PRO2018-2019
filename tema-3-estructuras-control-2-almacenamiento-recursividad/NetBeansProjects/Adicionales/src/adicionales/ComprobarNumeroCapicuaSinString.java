/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicionales;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class ComprobarNumeroCapicuaSinString {
    
    public static void esCapicua(int num){
        int numInverso = girarNum(num);
        if (num == numInverso) {
            System.out.println("Es capicua.");
        }else
            System.out.println("No es capicua.");
        
    }
    
    public static int girarNum(int num){
        int resultado= 0, cociente, resto;
        cociente = num;
        
        do {
            resto = cociente % 10;
            cociente = cociente /10;
            resultado *= 10;
            resultado += resto;
        } while (cociente != 0);
        
        
        return resultado;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Intro num:");
        int num = sc.nextInt();
//        int num = 123321;
        esCapicua(num);
    }
}
