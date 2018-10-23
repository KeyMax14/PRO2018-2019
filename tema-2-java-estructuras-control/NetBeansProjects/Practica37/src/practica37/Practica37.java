/*
    Práctica 37: Crear un programa que le pregunte al usuario la cantidad de billetes que tiene
        de 500, luego le pregunte por la cantidad de billetes que tiene de 200, después pregunte por
        los de 100, 50, 20, 10, 5. Finalmente se le dirá al usuario la cantidad de dinero acumulado
        que tiene en billetes.
 */
package practica37;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] billetes = {500,200,100,50,20,10,5};
        System.out.println("Contador de billetes: \n");
        int suma = 0;
        for (int i = 0; i < billetes.length; i++) {
            System.out.println("¿Cuantos billetes de "+billetes[i]+"€ tiene? ");
            int cantidad = sc.nextInt();
            suma += (billetes[i]*cantidad);
        }
        System.out.println("\nTiene un total de "+suma+"€.");
    }
    
}
