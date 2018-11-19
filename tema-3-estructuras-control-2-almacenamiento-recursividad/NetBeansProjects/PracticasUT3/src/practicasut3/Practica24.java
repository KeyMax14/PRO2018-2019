/*
    Práctica 24: Sumar las cifras de un número mediante recursión: 135 → 1+3+5 → 9
 */
package practicasut3;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica24 {

    
    public static int sumarCifras(int num){
//        int cociente = num/10;
//        int resto = num%10;
//        int resultado;
//        if (cociente > 0) {
//            resultado = resto + sumarCifras(cociente);
//        }else
//            resultado = num;
//        return resultado;
        
        int suma = 0;
        if (num <=9) {
            suma = num;
        }else{
            int cifra = num % 10;
            suma = cifra + sumarCifras(num/10);
        }
        return suma;
        
    }
    
    public static void main(String[] args) {
        System.out.println(sumarCifras(89));
    }
}
