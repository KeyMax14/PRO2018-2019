/*
        Práctica 28: para cualesquier cifra de dinero >= 12 que cueste una carta ocurre que se
            puede conseguir franquear con sellos de 4 y 5. Ej 12 = 4, 4, 4 13 = 4, 4, 5 14 = 4, 5, 5
            Encontrar un algoritmo recursivo que resuelva el problema
 */
package practicasut3;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica28ConSystemOut {


    public static void sellar(int num) throws Exception {
        int resultado = 0;
        if (num < 12) {
            throw new Exception("Número por debajo de 12.");
        }
        switch (num) {
            case 12:
                System.out.print("4,4,4");
                break;
            case 13:
                System.out.print("4,4,5");
                break;
            case 14:
                System.out.print("4,5,5");
                break;
            case 15:
                System.out.print("4,5,5");
                break;
            case 16:
                System.out.println("4,4,4,4");
            default:
                sellar(num - 5);
                System.out.print(",5");
        }
    }

    public static void main(String[] args) throws Exception {
        sellar(17);

    }
}


