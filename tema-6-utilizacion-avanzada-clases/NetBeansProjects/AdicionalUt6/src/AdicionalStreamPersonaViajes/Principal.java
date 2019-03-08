/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalStreamPersonaViajes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
class Persona {

    private String nombre;
    private List<Viaje> lista = new ArrayList<Viaje>();

    public String getNombre() {
        return nombre;
    }

    public void addViaje(Viaje v) {
        lista.add(v);
    }

    public List<Viaje> getLista() {
        return lista;
    }

    public Persona(String nombre) {
        super();
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

class Viaje {

    private String pais;

    public Viaje(String pais) {
        super();
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}

public class Principal {

    public static void main(String[] args) {
        Persona p = new Persona("pedro");
        Viaje v = new Viaje("Francia");
        Viaje v2 = new Viaje("Inglaterra");
        p.addViaje(v);
        p.addViaje(v2);
        Persona p1 = new Persona("gema");
        Viaje v3 = new Viaje("Italia");
        Viaje v4 = new Viaje("Belgica");
        p1.addViaje(v3);
        p1.addViaje(v4);
        List<Persona> lista = new ArrayList<Persona>();
        lista.add(p);
        lista.add(p1);
    }
}
