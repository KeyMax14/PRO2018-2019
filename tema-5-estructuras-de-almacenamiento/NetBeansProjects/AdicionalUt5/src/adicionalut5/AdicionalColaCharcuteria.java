/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicionalut5;

import java.util.LinkedList;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
class cola{
    private LinkedList<Integer> numeros;
    private Integer actual;
    private int fin;

    public cola() {
        numeros = new LinkedList<>();
        fin = 0;
    }
    
    public int darNumero(){
        numeros.add(++fin);
        return fin;
    }
    
    public String atender(){
        boolean resultado;
        try {
            actual = numeros.pop(); // poll te devolveria null si esta vacia, de esta manera evitas la excepcion.
            resultado = true;
        } catch (Exception e) {
            resultado = false;
        }
       return (resultado)?"Se ha atendido a "+actual:"No hay mas personas en la cola.";
    }
    
    public Integer mostrarActual(){
        return numeros.peek();
    }
}

public class AdicionalColaCharcuteria {
    
    public static void main(String[] args) {
        cola a = new cola();
        System.out.println(a.darNumero());
        System.out.println(a.darNumero());
        System.out.println(a.darNumero());
        System.out.println(a.darNumero());
        System.out.println(a.darNumero());
        System.out.println(a.darNumero());
        System.out.println(a.atender());
        System.out.println(a.mostrarActual());
        System.out.println(a.atender());
    }
}
