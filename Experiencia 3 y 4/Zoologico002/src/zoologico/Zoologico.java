/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

import java.util.Scanner;

/**
 *
 * @author patri
 */
public class Zoologico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal = new Animal();
        Mamifero mamifero = new Mamifero();
        Scanner leer = new Scanner(System.in);
        
        animal.comer();
        mamifero.comer();
        
        System.out.println("Ingrese liquido:");
        String liquido = leer.next();
        Mamifero humano = new Mamifero();
        
        
        humano.beber();
        
        
        humano.beber(liquido);
        humano.beber("cermeza");
        humano.beber("Bebida", 500);
        
        
        // this / super
        humano.llamar();
        
        // sobre escritura
    }
    
}
