/*
    Práctica 29: Modifica el ejercicio 20 de la UT de estructuras de almacenamiento para que
        el criterio de ordenamiento de las Matriz2x2 se establezca mediante una expresión lambda
 */
package P29ModificarMatriz2x2CompatibleConLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P29Main {
    public static void main(String[] args) {
        ArrayList<Matriz2x2> listaMatrices = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Menu: \n");
            System.out.println("1) Agregar Matrices.");
            System.out.println("2) Quitar Matrices.");
            System.out.println("3) Salir del programa.");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    int[] valores = new int[4];
                    for (int i = 0; i < valores.length; i++) {
                        System.out.println("Introduce el " + (i + 1) + "º número");
                        valores[i] = sc.nextInt();
                    }
                    listaMatrices.add(new Matriz2x2(valores[0], valores[1], valores[2], valores[3]));
                    
                    // Mod p29 tema6 -- Antes se realizaba mediante implementar comparable en la clase Matriz2x2
                    
                    Comparator<Matriz2x2> cmpMatriz = (m1, m2) -> Integer.compare(m1.determinante(), m2.determinante());
                    Collections.sort(listaMatrices, cmpMatriz);
                    
                    System.out.println("Lista de Matrices: \n");
                    
                    for (Matriz2x2 matriz : listaMatrices) {
                        System.out.println(matriz);
                    }
                    break;
                case 2:
                    int[] aEliminar = new int[4];
                    for (int i = 0; i < aEliminar.length; i++) {
                        System.out.println("Introduce el " + (i + 1) + "º número.");
                        aEliminar[i] = sc.nextInt();
                    }
                    Matriz2x2 matrizEliminada = new Matriz2x2(aEliminar[0], aEliminar[1], aEliminar[2], aEliminar[3]);
//                    listaMatrices.remove(matrizEliminada);
                    Iterator it = listaMatrices.iterator(); //Por alguna razón no elimina la matriz.
                    while (it.hasNext()) {
                        if (it.next().equals(matrizEliminada)) {
                            it.remove();
                        }
                    }
                    
                    /*
                        Mod p29 tema6 -- Antes se realizaba mediante implementar comparable en la clase Matriz2x2
                        
                        Si se coloca fuera del switch solo hace falta crear el comparator una vez.
                    */
                    
                    
                    Comparator<Matriz2x2> cmpMatriz1 = (m1, m2) -> Integer.compare(m1.determinante(), m2.determinante());
                    Collections.sort(listaMatrices, cmpMatriz1);
                    
                    System.out.println("Lista de Matrices: \n");
                    
                    for (Matriz2x2 matriz :listaMatrices) {
                        System.out.println(matriz);
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion Incorrecta.");
            }
        } while (opcion != 3);

    }
}
