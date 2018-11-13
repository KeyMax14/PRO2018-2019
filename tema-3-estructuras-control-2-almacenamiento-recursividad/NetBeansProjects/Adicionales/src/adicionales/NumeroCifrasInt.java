/*
    Crear un método que diga el número de cifras de un número.
 */
package adicionales;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class NumeroCifrasInt {
    public static int obtenerCifras(int num){
        
        int i=0;
        do {
            num /=10;
            i++;
        } while (num != 0);
        return i;
        
        // Método clase
        
    //        int mayor=1, i=0;
    //        do {
    //            mayor*=10;
    //            i++;
    //        } while (mayor <=num);
    //        return i;
    }
    
    public static void main(String[] args) {
        int num = 8;
        System.out.println("Tiene "+obtenerCifras(num)+" cifras.");
    }
}
