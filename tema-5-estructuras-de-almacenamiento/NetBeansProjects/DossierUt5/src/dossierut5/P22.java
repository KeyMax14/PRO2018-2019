/*
    Práctica 22: El usuario debe ir introduciendo el nombre de cada partido político y el
número de votos que ha tenido. Después se le mostrará un menú donde puede elegir
introducir el nombre de un partido y que le muestre los votos que ha tenido. Así como
introducir un límite inferior de votos y uno superior para que se le muestren los partidos y
los votos que han tenido que estén dentro de los límites. Utilizar la estructura dinámica más
apropiada para este caso. Justificar su elección entre comentarios
 */
package dossierut5;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
class Partidos {

    TreeMap<String, Integer> votos;

    public Partidos() {
        votos = new TreeMap<>();
    }

    public int mostrarVotos(String partido) {
        return votos.get(partido);
    }
    
    public String mostrarVotosIntervalos(int limInf, int limSup){
        StringBuilder resultado = new StringBuilder();
        boolean hayPartido = false;
        for (Map.Entry<String, Integer> partido : votos.entrySet()) {
            if (partido.getValue() >= limInf && partido.getValue() <= limSup) {
                resultado.append(partido.getKey()).append(": ").append(partido.getValue()).append(" votos.\n");
                hayPartido = true;
            }
        }
        if (!hayPartido) {
            resultado.append("No hay partidos en ese rango.");
        }
        return resultado.toString();
    }

    @Override
    public String toString() {

        return "Partidos{" + "votos=" + votos + '}';
    }

}

public class P22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Partidos partidos = new Partidos();
        char continuar;
        do {
            System.out.println("Introduce el nombre del partido: ");
            String partido = sc.nextLine();
            System.out.println("Introduce la cantidad de votos que ha recibido el mismo: ");
            int votos = sc.nextInt();
            sc.nextLine();
            partidos.votos.put(partido, votos);
            System.out.println("¿Hay más partidos? (S para continuar)");
            continuar = sc.nextLine().toUpperCase().charAt(0);
        } while ('S' == continuar);
        int opcion;
        do {
            System.out.println("\nMenu: ");
            System.out.println("\n1) Número de votos del partido x: ");
            System.out.println("2) Rango de votos: ");
            System.out.println("3) Salir: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("¿Partido? ");
                    String partido = sc.nextLine();
                    try {
                        System.out.println(partidos.mostrarVotos(partido));
                    } catch (java.lang.NullPointerException e) {
                        System.out.println("No existe ese partido.");
                    }
                    break;
                case 2:
                    System.out.print("¿Limite inferior?: ");
                    int limInf = sc.nextInt();sc.nextLine();
                    System.out.print("¿Limite Superior?: ");
                    int limSup = sc.nextInt();sc.nextLine();
                    System.out.println(partidos.mostrarVotosIntervalos(limInf, limSup));
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
            }
        } while (opcion != 3);

    }
}
