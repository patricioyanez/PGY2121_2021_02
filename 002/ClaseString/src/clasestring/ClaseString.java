package clasestring;

public class ClaseString {
    public static void main(String[] args) {
        String texto;
        texto = "4234jllkj";
        
        String texto2 = "gsd4g6s7df6g5sdf";
        
        String texto3 = new String("12345");
        
        System.out.println(texto + "\n" + texto2 + "\n" + texto3);
        
        System.out.println("Length: " + texto3.length());
        System.out.println("aa".equals("aa")); //TRue
        System.out.println("aa".equals("AA")); //false
        System.out.println("aa".equalsIgnoreCase("AA")); //true
        System.out.print("start with ");
        System.out.println(texto.startsWith("423")); // true
        System.out.println(texto.startsWith("atr")); // false
        System.out.print("ends with ");
        System.out.println(texto.endsWith("kj")); // true
        System.out.println(texto.endsWith("dgdg")); // false
        System.out.println("Mayusculas : " + ("fasdfASDF").toUpperCase() );
        System.out.println("Minusculas : " + ("fasdfSDFS").toLowerCase() );
        
        String palabra = "            palabra           ";
        System.out.println("_" + palabra + "_");
        System.out.println("_" + palabra.trim() + "_");
        
        String rut = "     20.100.200-k";
        System.out.println(rut.replace(".", "").trim().toUpperCase());
        
        System.out.println(rut.trim().replace(".","").substring(0, 4));
        // devolver los ultimos 4 caracteres
        
        
        
        
        
    }
    
}
