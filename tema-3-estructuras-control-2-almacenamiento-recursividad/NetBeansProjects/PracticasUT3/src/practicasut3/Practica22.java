/*
    Práctica 22: Imaginemos que java no supiera realizar una multiplicación de dos números
        enteros positivos. En ese caso aún podríamos realizar una multiplicación usando
        recursividad aprovechando la siguiente propiedad de la multiplicación:
        n*a = (n-1)*a + a
        Así pues podríamos crear un método que se llame multiplicar() donde:
        n*a = multiplicar(n,a) = multiplicar( n-1, a) + a
        la condición base es que 1*a = a
        Hacer un programa que resuelva las multiplicaciones utilizando recursión
 */
package practicasut3;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica22 {
    public static int multiplicar(int n, int a){
        int resultado = 0;
        if (n==0) {
            resultado = 0;
        }else if (n == 1) {
            resultado = a;
        }else{
            resultado = multiplicar( n-1, a) + a;
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        int dato = multiplicar(5, 6);
        System.out.println(dato);
    }
}
