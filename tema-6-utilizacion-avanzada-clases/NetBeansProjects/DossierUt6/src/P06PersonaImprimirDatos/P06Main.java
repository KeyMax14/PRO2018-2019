/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P06PersonaImprimirDatos;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P06Main {
    public static void main(String[] args) {
        Alumno a1 = new Alumno(Curso.DAW1, 8, "Alfredo", "quien");
        a1.imprimirDatos();
    }
}
