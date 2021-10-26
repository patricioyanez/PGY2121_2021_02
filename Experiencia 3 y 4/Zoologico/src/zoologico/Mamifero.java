/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

/**
 *
 * @author patri
 */
public class Mamifero extends Animal {
    private int diasGestacion;
    private int cantidadUbres;

    public Mamifero() {
        this.diasGestacion = 0;
        this.cantidadUbres = 0;
    }
    public Mamifero(int diasGestacion, int cantidadUbres) {
        this.diasGestacion = diasGestacion;
        this.cantidadUbres = cantidadUbres;
    }

    public int getCantidadUbres() {
        return cantidadUbres;
    }

    public void setCantidadUbres(int cantidadUbres) {
        this.cantidadUbres = cantidadUbres;
    }

    public int getDiasGestacion() {
        return diasGestacion;
    }

    public void setDiasGestacion(int diasGestacion) {
        this.diasGestacion = diasGestacion;
    }
    
    
}
