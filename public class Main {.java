//[1:35, 1/12/2022] Frai:

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author utiel
 * @author Lay4k
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ArrayList<Integer> Lakers = new ArrayList<Integer>();
     
     int[] Warriors = new int[10];
     int[] Celtics = new int[10];
     int decisionDeporte = 0;
     Scanner in = new Scanner(System.in);
     
    System.out.println("1.-*BALONCESTO*");
    System.out.println("2.-FUTBOL**");    
    System.out.println("3.-TENIS*");
    System.out.println("4.-SALIR**\n");
    
    System.out.println("¿Qué deporte quieres probar?");
    
    decisionDeporte = in.nextInt();
    in.nextLine();
   // systemIn(decisionDeporte)

    switch (decisionDeporte)
    {
        case 0:
            System.out.println("Salir");
          
            break;
        
        case 1:
            System.out.println("Has elegido Baloncesto");
          

            break;
        
        case 2:
            System.out.println("Has elegido Futbol");
            
            break;

        case 3:
            System.out.println("Has elegido Tenis");

            break;
        default:
    }
   
    }
    
    
}
//[2:01, 1/12/2022] Layak: CABRON JAJAJAJJA