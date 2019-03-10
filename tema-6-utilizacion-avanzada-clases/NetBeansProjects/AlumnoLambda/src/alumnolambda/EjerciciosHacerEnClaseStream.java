/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnolambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author carlos
 */
class Prueba3 {

    static void pruebita(Object a) {
        System.out.println(a);
    }

    static int pruebito(Object a, Object b) {
        return 1;
    }
}

public class EjerciciosHacerEnClaseStream {

    static String apellidos[] = {"Hernández", "Pérez", "González", "García", "Rodríguez"};
    static int i = 0;

    public static Hombre crearHombre() {
        String nombres[] = {"Luis", "Marcos", "Andrés", "Ramón", "Ricardo", "Jorge", "Armando"};
        Random rnd = new Random();

        int altura = rnd.nextInt(40) + 155;
        int edad = rnd.nextInt(90);
        int peso = rnd.nextInt(40) + 65;
        String apellido = apellidos[rnd.nextInt(apellidos.length)];
        String nombre = nombres[rnd.nextInt(nombres.length)];

        return new Hombre(nombre, apellido, edad, altura, peso);
    }

    public static Mujer crearMujer() {
        String nombres[] = {"Ana", "María", "Marta", "Luz", "Silvia", "Sandra"};
        Random rnd = new Random();

        int altura = rnd.nextInt(25) + 150;
        int edad = rnd.nextInt(90);
        int peso = rnd.nextInt(30) + 50;
        String apellido = apellidos[rnd.nextInt(apellidos.length)];
        String nombre = nombres[rnd.nextInt(nombres.length)];

        return new Mujer(nombre, apellido, edad, altura, peso);
    }

    public static void generarCodigoParaGrupoPersonas(ArrayList<Persona> personas) {
        System.out.println("\n\n\n");
        for (Persona persona : personas) {
            String genero = "Mujer";
            String n = persona.nombre;
            String a = persona.apellido1;
            String e = "" + persona.edad;
            String alt = "" + persona.alturaEnCm;
            String p = "" + persona.pesoEnKg;
            if (persona instanceof Hombre) {
                genero = "Hombre";
            }
            System.out.println("personas.add(new " + genero + "(\"" + n + "\",\""
                    + a + "\"," + e + "," + alt + "," + p + "));");
        }
    }

    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList<Persona>();

        for (int i = 0; i < 10; i++) {
            Random rnd = new Random();
            if (rnd.nextInt(2) == 0) {
                personas.add(crearMujer());
            } else {
                personas.add(crearHombre());
            }
        }

        generarCodigoParaGrupoPersonas(personas);

        // Mostrar Hombres y mujeres ordenados por sexo y por edad
        System.out.println("\nPersonas ordenados edad sexo: \n");

        personas.stream()
                .sorted((p1, p2) -> {
                    if (p1 instanceof Hombre && p2 instanceof Hombre || p1 instanceof Mujer && p2 instanceof Mujer) {
                        return Integer.compare(p1.edad, p2.edad);
                    } else if (p1 instanceof Hombre && p2 instanceof Mujer) {
                        return -1;
                    } else {
                        return 1;
                    }
                })
                .forEach(System.out::println);

        System.out.println("\n");

        personas.stream()
                .sorted((p1, p2) -> Double.compare(p1.edad, p2.edad))
                .sorted((p1, p2) -> {
                    if (p1 instanceof Hombre && p2 instanceof Hombre || p1 instanceof Mujer && p2 instanceof Mujer) {
                        return 0;
                    } else if (p1 instanceof Hombre && p2 instanceof Mujer) {
                        return -1;
                    } else {
                        return 1;
                    }
                })
                .forEach(System.out::println);

        //Obtener el imc mínimo ( el número ) y mostrar por cada
        //persona su imc
        System.out.println("\nPersonas IMC: \n");

        double imcMinimo
                = personas.stream()
                        .peek(p -> {
                            System.out.println(p);
                            System.out.println(p.imc());
                        })
                        .mapToDouble(p -> p.imc())
                        .min()
                        .getAsDouble();

        System.out.println("\nminIMC: " + imcMinimo);

//crear un arraylist con las mujeres, y obtener la edad media de los hombres
        System.out.println("\nArrayListMujeres, edadmedia hombres: \n");

        ArrayList<Mujer> mujeres = new ArrayList<Mujer>();

        double edadMediaHombres
                = personas.stream()
                        .peek(p -> {
                            if (p instanceof Mujer) {
                                mujeres.add((Mujer) p);
                            }
                        })
                        .filter(p -> p instanceof Hombre)
                        .mapToInt(p -> p.edad)
                        .average()
                        .getAsDouble();

        System.out.println("ArrayList Mujeres: ");
        for (Mujer mujer : mujeres) {
            System.out.println(mujer);
        }

        System.out.println("EdadMediaHombres: " + edadMediaHombres);

        //mostrar por cada persona cuántas personas tienen su misma edad
        System.out.println("\nMostrar por cada persona cuantas tienen su misma edad.\n");

        personas.stream()
                .forEach(persona -> {
                    System.out.println(persona);
                    System.out.println("Personas con la misma edad: "
                            + personas.stream()
                                    .filter(q -> q != persona)
                                    .filter(q -> q.edad == persona.edad)
                                    .count()
                    );
                });

        //mostrar ordenado para cada edad distinta presente, cuantas personas tienen esa edad
        System.out.println("\nMostrar ordenado para cada edad distinta presente, cuantas personas tienen esa edad:\n");

        personas.stream()
                .mapToInt(p -> p.edad)
                .distinct()
                .sorted()
                .forEach(edad -> {
                    System.out.println("Edad: " + edad);
                    System.out.println(
                            personas.stream()
                                    .filter(persona -> persona.edad == edad)
                                    .count()
                    );
                });

        //siguiendo un poco el anterior. Crear un mapa para cada edad como clave una lista de las personas con esa edad como value
        System.out.println("\nsiguiendo un poco el anterior. Crear un mapa para cada edad como clave una lista de las personas con esa edad como value: \n");

        HashMap<Integer, List<Persona>> edadPersonas = (HashMap<Integer, List<Persona>>) personas.stream()
                .sorted((p, q) -> Integer.compare(p.edad, q.edad))
                .collect(Collectors.groupingBy(p -> p.edad));

        for (Map.Entry<Integer, List<Persona>> entry : edadPersonas.entrySet()) {
            System.out.println("Edad: " + entry.getKey());
            for (Persona persona : entry.getValue()) {
                System.out.println(persona);
            }
        }

        //mostrar por cada persona como sería la media de peso si no se contara a esa persona para calcular 
        //la media. Esto es, como influye la persona en la media total
        System.out.println("\nMostrar por cada persona la media de las personas sin contar su peso: \n");
        personas.stream()
                .forEach(persona -> {
                    System.out.println(persona);
                    System.out.println("Media sin esta persona: "
                            + personas.stream()
                                    .filter(q -> q != persona)
                                    .mapToDouble(p -> p.pesoEnKg)
                                    .average()
                                    .getAsDouble() + "\n"
                    );
                });

        //obtener la diferencia de peso menor entre dos personas cualesquiera del array. Esto es por ejemplo, si hay dos personas
        //del array con el mismo peso, entonces devolvería cero
        System.out.println("\nObtener minima distancia de peso: \n");

        personas.stream()
                .mapToDouble(p -> p.pesoEnKg)
                .forEach(p -> {
                    System.out.println((++i) + ". " + p);
                });

        System.out.println("");

        EjerciciosHacerEnClaseStream.i = 0;

        double minimaDistancia = personas.stream()
                .mapToDouble(p -> {
                    double distanciaMinima = personas.stream()
                            .filter(q -> q != p)
                            .mapToDouble(q -> Math.abs(p.pesoEnKg - q.pesoEnKg))
                            .min()
                            .getAsDouble();

                    return distanciaMinima;
                })
                .peek(p -> {
                    System.out.println((++i) + ". " + p);
                })
                .min()
                .getAsDouble();

        System.out.println("Distancia Minima: " + minimaDistancia);

        //Por cada persona generar tres pesos aleatorios que estén entre +-5 respecto al peso de la persona
        //mostrar todos los pesos generados y calcular la media de esos pesos. Si los números aleatorios
        //están bien generados esa media no debiera diferir mucho del peso medio de las personas del array
        //( crear un arraylist con los tres pesos generados para volcarlo todo en el stream es una opción a considerar )
        personas.stream()
                .mapToDouble(p -> p.pesoEnKg)
                .average()
                .ifPresent(p -> {
                    System.out.println("Media normal pesos: " + p + "\n");
                });

        personas.stream()
                .flatMap(p -> {
                    Random rnd = new Random();
                    ArrayList<Double> pesosAleatorios = new ArrayList<>();
                    pesosAleatorios.add(((p.pesoEnKg) - 5) + rnd.nextInt(1000) / (double) 100);
                    pesosAleatorios.add(((p.pesoEnKg) - 5) + rnd.nextInt(1000) / (double) 100);
                    pesosAleatorios.add(((p.pesoEnKg) - 5) + rnd.nextInt(1000) / (double) 100);
                    return pesosAleatorios.stream();
                })
                .peek(System.out::println)
                .mapToDouble(p -> p)
                .average()
                .ifPresent(p -> {
                    System.out.println("\nMedia: " + p);
                });

        //Mostrar ordenado para cada edad distinta presente, cuantas personas tienen esa edad
        System.out.println("\nMostrar ordenado para cada edad distinta presente, cuantas personas tienen esa edad:\n");
        personas.stream()
                .mapToInt(p -> p.edad)
                .distinct()
                .sorted()
                .forEach(edad -> {
                    System.out.println("Edad:" + edad);

                    long numeroPersonas = personas.stream()
                            .filter(p -> p.edad == edad)
                            .count();
                    System.out.println(numeroPersonas);

                });

//Obtener el imc mínimo ( el número ) y mostrar por cada
//persona su imc
        System.out.println("\nIMC2: \n");

        double minImc2 = personas.stream()
                .peek(p -> {
                    System.out.println(p);
                    System.out.println("imc: " + p.imc());
                })
                .mapToDouble(p -> p.imc())
                .min()
                .getAsDouble();

        System.out.println(minImc2);

//crear un arraylist con las mujeres, y obtener la edad media de los hombres
        System.out.println("\nEdadmedia Hombres- ArrayListMujeres\n");
        ArrayList<Mujer> mujeres2 = new ArrayList<Mujer>();
        double edadMediaHombres2 = personas.stream()
                .peek(p -> {
                    if (p instanceof Mujer) {
                        mujeres2.add((Mujer) p);
                    }
                })
                .filter(p -> p instanceof Hombre)
                .mapToDouble(p -> p.edad)
                .average()
                .getAsDouble();

        System.out.println("edad media hombre: " + edadMediaHombres2);

//mostrar por cada persona cuántas personas tienen su misma edad
        System.out.println("\nPor cada persona num personas misma edad: \n");

        personas.stream()
                .forEach(persona -> {
                    System.out.println(persona);
                    System.out.println("num mismaEdad: "
                            + personas.stream()
                                    .filter(q -> q != persona)
                                    .filter(q -> q.edad == persona.edad)
                                    .count()
                    );
                });

//mostrar ordenado para cada edad distinta presente, cuantas personas tienen esa edad
        System.out.println("\npor cada edad distinta cuantas personas.\n");

        personas.stream()
                .mapToInt(p -> p.edad)
                .distinct()
                .sorted()
                .forEach(edad -> {
                    System.out.println("edad; " + edad);
                    System.out.println("num personas: "
                            + personas.stream()
                                    .filter(p -> p.edad == edad)
                                    .count()
                    );
                });

//siguiendo un poco el anterior. Crear un mapa para cada edad como clave una lista de las personas con esa edad como value
        System.out.println("\nMapa edad - Lista personas\n");

        HashMap<Integer, List<Persona>> mapaEdadPersonas2
                = (HashMap<Integer, List<Persona>>) personas.stream()
                        .collect(Collectors.groupingBy(p -> p.edad));

        for (Map.Entry<Integer, List<Persona>> entry : mapaEdadPersonas2.entrySet()) {
            System.out.println("edad: " + entry.getKey());
            System.out.println("Personas: ");
            for (Persona persona : entry.getValue()) {
                System.out.println(persona);
            }
        }

//mostrar por cada persona como sería la media de peso si no se contara a esa persona para calcular 
//la media. Esto es, como influye la persona en la media total
        System.out.println("\nCada persona muestra la media sin contar su peso: \n");

        personas.stream()
                .forEach(persona -> {
                    System.out.println(persona);
                    System.out.println(
                            personas.stream()
                                    .filter(p -> p != persona)
                                    .mapToDouble(p -> p.pesoEnKg)
                                    .average()
                                    .getAsDouble()
                    );
                });

//obtener la diferencia de peso menor entre dos personas cualesquiera del array. Esto es por ejemplo, si hay dos personas
//del array con el mismo peso, entonces devolvería cero
        System.out.println("\nDiferencia de peso menor entre dos personas del array\n");

        double minDif2 = personas.stream()
                .mapToDouble(p -> {
                    return personas.stream()
                            .filter(q-> p != q)
                            .mapToDouble(q -> Math.abs(p.pesoEnKg - q.pesoEnKg))
                            .min()
                            .getAsDouble();
                })
                .min()
                .getAsDouble();

        System.out.println("Diferencia peso minima:" + minDif2);

//Por cada persona generar tres pesos aleatorios que estén entre +-5 respecto al peso de la persona
//mostrar todos los pesos generados y calcular la media de esos pesos. Si los números aleatorios
//están bien generados esa media no debiera diferir mucho del peso medio de las personas del array
//( crear un arraylist con los tres pesos generados para volcarlo todo en el stream es una opción a considerar )
        System.out.println("\n3 Pesos aleatorios por cada persona(5kg +- su peso), media de estos:\n");

        personas.stream()
                .flatMap(p -> {
                    Random rnd = new Random();
                    ArrayList<Double> pesosAleatorios2 = new ArrayList<>();
                    for (int j = 0; j < 3; j++) {
                        pesosAleatorios2.add((p.pesoEnKg-5)+rnd.nextInt(1000)/100.0);
                    }
                    return pesosAleatorios2.stream();
                })
                .peek(System.out::println)
                .mapToDouble(p-> p)
                .average()
                .ifPresent(p-> System.out.println("\nPeso Medio: "+p));
        

    }

}
