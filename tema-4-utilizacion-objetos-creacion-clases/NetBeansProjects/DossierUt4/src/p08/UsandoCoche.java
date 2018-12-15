/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p08;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class UsandoCoche {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Datos del coche: ");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Posición inicial: ");
        int posicion = sc.nextInt();

        Coche coche = new Coche(nombre, posicion);

        System.out.println("Menu: ");
        System.out.println("1) encender. ");
        System.out.println("2) quitar freno de mano. ");
        System.out.println("3) apagar. ");
        System.out.println("4) poner freno mano. ");
        System.out.println("5) mover izquierda. ");
        System.out.println("6) mover derecha. ");
        System.out.println("Cualquier otro número para salir.");
        int pasos;
        boolean acabar = false;

        while (!acabar) {

            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println(coche.encender());
                    break;
                case 2:
                    System.out.println(coche.quitarFrenoMano());
                    break;
                case 3:
                    System.out.println(coche.apagar());
                    break;
                case 4:
                    System.out.println(coche.ponerFrenoMano());
                    break;
                case 5:
                    pasos = sc.nextInt();
                    System.out.println(coche.moverIzquierda(option));
                    break;
                case 6:
                    pasos = sc.nextInt();
                    System.out.println(coche.moverDerecha(option));
                    break; // Cambiar a derecha cuando lo tenga.

                default:
                    acabar = true;
            }

        }
        

//        Coche kevin = new Coche("Kevin",10);
//        System.out.println(kevin.moverIzquierda(3));
//        System.out.println(kevin.encender());
//        System.out.println(kevin.quitarFrenoMano());
//        System.out.println(kevin.moverIzquierda(3));
    }
}
