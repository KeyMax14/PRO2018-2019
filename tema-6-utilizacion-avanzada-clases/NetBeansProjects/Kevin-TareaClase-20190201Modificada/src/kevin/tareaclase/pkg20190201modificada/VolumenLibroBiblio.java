/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kevin.tareaclase.pkg20190201modificada;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class VolumenLibroBiblio extends VolumenLibro{
    
    String prestamo;

    public VolumenLibroBiblio(String propietario, String titulo, String resumen, int paginas, String... autores) {
        super(propietario, titulo, resumen, paginas, autores);
        prestamo = null;
    }
    
    

    public String getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(String prestamo) {
        this.prestamo = prestamo;
    }
    
}
