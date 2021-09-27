
package coleccion002;

import java.util.ArrayList;

public class Coleccion002 {

    public static void main(String[] args) {
        // crear una coleccion del tipo ArrayList
        //especificar clase y el nombre debe ser en plural
        ArrayList<String> nombres;
        nombres = new ArrayList<String>();
        
        // otra forma de crear una coleccion
        ArrayList<String> apellidos = new ArrayList<String>();
        
        // agrega elementos a la colección nombres
        nombres.add("Juan");
        nombres.add("Ana");
        nombres.add("Lorena");
        nombres.add("Amy");
        nombres.add("Ruperto");
        
        // mostrar los elementos
        for(String aux : nombres)
        {
            System.out.println("El nombre es: " + aux);
        }
        
        // agregar 5 apellidos a la colleccion, imprimirlos en consola
        // mostrar en mayusculas, ingresarlos en minusculas
        apellidos.add("gonzalez");
        apellidos.add("oyarce");
        apellidos.add("castro");
        apellidos.add("perez");
        apellidos.add("hernandez");

        for(String aux : apellidos)
        {
            System.out.println("El apellido es "+ aux.toUpperCase());
        }
        
        
        
        
        
    }
    
}
