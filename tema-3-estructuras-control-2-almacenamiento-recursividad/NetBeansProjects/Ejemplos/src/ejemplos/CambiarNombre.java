/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */


public class CambiarNombre {
    
   static String cambiarNombre(String nombre){
       System.out.println(nombre);
       nombre = "david";
       return nombre;
   }
    
    public static void main(String[] args) {
        System.out.println("dame un nombre");
        Scanner sc = new Scanner(System.in);
        String nombre = "Paulín";
        String resultado = cambiarNombre(nombre); 
        System.out.println(resultado+" "+nombre);
    }
}
