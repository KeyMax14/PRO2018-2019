/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosut5;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class EjemploString {
    public static void main(String[] args) {
        String texto = "hola";
        char[] tex = texto.toCharArray(); // Convertimos un String a un array de char.
        texto = new String(tex); // Pasamos un array de char que se pasa a String.
    }
}
