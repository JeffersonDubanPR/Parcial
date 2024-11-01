package com.example.Parcial.Model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "prestamos")
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Prestamo", columnDefinition = "INT(11)")
    private Integer idPrestamo;


    @Temporal(TemporalType.DATE)
    private Date fechaPrestamo;


    @Temporal(TemporalType.DATE)
    private Date fechaDevolucion;

    @ManyToOne
    private Libro libro;

    @ManyToOne
    private Cliente cliente;

    public Prestamo() {}

    public Prestamo(Integer idPrestamo, Date fechaPrestamo, Date fechaDevolucion, Libro libro, Cliente cliente) {
        this.idPrestamo = idPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.libro = libro;
        this.cliente = cliente;
    }

    public Integer getIdPrestamo() {
        return idPrestamo; }

    public void setIdPrestamo(Integer idPrestamo) {
        this.idPrestamo = idPrestamo; }

    public Date getFechaPrestamo() {
        return fechaPrestamo; }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo; }

    public Date getFechaDevolucion() {
        return fechaDevolucion; }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion; }

    public Libro getLibro() {
        return libro; }

    public void setLibro(Libro libro) {
        this.libro = libro; }

    public Cliente getCliente() {
        return cliente; }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente; }


    @Override
    public String toString() {
        return "Prestamo{" +
                "idPrestamo=" + idPrestamo +
                ", fechaPrestamo=" + fechaPrestamo +
                ", fechaDevolucion=" + fechaDevolucion +
                ", libro=" + libro +
                ", cliente=" + cliente +
                '}';
    }
}
