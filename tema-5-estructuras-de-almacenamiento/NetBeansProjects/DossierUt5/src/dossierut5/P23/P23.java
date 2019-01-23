/*
    Práctica 23: Utilizando la clase VectorLibre y teniendo en cuenta que el módulo de un
        vector V(x,y) es: sqrt(x²+y²) crear un ArrayList que se nutra de vectores libres que se
        habrán creado aleatoriamente y luego los muestre ordenados en pantalla por módulo.
        VectorLibre deberá implementar Comparable y que haga uso del módulo en el método
        compareTo() correspondiente
 */
package dossierut5.P23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P23 {
    public static void main(String[] args) {
        ArrayList<VectorLibre> listaVectores = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 5; i++) { //Metemos 5 vectores aleatorios
            /*
                La siguiente instrucción lo que hace es añadir un vectorLibre, que se crea
                mediante un punto con coordenadas aleatorias entre 0 y 99,
                los constructores estan en sus propias clases dentro del paquete.
            */
            listaVectores.add(new VectorLibre(new Punto(rnd.nextInt(100), rnd.nextInt(100))));
        }
        
        Collections.sort(listaVectores);
        System.out.println("Lista de vectores ordenada: \n");
        for (VectorLibre vector : listaVectores) {
            System.out.println(vector);
        }
    }
}
