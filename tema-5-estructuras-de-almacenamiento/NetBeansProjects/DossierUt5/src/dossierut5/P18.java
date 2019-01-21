/*
    Práctica 18: Práctica de autoaprendizaje: Buscar información sobre las 3 estructuras que
        acabamos de nombrar. Mostrar algún ejemplo respecto a los métodos: addAll(),
        removeAll(), retainAll()

    HashSet, TreeSet, LinkedHashSet.
 */
package dossierut5;

import java.util.HashSet;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P18 {
    public static void main(String[] args) {
        HashSet<String> prueba = new HashSet<>();
        prueba.add("cadena1");
        prueba.add("cadena2");
        prueba.add("cadena3");
        prueba.add("cadena4");
        prueba.add("cadena4");
        
        
        for (String string : prueba) {
            System.out.println(string); // Comprobamos con esto que no se pueden repetir valores.
        }
        
        HashSet<String> prueba2 = new HashSet<String>();
        prueba2.addAll(prueba);
        System.out.println("\naddAll():\n");
        for (String string : prueba2) {
            System.out.println(string); // Añade todo el conjunto
        }
        
        prueba.remove("cadena1"); // Eliminamos un elemento de nuestro primer HashSet
        prueba2.removeAll(prueba); // Eliminamos en el segundo HashSet todo lo que contiene el primero, si estan incluidos.
        
        System.out.println("\nremoveAll():\n");
        
        for (String string : prueba2) {
            System.out.println(string); // Debe quedar solo cadena1, porque no estaba dentro del primer conjunto.
        }
        
        prueba2.add("cadena2"); 
        prueba.retainAll(prueba2); // Retenemos solo los elementos que estan contenidos en el conjunto prueba2 y ya pertenecen a este prueba.
        
        System.out.println("\nretainAll():\n");
        for (String string : prueba) {
            System.out.println(string); // En este caso solo debe aparecer cadena2, ya que es el unico que esta en ambos conjuntos.
        }
        
        
        
        
    }
}
