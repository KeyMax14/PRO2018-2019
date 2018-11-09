/*
    Realizar el ejercicio de generar una clave aleatoria con datos incluidos en un
    array con todos los valores.

    min 8
    una MAYUSCULA minimo
    una MINUSCULA minimo
    un NUMERO minimo
 */
package adicionales;

import java.util.Random;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class GenerarClaveAleatoriaArrayValores {

    public static int[] generarArrayValoresPassword() {
        int[] array = new int[62];
        int infMayus = (int) 'A';
        int supMayus = (int) 'Z';
        int infMinus = (int) 'a';
        int supMinus = (int) 'z';
        int infNum = (int) '0';
        int supNum = (int) '9';
        int j = 0;
        for (int i = infMayus; i <= supMayus; i++) {
            array[j++] = i;
        }
        for (int i = infMinus; i <= supMinus; i++) {
            array[j++] = i;
        }
        for (int i = infNum; i <= supNum; i++) {
            array[j++] = i;
        }
        return array;

    }

    public static void mostrarArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println("]");

    }

    public static void main(String[] args) {
        int[] array = generarArrayValoresPassword();
        Random rnd = new Random();

        int infMayus = (int) 'A';
        int supMayus = (int) 'Z';
        int infMinus = (int) 'a';
        int supMinus = (int) 'z';
        int infNum = (int) '0';
        int supNum = (int) '9';

        boolean hayMinuscula = false;
        boolean hayMayuscula = false;
        boolean hayNumero = false;
        String resultado = "";
        while (!(hayMinuscula && hayMayuscula && hayNumero && resultado.length() >= 8)) {
            int aleatorio = array[rnd.nextInt(array.length)];
            if (aleatorio >= infMinus && aleatorio <= supMinus) {
                hayMinuscula = true;
            }
            if (aleatorio >= infMayus && aleatorio <= supMayus) {
                hayMayuscula = true;
            }
            if (aleatorio >= infNum && aleatorio <= supNum) {
                hayNumero = true;
            }

            resultado += ((char) aleatorio);

        }
        System.out.println(resultado);
    }
}
