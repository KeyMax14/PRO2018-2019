/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploDefaultInterface;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
interface Bicho {

    default void decirHola() {
        System.out.println("Hola bicho!!!!!");
    }
    
    static void decirAdios(){
        System.out.println("No digas adios ma frend");
    }
}

interface Planta {

    default void decirHola() {
        System.out.println("Hola planta!!!!!");
    }
}

public class Chlorotica implements Bicho, Planta {

    // si no se especifica el método decirHola dara error por tener una "herencia" multiple.
    
    public void decirHola() {
        Bicho.super.decirHola();
//        Planta.super.decirHola();
//         System.out.println("Ni bicho ni planta");
    }
    
    //@Override
    static void decirAdios(){
        System.out.println("jajajaja");
    }
}
