/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenkevinparte2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

/**
 *
 * @author Kevin Hernández García
 */
public class Ejercicio4 {

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

        /*
            1:  a) obtener altura media en variable
         */
        System.out.println("\n1 a :obtener altura media en variable\n");

        double alturaMediaA = array.stream()
                .mapToDouble(p -> p.alturaEnCm)
                .average()
                .getAsDouble();

        System.out.println(alturaMediaA);

        /*
        2: b) Mostrar la informacion de la persona con menos edad
         */
        System.out.println("\n  2: b) Mostrar la informacion de la persona con menos edad \n");

        array.stream()
                .mapToInt(p -> p.edad)
                .min()
                .ifPresent(edadMin -> {
                    array.stream()
                            .filter(p -> p.edad == edadMin)
                            .findFirst()
                            .ifPresent(System.out::println);
                });

        /*
        3: c) Crear un arrayList con los alumnos del array.
         */
        System.out.println("\n3: c) Crear un arrayList con los alumnos del array.\n");

        ArrayList<Alumno> arrLAlumnosC = (ArrayList<Alumno>) array.stream()
                .filter(p -> p instanceof Alumno)
                .map(p -> (Alumno) p)
                .collect(Collectors.toList());

//        System.out.println(arrLAlumnosC);
        /*
        4: d) guardar en una variable boolean true si en el array hay un profesor
         */
        boolean hayProfesorD = array.stream().anyMatch(p -> p instanceof Profesor);

//        System.out.println(hayProfesorD);

        /*
            5: e) mostrar el salario maximo de los profesores. 
         */
        System.out.println("\n5: e) mostrar el salario maximo de los profesores. \n");
        array.stream()
                .filter(p -> p instanceof Profesor)
                .mapToDouble(p -> ((Profesor) p).salario)
                .max()
                .ifPresent(System.out::println);

        /*
        6: g) mostrar las dos alturas distintas mas bajas
         */
        System.out.println("\n6: g) mostrar las dos alturas distintas mas bajas\n");

        array.stream()
                .mapToInt(p -> p.alturaEnCm)
                .distinct()
                .sorted()
                .limit(2)
                .forEach(System.out::println);

        /*
        7: h) Mostrar los departamentos que aparecen en el arraylist en mayusculas ordenados alfabeticamente
         */
        System.out.println("\n7: h) Mostrar los departamentos que aparecen en el arraylist en mayusculas ordenados alfabeticamente\n");

        array.stream()
                .filter(p -> p instanceof Profesor)
                .map(p -> ((Profesor) p).departamento.toUpperCase())
                .distinct()
                .sorted()
                .forEach(System.out::println);

        /*
        8: k) obtener un boolean que diga true si todos los del array son adultos
         */
        boolean todosAdultosK = array.stream().allMatch(p -> p.edad >= 18);
//        System.out.println(todosAdultosK);

        /*
        9: f) calcular las asignaturas que tiene cada alumno y mostrar la maxima de estas
         */
        System.out.println("\n9: f) calcular las asignaturas que tiene cada alumno y mostrar la maxima de estas\n");
        array.stream()
                .filter(p -> p instanceof Alumno)
                .mapToInt(alumno -> ((Alumno) alumno).calificaciones.size())
                .max()
                .ifPresent(System.out::println);

        /*
        10: l) mostrar la cantidad de apellidos distintos y la cantidad de letras que tienen
         */
        System.out.println("\n10: l) mostrar la cantidad de apellidos distintos y la cantidad de letras que tienen\n");

        array.stream()
                .map(p -> p.apellido1)
                .distinct()
                .forEach(p -> System.out.println(p + " " + p.length()));

        /*
        11: m) agrupar las personas segun el tamaño de sus nombres de pila.
         */
        System.out.println("\n11: m) agrupar las personas segun el tamaño de sus nombres de pila.\n");
        HashMap<Integer, List<Persona>> personasPorNombreM = (HashMap<Integer, List<Persona>>) array.stream()
                .collect(Collectors.groupingBy(p -> p.nombre.length()));

//        for (Map.Entry<Integer, List<Persona>> entry : personasPorNombreM.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }

        /*
        12: n) aumentar el sueldo 2000€ de todos los del departamento de Medicina 
         */
        array.stream()
                .filter(p -> p instanceof Profesor)
                .map(p -> (Profesor) p)
                .filter(p -> p.departamento.toLowerCase().equals("medicina"))
                .forEach(p -> p.salario += 2000);
        /*
        13: p) Mostrar todos los alumnos (Nombres completos) que tengan la edad mas baja
         */

        System.out.println("\n13: p) Mostrar todos los alumnos (Nombres completos) que tengan la edad mas baja\n");

        array.stream()
                .filter(p -> p instanceof Alumno)
                .mapToInt(p -> p.edad)
                .min()
                .ifPresent(edadMinima -> {
                    array.stream()
                            .filter(p -> p instanceof Alumno)
                            .filter(alumno -> alumno.edad == edadMinima)
                            .map(p -> ((Alumno) p).nombre + " " + ((Alumno) p).apellido1)
                            .forEach(System.out::println);
                });

        /*
        14: i) se quiere obtener cual es la nota proxima a: 7,3
         */
        System.out.println("\n14: i) se quiere obtener cual es la nota proxima a: 7,3\n");

        double notaProximaI = array.stream()
                .filter(p -> p instanceof Alumno)
                .map(p -> (Alumno) p)
                .flatMap(alumno -> alumno.calificaciones.stream())
                .map(calif -> calif.nota)
                .min((p, q) -> Double.compare(Math.abs(7.3 - p), Math.abs(7.3 - q)))
                .get();

        System.out.println(notaProximaI);

        /*
        15: j) mostrar la media de todas las notas. obtener media
         */
        System.out.println("\n15: j) mostrar la media de todas las notas. obtener media\n");
        
        array.stream()
                .filter(p -> p instanceof Alumno)
                .map(p -> (Alumno) p)
                .flatMap(alumno -> alumno.calificaciones.stream())
                .mapToDouble(calif -> calif.nota)
                .average()
                .ifPresent(System.out::println);
        
        /*
        16: r) Mostrar el nombre departamento que paga menos a sus empleados
        */
        System.out.println("\n16: r) Mostrar el nombre departamento que paga menos a sus empleados\n");
        
        array.stream()
                .filter(p -> p instanceof Profesor)
                .map(p -> (Profesor)p )
                .sorted();
        

                
        
        
        
        
                
    }
}
