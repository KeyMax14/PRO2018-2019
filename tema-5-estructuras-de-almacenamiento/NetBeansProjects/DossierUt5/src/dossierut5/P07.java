/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossierut5;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P07 {
    public static void main(String[] args) {
        String texto = "Hola";
        Double num = 2.0;
        
        StringBuilder textoBuilder = new StringBuilder();
        
        // Uso de apend
        
        textoBuilder.append("Esto es un texto").append(" hecho con StringBuilder");
        System.out.println(textoBuilder);
        textoBuilder.append(" Mas texto");
        System.out.println(textoBuilder);
        textoBuilder.append(texto);
        System.out.println(textoBuilder);
        
        // Uso de delete
        
        textoBuilder.delete(0, 9); // Borra los 10 primeros caracteres 
        System.out.println(textoBuilder);
        textoBuilder.deleteCharAt(0); // Borra el primer caracter.
        System.out.println(textoBuilder);
        
        // Uso de insert
        
        textoBuilder.insert(0, texto); // Insertas en el lugar que quieras el contenido de otra variable, método sobrecargado para muchos tipos de variable.
        System.out.println(textoBuilder);
        textoBuilder.insert(0, texto); 
        System.out.println(textoBuilder);
        
        
        // Uso de replace
        
        textoBuilder.replace(0, 19, texto); // Reemplaza el contenido de los 20 primeros caracteres por el contenido de la variable texto.
        System.out.println(textoBuilder);
        // Uso de reverse
        
        StringBuilder reverso = new StringBuilder(texto);
        reverso.reverse();
        System.out.println(reverso);
    }
}
