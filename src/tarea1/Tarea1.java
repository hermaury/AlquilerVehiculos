
package ;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Participantes
 * Oscar David Sierra
 * Jeyson Mora Alvarado
 * Hernán Maury Andrade
 * Sebastian Gomez Rincon
 */
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String matricula;
        boolean flag = true;
        String n;
        double precioTotal, precioBase = 50, pma=0;
        int days;
        
        //Lo que falta :
        //metodo para guardar todo el proceso
        //metodo para el mensaje anunciando que se alquilo exitosamente ya que la estructura es igual para todos
        //metodo para generar la matricula random dado el caso
        
        
        
        while (flag = true) {    
            
            n = JOptionPane.showInputDialog("Elija la opcion del tramite que desea realizar:\n"
                    + "1. Alquilar un coche...\n"
                    + "2. Alquilar un microbus...\n"
                    + "3. Alquilar una furgoneta de carga...\n"
                    + "4. Alquilar un camion...\n"
                    + "5. Salir...");
            
            switch(n){
                case "1":
                    days = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los dias que desea alquilar el vehiculo:"));
                    precioTotal = (precioBase * days) + (1.5 * days);
                    matricula = "a";
                    JOptionPane.showMessageDialog(null, "Querido usuario el tramite fue exitoso!\n"
                            + "El total a pagar es de " +precioTotal + "COP y el vehiculo alquilado se identifica con la matricula "+matricula);
                    
                                                
                    
                    break;
                case "2":
                    days = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los dias que desea alquilar el vehiculo:"));
                    precioTotal = ((precioBase * days) + (1.5 * days)) + 2;
                    
                    break;
                case "3":
                    days = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los dias que desea alquilar el vehiculo:"));
                    pma = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el PMA (Peso Máximo Autorizado en toneladas) deseado:"));
                    precioTotal = (precioBase * days) + (20 * pma);
                    
                    break;
                case "4":
                    days = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los dias que desea alquilar el vehiculo:"));
                    precioTotal = (precioBase * days) + 40;
                    
                    break;
                case "5":
                    flag = false;                    
                    break; 
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una opcion correcta por favor...");
                
            }
            
           
        }   
        
        
        
        
   
        
        
    }
    
}
