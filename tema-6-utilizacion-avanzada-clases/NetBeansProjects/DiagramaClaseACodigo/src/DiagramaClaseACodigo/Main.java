/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiagramaClaseACodigo;

import java.util.HashMap;
import java.util.InputMismatchException;
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

        uni.estudiantes.put(et.dni.dni, et);

    }

    static void agregarEstudianteGrado(Departamento dep) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce dni");
        String dni = sc.nextLine();

        System.out.println("introducir nombre");
        String nombre = sc.nextLine();

        System.out.println("introducir expediente");
        String expediente = sc.nextLine();

        System.out.println("¿titulacion?");
        System.out.println(dep.listadoTitulaciones());
        int titulacion = sc.nextInt();

        Titulaciones tit = dep.titulaciones.get(titulacion);

        EstudianteDeGrado e = new EstudianteDeGrado(tit, new Expediente(expediente), new Dni(dni), nombre);

        dep.estudiantes.put(e.dni.dni, e);
        Estudiante estudianteGrado = (Estudiante) e;
        dep.universidad.estudiantes.put(estudianteGrado.dni.dni, estudianteGrado);

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

        uni.trabajadores.put(t.dni.dni, t);
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

        int opcion = 0;
        do {
            System.out.println("¿Que desea hacer?");
            System.out.println("1) Agregar universidad: ");
            System.out.println("2) Listado Universidades: ");
            System.out.println("3) Agregar estudiante: ");
            System.out.println("4) Agregar trabajadores: ");
            System.out.println("5) Agregar departamento: ");
            System.out.println("6) Agregar estudiante de grado");
            System.out.println("7) Quitar trabajadores");
            System.out.println("8) Quitar departamento");
            System.out.println("9) Quitar Universidad");
            System.out.println("10) Quitar Estudiante");
            System.out.println("11) Listado Trabajadores");
            System.out.println("12) Listado departamentos");
            System.out.println("13) Listado Estudiantes");
            System.out.println("14) Listado Estudiantes por departamento");
            
            /*
             quitar departamentos
            quitar estudiantes
            quitar universades
            listar todo lo que se te ocurra.
             */
            System.out.println("20) Salir. ");
            boolean numeroCorrecto = false;
            do {                
                try {
                    opcion = sc.nextInt();
                    sc.nextLine();
                    numeroCorrecto = true;
                } catch (InputMismatchException e) {
                    System.out.println("Introduce un número válido.");
                    sc.nextLine();
                }
            } while (!numeroCorrecto);
            
            
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
                        agregarTrabajadores(uni2);
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
                    System.out.println("En que universidad estudia?");
                    String Universidad3 = sc.nextLine();
                    System.out.println("Cual es su dni?");
                    String dni = sc.nextLine();

                    Universidad uni4 = universidades.get(Universidad3);
                    if (uni4 == null) {
                        System.out.println("No existe esa universidad.");
                    } else {

                        try {
                            if (uni4.estudiantes.get(dni)instanceof EstudianteDeGrado) {
                                System.out.println("¿Departamento?");
                                String nomDep = sc.nextLine();
                                if (uni4.departamentos.get(nomDep) == null) {
                                    System.out.println("No existe el departamento.");
                                    break;
                                }
                                uni4.departamentos.get(nomDep).estudiantes.remove(dni);
                            }
                            uni4.estudiantes.remove(dni);
                        } catch (NullPointerException w) {
                            System.out.println("No existe ese estudiante.");
                        }

                    }
                    break;
                case 7:
                    System.out.println("En que universidad Trabaja?");
                    String Universidad4 = sc.nextLine();
                    System.out.println("Cual es su dni?");
                    String dni1 = sc.nextLine();
                    Universidad uni5 = universidades.get(Universidad4);
                    if (uni5 == null) {
                        System.out.println("No existe esa universidad.");
                    } else {

                        try {
                            uni5.trabajadores.remove(dni1);
                        } catch (NullPointerException r) {
                            System.out.println("No existe ese trabajador");
                        }

                    }
                    break;

                case 8:
                    System.out.println("En que universidad esta?");
                    String Universidad5 = sc.nextLine();
                    System.out.println("Cual es el nombre del departamento?");
                    String nom = sc.nextLine();
                    Universidad uni6 = universidades.get(Universidad5);
                    if (uni6 == null) {
                        System.out.println("No existe esa universidad.");
                    } else {
                        try {

                            uni6.departamentos.remove(nom);

                        } catch (NullPointerException e) {
                            System.out.println("No existe ese departamento");
                        }

                    }

                    break;

                case 9:
                    System.out.println("Dime el nombre de la universidad");
                    String nom1 = sc.nextLine();
                    Universidad uni7 = universidades.get(nom1);

                    if (uni7 == null) {
                        System.out.println("No existe esa universidad.");
                    } else {

                        universidades.remove(nom1);

                    }
                    break;

                case 13:
                    System.out.println("Dime el nombre de la universidad para listar sus alumnos");

                    String Universidad6 = sc.nextLine();
                    Universidad unis = universidades.get(Universidad6);
                    if (unis == null) {
                        System.out.println("No existe esa universidad.");
                    } else {
                        unis.listarEstudiantes();
                    }
                    break;
                case 11:
                    System.out.println("Dime el nombre de la universidad para listar sus Trabajadores");

                    String Universidad7 = sc.nextLine();
                    Universidad unis1 = universidades.get(Universidad7);
                    if (unis1 == null) {
                        System.out.println("No existe esa universidad.");
                    } else {
                        unis1.listarTrabajadores();
                    }
                    break;
                case 12:
                    System.out.println("Dime el nombre de la universidad para listar sus Departamentos");

                    String Universidad8 = sc.nextLine();
                    Universidad unis2 = universidades.get(Universidad8);
                    if (unis2 == null) {
                        System.out.println("No existe esa universidad.");
                    } else {
                        unis2.listarDepartamento();
                    }
                    break;
                case 6:
                    System.out.println("¿Universidad?");
                    String Universidad123 = sc.nextLine();
                    Universidad unis4 = universidades.get(Universidad123);
                    if (unis4 == null) {
                        System.out.println("No existe esa universidad.");
                    } else {
                        System.out.println("¿Departamento?");
                        String departamento = sc.nextLine();
                        Departamento d = unis4.departamentos.get(departamento);
                        if (d == null) {
                            System.out.println("No existe el departamento.");
                        } else {
                            agregarEstudianteGrado(d);
                        }
                    }
                    break;
                case 14:
                    System.out.println("¿Universidad?");
                    String Universidad124 = sc.nextLine();
                    Universidad unis6 = universidades.get(Universidad124);
                    if (unis6 == null) {
                        System.out.println("No existe esa universidad.");
                    } else {
                        System.out.println("¿Departamento?");
                        String departamento1 = sc.nextLine();
                        Departamento d1 = unis6.departamentos.get(departamento1);
                        if (d1 == null) {
                            System.out.println("No existe el departamento.");
                        } else {
                            System.out.println(d1.listadoEstudiantes());
                        }
                    }
                    break;
                case 20:
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("Elija una opcion válida.");
            }

        } while (opcion != 20);

    }
}
