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

    public Matriz(int filas, int columnas, int ...valores) {
        this.columnas = columnas;
        this.filas = filas;
        datos = new int[filas][columnas];
        int i=0,j=0;
        for (int val : valores) {
            datos[j/this.columnas][j%this.columnas] = val;
            j++;
            // Se puede con un if

        }
    }

    public Matriz(int filas, int columnas) {
        this.columnas = columnas;
        this.filas = filas;
        datos = new int[filas][columnas];
    }
    
    
    
    public Matriz multiplica(Matriz matriz){
        /*
            Esto el lo hizo con un triple bucle for.
            para que una matriz funcione se debe cumplir que las columnas de this, sean igual a las filas de la matriz dada.
            El resultado es viceversa
        
        */
        
        if (this.columnas == matriz.filas) {
            Matriz resultado = new Matriz(this.filas,matriz.columnas);
            for (int i = 0; i < this.filas; i++) { // Este bucle recorre las filas de la primera matriz
                for (int j = 0; j < matriz.columnas; j++) { // este bucle va mezclando esa fila con cada una de las columnas de la segunda matriz
                    int suma = 0;
                    for (int k = 0; k < this.columnas; k++) { // Recorre las columnas de la segunda matriz para ir multiplicando los valores.
                        suma += this.datos[i][k]*matriz.datos[k][j];
                    }
                    resultado.datos[i][j]=suma;
                }
            }
            return resultado;
        }else{
            return null;
        }
        
    }

    @Override
    public String toString() {
        String resultado = "";
        for (int[] fila : datos) {
            for (int i : fila) {
                resultado += i+"\t";
            }
            resultado+="\n";
        }
        return resultado;
    }
    
    
    
}

public class AdicionalP06Multiplicar {
    public static void main(String[] args) {
        Matriz a = new Matriz(1, 2, 1,2);
        Matriz b = new Matriz(2, 3, 1,2,3,4,5,6);
        
        System.out.println(a);
        System.out.println(b);
        
        System.out.println(a.multiplica(b));
        
        
    }
}
