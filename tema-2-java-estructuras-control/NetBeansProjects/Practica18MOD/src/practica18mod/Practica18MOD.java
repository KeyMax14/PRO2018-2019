/*
Práctica 18: Escribe un programa que calcule el salario semanal de un empleado en base
a las horas trabajadas, a razón de 18 euros la hora.
 */
package practica18mod;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica18MOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Modificado para introducir todos los dias de la semana.
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame las horas del lunes: ");
        int horasSemanales = sc.nextInt();
        System.out.println("Dame las horas del martes: ");
        horasSemanales += sc.nextInt();
        System.out.println("Dame las horas del miercoles: ");
        horasSemanales += sc.nextInt();
        System.out.println("Dame las horas del jueves: ");
        horasSemanales += sc.nextInt();
        System.out.println("Dame las horas del viernes: ");
        horasSemanales += sc.nextInt();
        
        
        System.out.println("Cobrando 18 euros la hora suman "+(horasSemanales*18)+ " euros semanales.");
    }
    
}
