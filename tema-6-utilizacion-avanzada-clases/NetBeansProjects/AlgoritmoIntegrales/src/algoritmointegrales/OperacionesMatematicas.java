/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmointegrales;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class OperacionesMatematicas {
    
    static boolean esMayorQue(String txt1, String txt2){
        boolean resultado = false;
        boolean finalizar = false; 
        for (int i = 0; !finalizar && i < txt1.length() && i< txt2.length(); i++) {
            if (txt1.charAt(i)> txt2.charAt(i)) {
                resultado = true;
                finalizar = true;
            }else if(txt1.charAt(i)<txt2.charAt(i)){
                finalizar = true;
            }
        }
        return resultado;
    }
    
    
    static void ordenar(String[] arr){
        for (int i = 0; i < arr.length-1; i++) {
//            char[]primera = arr[i].toCharArray();
            for (int j = i+1; j < arr.length; j++) {
//                char[]segunda = arr[j].toCharArray();
                
                if (esMayorQue(arr[i], arr[j])) {
                    String aux = arr[i];
                    arr[i]= arr[j];
                    arr[j] = aux;

                    
                }
                
            }
            
        }
    }
    
    static double func(double x) {
        return x * x;
    }

    class CalcularIntegralX implements Integrable {

        @Override
        public double func(double x) {
            return x;
        }

    }

    interface Integrable {

        double func(double x);
    }

    static double integrando(Integrable f, double limInf, double limSup) {
        double suma = 0;
        double numeroRectangulos = 100.0;
        double paso = (limSup - limInf) / numeroRectangulos;

        for (double x = limInf; x <= limSup; x += paso) {
            suma += (paso * f.func(x));
        }

        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce limite inferior: ");
        double limInf = sc.nextInt();
        System.out.println("Introduce limite superior: ");
        double limSup = sc.nextInt();

        Integrable ff = new Integrable() {
            @Override
            public double func(double x) {
                return x;
            }
        };

        System.out.println(integrando(ff, limInf, limSup));

        Integrable ff2 = new Integrable() {
            @Override
            public double func(double x) {
                return x * x;
            }
        };

        System.out.println(integrando(ff2, limInf, limSup));

        System.out.println(integrando(
            new Integrable() {
                @Override
                public double func(double x) {
                    return x * x * x * x;
                }
            },
            limInf, limSup)
        );
    }

}
