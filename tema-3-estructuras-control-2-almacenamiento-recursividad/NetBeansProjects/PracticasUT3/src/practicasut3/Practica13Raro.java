/*
    Práctica 13: Crear una variante del programa anterior que en lugar de guardar una copia de
        los números más pequeños guarde la posición en la que están esos números
 */
package practicasut3;

import java.util.Random;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica13Raro {

    static int aleatorio(int n1, int n2) {
        Random rnd = new Random();
        if (n1 > n2) {
            int temp = n2;
            n2 = n1;
            n1 = temp;
        }
        int resultado = (rnd.nextInt(n2 - n1) + 1) + (n1);
        return resultado;
    }

    static int[] ArrayMin(int[] copia) {
        int[] arrayMin = new int[5];
        int min;
        int posMin;
        for (int i = 0; i < 5; i++) {
            int j;
            min = 101;
            posMin = 0;
            for (j = 0; j < copia.length; j++) {
                if (min > copia[j] && copia[j] != 0) {
                    min = copia[j];
                    posMin = j;
                }
            }
            copia[posMin] = 0;
            arrayMin[i] = posMin;
        }
        return arrayMin;
    }

    public static void main(String[] args) {
        int[] array = new int[20];
        //int[] min = new int[20];
        //int[] min = new int[5];
        int[] minPos;

        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio(1, 100);
        }
        minPos = ArrayMin(array.clone());

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.print(minPos[i] + " ");
        }
        System.out.println("");

        // Lo que sigue a esto hay que cambiarlo todo, no es lo que se pide.
//        min = array.clone();
//        
//        for (int i = 0; i < min.length-1; i++) {
//            for (int j = i+1; j < min.length; j++) {
//                if (min[i] > min[j]) {
//                    int temp = min[i];
//                    min[i]=min[j];
//                    min[j]=temp;
//                }
//            }
//        }
//        
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]+" ");
//        }
//        System.out.println("");
//        for (int i = 0; i < 5; i++) {
//            System.out.print(min[i]+" ");
//        }
//        System.out.println("");
//        
    }
}
