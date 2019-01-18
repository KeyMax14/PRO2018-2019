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
class Cola{
    final int SIZE = 6;
    int[] datos;
    int siguiente;
    int ultimo;

    public Cola() {
        datos = new int[SIZE];
        siguiente = 0;
        ultimo = 0;
    }
    
    public boolean push(int num){
        boolean resultado;
        if (ultimo==SIZE) { // (ultimo+1)%datos.length
            resultado = false;
        }else{
            this.datos[ultimo]=num;
            ultimo++;
            // En caso de cola circular de esta 
            ultimo%=datos.length;
            resultado = true;
        }
        return resultado;
        // (ultimo+1)%array.lenght
    }
    
    /*
     Encontrar un método para qur funcione la cola circular.
    */
    
    public int pop() throws Exception{
        int resultado;
        if (siguiente>=ultimo) {
            throw new Exception("Limite superado.");
        }else{
            resultado = datos[siguiente++];
        }
        return resultado;
    }
        

}

public class EjemploColaEnteros {
    public static void main(String[] args) throws Exception {
        Cola c1 = new Cola();
        
        c1.push(1);
        c1.push(2);
        c1.push(3);
        c1.push(4);
        System.out.println(c1.pop());
        
    }
}
