/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrdenarPersona;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class PersonaDiferente {
    String nombre;
    int edad;

    public PersonaDiferente(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    static boolean esMayorQue(PersonaDiferente p1, PersonaDiferente p2){
        return p1.nombre.compareTo(p2.nombre) > 0;

//        boolean resultado = false;
//        boolean finalizar = false; 
//        for (int i = 0; !finalizar && i < txt1.length() && i< txt2.length(); i++) {
//            if (txt1.charAt(i)> txt2.charAt(i)) {
//                resultado = true;
//                finalizar = true;
//            }else if(txt1.charAt(i)<txt2.charAt(i)){
//                finalizar = true;
//            }
//        }
//        return resultado;
    }
    
    
    static void ordenar(PersonaDiferente[] arr){
        for (int i = 0; i < arr.length-1; i++) {
//            char[]primera = arr[i].toCharArray();
            for (int j = i+1; j < arr.length; j++) {
//                char[]segunda = arr[j].toCharArray();
                
                if (esMayorQue(arr[i], arr[j])) {
                    PersonaDiferente aux = arr[i];
                    arr[i]= arr[j];
                    arr[j] = aux;

                    
                }
                
            }
            
        }
    }
    
    public static void main(String[] args) {
        
    }
}
