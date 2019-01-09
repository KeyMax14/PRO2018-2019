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
public class EjemploArrayMultidimensional {

    public static void mostrarArrayBidimensional(int[][] almacen) {
        for (int i = 0; i < almacen.length; i++) {
//            int[] fila = almacen[i];
//            for (int dato : fila) {
//                System.out.print(" "+dato);
//            }
//            System.out.println(" ");


            for (int j = 0; j < almacen[i].length; j++) {
                System.out.print(almacen[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    

    public static void main(String[] args) {

        int[][] almacen = new int[3][4];
        almacen[0][0] = 5;
        almacen[1][0] = 1;
        almacen[2][2] = 13;
        
        mostrarArrayBidimensional(almacen);

    }
}
