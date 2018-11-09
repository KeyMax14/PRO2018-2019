/*
    Generar contraseña segura aleatoriamente

    min 8 caracteres

    almenos 1 minuscula
    alemenos 1 mayuscula
    almenos 1 número

    metodo para generar x claves
 */
package adicionales;

import java.util.Random;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class GenerarClaveAleatoria {

//    public static char MayusAleatoria(){
//        Random rnd = new Random();
//        int infMayus= (int)'A';
//        int infMayus= (int)'Z';
//        return (char)(rnd.nextInt(superior-inferior+1)+inferior);
//    
//    }
//    
//    public static char MinusAleatoria(){
//        Random rnd = new Random();
//        int infMinus= (int)'a';
//        int supMinus= (int)'z';
//        return (char)(rnd.nextInt(superior-inferior+1)+inferior);
//    
//    }
//    
//    public static int NumAleatorio(){
//        Random rnd = new Random();
//        int infNum= (int)'0';
//        int supNum= (int)'9';
//        return (char)(rnd.nextInt(superior-inferior+1)+inferior);
//    
//    }
    public static void generarClaves(int size) {
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            int tamanioClave = rnd.nextInt(20 - 8) + 8;
            for (int j = 0; j < tamanioClave; j++) {

            }
        }
    }

    public static void main(String[] args) {
        Random rnd = new Random();

        int infMayus = (int) 'A';
        int supMayus = (int) 'Z';
        int infMinus = (int) 'a';
        int supMinus = (int) 'z';
        int infNum = (int) '0';
        int supNum = (int) '9';

        boolean hayMinuscula = false;
        boolean hayMayuscula = false;
        boolean hayNumero = false;
        String resultado = "";
        while (!(hayMinuscula && hayMayuscula && hayNumero && resultado.length() >= 8)) {
            int aleatorio = rnd.nextInt(154 - 48 + 1) + 48;
            if (aleatorio >= infMinus && aleatorio <= supMinus) {
                hayMinuscula = true;
            }
            if (aleatorio >= infMayus && aleatorio <= supMayus) {
                hayMayuscula = true;
            }
            if (aleatorio >= infNum && aleatorio <= supNum) {
                hayNumero = true;
            }
            if (aleatorio < 123 || aleatorio > 127) {
                if (aleatorio < 91 || aleatorio > 96) {
                    resultado += ((char) aleatorio);
                }
            }
        }
        System.out.println(resultado);
    }
}
