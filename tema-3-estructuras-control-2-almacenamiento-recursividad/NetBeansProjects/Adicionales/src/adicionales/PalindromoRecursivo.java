/*
    Se tiene que mostrar en pantalla, es palindromo (capicua)
 */
package adicionales;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class PalindromoRecursivo {

    public static boolean esPalindromo(String palabra, int n) {
        boolean resultado = true;
        if (palabra.length() % 2 == 1) {
            if (n != palabra.length() - 1 - n) {
                resultado = palabra.charAt(n) == palabra.charAt(palabra.length() - 1 - n) && esPalindromo(palabra, n + 1);
            } else {
                resultado = true;
            }
        } else {
            if (palabra.length() / 2 == n) {
                resultado = palabra.charAt(n) == palabra.charAt(palabra.length() - 1 - n) && esPalindromo(palabra, n + 1);
            } else {
                resultado = palabra.charAt(n) == palabra.charAt(palabra.length() - 1 - n);
            }
        }

        return resultado;
    }

    public static boolean esPalindromoClase(String palabra, int posicion) {
        boolean resultado = true;
        if (posicion < palabra.length() - posicion - 1) {
            if (palabra.charAt(posicion) == palabra.charAt(palabra.length() - 1 - posicion)) {
                resultado = esPalindromoClase(palabra, posicion+1);
            }else{
                resultado = false;
            }
        }else{
            resultado = true;
        }
        return resultado;
    }

    public static void main(String[] args) {
        String prueba = "abcba";
        System.out.println(esPalindromo(prueba, 0));
        System.out.println(esPalindromoClase(prueba, 0));
    }
}
