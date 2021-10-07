
package reproductormusica;

import java.util.ArrayList;

// continuar con el ejercicio reproductor de musica
// link para descargar, en el chat
public class ListaReproduccion {
    private ArrayList<Cancion> canciones;

    public ListaReproduccion() {
        this.canciones = new ArrayList<Cancion>();
    }    
    public boolean agregar(Cancion cancion)
    {
        if(this.buscar(cancion.getNombre()))
            return false;
        else
            return canciones.add(cancion);
    }
    public void listar()
    {
        for(Cancion cancion: canciones)
        {
            System.out.println(cancion);
        }
    }
    public boolean buscar(String nombre)
    {  
        for(Cancion c: canciones)
        {
            if(c.equals(nombre))
                return true;
        }
        return false;  
    }
    public boolean eliminar(String nombre)
    {
        for(Cancion cancion : canciones)
        {
            if(cancion.getNombre().equalsIgnoreCase(nombre))
                return canciones.remove(cancion);            
        }
        return false;
    }
    
}
