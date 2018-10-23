/*
    Práctica 12: Se tienen tres variables, a, b y c. Escribe las asignaciones necesarias para
    intercambiar sus valores, sean cuales sean, de manera que:
    b tome el valor de a
    c tome el valor de b
    a tome el valor de c
 */
package practica12;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, auxiliar;
        System.out.println("a= "+a+" b= "+b+" c= "+c); // Para comprobar el estado inicial.
        auxiliar = b;
        b = a;
        a = c;
        c = auxiliar;
        System.out.println("a= "+a+" b= "+b+" c= "+c); // Para comprobar el resultado final.
    }
    
}
