package proyecto002;

public class Pizzeria {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        
        Pizza pizza1 = new Pizza(); // constructor sin parametros
        
        pizza1.calentar();
        String aux = pizza1.mensaje();
        System.out.println(aux);
        
        System.out.println(pizza1.mensaje());
        
        // se crea el objeto con el constructor con parametros
        // los atributos quedan con los valores especificados en los 
        // parentesís
        Pizza pizza2 = new Pizza("Napolitana", "Familiar", "Delgada", 8500);
        
        pizza1.imprimir();
        pizza2.imprimir();
        
        
        pizza2.setValor(9100);
        System.out.println("EL valor de napolitana es: " + pizza2.getValor());
        pizza2.imprimir();
        
    }
    
}
