/*
    Comprobar si un número es capìcua.
 */
package adicionales;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class ComprobarNumeroCapicuaString {

    public static void esCapicua(String num) {

        String reverso = "";
        for (int i = 0; i < num.length(); i++) {
            char caracter = num.charAt(i);
            reverso = "" + caracter + reverso;
        }
        
        boolean resultado =  num.equals(reverso);
        
        if (resultado) {
            System.out.println("Es capicua.");
        }else
            System.out.println("No es capicua.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Introduce num: ");
//        int num = sc.nextInt();
        int num = 12344321;
        String numString = "" + num;
        esCapicua(numString);
        
    }
}
