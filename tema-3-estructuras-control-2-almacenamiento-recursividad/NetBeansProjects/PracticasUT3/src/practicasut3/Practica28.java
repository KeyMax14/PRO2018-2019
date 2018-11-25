/*
    Práctica 28: para cualesquier cifra de dinero >= 12 que cueste una carta ocurre que se
        puede conseguir franquear con sellos de 4 y 5. Ej 12 = 4, 4, 4 13 = 4, 4, 5 14 = 4, 5, 5
        Encontrar un algoritmo recursivo que resuelva el problema
 */
package practicasut3;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica28 {
    
    // Incompleto
//    public static int franquearSellos(int num) throws Exception{
//        int resultado = 0;
//        if (num < 12) {
//            throw new Exception("Número por debajo de 12.");
//        }
//        switch (num) {
//            case 12:
//                System.out.print("4,4,4");
//                break;
//            case 13:
//                System.out.print("4,4,5");
//                break;
//            case 14:
//                System.out.print("4,5,5");
//                break;
//            case 15:
//                System.out.print("4,5,5");
//                break;
//            default:
//                
//                System.out.println("");
//                    
//                }
//        }
//        return resultado;
//    }

    public static String sellar(int cant) throws Exception{
        String resultado="";
        if (cant < 12) {
            throw new Exception("Debes introducir un número mayor que 12.");
        }else{
            if (cant==12) {
                resultado += "4 + 4 + 4";
            }else if (cant==13) {
                resultado += "4 + 4 + 5";
            }else if (cant==14) {
                resultado += "4 + 5 + 5";
            }else if (cant==15) {
                resultado += "5 + 5 + 5";
            }else if (cant==16) {
                resultado += "4 + 4 + 4 + 4";
            }else{
                resultado += sellar(cant-5) + " + 5";
            }
        }
        
        return resultado;
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println(sellar(17));
        
    }
}
