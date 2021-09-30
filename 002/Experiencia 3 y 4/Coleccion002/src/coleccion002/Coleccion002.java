
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
        
        
        System.out.println("*************  Métodos *******************");
        System.out.println("");
        // permite saber cuanto elementos hay en la colección
        System.out.println("Nros de elementos: " + apellidos.size());
        
        // limpiar o vacia una colección
        apellidos.clear();
        System.out.println("Nros de elementos clear: " + apellidos.size());
        
        // devuelve v/f si encuentra el elemento especificado dentro de la colección
        boolean existe = false;
        existe = nombres.contains("Juan");
        System.out.println("Existe el nombre?: " + (existe?"si":"no"));
        System.out.println("Existe el nombre?: " + nombres.contains("Fabiola"));
        
        // devuelve el elemento del indice especificado
        System.out.println("El nombre del indice es: " + nombres.get(2));
        System.out.println("El nombre del indice es: " + nombres.get(2).toUpperCase());
        
        // permite saber si el objeto existe en la colección
        // -1 no existe. 0 o nro +
        System.out.println("indice del nombre: " + nombres.indexOf("Amy"));        
        System.out.println("indice del nombre: " + nombres.indexOf("Fabian"));
        
        // eliminar un elemento dentro de la colección
        System.out.println("Resultado: " + nombres.remove(1));
        System.out.println("Resultado: " + nombres.remove("Amy"));
        
        
    }
    
}
