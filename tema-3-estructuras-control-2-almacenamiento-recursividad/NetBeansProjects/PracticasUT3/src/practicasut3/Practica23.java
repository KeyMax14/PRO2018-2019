/*
    Práctica 23: Invertir las cifras de un número mediante recursión: 123347 → 743321
    1234

    4*numeroDeCifras (1000) + invertir(1234/10)
    num%10*cantidadCifras(num/10) + invertir(num/10)
 */
package practicasut3;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica23 {

    /*
        Version de String
     */
    public static int invertirNumConString(int numero) {
        String resultado = "";
        String numString = "" + numero;
        if (numString.length() > 1) {
            char c = numString.charAt(0);
            String restante = numString.substring(1, numString.length());
            int restanteInt = Integer.parseInt(restante);
            resultado = "" + invertirNumConString(restanteInt) + c;
        } else {
            resultado = numString;
        }
        return Integer.parseInt(resultado);
    }

    public static int cantidadCifrasInt(int num) {
        int i = 0;
        do {
            i++;
            num /= 10;

        } while (num > 0);
        return i;
    }

    public static int invetirNumConInt(int num) {
        // No funciona, pedir a suso.

        int cociente = num / 10;
        int resto = num % 10;
        int resultado = 0;

        if (num < 10) {
            resultado = num;
        } else {
            int concatenacion = resto * (int)Math.pow(10, cantidadCifrasInt(cociente));
            resultado = invetirNumConInt(cociente) + concatenacion;
        }
        
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(invertirNumConString(123));
        System.out.println(invetirNumConInt(325));
        
    }
}
