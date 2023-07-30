
java
package tarea1;

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

       while (flag) {    
           n = JOptionPane.showInputDialog("Elija la opción del trámite que desea realizar:\n"
                   + "1. Alquilar un coche...\n"
                   + "2. Alquilar un microbus...\n"
                   + "3. Alquilar una furgoneta de carga...\n"
                   + "4. Alquilar un camión...\n"
                   + "5. Salir...");

           switch(n){
               case "1":
                   days = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los días que desea alquilar el vehículo:"));
                   precioTotal = (precioBase * days) + (1.5 * days);
                   matricula = generarMatricula(7);
                   JOptionPane.showMessageDialog(null, "Querido usuario, el trámite fue exitoso!\n"
                           + "El total a pagar es de " +precioTotal + " COP y el vehículo alquilado se identifica con la matrícula "+matricula);
                   break;
               case "2":
                   days = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los días que desea alquilar el vehículo:"));
                   precioTotal = ((precioBase * days) + (1.5 * days)) + 2;
                   matricula = generarMatricula(7);
                   JOptionPane.showMessageDialog(null, "Querido usuario, el trámite fue exitoso!\n"
                           + "El total a pagar es de " +precioTotal + " COP y el vehículo alquilado se identifica con la matrícula "+matricula);
                   break;
               case "3":
                   days = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los días que desea alquilar el vehículo:"));
                   pma = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el PMA (Peso Máximo Autorizado en toneladas) deseado:"));
                   precioTotal = (precioBase * days) + (20 * pma);
                   matricula = generarMatricula(7);
                   JOptionPane.showMessageDialog(null, "Querido usuario, el trámite fue exitoso!\n"
                           + "El total a pagar es de " +precioTotal + " COP y el vehículo alquilado se identifica con la matrícula "+matricula);
                   break;
               case "4":
                   days = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los días que desea alquilar el vehículo:"));
                   precioTotal = (precioBase * days) + 40;
                   matricula = generarMatricula(7);
                   JOptionPane.showMessageDialog(null, "Querido usuario, el trámite fue exitoso!\n"
                           + "El total a pagar es de " +precioTotal + " COP y el vehículo alquilado se identifica con la matrícula "+matricula);
                   break;
               case "5":
                   flag = false;                    
                   break; 
               default:
                   JOptionPane.showMessageDialog(null, "Ingrese una opción correcta por favor...");
           }
       }   
   }

   public static String generarMatricula(int length) {
       String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
       Random random = new Random();
       StringBuilder sb = new StringBuilder(length);

       for (int i = 0; i < length; i++) {
           int index = random.nextInt(caracteres.length());
           sb.append(caracteres.charAt(index));
       }

       return sb.toString();
   }
}
