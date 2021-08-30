
package proyecto002;

public class Pizza {
    // 1 Atributos
    private String nombre; // encapsulados
    private String tamano;
    private String masa;
    private int valor;
    // 2 Constructores
    public Pizza()
    {
        this.nombre = "personal";
        this.tamano = "personal";
        this.masa = "delgada";
        this.valor = 3500;
        /*
        System.out.println("Se ejecutó el constructor");
        System.out.println(this.nombre);
        System.out.println(valor);
        */
    }
    public Pizza(String nombre, String tamano, String masa, int valor)
    {
        this.nombre = nombre;
        this.tamano = tamano;
        this.masa   = masa;
        this.valor  = valor;
    }
    
    // 3 getter and setter accesadores / mutadores
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    
    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    // 4 métodos o customer
    public void preparar()
    {
        System.out.println("Se está preparando su Pizza");
    }
    
    public void calentar()
    {
        System.out.println("Se está horneando su Pizza");
    }
    
    public int total()
    {
        return 10025;
    }
    public String mensaje()
    {
        return "está lista la pizza";
    }

    public String imprimir()
    {
        String aux = "";
        aux = this.nombre + "\n" + 
                this.tamano + "\n" + 
                this.masa + "\n" + 
                this.valor;
        System.out.println("****** DETALLE DE LA PIZZA");
        System.out.println(aux);
        System.out.println("\n");
        return aux;
    }

    
}
