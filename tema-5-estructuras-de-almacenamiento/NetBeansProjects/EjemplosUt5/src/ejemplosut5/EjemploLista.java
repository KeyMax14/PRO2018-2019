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

class Nodo{
    int dato;
    Nodo next;
}

public class EjemploLista {
    public static void main(String[] args) {
        // Introducir lo números 3,8,12,6
        Nodo n1 = new Nodo();
        n1.dato = 3;
        
        Nodo n2 = new Nodo();
        n2.dato = 8;
        
        
        n1.next = n2;
        
        Nodo n3 = new Nodo();
        n3.dato = 12;
        n2.next = n3;
        n3.next = null;
        
        Nodo n4 = new Nodo();
        n4.dato=6;
        n4.next = n2;
        n1.next = n4;
        
        
        Nodo aux = n1;
        
        while (aux != null) {
            System.out.println(aux.dato);
            aux = aux.next;
        }
    }
}
