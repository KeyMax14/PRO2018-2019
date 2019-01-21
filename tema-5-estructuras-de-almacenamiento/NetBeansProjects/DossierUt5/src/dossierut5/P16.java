/*
    Práctica 16: Crear un diccionario de español/inglés. Se deberán registrar al menos 10
        palabras en español y su traducción en inglés. Se deberá realizar con un HashMap y con un
        TreeMap. Recorrer en ambos casos la estructura completa y mostrar en pantalla Hacer una
        captura de pantalla de cada una de las ejecuciones ¿ alguno se muestra ordenado ?
 */
package dossierut5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P16 {

    public static void main(String[] args) {
        Map<String, String> diccionario = new TreeMap<>();
        diccionario.put("Hola", "Hello");
        diccionario.put("Adios", "Bye");
        diccionario.put("Cuchara", "Spoon");
        diccionario.put("Tenedor", "Fork");
        diccionario.put("Yogurt", "Yogurt");
        diccionario.put("Amarillo", "Yellow");
        diccionario.put("Verde", "Green");
        diccionario.put("Azul", "Blue");
        diccionario.put("Azul", "Blue");
        diccionario.put("Perro", "Dog");
        
        System.out.println("TreeMap: \n");
  
        Iterator it = diccionario.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) it.next();
            System.out.println("Clave=" + entry.getKey() + ", Valor=" + entry.getValue());
        }

        HashMap<String, String> diccionario1 = new HashMap<>(10);
        diccionario1.put("Hola", "Hello");
        diccionario1.put("Adios", "Bye");
        diccionario1.put("Cuchara", "Spoon");
        diccionario1.put("Tenedor", "Fork");
        diccionario1.put("Yogurt", "Yogurt");
        diccionario1.put("Amarillo", "Yellow");
        diccionario1.put("Verde", "Green");
        diccionario1.put("Azul", "Blue");
        diccionario1.put("Azul", "Blue");
        diccionario1.put("Perro", "Dog");
//        diccionario1.put("Perro", "mismaClave");
        
        System.out.println("\nHashMap: \n");
  
        Iterator it1 = diccionario1.entrySet().iterator();
        while (it1.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) it1.next();
            System.out.println("Clave=" + entry.getKey() + ", Valor=" + entry.getValue());
        }
    }
}
