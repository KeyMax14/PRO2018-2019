/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculomediasinextremo;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class CalculoMediaSinExtremo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        El programa permitirá obtener la media de las notas de un alumno. Como se considera que pudiera ocurrir que alguien tenga un día especialmente malo o un día especialmente bueno no se tendrán en cuenta los extremos ( la calificación menor y la mayor ) 
Tener en cuenta que deben introducirse 3 notas válidas para que el programa funcione. En otro caso dirá:
"Se deben introducir al menos 3 datos entre 0 y 10" 
Ejemplo de salida en pantalla:

Programa de cálculo de nota media sin extremos
nota: (-1 para salir)
5
nota: (-1 para salir)
7
nota: (-1 para salir)
0
nota: (-1 para salir)
9
nota: (-1 para salir)
-1
Cantidad notas consideradas: 2
La media sin los extremos es: 6.0
        
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Programa para calcular media sin Extremos");
        int i = 0, nota, maximo = -1, minimo = 11, sumaNota = 0;

        do {
            System.out.println("Introduce una nota: ");
            nota = sc.nextInt();

            if (nota >= 0 && nota <= 10) {
                if (nota > maximo) {
                    maximo = nota;
                }
                if (nota < minimo) {
                    minimo = nota;
                }
                sumaNota += nota;
                i++;
            }
        } while (nota >= 0);

        if (i > 2) {

            i -= 2;

            sumaNota -= maximo;
            sumaNota -= minimo;

            System.out.println("Cantidad de notas consideradas: " + i);
            System.out.println("La media es igual a " + sumaNota / (double)i);
        } else {
            System.out.println("No ha introducido 3 o más notas.");
        }
    }

}
