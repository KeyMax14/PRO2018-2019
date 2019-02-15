/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrdenarPersona;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class PersonaDiferente {
    String nombre;
    int edad;

    @Override
    public String toString() {
        return "PersonaDiferente{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    

    public PersonaDiferente(String nombre) {
        this.nombre = nombre;
    }
    
    interface Ordenable<T>{
        // No permite static 
        boolean esMayorQue(T obj, T obj2);
    }
    
    
    
//    static boolean esMayorQue(PersonaDiferente p1, PersonaDiferente p2){
//        return p1.nombre.compareTo(p2.nombre) > 0;
//
////        boolean resultado = false;
////        boolean finalizar = false; 
////        for (int i = 0; !finalizar && i < txt1.length() && i< txt2.length(); i++) {
////            if (txt1.charAt(i)> txt2.charAt(i)) {
////                resultado = true;
////                finalizar = true;
////            }else if(txt1.charAt(i)<txt2.charAt(i)){
////                finalizar = true;
////            }
////        }
////        return resultado;
//    }
    

    
    static void ordenar(Object[] arr,Ordenable o){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (o.esMayorQue(arr[i], arr[j])) {
                    Object aux = arr[i];
                    arr[i]= arr[j];
                    arr[j] = aux;
                }
                
            }
            
        }
    }
    
    static void ordenar(ArrayList arrayL, Ordenable o){
        Object[] array = arrayL.toArray();
        ordenar(array, o);
        arrayL.clear();
        for (Object object : array) {
            arrayL.add(object);
        }
        
    }
    
    public static void main(String[] args) {
        PersonaDiferente []personas = new PersonaDiferente[3];
        
        personas[0] = new PersonaDiferente("Hola");
        personas[1] = new PersonaDiferente("Ra");
        personas[2] = new PersonaDiferente("Adios");
        
        
        ArrayList<PersonaDiferente> arrayL = new ArrayList<>(Arrays.asList(personas));
        
        Ordenable o = new Ordenable<PersonaDiferente>() {
            @Override
            public boolean esMayorQue(PersonaDiferente obj, PersonaDiferente obj2) {
                return obj.nombre.compareTo(obj2.nombre) > 0;
            }
     
        };
        
        ordenar(personas, o);
        ordenar(arrayL, o);
        
        
        for (PersonaDiferente persona : personas) {
            System.out.println(persona);
        }
        
        System.out.println("Con ArrayList: ");
        
        for (PersonaDiferente personaDiferente : arrayL) {
            System.out.println(personaDiferente);
        }
        
        
        ArrayList<String> palabras = new ArrayList<>();
        
        palabras.add("primera");
        palabras.add("segunda");
        palabras.add("tercera");
        palabras.add("cuarta");
        
        Ordenable oString = new Ordenable<String>() {
            @Override
            public boolean esMayorQue(String obj, String obj2) {
                return obj.compareTo(obj2) > 0;
            }
        };
        
        
        PersonaDiferente.ordenar(palabras, oString);
        
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
        
        
    }
}
