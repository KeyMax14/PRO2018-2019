/*
Práctica 18: Escribe un programa que calcule el salario semanal de un empleado en base
a las horas trabajadas, a razón de 18 euros la hora
 */
package practica18;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("¿Cuantas horas trabaja a la semana? ");
        Scanner sc = new Scanner(System.in);
        int horasSemanales = sc.nextInt();
        System.out.println("Cobrando 18 euros la hora suman "+(horasSemanales*18)+ " euros semanales.");
    }
    
}
