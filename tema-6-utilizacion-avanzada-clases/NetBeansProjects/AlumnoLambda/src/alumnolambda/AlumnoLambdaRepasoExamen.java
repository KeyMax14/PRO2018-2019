/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnolambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class AlumnoLambdaRepasoExamen {

    static String nombres[] = {"Ana", "María", "Alfredo", "Martín", "Diego", "Rita", "Américo", "Marta"};
    static String apellidos[] = {"González", "García", "Pérez", "Rodríguez", "Expósito", "Hernández"};

    public static Profesor crearProfesor() {
        String departamentos[] = {"Psicología", "Medicina", "Biología", "Farmacia"};
        Random rnd = new Random();
        String nombre = nombres[rnd.nextInt(nombres.length)];
        String apellido = apellidos[rnd.nextInt(apellidos.length)];

        int edad = rnd.nextInt(80) + 10;
        int altura = rnd.nextInt(40) + 150;
        int peso = rnd.nextInt(40) + 50;
        double salario = rnd.nextInt(1000) + 1800;
        String departamento = departamentos[rnd.nextInt(departamentos.length)];
        Profesor prof = new Profesor(nombre, apellido, edad, altura, peso, departamento, salario);
        return prof;

    }

    public static Alumno crearAlumno() {
        Random rnd = new Random();
        String nombre = nombres[rnd.nextInt(nombres.length)];
        String apellido = apellidos[rnd.nextInt(apellidos.length)];

        int edad = rnd.nextInt(80) + 10;
        int altura = rnd.nextInt(40) + 150;
        int peso = rnd.nextInt(40) + 50;
        Alumno alu = new Alumno(nombre, apellido, edad, altura, peso);

        int numeroAsignaturas = rnd.nextInt(Alumno.Asignatura.values().length / 2) + Alumno.Asignatura.values().length / 2;
        for (int j = 0; j < numeroAsignaturas; j++) {
            int intAsignatura = rnd.nextInt(Alumno.Asignatura.values().length);
            Alumno.Asignatura asignatura = Alumno.Asignatura.values()[intAsignatura];
            int nota = rnd.nextInt(11);
            alu.agregarCalificacion(asignatura, nota);
        }

        return alu;

    }

    public static void main(String[] args) {

        ArrayList<Persona> array = new ArrayList<Persona>();
        Random rnd = new Random();

        for (int i = 0; i < 20; i++) {
            int probabilidadCrearProfesor = rnd.nextInt(10);
            Persona p = null;
            if (probabilidadCrearProfesor < 3) {  // 3 de 10: aproximadamente el 30% de las veces se creará un profesor
                p = crearProfesor();
            } else {
                p = crearAlumno();
            }
            array.add(p);

        }

        array.stream()
                .forEach(System.out::println);

        //1) Mostrar el salario más alto de los profesores
        System.out.println("\nMostrar salario más alto\n");

        array.stream()
                .filter(p -> p instanceof Profesor)
                .mapToDouble(p -> ((Profesor) p).salario)
                .max()
                .ifPresent(System.out::println);

        //2) Mostrar el salario medio de los profesores
        System.out.println("\nMostrar salario medio: \n");

        array.stream()
                .filter(p -> p instanceof Profesor)
                .mapToDouble(p -> ((Profesor) p).salario)
                .average()
                .ifPresent(System.out::println);

        //3) Mostrar cuál es la máxima cantidad de asignaturas de las que hay
        //matriculado un alumno ( contar las asignaturas que tiene cada alumno y mostrar la cantidad máxima entre esas )
        System.out.println("\n Maxima cantidad asignaturas: \n");

        array.stream()
                .filter(p -> p instanceof Alumno)
                .mapToInt(p -> ((Alumno) p).calificaciones.size())
                .max()
                .ifPresent(System.out::println);

        //4) mostrar nombre, apellido altura y peso para las personas que tienen 
        //sobrepeso ( imc >= 25 ) Sabiendo que la fórmula de imc es:
        //   peso / altura^2     Donde peso está en kg y altura en m
        System.out.println("\nNombre, apellido, altura de personas con sobrepeso: \n");

        array.stream()
                .filter(p -> p.imc() >= 25)
                .forEach(p -> {
                    System.out.println(p.nombre + " " + p.apellido1 + ", Altura: " + p.alturaEnCm);
                });

        //5) mostrar las dos alturas distintas más bajas
//        System.out.println("\nTodas las alturas :\n");
//        
//        array.stream()
//                .mapToInt(p -> p.alturaEnCm)
//                .sorted()
//                .forEach(System.out::println);
//        
        System.out.println("\nMostrar las dos alturas distintas más bajas:\n");

        array.stream()
                .mapToInt(p -> p.alturaEnCm)
                .distinct()
                .sorted()
                .limit(2)
                .forEach(System.out::println);

        //6) Decir: hay profesores en el array si se encuentran profesores 
        // no se puede usar for ni bucles habituales y únicamente un método de stream ( no pueden usarse varios )
        // máximo 3 líneas de código( es inválido varias sentencias en una única línea:  int a; a=3; a++;  )
        System.out.println("\n¿Hay profesores en el array?\n");

        if (array.stream().anyMatch(p -> p instanceof Profesor)) {
            System.out.println("Hay profesores en el array");
        }

        // 6.1 Obtener un ArrayList con las personas llamadas Ana
        System.out.println("\nObtener un ArrayList con las personas llamadas Ana: \n");

        ArrayList<Persona> personasLlamadasAna = (ArrayList<Persona>) array.stream()
                .filter(p -> p.nombre.toLowerCase().equals("ana"))
                .collect(Collectors.toList());

        for (Persona persona : personasLlamadasAna) {
            System.out.println(persona);
        }

        //7) mostrar en mayúsculas los diferentes departamentos que aparecen en el arraylist 
        //ordenados alfabéticamente
        System.out.println("\nMostrar en mayusculas los diferentes departamentos.\n");

        array.stream()
                .filter(p -> p instanceof Profesor)
                .map(p -> ((Profesor) p).departamento.toUpperCase())
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nAlfabetico inverso:");

        array.stream()
                .filter(p -> p instanceof Profesor)
                .map(p -> ((Profesor) p).departamento.toUpperCase())
                .sorted((p, q) -> (q.compareTo(p)))
                .distinct()
                .forEach(System.out::println);

        // 8) obtenener y mostrar la cantidad de profesores por cada departamento
        // no se deben mostrar los departamentos que no tienen ningún profesor
        HashMap<String, Long> cantidadProfesoresDepartamento = new HashMap<>();

        array.stream()
                .filter(p -> p instanceof Profesor)
                .map(p -> ((Profesor) p).departamento)
                .distinct()
                .sorted()
                .forEach(departamento -> {
                    System.out.println("Departamento: " + departamento);
                    long cantidadProfesores = array.stream()
                            .filter(p -> p instanceof Profesor)
                            .map(p -> (Profesor) p)
                            .filter(p -> p.departamento.equals(departamento))
                            .count();
                    System.out.println("numProfesores: " + cantidadProfesores);
                    cantidadProfesoresDepartamento.put(departamento, cantidadProfesores);
                });

        System.out.println("");

        for (Map.Entry<String, Long> entry : cantidadProfesoresDepartamento.entrySet()) {
            System.out.println("Departamento: " + entry.getKey() + " NumProfesores: " + entry.getValue());
        }

        // Otra forma - Departamentos, junto a profesores.
        System.out.println("\nMostras Departamentos junto a sus profesores.\n");
        HashMap<String, List<Profesor>> cantidadProfesoresDepartamento2 = (HashMap<String, List<Profesor>>) array.stream()
                .filter(p -> p instanceof Profesor)
                .map(p -> (Profesor) p)
                .collect(Collectors.groupingBy(p -> p.departamento));

        for (Map.Entry<String, List<Profesor>> entry : cantidadProfesoresDepartamento2.entrySet()) {
            System.out.println("Departamento: " + entry.getKey());
            System.out.println("Profesores: ");
            for (Profesor profesor : entry.getValue()) {
                System.out.println(profesor);
            }
            System.out.println("");
        }

        System.out.println("");

        // 9) obtener el porcentaje de profesores del array ( 100* cantidad profesores / tamaño del array   )
        System.out.println("\nObtener porcentaje de profesores dentro del array: \n");
        long cantidadProfesores = array.stream()
                .filter(p -> p instanceof Profesor)
                .count();

        System.out.println((100 * cantidadProfesores) / (double) array.size());

        // 10) mostrar los nombres completos de  los alumnos cuyo nombre de pila comience por: "A" y su calificación en LND 
        //( en el caso que la tengan en otro caso escribir: no tiene LND )
        System.out.println("\n\nAlumnos con LND que su nombre empieza por A\n");

        array.stream()
                .filter(persona -> persona instanceof Alumno)
                .filter(persona -> persona.nombre.toUpperCase().charAt(0) == 'A')
                .map(persona -> (Alumno) persona)
                .forEach(alumno -> {
                    System.out.print(alumno.nombre + " " + alumno.apellido1 + ", Nota LND: ");
                    int nota = alumno.calificaciones.stream()
                            .filter(p -> p.asignatura == Alumno.Asignatura.LND)
                            .mapToInt(p -> p.nota)
                            .findFirst()
                            .orElse(-1);
                    if (nota == -1) {
                        System.out.println("No tiene LND.");
                    }else{
                        System.out.println(nota);
                    }
                });
    }
}
