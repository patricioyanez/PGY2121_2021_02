
package scootin002;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa() {
        // se crea la colección cuando se instancia la clase empresa
        this.empleados = new ArrayList<Empleado>();
    }
    
    // Ejercicios:
    // crear un método que permita agregar a 1 empleado
    public boolean agregar(Empleado empleado)
    {
        // Evitar que se repita el rut
        if(this.buscar(empleado.getRut()))
        {
            System.out.println("El rut " + empleado.getRut() +" ya existe");
            return false;
        }
        return empleados.add(empleado);
    }
    // crear otro método que permita saber si existe un empleado X
    // se debe buscar por rut
    public boolean buscar(String rut)
    {
        for(Empleado empleado : empleados)
        {
            if(rut.equalsIgnoreCase(empleado.getRut()))
                return true;            
        }
        return false;
    }
    
    public void listar()
    {
        for(Empleado empleado: empleados)
        {
            System.out.println(empleado);
        }
    }
    public boolean eliminar(String rut)
    {
        for(Empleado empleado : empleados)
        {
            if(rut.equalsIgnoreCase(empleado.getRut()))
                return empleados.remove(empleado);            
        }
        return false;
    }
    
}
