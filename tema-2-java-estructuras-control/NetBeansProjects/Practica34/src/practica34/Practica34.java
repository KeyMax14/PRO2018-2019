/*
    Práctica 34: Hacer un programa que muestre la secuencia de números: 71, 65,59,.., y que
        pare cuando ya sean negativos
 */
package practica34;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 71; i > 0; i -= 6) {
            System.out.println(i);
        }
    }
    
}
