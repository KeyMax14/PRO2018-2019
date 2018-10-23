/*
    Práctica 42: Hay una cuadrilla de trabajadores que aceptar encargos. Pongamos por
        ejemplo que tienen un encargo por 10000€. Al finalizar el trabajo observan que han
        participado 5 componentes de la cuadrilla dedicando cada uno de ellos respectivamente el
        siguiente número de horas:
        10, 100, 100, 20, 20
        Así que en total han invertido 250horas para un trabajo de 10000€ saliendo la hora
        trabajada a: 40€
        Hacer un programa que les permita calcular lo que sale cada hora trabajada. Como datos de
        entrada recibirá el dinero total que se pagará por el encargo. El número de participantes de
        la cuadrilla y el número de horas que haya realizado cada uno de los participantes
 */
package practica42;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Qué dinero total se recibira por el trabajo?");
        
        int dineroTotal = sc.nextInt();
        System.out.println("¿De cuantas personas es la cuadrilla?");
        
        int numCuadrilla = sc.nextInt();
        int suma = 0;
        
        for (int i = 1; i <= numCuadrilla; i++) {
            System.out.println("¿Cuantas horas ha trabajado el trabajador "+i+"?");
            int horas = sc.nextInt();
            suma += horas;
        }
        
        System.out.println("\nEn total han invertido "+suma+
                " horas para un trabajo de "+dineroTotal+
                "€ saliendo la hora trabajada a: "+(dineroTotal/suma)+"€");
    }
    
}
