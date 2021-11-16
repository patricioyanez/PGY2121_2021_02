/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author administrador
 */
public class Libro {

    private int idLibro;
    private String titulo;
    private String autor;
    private Date publicacion;
    private int precio;
    private boolean disponible;

    public Libro() {
    }

    public Libro(int idLibro, String titulo, String autor, Date publicacion, int precio, boolean disponible) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.publicacion = publicacion;
        this.precio = precio;
        this.disponible = disponible;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Date publicacion) {
        this.publicacion = publicacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}
