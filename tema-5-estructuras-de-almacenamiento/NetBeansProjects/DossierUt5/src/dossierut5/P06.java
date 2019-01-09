/*
    Práctica 6: Emular la suma de dos matrices. Se creará una clase: MatrizCuadrada con un
        constructor que reciba el tamaño en filas de la matriz, digamos: n. Entonces el constructor
        establece como atributo un array de n*n Se deberá crear un método llamado:
        MatrizCuadrada suma(MatrizCuadrada) que sirve para hacer la suma de dos matrices
        devolviendo la matriz suma ( la suma de dos matrices es una nueva matriz donde cada
        compotenente es la suma de las componentes
 */
package dossierut5;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
class MatrizCuadrada{
    
    private int[][] matriz;
    
    public MatrizCuadrada(int n) {
        matriz = new int[n][n];
    }
    
    public MatrizCuadrada suma(MatrizCuadrada mC){
        MatrizCuadrada resultado = new MatrizCuadrada(matriz.length);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resultado.matriz[i][j] = this.matriz[i][j]+mC.matriz[i][j];
            }
        }
        return resultado;
    }
    
}

public class P06 {
    public static void main(String[] args) {
        // Todo esta en la clase MatrizCuadrada. Revisar en clase.
    }
}
