/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p20;



/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class p20 {
    public static void main(String[] args) throws Exception {
        Reloj re = new Reloj(0, 0, 0);
        System.out.println(re.mostrar());
        
        // Aquí se muestra que funciona la parte decimal.
        
        re.agregarHoras(1.5555);
        System.out.println(re.mostrar());
        
        
        
        Reloj re1 = new Reloj(0, 0, 0);
        System.out.println(re1.mostrar());
        
        // Aquí se muestra que cuando llega a 60 pasa a la siguiente unidad.
        
        re1.agregarSegundos(50000);
        System.out.println(re1.mostrar());
    }
}
