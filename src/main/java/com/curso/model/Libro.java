package com.curso.model;

public class Libro {

    private int isbn;
    private String titulo;
    private String tematica;

    public Libro() {
        super();
    }

    public Libro(int isbn, String titulo, String tematica) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.tematica = tematica;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTematica() {
        return tematica;
    }

    

}
