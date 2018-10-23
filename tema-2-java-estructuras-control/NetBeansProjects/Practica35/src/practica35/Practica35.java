/*
    Práctica 35: Sabiendo que:
        char letra = 'a';
        letra++;
        System.out.println(letra);
    nos muestra la letra ‘b’ tenemos una forma para ir mostrando las diferentes letras
    incrementando una variable. Usar un bucle for y mostrar en pantalla la secuencia de las 10
    primeras letras del abecedario ( todas en minúscula)
 */
package practica35;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Método 1
//        for ( char letra = 'a' ; letra < 'k'; letra++) {
//            System.out.println(letra);
//        }
        
// Método 2
          char letra = 'a';
          
          for (int i = 0; i < 10; i++) {
              System.out.println((char)(letra+i));
        }
          

    }
    
}
