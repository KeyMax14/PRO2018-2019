/*
    [4,8,11,17,19,21,28]
    Tienes que saber si un número esta en ese array con el metodo divide y venceras
    Para ello si son n numeros, debes comparar con el número dado, 
    con array[n/2], si es mayor el tamaño del subarray es n/2, y si es menor el inicio es n/2.
 */
package adicionales;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class BusquedaOrdenadaRecursiva {

    //Incompleto.
    public static boolean buscarRecursivo(int[] arr, int posInicio, int posFin, int num) {
        boolean resultado = false;

        if (posFin < posInicio) {
            resultado = false;
        } else if (posFin == posInicio) {
            if (num == arr[posFin]) {
                resultado = true;
            } else {
                resultado = false;
            }
        } else if (posInicio + 1 == posFin) {
            if (arr[posInicio] == num || arr[posFin] == num) {
                resultado = true;
            } else {
                resultado = false;
            }
        } else { // Tenemos un subarray de almenos 3 números.
            int media = (posInicio + posFin) / 2;
            if (num == arr[media]) {
                resultado = true;
            } else if (arr[media] > num) {
                resultado = buscarRecursivo(arr, posInicio, media, num);
            } else {
                resultado = buscarRecursivo(arr, media, posFin, num);
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 7, 11, 15, 23, 30, 45};
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero: ");
//        int num = 11;
        int num = sc.nextInt();
        if (buscarRecursivo(arr, 0, arr.length - 1, num)) {
            System.out.println(num + " esta presente.");
        } else {
            System.out.println(num + " no esta presente.");
        }
    }
}
