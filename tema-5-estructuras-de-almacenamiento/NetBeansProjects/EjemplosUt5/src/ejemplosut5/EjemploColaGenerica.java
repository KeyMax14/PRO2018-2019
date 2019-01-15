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
class ColaGen<T>{
    final int SIZE = 6;
    T[] datos;
    int siguiente;
    int ultimo;

    public ColaGen() {
        datos = (T[])new Object[SIZE];
        siguiente = 0;
        ultimo = 0;
    }
    
    public boolean push(T num){
        boolean resultado;
        if (ultimo==SIZE) {
            resultado = false;
        }else{
            this.datos[ultimo]=num;
            ultimo++;
            // En caso de cola circular de esta 
            ultimo%=datos.length;
            resultado = true;
        }
        return resultado;
    }
    
    /*
     Encontrar un método para qur funcione la cola circular.
    */
    
    public T pop() throws Exception{
        T resultado;
        if (siguiente>=ultimo) {
            throw new Exception("Limite superado.");
        }else{
            resultado = datos[siguiente++];
        }
        return resultado;
    }
        

}

public class EjemploColaGenerica {
    public static void main(String[] args) throws Exception {
        ColaGen c1 = new ColaGen<String>();
        
        c1.push("Hola");
        c1.push("adios");
        c1.push("a");
        c1.push("b");
        System.out.println(c1.pop());
        
    }
}
