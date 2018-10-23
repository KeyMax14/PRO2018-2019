/*
    Práctica 23: Hacer un programa que resuelva ecuaciones de segundo grado. El usuario
    introduce los valores de a,b,c de la fórmula: aX^2+bX+c = 0
    Se debe mostrar las dos posibles soluciones, salvo que haya una raiz negativa en cuyo caso
    se mostrará el mensaje: “no hay solución real”
    Nota. Para resolver podemos hacer uso de: Math.sqrt() para obtener la raíz cuadrada
 */
package practica23;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce los tres valores de la raiz cuadrada: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("x²?");
        int a = sc.nextInt();
        System.out.println("x?");
        int b = sc.nextInt();
        System.out.println("último valor?");
        int c = sc.nextInt();
        
        
        int raiz = (b*b) - 4*a*c;
        
        if (a == 0){
            double x = -c/(double)b;
            System.out.println("Los resultados son "+x+".");
        }else if (raiz < 0) {
            System.out.println("La raiz cuadrada es negativa, da error.");
        }else if (raiz == 0){
            double x1 = (-b / (double)(2*a));
            System.out.println("Los resultados son "+x1+".");
        }else {
            double x1 = (-b + Math.sqrt(raiz)) / (2*a);
            double x2 = (-b - Math.sqrt(raiz)) / (2*a);
            System.out.println("Los resultados son "+x1+" y "+x2);
        }
    }
    
}
