package com.example.Parcial.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "generos")
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Genero", columnDefinition = "INT(11)")
    private Integer idGenero;


    private String nombreGenero;

    public Genero() {}

    public Genero(Integer idGenero, String nombreGenero) {
        this.idGenero = idGenero;
        this.nombreGenero = nombreGenero;
    }

    public Integer getIdGenero() {
        return idGenero; }

    public void setIdGenero(Integer idGenero) {
        this.idGenero = idGenero; }

    public String getNombreGenero() {
        return nombreGenero; }

    public void setNombreGenero(String nombreGenero) {
        this.nombreGenero = nombreGenero; }

    @Override
    public String toString() {
        return "Genero{" +
                "idGenero=" + idGenero +
                ", nombreGenero='" + nombreGenero + '\'' +
                '}';
    }
}
