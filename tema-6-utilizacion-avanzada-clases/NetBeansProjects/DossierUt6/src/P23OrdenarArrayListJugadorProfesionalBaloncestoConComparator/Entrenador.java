/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P23OrdenarArrayListJugadorProfesionalBaloncestoConComparator;

import P16ClaseProfesionalBaloncesto.*;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Entrenador extends ProfesionalBaloncesto {

    int porcentajeVictorias;

    public Entrenador(int porcentajeVictorias, String nombre, String apellidos, int edad, double ingresosAnuales, int numeroFederado) throws Exception {
        super(nombre, apellidos, edad, ingresosAnuales, numeroFederado);
        if (!(porcentajeVictorias >= 0 && porcentajeVictorias <= 100)) {
            throw new Exception("Porcentaje no valido.");
        }
        this.porcentajeVictorias = porcentajeVictorias;
    }

    @Override
    public String toString() {
        return super.toString() + ", Porcentaje de victorias: " + porcentajeVictorias + "%";
    }

}
