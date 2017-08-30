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

    /**
     *
     * @param titulo Titulo do livro a ser inserido
     * @param ISBN  Identificador numerico para o livro
     */
    public Livro(String titulo, String ISBN) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        capitulos = new Capitulo[30];
        autores = new Autor[5];
    }

    /**
     *
     * @return os capitulos do livro
     */
    public Capitulo[] getCapitulos() {
        return capitulos;
    }

    /**
     *
     * @param capitulos Altera os capitulos do livro
     */
    public void setCapitulos(Capitulo[] capitulos) {
        this.capitulos = capitulos;
    }

    /**
     *
     * @return os autores do livro
     */
    public Autor[] getAutores() {
        return autores;
    }

    /**
     *
     * @param autores Altera os autores do livro
     */
    public void setAutores(Autor[] autores) {
        this.autores = autores;
    }

    /**
     *
     * @return o codigo ISBN do livro
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     *
     * @param ISBN altera o codigo de livro ISBN
     */
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

    /**
     *  Remove o autor do livro
     * 
     * @param autor
     * @return
     */
    public int removerAutor(Autor autor) {
        for (int i = 0; i < autores.length; i++) {
            if (autores[i].equals(autor)) {
                autores[i] = null;
                return i;
            }
        }
        return -1;
    }

    /**
     * Adiciona autor ao livro
     * 
     * @param autor
     * @return
     */
    public int adicionarAutor(Autor autor) {

        for (int i = 0; i < autores.length; i++) {
            if (autores[i] == null) {
                autores[i] = autor;
                return i;
            }
        }
        return -1;
    }

    /**
     * Metodo de retorno sobre escrito toString quetornando o livrro com titulo, autores, e cod de livros.
     *
     * @return
     */
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
