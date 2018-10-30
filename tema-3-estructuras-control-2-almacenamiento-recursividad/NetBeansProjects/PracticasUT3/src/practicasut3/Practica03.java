/*
 Práctica 3: Crear un programa con un método llamado aleatorio() que reciba dos números
 enteros positivos y devuelva un número aleatorio que esté entre esos dos números. El
 main() del programa:
 */
package practicasut3;

import java.util.Random;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica03 {

    static int aleatorio(int n1, int n2){
        Random rnd = new Random();
        if (n1 > n2) {
            int temp = n2;
            n2 = n1;
            n1 = temp;
        }
        int resultado = (rnd.nextInt(n2-n1)+1)+(n1);
        return resultado;
    }
    
    public static void main(String[] args) {
        int num;
        do {
            num = aleatorio(25, 45);
            System.out.println(num);
        } while (num != 35);
    }
}
