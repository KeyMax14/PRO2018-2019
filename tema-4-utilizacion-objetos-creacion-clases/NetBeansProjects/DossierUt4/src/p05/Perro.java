/*
    Práctica 5: Crear la clase: Perro Esta clase tiene por atributos String raza, String nombre
        y int edad. Tiene un constructor que recibe la raza el nombre y la edad. Ej.

            Perro(String n, String r, int e){
            nombre=n;
            raza=r;
            edad=e;
            }

        y creamos otro constructor para cuando desconocemos la edad del animal:

            Perro(String n, String r){
            nombre=n;
            raza=r;
            edad=-1;
            }

        crear un tercer Constructor que sirva para el caso en el que no sabemos ni la raza ni la edad
 */
package p05;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Perro {

    String raza;
    String nombre;
    int edad;

    Perro(String n, String r, int e) {
        nombre = n;
        raza = r;
        edad = e;
    }

    Perro(String n, String r) {
        nombre = n;
        raza = r;
        edad = -1;
    }

    Perro(String n) {
        nombre = n;
        raza = null;
        edad = -1;
    }
}
