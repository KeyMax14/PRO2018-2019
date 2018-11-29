/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalClaseCasa;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Casa {

    public double precio;
    public double metroCuadrados;
    public String localizacion;
    public String tipoVivienda;
    public boolean asensor;
    public double tamanioAsensor;
    public boolean piscina;
    public double tamanioPiscina;

    public void getDatosGenerales() {
        System.out.println("precio: " + precio + "€");
        System.out.println("m^2: " + metroCuadrados + "m^2");
        System.out.println("tipo de vivienda: " + tipoVivienda);
        System.out.println("Localidad: " + localizacion);
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public double getTamanioPiscina() {
        return tamanioPiscina;
    }

    public void setTamanioPiscina(double tamanioPiscina) {
        this.tamanioPiscina = tamanioPiscina;
    }

    public double getPrecio() {
        return precio;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    public void setAsensor(boolean asensor) {
        this.asensor = asensor;
    }

    public void setTamanioAsensor(double tamanioAsensor) {
        this.tamanioAsensor = tamanioAsensor;
    }

    public double getMetroCuadrados() {
        return metroCuadrados;
    }

    public void setMetroCuadrados(double metroCuadrados) {
        this.metroCuadrados = metroCuadrados;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public boolean isAsensor() {
        return asensor;
    }

    public double getTamanioAsensor() {
        return tamanioAsensor;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static void main(String[] args) {
        Casa c = new Casa();

        c.setAsensor(true);
        c.setTamanioAsensor(4.5);
        c.setPiscina(true);
        c.setTamanioPiscina(10);
        c.setTipoVivienda("Chalet");
        c.setPrecio(500000);
        c.setMetroCuadrados(251.1);
        c.setLocalizacion("La Laguna");
        
        
        c.getDatosGenerales();
    }

}
