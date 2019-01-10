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
public class EjemploArrayMulForEach {

    public static void main(String[] args) {
        int array[][];
        array = new int[3][];
        for (int[] fila : array) {
//            fila = new int[5];
            System.out.println(fila);
        }

        for (int i = 0; i < array.length; i++) {
            int[] fila = array[i];
            System.out.println(fila);

        }

        // Rellenar el array con un for normal.
//        for (int i = 0; i < array.length; i++) {
//            array[i] = new int[4];
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = i; // Rellenamos el array con el valor de la fila.
//                
//            }
//            
//        }
        // Crear el array pero de 3, 2, 4 columas.
        array[0] = new int[3];
        array[1] = new int[2];
        array[2] = new int[4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i; // Rellenamos el array con el valor de la fila.

            }

        }

        // Mostrar el contenido
        for (int[] fila : array) {
            for (int i : fila) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }

    }
}
