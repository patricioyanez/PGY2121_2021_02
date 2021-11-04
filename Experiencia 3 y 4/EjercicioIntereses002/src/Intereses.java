
import java.util.ArrayList;


public class Intereses implements IOperacion{
    private String nombre;
    private int minutosUso;
   
    private ArrayList<Intereses> intereses;
    private int like;

    public Intereses() {
        this.nombre = "";
        this.minutosUso = -1;
        this.intereses = new ArrayList<Intereses>();
    }
    
    public Intereses(String nombre, int minutosUso) {
        this.nombre = nombre;
        this.minutosUso = minutosUso;
        this.intereses = new ArrayList<Intereses>();
    }

    public int getMinutosUso() {
        return minutosUso;
    }

    public void setMinutosUso(int minutosUso) {
        this.minutosUso = minutosUso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Intereses{" + "nombre=" + nombre + ", minutosUso=" + minutosUso + '}';
    }
    
    @Override
    public void sumarMinutos()
    {
        int total = 0;
        for(Intereses aux : intereses)
        {
            //total += aux.minutosUso;
            total = total + aux.minutosUso;
        }
        
    }
    
    @Override
    public int darLike()
    {
        return ++this.like;
    }
    
}
