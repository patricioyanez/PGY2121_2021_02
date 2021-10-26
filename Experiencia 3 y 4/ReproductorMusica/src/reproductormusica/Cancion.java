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
public class Cancion {
    private String nombre;
    private int segundos;
    private String album;
    private boolean esFavorita;
    private Artista artista;

    public Cancion() {
        this.nombre = "";
        this.segundos = 0;
        this.album = "";
        this.artista = new Artista();
    }
    
    public Cancion(String nombre, int segundos, String album, Boolean esFavorita, Artista artista) {
        this.nombre = nombre;
        this.segundos = segundos;
        this.album = album;
        this.esFavorita = esFavorita;
        this.artista = artista;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public boolean isEsFavorita() {
        return esFavorita;
    }

    public void setEsFavorita(boolean esFavorita) {
        this.esFavorita = esFavorita;
    }

    @Override
    public String toString() {
        return "Cancion{" + "nombre=" + nombre + ", segundos=" + segundos + ", album=" + album + ", esFavorita=" + esFavorita + ", artista=" + artista + '}';
    }
    
    public void imprimir()
    {
        System.out.println(this);
    }
    
    public void imprimir(String titulo)
    {
        System.out.println(titulo +"\n" + this);
    }
    
    public String imprimir(Boolean devolverDatos)
    {
        return this.toString();
    }
    
}
