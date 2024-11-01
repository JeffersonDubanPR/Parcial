package com.example.Parcial.Model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "libros")
public class Libro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idLibro;


    private String titulo;


    private Integer añoPublicacion;


    private String isbn;


    private Boolean disponibilidad;

    @ManyToOne
    private Autor autor;

    @ManyToOne
    private Genero genero;

    public Libro() {}

    public Libro(Integer idLibro, String titulo, Integer añoPublicacion, String isbn, Boolean disponibilidad, Autor autor, Genero genero) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
        this.isbn = isbn;
        this.disponibilidad = disponibilidad;
        this.autor = autor;
        this.genero = genero;
    }

    public Integer getIdLibro() {
        return idLibro; }

    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro; }

    public String getTitulo() {
        return titulo; }

    public void setTitulo(String titulo) {
        this.titulo = titulo; }

    public Integer getAñoPublicacion() {
        return añoPublicacion; }

    public void setAñoPublicacion(Integer añoPublicacion) {
        this.añoPublicacion = añoPublicacion; }

    public String getIsbn() {
        return isbn; }

    public void setIsbn(String isbn) {
        this.isbn = isbn; }

    public Boolean getDisponibilidad() {
        return disponibilidad; }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad; }

    public Autor getAutor() {
        return autor; }

    public void setAutor(Autor autor) {
        this.autor = autor; }

    public Genero getGenero() {
        return genero; }

    public void setGenero(Genero genero) {
        this.genero = genero; }

    @Override
    public String toString() {
        return "Libro{" +
                "idLibro=" + idLibro +
                ", titulo='" + titulo + '\'' +
                ", añoPublicacion=" + añoPublicacion +
                ", isbn='" + isbn + '\'' +
                ", disponibilidad=" + disponibilidad +
                ", autor=" + autor +
                ", genero=" + genero +
                '}';
    }
}
