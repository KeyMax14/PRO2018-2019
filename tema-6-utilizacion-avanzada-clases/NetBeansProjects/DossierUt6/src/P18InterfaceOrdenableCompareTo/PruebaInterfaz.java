/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P18InterfaceOrdenableCompareTo;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class PruebaInterfaz {

    public static void main(String[] args) {
        Ordenable elemento1 = new Hombre("unnom", "unape", "otro", 25, 178, 75);
        Ordenable elemento2 = new Mujer("otronom", "ape1", "ape2", 20, 165, 60);
        if (elemento1.esMayorQue(elemento2)) {
            System.out.println("elemento1 es mayor que elemento2");
        } else {
            System.out.println("elemento1 no es mayor que elemento2");
        }
    }
}
