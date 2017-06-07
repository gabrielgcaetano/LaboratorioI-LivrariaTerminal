/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local.livraria;

import java.util.Arrays;

/**
 *
 * @author angelodaluz
 */
public class Livro {

    private String titulo;
    private Capitulo[] capitulos;
    private Autor[] autores;
    private String ISBN;

    public Livro(String titulo, String ISBN) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        capitulos = new Capitulo[30];
        autores = new Autor[5];
    }

    public Capitulo[] getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(Capitulo[] capitulos) {
        this.capitulos = capitulos;
    }

    public Autor[] getAutores() {
        return autores;
    }

    public void setAutores(Autor[] autores) {
        this.autores = autores;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * Adiciona capítulo ao livro
     *
     * @param titulo
     * @param texto
     * @return a posição em que o capítulo foi inserido, ou -1 caso não tenha
     * sido inserido.
     */
    public int adicionarCapitulo(String titulo, String texto) {
        Capitulo cap = new Capitulo(titulo, texto);
        for (int i = 0; i < capitulos.length; i++) {
            if (capitulos[i] == null) {
                capitulos[i] = cap;
                return i;
            }
        }
        return -1;
    }

    /**
     *
     * @param cap
     * @return a posição do capítulo que foi removido, ou -1 caso não tenha sido
     * removido
     */
    public int removerCapitulo(Capitulo cap) {
        for (int i = 0; i < capitulos.length; i++) {
            if (capitulos[i].equals(cap)) {
                capitulos[i] = null;
                return i;
            }
        }
        return -1;
    }

    public int removerAutor(Autor autor) {
        for (int i = 0; i < autores.length; i++) {
            if (autores[i].equals(autor)) {
                autores[i] = null;
                return i;
            }
        }
        return -1;
    }

    public int adicionarAutor(Autor autor) {

        for (int i = 0; i < autores.length; i++) {
            if (autores[i] == null) {
                autores[i] = autor;
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Livro{" + "Título = " + titulo + ", autores=" + Arrays.toString(autores) + ", ISBN=" + ISBN + '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
