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
public class PasarDeStringAIntExcepciones {

    public static int proximoEntero() throws Exception {
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        int numFinal = 0, inicio=0;
        boolean esNegativo = false;
        if (texto.charAt(0) == '-') {
            inicio = 1;
            esNegativo = true;
        }else if (texto.charAt(0) == '+') {
            inicio = 1;
        }
        
        for (int i = inicio; i < texto.length(); i++) {
            int num = (int) texto.charAt(i) - (int) '0';
            if (num >= 0 && num <= 9) {
                numFinal *= 10;
                numFinal += num;
            } else {
                throw new Exception("No se ha introducido un número.");
            }
        }
        if (esNegativo) {
            numFinal *= -1;
        }
        return numFinal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int textoANum = 0;
        boolean error = true;
        do {
            try {
                textoANum = proximoEntero();
                error = false;
            } catch (Exception ex) {
                System.out.println("No ha introducido un número correcto.");
            }
        } while (error);
        System.out.println(textoANum);
    }
}
