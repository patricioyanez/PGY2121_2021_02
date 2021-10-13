package colaboracion002;

public class Colaboracion002 {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona(200, "Juan", "Cerrillos");
        
        // persona 1???
        
        p1.setRut(100);
        p1.setNombre("Byron");
        p1.setComuna("Lo Espejo");
        
        p2.setNombre("diego");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        
    }
    
}
