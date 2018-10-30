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
public class MetodoSaludar {
    
    static void saludar(String nombre){
        System.out.println("Hola, soy "+nombre+".");
    }
    
    static void holaMundo(){
        System.out.println("Hola Mundo!");
    }
    
    public static void main(String[] args) {
        
        saludar("Kevin");
        holaMundo();
    }
}
