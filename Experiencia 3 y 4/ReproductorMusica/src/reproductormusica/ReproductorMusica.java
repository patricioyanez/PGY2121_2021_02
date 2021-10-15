/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reproductormusica;

import java.util.Scanner;

/**
 *
 * @author patri
 */
public class ReproductorMusica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Artista artista1 = new Artista("Los Bunkers", "Chile");
        Artista artista2 = new Artista("Soda Stereo", "Argentina");
        
        Cancion cancion1 = new Cancion("Ven aqui", 330, "Vida Perros", true, artista1);
        Cancion cancion2 = new Cancion("Miño", 430, "Vida Perros", true, artista1);
        Cancion cancion3 = new Cancion("Bailando solo", 230, "Vida Perros", true, artista1);
        
        Cancion cancion4 = new Cancion("Musica ligera", 450, "El Ultimo concierto", Boolean.FALSE, artista2);
        Cancion cancion5 = new Cancion("Profugos", 331, "El Ultimo concierto", Boolean.FALSE, artista2);
        Cancion cancion6 = new Cancion("Signos", 610, "El Ultimo concierto", Boolean.FALSE, artista2);
        
        ListaReproduccion lr1 = new ListaReproduccion();
        ListaReproduccion lr2 = new ListaReproduccion();
        
        lr1.agregar(cancion1);
        lr1.agregar(cancion2);
        lr1.agregar(cancion3);
        
        lr2.agregar(cancion4);
        lr2.agregar(cancion5);
        lr2.agregar(cancion6);
        
        Scanner leer = new Scanner(System.in);
        String opcion = "";
        while(!opcion.equals("0"))
        {
            System.out.println("Lista de reproducción");
            System.out.println("1.- lista de reproducción 1");
            System.out.println("2.- lista de reproducción 2");
            System.out.println("0.- Salir del menú");
            System.out.print("Escriba la opción: ");
            opcion = leer.next();

            if(opcion.equals("1"))
            {
                lr1.listar();
            }
            else if(opcion.equals("2"))
            {
                lr2.listar();
            }

        }
        // Ejercicios: crear clase Super clase Animal con 3 atributos
        // y 2 sub clases que contengan 2 atributos adicionales.
        // imprimir todos los valores
       
        
    }
    
}
