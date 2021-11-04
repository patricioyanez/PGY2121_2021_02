/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patri
 */
public class Musica extends Intereses {
    private String origen;

    public Musica() {
        this.origen = "";
    }
    
    
    public Musica(String origen) {
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return "Musica{" + "origen=" + origen + '}';
    }
    
    
    
    
}
