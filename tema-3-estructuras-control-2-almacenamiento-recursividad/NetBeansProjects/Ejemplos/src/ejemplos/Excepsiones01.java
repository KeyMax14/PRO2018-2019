/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Excepsiones01 {

    public static void f()  { // throws InputMismatchException
// Fragmento de código que puede
// lanzar una excepción de tipo IOException
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número para dividir 8: ");
        double dato = sc.nextDouble();
        if (dato == 0) {
            try {
                throw new Exception("Dividido por 0.");
            } catch (Exception ex) {
                Logger.getLogger(Excepsiones01.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("El número introducido es: "+(8/dato));
    }
//    public static void f() throws Exception  { // throws InputMismatchException
//// Fragmento de código que puede
//// lanzar una excepción de tipo IOException
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Dame un número para dividir 8: ");
//        double dato = sc.nextDouble();
//        if (dato == 0) {
//            throw new Exception("Dividido por 0.");
//        }
//        System.out.println("El número introducido es: "+(8/dato));
//    }

    public static void main(String[] args) {
        try {
            f();
        } catch (Exception error) { // InputMismatchException
// Tratamiento de la excepción
            System.out.println("Se ha producido un error\nparamos el programa");
        }
//         finally {
//// Liberar recursos (siempre se hace)
//        }
    }
}
