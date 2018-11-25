/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicionalcalculadorasumar;

//import java.util.Scanner;
/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class AdicionalCalculadoraSumarParametros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//            Scanner sc= new Scanner(System.in);
//            System.out.println("Dame num1: ");
//            int num1 = sc.nextInt();
//            System.out.println("Dame num2: ");
//            int num2 = sc.nextInt();
        // usando java JAR - Obteniendo información mediante argumentos.
        if (args.length < 2) {
            System.out.println("Introduce dos números como mínimo.");
        } else {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            System.out.println("Suma de: " + num1 + " + " + num2 + " = " + (num1 + num2));
        }
    }

}
