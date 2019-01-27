/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P08CocheModCocheSeat;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P08Main {
    public static void main(String[] args) {
        CocheSeat coche = new CocheSeat("Ibiza", 100, 5, "4568WRT");
        CocheSeat cocheEscribiendoCodigo = new CocheSeat("se-Ibiza", 100, 5, "4168WRT");
        
        System.out.println(coche);
        System.out.println(cocheEscribiendoCodigo);
    }
}
