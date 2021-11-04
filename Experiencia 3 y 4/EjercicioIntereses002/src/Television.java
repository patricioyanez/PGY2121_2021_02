/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patri
 */
public class Television extends Intereses{
    private String tipoDeMedio; // noticias, peliculas, etc.

    public Television() {
        this.tipoDeMedio = "";
    }    
    public Television(String tipoDeMedio) {
        this.tipoDeMedio = tipoDeMedio;
    }

    public String getTipoDeMedio() {
        return tipoDeMedio;
    }

    public void setTipoDeMedio(String tipoDeMedio) {
        this.tipoDeMedio = tipoDeMedio;
    }

    @Override
    public String toString() {
        return "Television{" + "tipoDeMedio=" + tipoDeMedio + '}';
    }
    
    
}
