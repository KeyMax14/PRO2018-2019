/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class ExcepcionesParseint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número: ");
        int dato = 0, resultado = 0;
        boolean datoCorrecto = false;

        while (!datoCorrecto) {
            try {
                dato = sc.nextInt();
                
                resultado=5/dato;
                datoCorrecto = true;
            } catch(InputMismatchException ex){                 //catch (Exception ex) { /* Esto seria una excepcion por defecto.*/
                ex.printStackTrace();
                sc.nextLine(); // Esto es porque Scanner se queda en el buffer.
                System.out.println("No es un número valido, finaliza el programa.");
                System.out.println("Dame bien el número");
            }catch(ArithmeticException ex){
                sc.nextLine();
                System.out.println("No se puede dividir por 0.");
            }
        }
        System.out.println("Dividiendo 5 entre resultado:" +resultado);
        System.out.println("Multiplicado por dos: " + (dato*2));

    }
}
