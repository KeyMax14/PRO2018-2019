/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosromanos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class NumerosRomanos {

    /**
     * @param args the command line arguments
     */
    public static  int numeroRomano(String num){
        int resultado = 0;
        HashMap<String, Integer> traduccion = new HashMap<>();
        traduccion.put("I", 1);
        traduccion.put("V", 5);
        traduccion.put("X", 10);
        traduccion.put("L", 50);
        traduccion.put("C", 100);
        traduccion.put("D", 500);
        traduccion.put("M", 1000);
        
        ArrayList<String> valores = new ArrayList<String>(Arrays.asList(num.split("")));
        int temporal = 5000;
        for (String valor : valores) {
            if (traduccion.get(valor) > temporal) {
                resultado -= temporal;
                resultado += (traduccion.get(valor) -temporal);
            }else{
                resultado +=(traduccion.get(valor));
            }
            temporal = traduccion.get(valor);
        }
        return resultado;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero romano: ");
        String num = sc.nextLine();
        System.out.println(numeroRomano(num));
        
    }
    
}
