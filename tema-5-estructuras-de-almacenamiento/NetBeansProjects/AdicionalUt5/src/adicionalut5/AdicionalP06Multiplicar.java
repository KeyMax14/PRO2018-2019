/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicionalut5;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
class Matriz {

    int columnas;
    int filas;
    int datos[][];

    public Matriz(int columnas, int filas, int ...valores) {
        this.columnas = columnas;
        this.filas = filas;
        datos = new int[filas][columnas];
        int i=0,j=0;
        for (int val : valores) {
            datos[i/columnas][j%columnas]= val;
            j++;
            // Se puede con un if
        }
    }
    
    public Matriz multiplica(Matriz matriz){
        /*
            Esto el lo hizo con un triple bucle for.
            para que una matriz funcione se debe cumplir que las columnas de this, sean igual a las filas de la matriz dada.
            El resultado es viceversa
        
        */
        return null;
    }
    
}

public class AdicionalP06Multiplicar {

}
