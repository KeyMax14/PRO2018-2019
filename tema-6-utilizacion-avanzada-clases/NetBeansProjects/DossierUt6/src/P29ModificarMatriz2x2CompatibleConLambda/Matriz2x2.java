/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P29ModificarMatriz2x2CompatibleConLambda;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
class Matriz2x2 /*implements Comparable<Matriz2x2>*/ {

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

    public int determinante() {
        return this.datos[0][0] * this.datos[1][1] - this.datos[0][1] * this.datos[1][0];
    }

//    @Override
//    public int compareTo(Matriz2x2 t) {
//        return Integer.compare(this.determinante(), t.determinante());
//    }
}
