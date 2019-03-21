/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class mainPruebaComandos {
    public static void main(String[] args) {
        Ponderaciones clasificacion = new Ponderaciones();
        
        clasificacion.agregarNota(1, "7.2");
        clasificacion.agregarNota(0.5, "55 89.2 1548 41684 asdfkasjdf asfjas 10");
        
        for (NotasPonderadas nota : clasificacion.notas) {
            System.out.println("Ponderacion: "+ nota.ponderacion);
            System.out.println("Nota: "+ nota.nota);
            
        }
        
        System.out.println(clasificacion.getResultado());
    }
}
