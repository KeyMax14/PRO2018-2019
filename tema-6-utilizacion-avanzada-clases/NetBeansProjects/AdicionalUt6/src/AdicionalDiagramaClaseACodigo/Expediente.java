/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalDiagramaClaseACodigo;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Expediente {
    Estudiante estudiante;
    String expediente;
    
    public boolean validarExpediente(){
        return expediente.matches("[A-Z][0-9]{3}-[0-9]{3}");
    }
    
    public static boolean validadorExpediente(String expediente){
        return expediente.matches("[A-Z][0-9]{3}-[0-9]{3}");
    }
}
