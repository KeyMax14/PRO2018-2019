/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kevin.tareaclase.pkg20180201;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Libro {

    protected HashSet<String> autores;
    protected String titulo;
    protected String resumen;
    protected int paginas;

    public Libro(String titulo, String resumen, int paginas, String... autores) {
        this.titulo = titulo;
        this.resumen = resumen;
        this.paginas = paginas;

        this.autores = new HashSet<String>();
//        this.autores = new HashSet<String>(Arrays.asList(autores));  // Con esto nos saltamos tener que hacerlo manual.
        if (autores == null) {
            this.autores.add("Anonimo");
        } else {
            for (String autor : autores) {
                this.autores.add(autor);
            }
        }
    }

    @Override
    public String toString() {
        String autores = "";
        for (String aut : this.autores) {
            autores += "\n" + aut;
        }
        return "Autor/es:" + autores + "\nTitulo:\n" + titulo + "\nResumen:\n" + resumen + "\nPaginas:\n" + paginas;
    }

    public boolean libroGrande() {
        return this.paginas > 500;
    }

    public HashSet<String> getAutores() {
        return autores;
    }

    public void setAutores(HashSet<String> autores) {
        this.autores = autores;
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
