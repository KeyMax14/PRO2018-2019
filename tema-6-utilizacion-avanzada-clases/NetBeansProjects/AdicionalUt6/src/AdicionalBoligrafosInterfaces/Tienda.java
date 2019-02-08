/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalBoligrafosInterfaces;

import java.util.ArrayList;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Tienda {
    private String nombre;
    private ArrayList<Vendible> articulos;
    private double saldoTienda;

    public Tienda(String nombre, double saldoInicial) {
        this.nombre = nombre;
        this.articulos = new ArrayList<>();
        this.saldoTienda= saldoInicial;
    }
    
    public String mostrarArticulos(){
        String resultado= "";
        for (int i = 0; i < articulos.size(); i++) {
            resultado += "Id: " + i +" "+ articulos.get(i).listar()+ "\n";
        }
        return resultado;
    }
    
    public boolean agregarArticulos(Vendible articulo){
        boolean agregadoArticulo = false;
        if (articulo.obtenerPrecio()*0.7 < saldoTienda) {
            articulos.add(articulo);
            agregadoArticulo = true;
            saldoTienda -= 0.7*articulo.obtenerPrecio();
        }
        return agregadoArticulo;
    }
    
    public double vender(int posicion, double dinero){
        Vendible v = articulos.get(posicion);
        double cambio = -1;
        if (dinero >= v.obtenerPrecio()) {
            articulos.remove(posicion);
            cambio = dinero -v.obtenerPrecio();
            saldoTienda += v.obtenerPrecio();
        }
        return cambio;
    }
    
}
