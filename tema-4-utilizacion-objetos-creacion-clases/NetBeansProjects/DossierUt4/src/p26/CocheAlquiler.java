/*
    Práctica 26: Crear la clase CocheAlquiler como mínimo con atributos: String matricula,
        marca, modelo; double precio; int numDias; boolean alquilado; y la fecha de alquiler
        reflejada en tres valores enteros: dd, mm, aa
        Se deberá reflejar que hay una cantidad mínima de días de alquiler: 2
        Un constructor como mínimo que reciba matricula, marca, modelo y precio.
        Un método: double alquilar(int dias, int dd, int mm, int aa) que refleja la fecha de alquiler y
        el número de días del alquiler. En este método se deberá controlar si el coche ya está
        alquilado en cuyo caso devolverá -1. -2 si se intenta alquilar por menos días del mínimo
        establecido y el coste del alquiler en otro caso
        Un método: double devolver(int dias) que refleja que se ha devuelto el coche después de
        una cantidad de días. Este método devuelve -1 si el coche no está alquilado y la cantidad de
        sobrecoste que pudiera haber incurrido si sobrepasa los días de alquiler inicialmente
        establecidos
        Sobreescribir el método toString() que muestre los datos relevantes del alquiler
 */
package p26;

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
