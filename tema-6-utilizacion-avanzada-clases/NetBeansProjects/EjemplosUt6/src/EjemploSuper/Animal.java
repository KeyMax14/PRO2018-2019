/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploSuper;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Animal {
    protected String nombre;
    protected int edad;
    private String AtributoPropioAnimal = "Awan";

    public Animal(String nombre) {
        System.out.println("Soy un animal.");
    }

    public Animal() {
        System.out.println("Acaban de lanzar constructor vacio.");
    }
    
    
    
    public static void main(String[] args) {
        new felino();
    }
}

class felino extends Animal{
    double sizeGarras;
    double sizeBigotes;
    
    public felino() {
        
        super.nombre = "a";
        
        System.out.println("lalalalala");
        
    }

    public felino(String nombre) {
        
    }
}
