/*
    Práctica 29: Hacer un programa que muestre la tabla de multiplicar del número 5 usando
        un bucle do while.
 */
package practica29;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 1;
        do{
            System.out.println("5 x "+i+" = "+(5*i));
            i++;
        }while (i < 11);
    }
    
}
