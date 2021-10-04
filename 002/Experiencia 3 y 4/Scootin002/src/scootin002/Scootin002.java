/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scootin002;

/**
 *
 * @author patri
 */
public class Scootin002 {

    /**
     * @param args the command line arguments
     * Esta reemplaza a TEST EMPRESA!!!!!
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Puesto puesto1 = new Puesto(100, "Vendedor");
        Puesto puesto2 = new Puesto(200, "Supervisor");
        
        Empleado empleado1 = new Empleado("1-9", "Juan Diaz", "Masculino", 1, 30, puesto1);
        Empleado empleado2 = new Empleado("2-7", "Juana Aros", "Femenino", 5, 40, puesto2);
        
        Empresa scootin = new Empresa();
        
        // agregar empleados a la empresa
        scootin.agregar(empleado1);
        scootin.agregar(empleado2);
        
        // detecta que ya existe el empleado
        scootin.agregar(empleado2);
        
        // lista los empleados
        scootin.listar();
        
        // buscar si un rut existe y eliminarlo
    }
    
}
