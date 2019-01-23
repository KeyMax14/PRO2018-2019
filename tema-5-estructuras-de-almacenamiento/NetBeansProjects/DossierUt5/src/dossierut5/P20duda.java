/*
    Práctica 20: Tomando la clase MatrizCuadrada de la práctica 6 Ahora Crearemos una
        Clase: Matriz2x2 que hace referencia a las matrices cuadradas de dimensión 2. El usuario
        tendrá la posibilidad de agregar una nueva matriz a la lista, quitar una matriz de la lista.
        Cada vez que realice una operación se le mostrará la lista completa de matrices que quede
        después de la operación
        Para el funcionamiento de este programa se utilizará la estructura dinámica que se considere
        conveniente. La Clase Matriz2x2 debe tener un método toString() que facilite que se
        muestre la matriz correctamente en pantalla al mostrar la lista de matrices
        La lista de matrices siempre se mostrará ordenada. El orden entre matrices cuadradas de
        dimensión dos lo va a establecer el determinante de la matriz. Ej
        a b
        c d determinante = a*d - c*b
 */
package dossierut5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.util.Collections.sort;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
class Matriz2x2 implements Comparable<Matriz2x2> {

    int columnas;
    int filas;
    int datos[][];

    public Matriz2x2(int... valores) {//    public Matriz2x2(int filas, int columnas, int ...valores) {
        this.columnas = 2;
        this.filas = 2;
        datos = new int[filas][columnas];
        int i = 0, j = 0;
        for (int val : valores) {
            datos[j / this.columnas][j % this.columnas] = val;
            j++;
            // Se puede con un if

        }
    }

    public Matriz2x2() {//    public Matriz2x2(int filas, int columnas) {
        this.columnas = 2;
        this.filas = 2;
        datos = new int[filas][columnas];
    }

    public Matriz2x2 multiplica(Matriz2x2 matriz) {

        if (this.columnas == matriz.filas) {
            Matriz2x2 resultado = new Matriz2x2(this.filas, matriz.columnas);
            for (int i = 0; i < this.filas; i++) { // Este bucle recorre las filas de la primera matriz
                for (int j = 0; j < matriz.columnas; j++) { // este bucle va mezclando esa fila con cada una de las columnas de la segunda matriz
                    int suma = 0;
                    for (int k = 0; k < this.columnas; k++) { // Recorre las columnas de la segunda matriz para ir multiplicando los valores.
                        suma += this.datos[i][k] * matriz.datos[k][j];
                    }
                    resultado.datos[i][j] = suma;
                }
            }
            return resultado;
        } else {
            return null;
        }
    }




    public boolean equals(Matriz2x2 matriz) {
        boolean eq = true;
        for (int i = 0; i < datos.length && eq; i++) {
            for (int j = 0; j < datos[i].length && eq; j++) {
                if (matriz.datos[i][j] != this.datos[i][j]) {
                    eq = false;
                }
            }
        }
        return eq;
    }
    
    

    @Override
    public String toString() {
        String resultado = "";
        for (int[] fila : datos) {
            for (int i : fila) {
                resultado += i + "\t";
            }
            resultado += "\n";
        }
        return resultado;
    }

    private int determinante() {
        return this.datos[0][0] * this.datos[1][1] - this.datos[0][1] * this.datos[1][0];
    }

    @Override
    public int compareTo(Matriz2x2 t) {
        return Integer.compare(this.determinante(), t.determinante());
    }
}

public class P20duda {

    public static void main(String[] args) {
        ArrayList<Matriz2x2> listaMatrices = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Menu: \n");
            System.out.println("1) Agregar Matrices.");
            System.out.println("2) Quitar Matrices.");
            System.out.println("3) Salir del programa.");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    int[] valores = new int[4];
                    for (int i = 0; i < valores.length; i++) {
                        System.out.println("Introduce el " + (i + 1) + "º número");
                        valores[i] = sc.nextInt();
                    }
                    listaMatrices.add(new Matriz2x2(valores[0], valores[1], valores[2], valores[3]));
                    Collections.sort(listaMatrices);
                    
                    System.out.println("Lista de Matrices: \n");
                    
                    for (Matriz2x2 matriz : listaMatrices) {
                        System.out.println(matriz);
                    }
                    break;
                case 2:
                    int[] aEliminar = new int[4];
                    for (int i = 0; i < aEliminar.length; i++) {
                        System.out.println("Introduce el " + (i + 1) + "º número.");
                        aEliminar[i] = sc.nextInt();
                    }
                    Matriz2x2 matrizEliminada = new Matriz2x2(aEliminar[0], aEliminar[1], aEliminar[2], aEliminar[3]);
//                    listaMatrices.remove(matrizEliminada);
                    Iterator it = listaMatrices.iterator(); //Por alguna razón no elimina la matriz.
                    while (it.hasNext()) {
                        if (it.next().equals(matrizEliminada)) {
                            it.remove();
                        }
                    }
                    Collections.sort(listaMatrices);
                    
                    System.out.println("Lista de Matrices: \n");
                    
                    for (Matriz2x2 matriz :listaMatrices) {
                        System.out.println(matriz);
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion Incorrecta.");
            }
        } while (opcion != 3);

    }
}
