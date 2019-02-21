/*
    Práctica 22: Crear un ArrayList con objetos Fraccion ordenarlos utilizando una clase
        anónima que implemente Comparator<Fraccion>
 */
package P22OrdenarArrayListFraccionConComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P22Main {
    public static void main(String[] args) {
        ArrayList<Fraccion> arrL = new ArrayList<>();
        arrL.add(new Fraccion(1, 2));
        arrL.add(new Fraccion(1, 4));
        arrL.add(new Fraccion(1, 3));
        
        Comparator<Fraccion> cm = new Comparator<Fraccion>() {
            @Override
            public int compare(Fraccion f1, Fraccion f2) {
                return Double.compare(f1.toDouble(), f2.toDouble());
            }
        };
        
        Collections.sort(arrL,cm);
        
        for (Fraccion fraccion : arrL) {
            System.out.println(fraccion);
        }
        
    }
}
