/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class LanzarExcepcion {
    public static void main(String[] args) throws Exception {
//        double var1=5;
//        double var2=0;
//        double resultado= var1/var2;
//        System.out.println(resultado); // Devuelve infinity.
        
        double var3=0;
        double var4=0;
        
        double resultado = var3/var4;
//        System.out.println(resultado); // Devuelve NaN

        if (Double.isNaN(resultado)) {
            throw new Exception("Indeterminacion."); // Cuando lanzamos las excepciones, el programa se detiene con un fallo. 
        }else if (Double.isInfinite(resultado)) {
            throw new Exception("Infinito.");
        }else{
            System.out.println("La division es: "+ resultado);
        }
    
    }
}
