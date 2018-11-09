/*
    Versión propia de generar clave aleatoria, con métodos para generar 
    el cáracter deseado
 */
package adicionales;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class GenerarClaveAleatoriaMetodos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantas claves desea crear?");
        int size = sc.nextInt();
        generarClave(size);
    }

    public static char mayusAleatoria() {
        Random rnd = new Random();
        int infMayus = (int) 'A';
        int supMayus = (int) 'Z';
        return (char) (rnd.nextInt(supMayus - infMayus + 1) + infMayus);

    }

    public static char minusAleatoria() {
        Random rnd = new Random();
        int infMinus = (int) 'a';
        int supMinus = (int) 'z';
        return (char) (rnd.nextInt(supMinus - infMinus + 1) + infMinus);

    }

    public static int numAleatorio() {
        Random rnd = new Random();
//        int infNum = (int) '0';
//        int supNum = (int) '9';
//        return (char) (rnd.nextInt(superior - inferior + 1) + inferior);
        return rnd.nextInt(10);
    }

    public static void generarClave(int cantidad) {
        Random rnd = new Random();
        boolean hayMinus = false;
        boolean hayMayus = false;
        boolean hayNum = false;
        for (int i = 0; i < cantidad; i++) {
            String resultado = "";
            while (!(hayMayus && hayMinus && hayNum && resultado.length() >= 8)) {
                int categoria = rnd.nextInt(3);
                switch (categoria) {
                    case 0:
                        resultado += mayusAleatoria();
                        hayMayus = true;
                        break;
                    case 1:
                        resultado += minusAleatoria();
                        hayMinus = true;
                        break;
                    default:
                        resultado += numAleatorio();
                        hayNum = true;
                        break;
                }
            }
            System.out.println(resultado);
        }
    }

}
