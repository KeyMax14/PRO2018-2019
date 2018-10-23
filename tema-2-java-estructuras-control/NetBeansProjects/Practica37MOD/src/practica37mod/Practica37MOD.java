/*
    Práctica 37: Crear un programa que le pregunte al usuario la cantidad de billetes que tiene
de 500, luego le pregunte por la cantidad de billetes que tiene de 200, después pregunte por
los de 100, 50, 20, 10, 5. Finalmente se le dirá al usuario la cantidad de dinero acumulado
que tiene en billetes.
 */
package practica37mod;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica37MOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        MOD: Se pide una cuantia total, y tenemos que dividirlos en los billetes mas grandes
        */
        
        Scanner sc = new Scanner(System.in);
        //int[] billetes = {500,200,100,50,20,10,5,2,1};
        System.out.println("Introduce la cantidad de dinero que quieres cambiar: ");
        //int cantidad = sc.nextInt();
        int totalDinero = 0;
        for (int i = 100; i >= 1; i/=10) {
            for (int j = 5; j >= 1; j/=2) {
                
                if (j < 4 && i == 1)
                    System.out.println("¿Cuantas monedas de "+i*j+"€?");
                else
                    System.out.println("¿Cuantos billetes de "+i*j+"€?");

                int billetes = sc.nextInt();
                totalDinero += billetes*i*j;
            }
            
        }
        System.out.println("Tienes un total de "+totalDinero+"€.");
    }
    
}
