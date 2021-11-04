/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patri
 */
public class RedSocial extends Intereses {
    private String clasificacion;

    public RedSocial() {
        this.clasificacion = "";
    }
    
    public RedSocial(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return "RedSocial{" + "clasificacion=" + clasificacion + '}';
    }
    
    
}
