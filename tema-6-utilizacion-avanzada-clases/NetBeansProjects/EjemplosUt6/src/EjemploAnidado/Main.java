/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploAnidado;

import java.util.Comparator;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
class Padre {

    int datoPadre;
    
    /*
        Al hacer este método no estatico conseguimos lograr que
            no se puedan crear clases anidadas sin tener previamente creado al padre.
    */

    public Anidada crearAnidada() {
        return new Anidada();
    }

    class Anidada {

        int datoHijo;

        public Anidada() {
            datoHijo = 7;
        }

    }
}

public class Main {

    public static void main(String[] args) {
        Padre objetoPadre = new Padre();

        Padre.Anidada objetoHijo = objetoPadre.new Anidada();

        /*
            El contructor es un método de instancia, no puedes llamar new Padre.Anidado() como si fuera estatico
                esto da error siempre.
         */
        System.out.println(objetoHijo.datoHijo);

        /*
         Esto nose usa a menudo, se crea un método (factoria) para no hacer lso new
         */
        Padre.Anidada obj2 = objetoPadre.crearAnidada();
        
        System.out.println(obj2.datoHijo);
        
        
        Comparator c = new Comparator<Integer> () {
            @Override
            public int compare(Integer o1, Integer o2) {
                return  o1 - o2;
            }

        };

        Comparator ca = (Comparator<Integer>) (Integer o1, Integer o2) -> o1 - o2;
        
        Comparator<Padre> ca1 = (Padre a, Padre b) -> {
            return a.datoPadre - b.datoPadre;
        };
    }
}
