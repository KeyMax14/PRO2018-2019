/*
    Práctica 27: Crear para todos los métodos creados en la clase CocheAlquiler
        documentación javadoc de los parámetros, lo que devuelve y lo que hace el método
 */
package p27;



/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class CocheAlquiler {
    private String matricula;
    private String marca;
    private String modelo;
    private double precio;
    private int numDias;
    private boolean alquilado;
    private int diaAlquiler;
    private int mesAlquiler;
    private int anioAlquiler;
    private static int cantidadMinimaDias = 2;

    public CocheAlquiler(String matricula, String marca, String modelo, double precio) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    /**
     * Con este método puedes realizar la acción de alquilar un coche.
     * @param dias Números de días en alquiler.
     * @param dd Dia del mes en que se realiza el alquiler.
     * @param mm Mes en el que se realiza el alquiler.
     * @param aa Año en el que se realiza el alquiler.
     * @return Devuelve un double con -1 si esta alquilado, -2 si no
     * supera el limite minimo de días o el precio del alquiler total.
     */
    
    public double alquilar(int dias, int dd, int mm, int aa){
        double resultado;
        if (alquilado) {
            resultado = -1;
        }else if (dias < cantidadMinimaDias) {
            resultado = -2;
        }else{
            this.diaAlquiler = dd;
            this.mesAlquiler = mm;
            this.anioAlquiler = aa;
            this.numDias = dias;
            this.alquilado = true;
            resultado = this.precio*dias;
        }
        
        return resultado;
    }
    /**
     * Acción que se realizar para devolver el coche.
     * @param dias Número de días que el cliente ha permanecido con el coche.
     * @return Devuelve un double con -1 si el coche no ha sido alquilado, 
     * o el sobrecoste si se a superado los días de alquiler establecidos.
     */
    public double devolver(int dias){
        double resultado;
        if (!alquilado) {
            resultado = -1;
        }else{
            if (dias <= this.numDias) {
                resultado = 0;
            }else{
                resultado = (dias-numDias)*precio;
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Matricula: "+matricula+" Marca: "+marca+" Modelo: "+modelo+
                " Fecha: "+diaAlquiler+"/"+mesAlquiler+"/"+anioAlquiler+
                " Precio: "+precio+"€ Dias Alquiler: "+numDias+" Estado: "+
                ((alquilado)?"Alquilado":"Disponible");
    }
    
    
    
}
