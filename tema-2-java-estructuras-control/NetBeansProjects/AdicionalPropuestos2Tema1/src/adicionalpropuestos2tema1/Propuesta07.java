/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicionalpropuestos2tema1;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Propuesta07 {
    public static void main(String[] args) {
        /*
            Diseña un algoritmo que solicite la lectura, letra a letra, de un texto que no contenga letras mayúsculas. 
                Si el usuario teclea una letra mayúscula, el algoritmo solicitará nuevamente la introducción 
                del texto cuantas veces sea preciso.
        */
         Scanner sc = new Scanner(System.in);
         System.out.println("Escribe un texto solo en minusculas: ");
         String text= sc.nextLine();
         while (text != text.toLowerCase()){
             System.out.println("Solo se permiten las minusculas, prueba otra vez: ");
             text = sc.nextLine();
         }
    }
}
