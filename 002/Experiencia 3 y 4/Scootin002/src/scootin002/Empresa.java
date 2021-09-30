
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
        return empleados.add(empleado);
    }
    // crear otro método que permita saber si existe un empleado X
    
}
