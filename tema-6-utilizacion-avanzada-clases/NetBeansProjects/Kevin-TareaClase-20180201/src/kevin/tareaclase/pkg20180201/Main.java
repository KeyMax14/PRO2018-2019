/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kevin.tareaclase.pkg20180201;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca("Biblioteca Kevin");
        int opcion;
        do {
            System.out.println("Menu:");
            System.out.println("1) Agregar libro a la biblioteca.");
            System.out.println("2) Buscar volumenes para un titulo.");
            System.out.println("3) Salir.");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Titulo:");
                    String titulo = sc.nextLine();
                    System.out.println("Resumen:");
                    String resumen = sc.nextLine();
                    System.out.println("Número de páginas:");
                    int nPaginas = sc.nextInt();
                    sc.nextLine();
                    System.out.println("¿Cuantos autores tiene el libro?");
                    int nAutores = sc.nextInt();
                    sc.nextLine();
                    String[] autores = new String[nAutores];
                    for (int i = 0; i < autores.length; i++) {
                        System.out.print(i + "º autor: ");
                        autores[i] = sc.nextLine();
                    }
                    biblioteca.agregarLibro(titulo, resumen, nPaginas, autores);
                    break;
                case 2:
                    System.out.println("Introduce el titulo del libro a buscar: ");
                    String tituloLibro = sc.nextLine();
                    String listado = biblioteca.listadoTitulo(tituloLibro);
                    System.out.println(listado);
                    if (!listado.equals("No tenemos ese libro.")) {
                        System.out.println("1) Prestamo");
                        System.out.println("2) Devolucion");
                        System.out.println("3) Salir");
                        int opcionPrestamo = sc.nextInt();
                        sc.nextLine();
                        switch (opcionPrestamo) {
                            case 1:
                                System.out.println("Nombre del solicitante: ");
                                VolumenLibroBiblio[] aux = biblioteca.volumenes.get(tituloLibro).toArray(new VolumenLibroBiblio[biblioteca.volumenes.get(tituloLibro).size()]);
                                biblioteca.prestar(aux[0], sc.nextLine());
                                break;
                            case 2:
                                System.out.println("Nombre del solicitante: ");
                                VolumenLibroBiblio[] aux1 = biblioteca.volumenes.get(tituloLibro).toArray(new VolumenLibroBiblio[biblioteca.volumenes.get(tituloLibro).size()]);
                                biblioteca.devolver(aux1[0], sc.nextLine());
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Opción incorrecta.");
                        }
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    ;
            }
        } while (opcion != 3);

    }
}
