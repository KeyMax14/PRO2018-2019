/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifradocadena;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class CifradoCadena {

    /**
     * @param args the command line arguments
     */
    public static String textoCifrado(String codigo) {
        String resultado = "";

        for (int i = 0; i < codigo.length(); i++) {
            if (codigo.charAt(i) + 2 > 'z') {
//                resultado+=""+ (char)((int)codigo.charAt(i)+2-((int)'z'-(int)'a'+1));
                resultado += (char)('a'-1+(2-('z'-codigo.charAt(i))));

            } else {
                resultado += "" + (char) ((int) codigo.charAt(i) + 2);
            }

        }
        return resultado;
    }

    public static String cifrar(String palabra) {
        String palabraFinal = "";
        return palabraFinal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = "aaz";
        System.out.println(textoCifrado(palabra));
        System.out.println((int) 'z' - (int) 'a' + " " + (int) 'z');
    }

}
