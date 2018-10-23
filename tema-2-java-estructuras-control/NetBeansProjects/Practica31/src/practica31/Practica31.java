/*
    Práctica 31: Hacer un programa que muestre la tabla de multiplicar del número 5 usando
        un bucle for
 */
package practica31;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println("5 x "+i+" = "+ (5*i));
        }
    }
    
}
