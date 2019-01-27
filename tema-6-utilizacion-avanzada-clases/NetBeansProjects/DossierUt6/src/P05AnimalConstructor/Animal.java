/*
    Práctica 5: Crear un constructor para Animal y un constructor para Pajaro y Perro. Hacer
        uso de super() para esos constructores
 */
package P05AnimalConstructor;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Animal {

    protected String nombre;
    protected int edad;
    protected int peso;

    public Animal(String nombre, int edad, int peso) {
        this.nombre = nombre;
        this.edad = edad;
        if (edad <0) {
            this.edad= -1;
        }
        this.peso = peso;
    }
}
