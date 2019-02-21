/*
    Práctica 31: Modifica el ejercicio 23 de la UT de estructuras de almacenamiento para que
        el criterio de ordenamiento de VectorLibre se establezca mediante una expresión lambda
 */
package P31ModificarClaseVectorLibreOrdenarConLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P31Main {
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
        
        Comparator<VectorLibre> cmptVectorLibre = (t1, t2) -> Double.compare(t1.modulo(), t2.modulo());
        
        Collections.sort(listaVectores, cmptVectorLibre);
        System.out.println("Lista de vectores ordenada: \n");
        for (VectorLibre vector : listaVectores) {
            System.out.println(vector);
        }
    }
}
