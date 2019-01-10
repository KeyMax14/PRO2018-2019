/*
    Matriz a = new Matriz(2,1,3,4);
    Matriz b = new Matriz(0,5,7,8);
    Matriz c = Matriz.Suma(a,b);
 */
package dossierut5.P06EnClase;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
class MatrizCuadrada2x2 {

    int[][] matriz;

    public MatrizCuadrada2x2(int a, int b, int c, int d) {
        matriz = new int[2][2];
        matriz[0][0] = a;
        matriz[0][1] = b;
        matriz[1][0] = c;
        matriz[1][1] = d;
    }

    public static MatrizCuadrada2x2 suma(MatrizCuadrada2x2 m1, MatrizCuadrada2x2 m2) {
        MatrizCuadrada2x2 resultado = new MatrizCuadrada2x2(0, 0, 0, 0);
        for (int i = 0; i < resultado.matriz.length; i++) {
            for (int j = 0; j < resultado.matriz[i].length; j++) {
                resultado.matriz[i][j] = m1.matriz[i][j] + m2.matriz[i][j];
            }
        }
        return resultado;
    }

    public MatrizCuadrada2x2 suma(MatrizCuadrada2x2 m1) {
        return this.suma(this, m1);
    }

    @Override
    public String toString() {
        String resultado = "";
        for (int[] fila : matriz) {
            for (int i : fila) {
                resultado += ""+i+" ";
            }
            resultado += "\n";
        }
        return resultado;
    }
    
    

}

public class P06EnClase {

    public static void main(String[] args) {
        MatrizCuadrada2x2 a = new MatrizCuadrada2x2(2, 1, 3, 4);
        MatrizCuadrada2x2 b = new MatrizCuadrada2x2(0, 5, 7, 8);

        System.out.println(MatrizCuadrada2x2.suma(a, b));
        System.out.println(a.suma(b));
        
    }
}
