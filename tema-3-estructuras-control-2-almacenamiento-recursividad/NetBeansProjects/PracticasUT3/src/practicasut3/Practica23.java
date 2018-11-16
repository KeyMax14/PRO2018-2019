/*
    Práctica 23: Invertir las cifras de un número mediante recursión: 123347 → 743321
    1234

    4*numeroDeCifras (1000) + invertir(1234/10)
    num%10*cantidadCifras(num/10) + invertir(num/10)
 */
package practicasut3;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica23 {
    
    /*
        Version de String
    */
    public static int invertirNum(int numero){
        String resultado = "";
        String numString = ""+numero;
        if (numString.length() > 0) {
            char c = numString.charAt(0);
            String restante = numString.substring(1, numString.length());
            int restanteInt = Integer.parseInt(restante);
            resultado = ""+invertirNum(restanteInt)+c;
        }else{
            resultado = "";
        }
        return Integer.parseInt(resultado);
    }
    public static void main(String[] args) {
        System.out.println(invertirNum(2856));
    }
}
