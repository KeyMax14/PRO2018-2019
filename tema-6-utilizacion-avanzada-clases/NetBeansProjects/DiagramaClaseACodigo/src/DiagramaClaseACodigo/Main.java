/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiagramaClaseACodigo;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Main {

    static Universidad agregarUniversidad(HashMap<String, Universidad> universidades) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de la universidad: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce la ciudad donde esta la universidad: ");
        String ciudad = sc.nextLine();
        Universidad uni = new Universidad(nombre, ciudad);
        universidades.put(nombre, uni);
        return uni;
    }

    static String listadoUniversidades(HashMap<String, Universidad> unis) {
        String resultado = "";
        for (Universidad uni : unis.values()) {
            resultado += uni + "\n";
        }
        return resultado;
    }

    static void agregarEstudiante(Universidad uni) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce dni");
        String dni = sc.nextLine();

        System.out.println("introducir nombre");
        String nombre = sc.nextLine();

        System.out.println("introducir expediente");
        String expediente = sc.nextLine();

        Estudiante et = new Estudiante(new Expediente(expediente), new Dni(dni), nombre);

        uni.estudiantes.put(et.dni, et);

    }

    static void agregarEstudiante(Universidad uni, Estudiante e) {
        uni.estudiantes.put(e.dni, e);
    }

    static void agregarTrabajadores(Universidad uni) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce dni");
        String dni = sc.nextLine();

        System.out.println("introducir nombre");
        String nombre = sc.nextLine();

        System.out.println("introducir fecha inicio trabajo: ");
        String fechaIni = sc.nextLine();

        Trabajador t = new Trabajador(fechaIni, new Dni(dni), nombre);

        uni.trabajadores.put(t.dni, t);
    }

    static void agregarDepartamento(Universidad uni) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre departamento: ");
        String nombre = sc.nextLine();

        Departamento departamento = new Departamento(nombre, uni);
        uni.departamentos.put(departamento.nombre, departamento);
        System.out.println("¿Que titulacion agregas?");
        int i = 0;
        int opcion = 0;
        for (Titulaciones titulacion : Titulaciones.values()) {
            System.out.println((i++) + ") " + titulacion);
        }
        Titulaciones[] tit = Titulaciones.values();
        System.out.println(tit.length + ") Salir");
        do {
            System.out.println("Agrega una opcion: ");
            opcion = sc.nextInt();
            if (opcion >= 0 && opcion < tit.length) {
                departamento.titulaciones.add(tit[opcion]);
            }
        } while (opcion != tit.length);

    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Universidad> universidades = new HashMap<>();

        int opcion;
        do {
            System.out.println("¿Que desea hacer?");
            System.out.println("1) Agregar universidad: ");
            System.out.println("2) Listado Universidades: ");
            System.out.println("3) Agregar estudiante: ");
            System.out.println("4) Agregar trabajadores: ");
            System.out.println("5) Agregar departamento: ");
            /*
             quitar departamentos
            quitar estudiantes
            quitar universades
            listar todo lo que se te ocurra.
            */
            System.out.println("10) Salir. ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    Universidad uni = agregarUniversidad(universidades);
                    System.out.println(uni);
                    break;
                case 2:
                    System.out.println(listadoUniversidades(universidades));
                    break;
                case 3:
                    System.out.println("¿En que universidad estudia?");
                    String universidad = sc.nextLine();

                    Universidad uni1 = universidades.get(universidad);
                    if (uni1 == null) {
                        System.out.println("No existe esa universidad.");
                    } else {
                        agregarEstudiante(uni1);
                    }
                    break;
                case 4:
                    System.out.println("¿En que universidad trabaja?");
                    String universidad1 = sc.nextLine();

                    Universidad uni2 = universidades.get(universidad1);
                    if (uni2 == null) {
                        System.out.println("No existe esa universidad.");
                    } else {
                        agregarEstudiante(uni2);
                    }
                    break;
                case 5:
                    System.out.println("¿En que universidad?");
                    String universidad2 = sc.nextLine();

                    Universidad uni3 = universidades.get(universidad2);
                    if (uni3 == null) {
                        System.out.println("No existe esa universidad.");
                    } else {
                        agregarDepartamento(uni3);
                    }
                    break;
                case 10:
                    System.out.println("Hasta luego.");
                default:
                    System.out.println("Elija una opcion válida.");
            }

        } while (opcion != 10);

    }
}
