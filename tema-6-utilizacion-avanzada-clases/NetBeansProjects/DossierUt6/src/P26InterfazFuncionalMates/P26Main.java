/*
    Práctica 26: Crear la interfaz funcional: Mates que tiene el método:
        public abstract int calc(int x);
        En el main crear una lambda para obtener el número al cuadrado, otra para calcular el
        factorial. Crea un método parecido al anterior: mostrarResultado(int x, Mates func) que nos
        muestre en pantalla el resultado. Pasarle tanto el factorial como el cuadrado
 */
package P26InterfazFuncionalMates;

import P24InterfazOperacionesMasAbstractos.P24Main;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P26Main {
    
    static void mostrarResultado(int x, Mates func){
        System.out.println(func.calc(x));
    }

    public static void main(String[] args) {
        Mates cuadrado = (x) -> x * x;
        Mates factorial = (x) -> {
            int resultado = 1;
            if (x < 0) {
                resultado = -1;
            } else if (x > 0) {
                for (int i = x; i > 0; i--) {
                    resultado *= i;
                }
            }
            return resultado;
        };
        
        
        mostrarResultado(4, cuadrado);
        mostrarResultado(4, factorial);
        
    }
}
