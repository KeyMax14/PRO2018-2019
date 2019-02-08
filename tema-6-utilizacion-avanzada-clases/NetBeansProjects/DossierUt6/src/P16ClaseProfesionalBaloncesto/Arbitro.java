/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P16ClaseProfesionalBaloncesto;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Arbitro extends ProfesionalBaloncesto{
    int faltasPitadas;

    public Arbitro(int faltasPitadas, String nombre, String apellidos, int edad, double ingresosAnuales, int numeroFederado) throws Exception {
        super(nombre, apellidos, edad, ingresosAnuales, numeroFederado);
        this.faltasPitadas = faltasPitadas;
    }

    @Override
    public String toString() {
        return super.toString()+", Faltas pitadas: "+faltasPitadas; 
    }

    
    
    
}
