/*
    Práctica 25: Sumar todos los elementos de un array mediante recursión
 */
package practicasut3;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica25 {
    
    public static int sumaArray(int[] array,int n){
        int resultado = 0;
        if (n >= array.length-1) { //n+1 > array.length
            resultado = array[n];
        }else
            resultado = array[n]+sumaArray(array, n+1);
        return resultado;
    }
    
    public static void main(String[] args) {
        int[] array = {1,5,54,2};
        System.out.println(sumaArray(array, 0));
    }
}
