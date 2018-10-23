/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicionalpropuestos1tema1;

import java.util.Scanner;

/**
 *
 * @author daw
 */
public class Propuesta1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crea un algoritmo que devuelva el 16% (IVA) de un precio dado
        
        System.out.println("Introduce el precio que desea: ");
        Scanner sc = new Scanner(System.in);
        int precio = sc.nextInt();
        
        final double IVA = 0.16;
        
        double PrecioFinal = precio*IVA;
        
        System.out.println("El IVA equivalente a su precio es " + PrecioFinal);
        System.out.println("El nuevo precio será " + (PrecioFinal+precio));
        
        
                
        
    }
    
}
