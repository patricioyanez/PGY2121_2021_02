package sentencias002;

public class Sentencias002 {

    public static void main(String[] args) {
        
        //  creación de variables
        int nota;
        nota = 50;
        
        int nota2 = 40;
        
        nota = 45;
        
        
        // if  > < >= <= == !=
        
        if(nota > 40)
        {
            System.out.println("UD. aprobó");            
        }
        
        
        if(nota < 40)
        {
            System.out.println("Ud. reprobó la asignatura");
        }
        else
        {
            System.out.println("Ud. aprobó la asignatura");
        }
        
        if(nota < 30)
        {
            System.out.println("Su rendimiento es malo");
        }//elif
        else if(nota < 40)
        {
            System.out.println("Su rendimiento no es bueno, se puede superar");
        }
        else if(nota < 60)
        {
            System.out.println("Su rendimiento es bueno");
        }
        else
        {
            System.out.println("Rendimiento es excelente");
        }
        
        if(nota != 40)
            System.out.println("LA nota es diferente a 40");
        
        
        // switch
        int numero = 100;
        String texto = "";
        
        switch(numero)
        {
            case 1:
                texto = "es Unidad";
                break;
            case 10:
                texto= "Es decena";
                break;
            case 100:
                texto= "es Centena";
                break;
            case 1000:
                texto = "es mil";
                break;
            default:
                texto = "no está definido";
                break;
        }
        
        System.out.println("el numero " + texto);
        int contador = 0;
        while(contador < 10)
        {
            // contador = contador + 1
            System.out.println("numero " + contador++);
        }
    }
    
}
