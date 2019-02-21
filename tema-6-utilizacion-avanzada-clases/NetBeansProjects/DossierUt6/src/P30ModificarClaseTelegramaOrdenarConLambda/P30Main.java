/*
    Práctica 30: Modifica el ejercicio 21 de la UT de estructuras de almacenamiento para que
        el criterio de ordenamiento de lTelegrama se establezca mediante una expresión lambda
 */
package P30ModificarClaseTelegramaOrdenarConLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P30Main {
    public static void main(String[] args) {
        ArrayList<Telegrama> listaTelegramas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("Menu: ");
            System.out.println("1)Crear telegrama.");
            System.out.println("2)Ver telegrama.");
            System.out.println("3)Salir.");
            option = sc.nextInt();sc.nextLine();
            switch (option) {
                case 1:
                    System.out.print("Destinado a: ");
                    String receptor = sc.nextLine();
                    System.out.print("Enviado por: ");
                    String emisor = sc.nextLine();
                    System.out.println("Escriba su mensaje: ");
                    String mensaje = sc.nextLine(); // Dejo el valor por defecto a 1 por caracter.
                    listaTelegramas.add(new Telegrama(mensaje, emisor, receptor));
                    
                    /*
                        Mod p30 Tema6 -- Antes se usaba una clase que implementaba comparator,
                        Ahora se ordena pasandole el criterio de ordenacion directamente con una 
                        lambda.
                    */
                    
                    Comparator<Telegrama> cmptTelegrama = (t1, t2) -> Double.compare(t1.coste(), t2.coste());
                    
//                    Collections.sort(listaTelegramas,new ComparadorTelegrama()); 
                    Collections.sort(listaTelegramas,cmptTelegrama); 
                    break;
                case 2:
                    System.out.println("Lista de Telegramas: \n");
                    for (Telegrama telegrama : listaTelegramas) {
                        System.out.println(telegrama);
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion incorrecta.\n");
            }
        } while (option!=3);
        
    }
}
