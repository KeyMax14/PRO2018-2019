/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P09ClaseLibro;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Libro {
    protected String[] autor;
    protected String titulo;
    protected String resumen;
    protected int paginas;

    public Libro(String[] autor, String titulo, String resumen, int paginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.resumen = resumen;
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        String autores="";
        for (String aut : autor) {
            autores+="\n"+aut;
        }
        return "Autor/es:" + autores + "\nTitulo:\n" + titulo + "\nResumen:\n" + resumen + "\nPaginas:\n" + paginas;
    }
    
    
    public boolean libroGrande(){
        return this.paginas > 500;
    }

    public String[] getAutor() {
        return autor;
    }

    public void setAutor(String[] autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    
}
