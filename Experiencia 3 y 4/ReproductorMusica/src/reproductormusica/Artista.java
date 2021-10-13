/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reproductormusica;

/**
 *
 * @author patri
 */
public class Artista {
    private String nombre;
    private String origen;

    public Artista() {
        this.nombre = "";
        this.origen = "";
    }
    public Artista(String nombre, String origen) {
        this.nombre = nombre;
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Artista: " + "nombre=" + nombre + ", origen=" + origen;
    }
    
    
    
}
