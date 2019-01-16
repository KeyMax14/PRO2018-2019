/*
    Práctica 13: Crear un programa para la gestión de clientes. Al usuario se le mostrará un
        menú donde pueda elegir entre agregar nuevo cliente a la cola, atender cliente, ver estado de
        la cola.
        Crear una clase Cliente con: nombre, apellido, edad y un método: boolean menorDeEdad()
        que determina si el clientes es o no menor de edad. Cuando el usuario intenta agregar un
        nuevo cliente al final de la cola, si fuera menor de edad se usa el método y no se incorpora a
        la cola mostrando un mensaje al usuario diciendo los datos del cliente que se iba a insertar
        en cola y que no puede agregar a menores de edad.
        Cuando el usuario elige atender cliente se toma el próximo elemento que corresponda en la
        cola quitándolo de la cola y se muestra en pantalla
        Cuando el usuario escoge ver estado de la cola se le muestra el tamaño actual de la cola
        ( método size() )
 */
package dossierut5;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
class Cliente {

    String nombre;
    String apellido;
    int edad;

    public Cliente(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public boolean menorDeEdad() {
        return edad<18;
    }

    @Override
    public String toString() {
        return nombre+" "+apellido+" | Edad: "+edad;
        
    }
}

public class P13 {

    public static void agregarCola(LinkedList<Cliente> cola) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del cliente: ");
        String nombre = sc.next();sc.nextLine();
        System.out.print("Apellido del cliente: ");
        String apellido = sc.nextLine();
        System.out.print("Edad del cliente: ");
        int edad = sc.nextInt();
        Cliente next = new Cliente(nombre, apellido, edad);
        if (next.menorDeEdad()) { 
            System.out.println(next);
            System.out.println("Cliente menor de edad");
        }else{
            cola.add(next);
        }
    }

    public static void main(String[] args) {

        LinkedList<Cliente> cola = new LinkedList<>();
        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        while (!salir) {
            System.out.println("Menu:");
            System.out.println("1) Agregar cliente a la cola.");
            System.out.println("2) Atender cliente de la cola.");
            System.out.println("3) Ver cuantos clientes tiene la cola.");
            System.out.println("4) Cerrar programa.");
            int eleccion = sc.nextInt();
            switch (eleccion) {
                case 1:
                    agregarCola(cola);
                    break;
                case 2:
                    try {
                        System.out.println(cola.remove()); // Método FIFO
                    } catch (java.util.NoSuchElementException e) {
                        System.out.println("No hay clientes en la cola.");
                    }
                    
                    break;
                case 3:
                    System.out.println("Hay "+cola.size()+" personas en cola.");
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("No existe esa opcion.\n");

            }
        }

    }
}
