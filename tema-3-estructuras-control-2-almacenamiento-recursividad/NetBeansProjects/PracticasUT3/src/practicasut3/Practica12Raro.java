/*
    Práctica 12: Crear un programa que genere 20 números aleatorios enteros entre 1 y 100.
        Este array una vez se hay rellenado no se puede modificar. Crear un segundo array donde se
        almacenará una copia de los 5 números más pequeños del primer array. Mostrar en pantalla
        el contenido del array de 20 números y mostrar cuáles son los 5 números más pequeños
 */
package practicasut3;

import java.util.Random;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica12Raro {

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

    public static void mostrarArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + " ]");
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
            arrayMin[i] = min;
        }
        return arrayMin;
    }

    public static void main(String[] args) {
        int[] array = new int[20];
        //int[] min = new int[20];
        //int[] min = new int[5];
        int[] min;

        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio(1, 100);
        }
        min = ArrayMin(array.clone());

        mostrarArray(array);
        mostrarArray(min);
        

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
