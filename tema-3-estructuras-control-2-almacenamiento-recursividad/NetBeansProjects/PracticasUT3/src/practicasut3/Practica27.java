/*
    Práctica 27: Calcular la potencia de forma recursiva: 27 → 128
 */
package practicasut3;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica27 {

    public static int potenciaArray(int base, int exponente) throws Exception {
        int resultado;
        if (exponente < 0) {
            throw new Exception("Potencia negativa.");
        }
        if (exponente == 0) {
            resultado = 1;
        } else {
            resultado = base * potenciaArray(base, exponente - 1);
        }

        return resultado;
    }

    // Método divide y venceras. Haces la mitad de iteracciones.
    public static int potenciaArray2Metodo(int base, int exponente) {
        int resultado;
        if (exponente == 1) {
            resultado = base;
        } else {
            resultado = potenciaArray2Metodo(base, exponente / 2);
            resultado *= resultado;
            if (exponente % 2 != 0) {
                resultado *= base;
            }

        }
        return resultado;
    }

    public static void main(String[] args) throws Exception {
//        System.out.println(potenciaArray(2,8));
        System.out.println(potenciaArray2Metodo(2, 8));

    }
}
