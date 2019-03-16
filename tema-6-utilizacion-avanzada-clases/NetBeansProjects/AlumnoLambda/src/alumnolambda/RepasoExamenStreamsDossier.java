/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnolambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class RepasoExamenStreamsDossier {

    static String apellidos[] = {"Hernández", "Pérez", "González", "García", "Rodríguez"};

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

        /*
            Práctica 40: Mostrar las 3 personas de más edad
         */
        System.out.println("\nPráctica 40: Mostrar las 3 personas de más edad\n");

        personas.stream()
                .sorted((p, q) -> Integer.compare(q.edad, p.edad))
                .limit(3)
                .forEach(System.out::println);

        /*
            Práctica 41: Mostrar las personas que tienen menos peso que el que le corresponde
                idealmente
         */
        System.out.println("\nPráctica 41: Mostrar las personas que tienen menos peso que el que le corresponde\n"
                + "idealmente\n");

        personas.stream()
                .filter(p -> p.pesoEnKg < p.calcularPesoIdeal())
                .forEach(System.out::println);

        /*
            Práctica 42: Mostrar una persona de 27 años si hay alguna
         */
        System.out.println("\nPráctica 42: Mostrar una persona de 27 años si hay alguna\n");

        personas.stream()
                .filter(p -> p.edad == 27)
                .findFirst()
                .ifPresent(System.out::println);

        /*
            Práctica 43: Crear un arraylist de hombres con un elemento hombre por cada persona del
                array original
         */
        System.out.println("\nPráctica 43: Crear un arraylist de hombres con un elemento hombre por cada persona del\n"
                + "array original\n");

        ArrayList<Hombre> arrHombres43 = (ArrayList<Hombre>) personas.stream()
                .map(Hombre::new) // Se tuvo que hacer un constructor de Hombre.
                .collect(Collectors.toList());

        for (Hombre hombre : arrHombres43) {
            System.out.println(hombre);
        }

        /*
            Práctica 44: Calcular el peso medio de las mujeres del arraylist
         */
        System.out.println("\nPráctica 44: Calcular el peso medio de las mujeres del arraylist\n");

        double pesoMedio44 = personas.stream()
                .filter(p -> p instanceof Mujer)
                .mapToDouble(p -> p.pesoEnKg)
                .average()
                .getAsDouble();

        System.out.println("Peso medio = " + pesoMedio44);

        /*
            Práctica 45: Mostrar las personas que tienen más edad que la media
         */
        System.out.println("\nPráctica 45: Mostrar las personas que tienen más edad que la media\n");

        personas.stream()
                .mapToInt(p -> p.edad)
                .average()
                .ifPresent(media -> {
                    personas.stream()
                            .filter(p -> p.edad > media)
                            .forEach(System.out::println);
                });

        /*
            Práctica 46: Mostrar por cada persona cuántas personas tienen su misma edad
         */
        System.out.println("\nPráctica 46: Mostrar por cada persona cuántas personas tienen su misma edad\n");
        personas.stream()
                .forEach(persona -> {
                    System.out.println(persona);
                    System.out.println("Misma edad: "
                            + personas.stream()
                                    .filter(p -> p != persona)
                                    .filter(p -> p.edad == persona.edad)
                                    .count()
                    );
                });

        /*
            Práctica 47: Obtener el imc mínimo ( el número ) y mostrar por cada persona su imc
         */
        System.out.println("\nPráctica 47: Obtener el imc mínimo ( el número ) y mostrar por cada persona su imc\n");

        double imcMinimo47 = personas.stream()
                .peek(p -> System.out.println("IMC " + p.nombre + " " + p.apellido1 + ": " + p.imc()))
                .mapToDouble(p -> p.imc())
                .min()
                .getAsDouble();

        System.out.println("\nMinimo IMC: " + imcMinimo47);

        /*
            Práctica 48: Crear un arraylist con las mujeres, y obtener la edad media de los hombres
         */
        System.out.println("\nPráctica 48: Crear un arraylist con las mujeres, y obtener la edad media de los hombres\n");

        ArrayList<Mujer> arrMujeres48 = new ArrayList<>();
        double edadMediaHombres48 = personas.stream()
                .peek(p -> {
                    if (p instanceof Mujer) {
                        arrMujeres48.add((Mujer) p);
                    }
                })
                .filter(p -> p instanceof Hombre)
                .mapToInt(p -> p.edad)
                .average()
                .getAsDouble();

        System.out.println("Edad Media Hombres: " + edadMediaHombres48);

        /*
            Práctica 49: Crear un arraylist con textos que indiquen por cada persona su nombre, sexo
                y edad: "Ana, mujer: 23años" . Este array quedará ordenado por peso
         */
        System.out.println("\nPráctica 49: Crear un arraylist con textos que indiquen por cada persona su nombre, sexo\n"
                + "y edad: \"Ana, mujer: 23años\" . Este array quedará ordenado por peso\n");

        ArrayList<String> arrTextos49 = (ArrayList<String>) personas.stream()
                .sorted((p, q) -> Double.compare(p.pesoEnKg, q.pesoEnKg))
                .map(p -> "" + p.nombre + ", " + ((p instanceof Mujer) ? "mujer" : "hombre") + ": " + p.edad + " años.")
                .collect(Collectors.toList());

        for (String texto49 : arrTextos49) {
            System.out.println(texto49);
        }

        /*
            Práctica 50: Mostrar todas las personas adulta más jovenes (Misma edad) ( se entiende por adulto >= 18años)
         */
        System.out.println("\nPráctica 50: Mostrar todas las personas adulta más jovenes (Misma edad) ( se entiende por adulto >= 18años)\n");

        personas.stream()
                .mapToInt(p -> p.edad)
                .filter(p -> p >= 18)
                .min()
                .ifPresent(edadMinima -> {
                    personas.stream()
                            .filter(p -> p.edad == edadMinima)
                            .forEach(System.out::println);
                });

        /*
            Práctica 51: obtener la persona que se aleja más de su peso ideal ( observar que esto puede
                ser tanto por mucho peso como por poco peso )
         */
        System.out.println("\nPráctica 51: obtener la persona que se aleja más de su peso ideal ( observar que esto puede\n"
                + "ser tanto por mucho peso como por poco peso )\n");

        Persona personaAlejadaPeso51 = personas.stream()
                .max((p, q) -> Double.compare(Math.abs(p.pesoEnKg - p.calcularPesoIdeal()), Math.abs(q.pesoEnKg - q.calcularPesoIdeal())))
                .get();

        System.out.println(personaAlejadaPeso51);

        /*
            Práctica 52: Crear un arraylist con los hombres ordenados de menor a mayor peso al
                principio del array y luego las mujeres con el mismo criterio
         */
        System.out.println("\nPráctica 52: Crear un arraylist con los hombres ordenados de menor a mayor peso al\n"
                + "principio del array y luego las mujeres con el mismo criterio\n");

        ArrayList<Persona> arrPorPesoHombresPrimero = (ArrayList<Persona>) personas.stream()
                .sorted((p, q) -> {
                    if (p instanceof Hombre && q instanceof Hombre || p instanceof Mujer && q instanceof Mujer) {
                        return Double.compare(p.pesoEnKg, q.pesoEnKg);
                    } else if (p instanceof Hombre) {
                        return -1;
                    }else{
                        return 1;
                    }
                })
                .collect(Collectors.toList());
        
        for (Persona persona : arrPorPesoHombresPrimero) {
            System.out.println(persona);
        }
        
        /*
            Práctica 53: Mostrar las mujeres que son más altas que los hombres
        */
        System.out.println("\nPráctica 53: Mostrar las mujeres que son más altas que los hombres\n");
        
        personas.stream()
                .filter(p -> p instanceof Hombre)
                .mapToInt(p -> p.alturaEnCm)
                .max()
                .ifPresent(alturaMaxima -> {
                    personas.stream()
                            .filter(p -> p instanceof Mujer && p.alturaEnCm > alturaMaxima)
                            .forEach(System.out::println);
                });
        
        /*
            Práctica 54: Obtener un arraylist de String donde cada letra de los diferentes nombres de
                las personas sea un elemento del arraylist. Para esto usaremos flatMap() y la instrucción:
                Arrays.stream(p.nombre.split(""))
                observar que mediante String.split(“”) obtenemos un array de String con todos los
                caracteres separados. Mediante Arrays.stream() convertimos un array en un stream
        */
        
        System.out.println("Práctica 54: Uso de flatmap");
        
        ArrayList<String> arrCaracteresNombres54 = (ArrayList<String>) personas.stream()
                .flatMap(p-> Arrays.stream(p.nombre.split("")))
                .collect(Collectors.toList());
        
        System.out.println(arrCaracteresNombres54);
        
    }
}
