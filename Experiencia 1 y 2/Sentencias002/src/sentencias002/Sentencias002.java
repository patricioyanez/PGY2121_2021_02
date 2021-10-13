package sentencias002;
import java.util.Scanner; // permite leer el teclado

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
        int numero = 1000000;
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
        while(contador <= 10)
        {
            // contador = contador + 1
            System.out.println("numero " + contador++);
        }
        
        
        while(contador != 0)
        {
            System.out.println("cuenta atrás " + contador--);
        }
        
        for(int i = 0; i <= 10; i++)
        {
            System.out.println("for: "+ i);
        }
        int index = 0;
        for( ; index++ <10 ;)
        {
            System.out.println("index: " + index);
        }
        
        
        ///*** menu ******////
        String opcion = "";
        //Objeto para leer el teclado
        Scanner teclado = new Scanner(System.in);
        
        while(!opcion.equals("5"))
        {
            System.out.println("***** Menú *******");
            System.out.println("1.- Ingreso");
            System.out.println("2.- Modificación");
            System.out.println("3.- Eliminar");
            System.out.println("4.- Listar");
            System.out.println("5.- Salir");
            System.out.print("Ingrese su opción: ");
            // capturar y asignar el texto que el usuario escribio
            opcion = teclado.next();
            // mostrar un mensaje con la opcion presionada
            if (opcion.equals("1"))
            {
                System.out.println("Accedio a la opción: Ingreso");
            }
            else if (opcion.equals("2"))
            {
                System.out.println("Accedio a la opción: Modificación");
            }
            else if (opcion.equals("3"))
            {
                System.out.println("Accedio a la opción: Eliminar");
            }
            else if (opcion.equals("4"))
            {
                System.out.println("Accedio a la opción: Listar");
            }
            else if (opcion.equals("5"))
            {
                System.out.println("... cerrando sistema");
            }
            else
            {
                System.out.println("Opción no válida");
            }
            
        }
        
        
        
        //**** ejercicio *////
        
        int adultos     = 0;
        int ninos       = 0;
        int invitados   = 0;
        int edad        = 0;
        
        System.out.print("Cuantos invitados son?: ");
        // utilizar la clase / objeto scanner
        invitados = teclado.nextInt();
        
        for(int indice = 1; indice <= invitados; indice++)
        {
            System.out.print("La edad del invitado es: ");
            edad = teclado.nextInt();
            
            if(edad <= 12)
                ninos++;
            else
                adultos++;
        }
        
        System.out.println("Total de niños  : " + ninos);
        System.out.println("Total de adultos: " + adultos);
        
        
    }
    
}
