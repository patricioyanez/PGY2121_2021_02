
package proyectostreaming002;


public class ProyectoStreaming002 {


    public static void main(String[] args) {
        System.out.println("****  Inicio de la aplicación  ****");
        
        Cancion cancion01 = new Cancion();
        cancion01.imprimir();
        
        cancion01.setTitulo("Miño");
        cancion01.setArtista("Los Bunkers");
        cancion01.setSegundos(360);
        
        cancion01.imprimir();
        
        
        
        
    }
    
}
