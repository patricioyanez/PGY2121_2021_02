
package scootin002;

public class Empleado {
    private String rut;
    private String nombreCompleto;
    private String genero;
    private int anioDeServicio;
    private int edad;
    private Puesto puesto;

    public Empleado() {
        this.rut = "";
        this.nombreCompleto = "";
        this.genero = "";
        this.anioDeServicio = 0;
        this.edad = 0;
        this.puesto = new Puesto(); // null
    }
    public Empleado(String rut, String nombreCompleto, String genero, int anioDeServicio, int edad, Puesto puesto) {
        this.rut = rut;
        this.nombreCompleto = nombreCompleto;
        this.genero = genero;
        this.anioDeServicio = anioDeServicio;
        this.edad = edad;
        this.puesto = puesto;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnioDeServicio() {
        return anioDeServicio;
    }

    public void setAnioDeServicio(int anioDeServicio) {
        this.anioDeServicio = anioDeServicio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Empleado:\n" + 
                "rut=" + rut + 
                ", nombre Completo=" + nombreCompleto + 
                ", genero=" + genero + 
                ", año De Servicio=" + anioDeServicio + 
                ", edad=" + edad + 
                ", puesto=" + puesto;
    }
    
    
    
}
