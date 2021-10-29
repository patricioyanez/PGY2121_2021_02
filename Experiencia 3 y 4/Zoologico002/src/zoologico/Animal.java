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
public class Animal {
    private int ojos;
    private boolean tieneCola;
    private boolean esVenenoso;

    public Animal() {
        this.ojos = 0;
        this.tieneCola = false;
        this.esVenenoso = false;
    }
    
    public Animal(int ojos, boolean tieneCola, boolean esVenenoso) {
        this.ojos = ojos;
        this.tieneCola = tieneCola;
        this.esVenenoso = esVenenoso;
    }

 
    public int getOjos() {
        return ojos;
    }

    public void setOjos(int ojos) {
        this.ojos = ojos;
    }

    public boolean isTieneCola() {
        return tieneCola;
    }

    public void setTieneCola(boolean tieneCola) {
        this.tieneCola = tieneCola;
    }

    public boolean isEsVenenoso() {
        return esVenenoso;
    }

    public void setEsVenenoso(boolean esVenenoso) {
        this.esVenenoso = esVenenoso;
    }
    
    @Override
    public String toString() {
        return "Animal{" + "ojos=" + ojos + ", tieneCola=" + tieneCola + ", esVenenoso=" + esVenenoso + '}';
    }
    
    public void comer()
    {
        System.out.println("El animal come");
    }

    
}
