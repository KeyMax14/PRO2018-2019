/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicionalpropuestos1tema1;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Propuesta10 {
    public static void main(String[] args) {
        /*
        10: Diseña un algoritmo que lea un carácter cualquiera desde el teclado, 
                y muestre el mensaje "Es una MAYUSCULA" cuando el carácter sea una letra mayúscula y el mensaje 
                "Es una MINUSCULA" cuando sea una minúscula. En cualquier otro caso, no mostrará mensaje alguno. 
                (Considera únicamente letras del alfabeto inglés.)
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la letra para saber si es mayuscula o no: ");
        char letra = sc.next().charAt(0);
        
        if (letra >= 'A' && letra <= 'Z') {
            System.out.println("La letra es mayuscula.");
        }else if (letra >= 'a' && letra <= 'z') {
            System.out.println("La letra es minuscula.");
        }else{
            System.out.println("El cáracter introducido no es válido.");
        }
        
        // Usando la función toLowerCase
        System.out.println("Introduce la letra para saber si es mayuscula o no: ");
        String texto = sc.next().substring(0, 1); //
        
        
        if (texto.toLowerCase() != texto.toUpperCase()) {
            if (texto.toLowerCase() == texto) {
                System.out.println("La letra es minúscula.");
            }else{
                System.out.println("La letra es mayúscula.");
            }
        }else{
            System.out.println("El cáracter introducido no es válido.");
        }
    }
}
