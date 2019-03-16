/*
    Recopilación de los ejercicios 34-36 y 40-54,
        En estos se usan Stream y Lambdas para trabajar sobre un ArrayList de personas.
 */
package P34_36yP40_54EjerciciosStreamClasePersona;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class StreamMain {

    static String[] apellidos = {"Hernandez", "Gonzalez", "Perez", "García", "Rodriguez"};

    public static Hombre crearHombre() {
        String[] nombres = {"Paco", "Luis", "Gil", "Marcos", "Ricardo", "Jorge", "Armando"};
        Random rnd = new Random();

        int altura = rnd.nextInt(40) + 160;
        int edad = rnd.nextInt(100) + 1;
        int peso = rnd.nextInt(40) + 65;

        String nombre = nombres[rnd.nextInt(nombres.length)];
        String apellido = apellidos[rnd.nextInt(apellidos.length)];
        String apellido2 = apellidos[rnd.nextInt(apellidos.length)];

        return new Hombre(nombre, apellido, apellido2, edad, altura, peso);
    }

    public static Mujer crearMujer() {
        String[] nombres = {"Pepa", "Juana", "Maria", "Lucia", "Luz", "Silvia", "Sandra", "Monica"};
        Random rnd = new Random();

        int altura = rnd.nextInt(25) + 150;
        int edad = rnd.nextInt(100) + 1;
        int peso = rnd.nextInt(30) + 50;

        String nombre = nombres[rnd.nextInt(nombres.length)];
        String apellido = apellidos[rnd.nextInt(apellidos.length)];
        String apellido2 = apellidos[rnd.nextInt(apellidos.length)];

        return new Mujer(nombre, apellido, apellido2, edad, altura, peso);
    }

    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Random rnd = new Random();
            if (rnd.nextInt(2) == 0) {
                personas.add(crearMujer());
            } else {
                personas.add(crearHombre());
            }
        }

        // Mostrar nombre de personas ordenadas por edad: 
        
        System.out.println("Nombre de todas las personas ordenadas por edad: \n");
        personas.stream()
                .sorted((p,q) -> Integer.compare(p.edad, q.edad))
                .map(p-> p.nombre)
                .forEach(System.out::println);
        
        
        System.out.println("Obtener nombre de las personas mayores de edad por orden alfabetico: \n");
        ArrayList<String> personasOrdenadasPorNombre;
        personasOrdenadasPorNombre = (ArrayList) personas.stream().filter(x -> x.edad >= 18)
                .sorted((p1, p2) -> p1.nombre.compareTo(p2.nombre))
                .map(p -> p.nombre)
                .collect(Collectors.toList());

        System.out.println(personasOrdenadasPorNombre);

        /*
            Práctica 34: haciendo uso de anyMatch(), noneMatch() obtener true si para el ArrayList
            personas hay algún objeto de tipo Mujer.
            Obtener true si ninguna persona tiene un peso anormalmente bajo ( menor de 50kg)
         */
        
        System.out.println("\np34: \n");
        
        
        
        System.out.println("Mujer en el array: (noneMatch)");
        
        System.out.println(!personas.stream().noneMatch(p -> p instanceof Mujer));
        
        System.out.println("Mujer en el array: (anyMatch)");
        
        System.out.println(personas.stream().anyMatch(p -> p instanceof Mujer));
        
        System.out.println("Persona peso bajo: (noneMatch)");
        
        System.out.println(personas.stream().noneMatch(p -> p.peso < 50));
        
        System.out.println("Persona peso bajo: (anyMatch)");

        System.out.println(!personas.stream().anyMatch(p -> p.peso < 50));

        /*
            Práctica 35-36 (Duplicada en dossier): Utiliza findFirst() y Optional.ifPresent() para mostrar a un Hombre llamado:
            “Luis” que debes primero agregar al arraylist personas.
         */
        
        // Luis esta añadido en los aleatorios no hace falta añadirlo.
        
        System.out.println("\np35-36: \n");
        
        Optional<Persona> opt35 = personas.stream()
                .filter(p -> p.nombre.equals("Luis"))
                .findFirst();
        
        opt35.ifPresent(System.out::println);
//        System.out.println(opt35.orElse(new Hombre("Luis", "1", "2", 24, 170, 80)));

        /*
            Práctica 40: Mostrar las 3 personas de más edad
         */

        System.out.println("\np40:\n");

        Stream<Persona> miStream = personas.stream();

        miStream.sorted((o1, o2) -> Integer.compare(o1.edad, o2.edad))
                .skip(personas.size() - 3)
                .forEach(System.out::println);

        System.out.println("");

        /*
            Los Stream se queman cuando se usan. Son de un solo uso
         */
        personas.stream()
                .sorted((o1, o2) -> Integer.compare(o2.edad, o1.edad))
                .limit(3)
                .forEach(System.out::println);

        /*
            Práctica 41: Mostrar las personas que tienen menos peso que el que le corresponde
                idealmente
         */
        System.out.println("\np41: \n");

        ArrayList<Persona> res1 = new ArrayList<>();

        personas.stream()
                .filter((t) -> t.peso < t.pesoIdeal())
                .forEach(p -> {
                    System.out.println(p.nombre + " " + p.apellido1 + " le falta peso.");
                    res1.add(p);
                });
//                .forEach(System.out::println); // El de arriba esta personalizado

        // Usando peek
//        HashSet res2 = (HashSet)personas.stream() // Asi lo haces en un hashSet
        Set res2 = personas.stream()
                .filter((t) -> t.peso < t.pesoIdeal())
                .peek((p) -> { // Esto permite hacer lo que tu quieras sin modificar el Stream, el forEach es terminal, peek no, puedes escribir collect. (Como un forEach no terminal.)
                    System.out.println(p.nombre + " " + p.apellido1 + " le falta peso.");
                })
                .collect(Collectors.toSet());

        // Obtener con una sola sentencia de Stream un set con las mujeres y una lista con los hombres.
        Set<Mujer> mujeres = new HashSet();
        List<Hombre> hombres = new ArrayList();

        personas.stream()
                .forEach((p) -> {
                    if (p instanceof Hombre) {
                        hombres.add((Hombre) p);
                    } else if (p instanceof Mujer) {
                        mujeres.add((Mujer) p);
                    }
                });

        Map<Boolean, List<Persona>> agrupacion = personas.stream()
                .collect(Collectors.groupingBy(p -> p instanceof Mujer));

        agrupacion.keySet().stream().forEach(p -> {
            System.out.println(agrupacion.get(p));

        });

//        hombres = agrupacion.get(false).;
//        mujeres = agrupacion.get(true);
//                .forEach((p) -> {
//                  if (p instanceof Hombre) {
//                      hombres.add((Hombre)p);
//                  }else if(p instanceof Mujer){
//                      mujeres.add((Mujer)p);
//                  }
//                });
        /*
            Práctica 42: Mostrar una persona de 27 años si hay alguna
         */
        System.out.println("\np42:\n");
//        personas.add(new Hombre("k", "h", "g", 27, 0, 0));
        personas.stream()
                .filter(p -> p.edad == 27)
                .findFirst()
                .ifPresent(System.out::println);

        /*
            Práctica 43: Crear un arraylist de hombres con un elemento hombre por cada persona del array original
         */
        ArrayList<Hombre> hombres1 = (ArrayList<Hombre>) personas.stream()
                //.map(p -> new Hombre(p))
                .map(Hombre::new)
                .collect(Collectors.toList());

        System.out.println(hombres1);

        // Práctica 44: Calcular el peso medio de las mujeres del arraylist
        personas.stream()
                .filter((p) -> p instanceof Mujer)
                .mapToDouble((p) -> p.peso)
                .average()
                .ifPresent(System.out::println);

        // Práctica 45: Mostrar las personas que tienen más edad que la media
        personas.stream()
                .mapToDouble(p -> p.edad)
                .average()
                .ifPresent(media -> {
                    personas.stream()
                            .filter(p -> p.edad > media)
                            .forEach(System.out::println);
                });

        // Práctica 46: Mostrar por cada persona cuántas personas tienen su misma edad
        System.out.println("\n");

        personas.stream()
                .forEach(persona -> {
                    System.out.println(persona);
                    System.out.println(personas.stream()
                            .filter(p -> persona.edad == p.edad)
                            .count());
                });

        // Práctica 47: Obtener el imc mínimo ( el número ) y mostrar por cada persona su imc
        System.out.println("\np47:\n");

        double minimoIMC = personas.stream()
                .peek(p -> {
                    System.out.println(p);
                    System.out.println(p.calcularIMC());
                })
                .min((p, q) -> Double.compare(p.calcularIMC(), q.calcularIMC()))
                .get().calcularIMC();

        System.out.println("Minimo IMC= " + minimoIMC);

        // Práctica 48: Crear un arraylist con las mujeres, y obtener la edad media de los hombres
        System.out.println("\np48: \n");

        ArrayList<Mujer> mujeres48 = new ArrayList<>();

        double mediaHombres = personas.stream()
                .peek(p -> {
                    if (p instanceof Mujer) {
                        mujeres48.add((Mujer) p);
                    }
                })
                .filter(p -> p instanceof Hombre)
                .mapToInt(p -> p.edad)
                .average()
                .getAsDouble();

        System.out.println(mujeres48);

        System.out.println("");

        // Práctica 49: Crear un arraylist con textos que indiquen por cada persona su nombre, sexo
        //        y edad: "Ana, mujer: 23años" . Este array quedará ordenado por peso
        ArrayList<String> arr49 = (ArrayList<String>) personas.stream()
                .sorted((p, q) -> Double.compare(p.peso, q.peso))
                .map((p) -> {
                    String resultado = "";
                    if (p instanceof Hombre) {
                        resultado = ((Hombre) p).nombre + ", hombre: " + ((Hombre) p).edad + " años.";
                    } else {
                        resultado = p.nombre + ", mujer: " + p.edad + " años.";
                    }
                    return resultado;
                })
                .collect(Collectors.toList());

        // Práctica 50: Mostrar la persona adulta más joven ( se entiende por adulto >= 18años)
        System.out.println("\np50: \n");

        personas.stream()
                .filter(p -> p.edad >= 18)
                .min((p, q) -> Integer.compare(p.edad, q.edad))
                .ifPresent(System.out::println);

        //Mod para todas las personas con la misma edad menor.
        personas.stream()
                .filter(p -> p.edad >= 18)
                .min((p, q) -> Integer.compare(p.edad, q.edad))
                .ifPresent(p -> {
                    personas.stream()
                            .filter(q -> q.edad == p.edad)
                            .forEach(System.out::println);
                });

        // Práctica 51: obtener la persona que se aleja más de su peso ideal ( observar que esto puede
        //    ser tanto por mucho peso como por poco peso )
        System.out.println("\np51: \n");

        Persona personaMaxDiferenciaPeso = personas.stream()
                .max((p, q) -> Double.compare(Math.abs(p.pesoIdeal() - p.peso), Math.abs(q.pesoIdeal() - p.peso)))
                .get();

        System.out.println(personaMaxDiferenciaPeso);

        /*
            Práctica 52: Crear un arraylist con los hombres ordenados de menor a mayor peso al
                principio del array y luego las mujeres con el mismo criterio
         */
        System.out.println("\np52: \n");

        HashMap<String, ArrayList<Persona>> mapArr = (HashMap) personas.stream()
                .sorted((p, q) -> Double.compare(p.peso, q.peso))
                .collect(Collectors.groupingBy((t) -> {
                    if (t instanceof Hombre) {
                        return "hombre";
                    } else {
                        return "mujer";
                    }
                }));

        ArrayList<Persona> arr52 = new ArrayList<>(mapArr.get("hombre"));
        arr52.addAll(mapArr.get("mujer"));

        for (Persona persona : arr52) {
            System.out.println(persona);
        }

        // con un solo stream
        System.out.println("");
        ArrayList<Persona> arr522 = (ArrayList<Persona>) personas.stream()
                .sorted((Persona a, Persona b) -> {
                    double pesoA = a.peso;
                    double pesoB = b.peso;
                    pesoA += (a instanceof Mujer) ? 10000 : 0;
                    pesoB += (b instanceof Mujer) ? 10000 : 0;
                    return Double.compare(pesoA, pesoB);
                })
                .collect(Collectors.toList());

        for (Persona persona : arr522) {
            System.out.println(persona);
        }

        // Preguntado de forma anidada
        System.out.println("");

        ArrayList<Persona> arr523 = (ArrayList) personas.stream().sorted((Persona a, Persona b) -> {
            if ((a instanceof Hombre && b instanceof Hombre) || (a instanceof Mujer && b instanceof Mujer)) {
                if (a.peso > b.peso) {
                    return 1;
                } else if (a.peso == b.peso) {
                    return 0;
                } else {
                    return -1;
                }
            } else {
                if (a instanceof Hombre) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }).collect(Collectors.toList());

        for (Persona persona : arr523) {
            System.out.println(persona);
        }

        /*
            Práctica 53: Mostrar las mujeres que son más altas que los hombres
         */
        System.out.println("\np53: \n");

        personas.add(new Mujer("mujer", "alta", "", 20, 210, 100));
        personas.stream()
                .filter((p) -> {
                    return p instanceof Mujer && p.altura > personas.stream()
                            .filter(hombre -> hombre instanceof Hombre)
                            .max((hombre1, hombre2) -> Integer.compare(hombre1.altura, hombre2.altura))
                            .get().altura;
                })
                .forEach(System.out::println);

        // Usando dos filter
        System.out.println("");
        personas.stream()
                .filter(p -> p.altura > personas.stream().
                filter(hombre -> hombre instanceof Hombre)
                .mapToInt(q -> q.altura)
                .max()
                .getAsInt()
                )
                //                .filter(p -> p instanceof Mujer)  // Si es mayor que cualquier hombre, o hay mujeres más altas o no hay nadie.
                .forEach(System.out::println);

        /*
            Práctica 54: Obtener un arraylist de String donde cada letra de los diferentes nombres de
                las personas sea un elemento del arraylist. Para esto usaremos flatMap() y la instrucción:
                Arrays.stream(p.nombre.split(""))
                observar que mediante String.split(“”) obtenemos un array de String con todos los
                caracteres separados. Mediante Arrays.stream() convertimos un array en un stream
         */
        System.out.println("\np54: \n");

        ArrayList<String> letrasNombres = (ArrayList<String>) personas.stream()
                .flatMap(p -> Arrays.stream(p.nombre.split("")))
                .collect(Collectors.toList());

        System.out.println(letrasNombres);

        // Ordenar por peso
        System.out.println("\nOrdenar por peso: \n");

        personas.stream()
                .sorted((o1, o2) -> Double.compare(o1.peso, o2.peso))
                .forEach(System.out::println);

        // Sacar maximo altura
        System.out.println("");

        Optional<Persona> opt = personas.stream()
                .max((p, q) -> Integer.compare(q.altura, p.altura));

//        opt.ifPresent(System.out::println);
        int alturaMaxima = 0;
        if (opt.isPresent()) {
            alturaMaxima = opt.get().altura;
        }

        // ifPresent es un metodo de optional, no es de Stream. 
        


        //Si el array de personas son todo mujeres recogelo en uno de mujeres.
        
        
        ArrayList<Mujer> arr = null;
        if (personas.stream().allMatch(p -> p instanceof Mujer)) {
            arr = (ArrayList<Mujer>) personas.stream()
                    .map(p -> (Mujer) p)
                    .collect(Collectors.toList());
        }

        System.out.println("Array de mujeres si todas las personas son mujer: (Caso contrario null)");

        System.out.println(arr);

    }
}

class Prueba {

    static void pruebita(Object n) {
        System.out.println(n);
    }

    static int pruebito(Object a, Object b) {
        return 3;
    }
}
