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
public class ejemploEnum {
    
    public enum Mes{
        ENERO,
        FEBRERO,
        MARZO,
        ABRIL,
        MAYO,
        JUNIO,
        JULIO,
        AGOSTO,
        SEPTIEMBRE,
        OCTUBRE,
        NOVIEMBRE,
        DICIEMBRE
        
        
    }
    
    public static void main(String[] args) {
        System.out.println("Enum para julio: "+ Mes.JULIO);
        
        Mes unmes; // Puedes declarar una variable, que este limitada a los valores del enum.
        
    }
}
