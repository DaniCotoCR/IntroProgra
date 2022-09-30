
package tarea.pkg1;

import javax.swing.JOptionPane;

public class TAREA1 {

  
    public static void main(String[] args) {
       
   Mes m = new Mes();
     int n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero")); 
     m.mes(n);
     int edad = Integer.parseInt(JOptionPane.showInputDialog("Digite una edad")); 

     Edad e = new Edad();
     e.edad(edad);
    
     
  
    }
     
    
}
