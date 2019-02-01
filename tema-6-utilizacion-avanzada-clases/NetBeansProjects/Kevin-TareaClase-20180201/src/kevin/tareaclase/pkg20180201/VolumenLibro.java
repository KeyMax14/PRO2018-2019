/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kevin.tareaclase.pkg20180201;



/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class VolumenLibro extends Libro {

    enum EstadoConservacion {
        BUENO,
        REGULAR,
        MALO
    }
    
    protected String propietario;
    protected EstadoConservacion estadoConservacion;
    private static int contador; // Contador incremental.
    protected int id;
    protected boolean variosTomos;


    public VolumenLibro(String propietario, String titulo, String resumen, int paginas, String... autores) {
        super(titulo, resumen, paginas, autores);
        this.propietario = propietario;
        this.estadoConservacion = estadoConservacion.BUENO;
        this.id = ++contador;
        this.variosTomos = super.libroGrande();
    }

    public void setVariosTomos(boolean variosTomos) {
        this.variosTomos = variosTomos;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public EstadoConservacion getEstadoConservacion() {
        return estadoConservacion;
    }

    public void setEstadoConservacion(EstadoConservacion estadoConservacion) {
        this.estadoConservacion = estadoConservacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPropietario:\n" + propietario
                + "\nEstado de conservacion:\n" + estadoConservacion
                + "\nIdentificador:\n" + id + "\n¿Tiene varios tomos?:\n"
                + (variosTomos ? "Sí" : "No");
    }

}
