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
    public String tipo;
    public boolean asensor;
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public double setPrecio(){
        return precio;
    }
}
