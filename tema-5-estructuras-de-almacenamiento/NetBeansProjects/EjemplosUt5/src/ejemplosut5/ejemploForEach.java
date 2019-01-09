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
class Prueba{
    Prueba(int dato){
        this.dato = dato;
    }
    int dato;

    @Override
    public String toString() {
        return " "+dato;
    }
    
    
}

public class ejemploForEach {

    public static void main(String[] args) {
        int array[] = {7, 3, 9, 2, 8};
        Prueba arr[] = {new Prueba(1), new Prueba(2), new Prueba(3)};
        int indice = 1;
        for (Prueba elemento : arr) { // Recorre solo los valores del array.
            elemento.dato = ++indice;
        }
        
        // Caso para parar normal si es menor de 3
        
        for (int i = 0; i < array.length && array[i]<3; i++) {
            int j = array[i];
            
        }
        
        // Caso de for que queremos que coja de 2 en 2 a partir del 6
        int j=2;
        for (int i = 0; i < array.length; i+=j) {
            if ( i >=6 ) {
                j=4;
            }
        }
        
        // 
        
        Prueba pr[]= new Prueba[5];
        
        for (int i = 0; i < pr.length; i++) {
            pr[i]= new Prueba(i);
        }
        for (Prueba prueba : pr) {
            prueba.dato = 5;
        }
        
        for (int i = 0; i < pr.length; i++) {
            System.out.println(pr[i]);
            
        }
    }
}
