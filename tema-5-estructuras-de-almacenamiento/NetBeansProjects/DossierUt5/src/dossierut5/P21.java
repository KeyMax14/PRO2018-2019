/*
    Práctica 21: Crear la clase Telegrama con atributos: String texto, String remitente, String
        receptor, double precioPalabra Deberá tener como mínimo un constructor. La longitud del
        atributo texto determina el coste del telegrama al multiplicarlo por precioPalabra. Deberá
        haber un método: double coste() y un método toString() que ponga una cabecera que diga
        quién es el remitente, a quién va dirigido y luego el texto del telegrama. Crear un programa
        que use la clase telegrama donde el usuario introduzca los datos de cada telegrama y estos
        queden insertados ordenados por coste en una lista. Se debe crear una nueva clase:
        ComparadorTelegrama que implemente Comparator para mantener la lista ordenada
 */
package dossierut5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
class ComparadorTelegrama implements Comparator<Telegrama>{
    @Override
    public int compare(Telegrama t, Telegrama t1) {
        return Double.compare(t.coste(), t1.coste());
    }
}

class Telegrama{
    private String texto;
    private String remitente;
    private String receptor;
    private double precioPalabra;

    public Telegrama(String texto, String remitente, String receptor, double precioPalabra) {
        this.texto = texto;
        this.remitente = remitente;
        this.receptor = receptor;
        this.precioPalabra = precioPalabra;
    }

    public Telegrama(String texto, String remitente, String receptor) {
        this(texto, remitente, receptor, 1);
    }
    
    public double coste(){
        return texto.length()*precioPalabra;
    }

    @Override
    public String toString() {
        return "Remitente: "+remitente+
                "\nEmitido a: "+receptor+
                "\n"+texto+"\n";
    }
}

public class P21 {
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
                    Collections.sort(listaTelegramas,new ComparadorTelegrama()); // Aquí se ordena utilizando la clase anterior.
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
