/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaAbstracto;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */


public class PruebaAbstracto {

    public static void main(String[] args) {
        Pajaro p = new Pajaro();
        
        // No se puede instansciar una clase abstracta.

//        Animal a = new Animal();

    }
}

abstract class Animal {

    protected String nombre;
    protected int edad;
    protected int peso;

    public Animal() {
        System.out.println("jajaja! soy un animal!!!!");
    }
    
    // Es una plantilla que obliga a realizar el método.
    /*
         Por definicion estos métodos no tienen contenido por que no se sabe como hacerlo, 
         se le cede a los hijos especificar que va a hacer este método.
    */
    
    
    
    public  abstract String emitirSonido();
}

class Perro extends Animal {

    int dientes;

    @Override
    public String emitirSonido() {
        return "guau";
    }
}

class Pajaro extends Animal {

    double ala;

    @Override
    public String emitirSonido() {
        return "pio";
    }
}
