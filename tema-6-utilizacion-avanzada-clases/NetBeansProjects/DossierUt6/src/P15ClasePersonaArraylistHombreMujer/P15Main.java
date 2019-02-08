/*
    Práctica 15: Toma las clases Persona, Hombre, Mujer de la práctica 12 y crea un pequeño
        programa que le de la posibilidad al usuario de introducir tantos hombres y mujeres como
        quiera. Esos datos se insertarán en un ArrayList de tipo Persona. Finalmente recorrer el
        ArrayList y mostrar el toString() de cada elemento. ¿ qué toString() está usando ? ¿ el de
        Persona, el de Hombre, el de Mujer ?
 */
package P15ClasePersonaArraylistHombreMujer;

import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P15Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList<>();
        int opcion;
        do {
            System.out.println("Menu: ");
            System.out.println("1) Añadir hombre.");
            System.out.println("2) Añadir mujer.");
            System.out.println("3) Salir.");
            opcion = sc.nextInt();sc.nextLine();
            if (opcion == 1 || opcion == 2) {
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Apellido 1: ");
                String ape1 = sc.nextLine();
                System.out.print("Apellido 2: ");
                String ape2 = sc.nextLine();
                System.out.print("Edad: ");
                int edad = sc.nextInt();
                System.out.print("Altura en cm: ");
                int altura = sc.nextInt();
                System.out.print("Peso en kg: ");
                double peso = sc.nextDouble();
                if (opcion == 1) {
                    personas.add(new Hombre(nombre, ape1, ape2, edad, altura, peso));
                }else{
                    personas.add(new Mujer(nombre, ape1, ape2, edad, altura, peso));
                }
            }else if(opcion!=3){
                System.out.println("Opción Incorrecta.");
            }
        } while (opcion != 3);
        
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        
        /*
            El método toString que se usa es el de Hombre o Mujer respectivamente.
        */
    }
}
