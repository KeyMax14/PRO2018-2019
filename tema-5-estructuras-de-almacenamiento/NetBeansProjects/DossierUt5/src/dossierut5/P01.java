/*
    Práctica 1: Probar el código anterior y luego recorrer el array para mostrar en pantalla la
        información que tiene almacenada. Toma captura de pantalla de la salida que muestra. ¿ se
        ha modificado el array ?
 */
package dossierut5;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P01 {

    public static void main(String[] args) {
        int array[] = {7, 3, 9, 2, 8};
        for (int elemento : array) {
            System.out.println(elemento);
        }

        for (int elemento : array) {
            elemento = 20;
        }
        System.out.println("");
        for (int elemento : array) {
            System.out.println(elemento);
        }

    }
}
