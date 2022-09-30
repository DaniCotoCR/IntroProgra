
package tarea.pkg1;


public class Edad {
    
public void edad(int edad){
        String e = "";
        if (edad>=0 && edad<=5){
            e= "PRIMERA INFANCIA";
        }else if(edad>=6 && edad<=11){
            e= "INFANCIA";
        }else if (edad>=12 && edad<=18){
            e= "ADOLESCENCIA";
        }else if (edad>=19 && edad<=30){
            e= "JUVENTUD";
        }else if (edad>=30 && edad<=59){
            e= "ADULTEZ";
        }else if (edad>=60){
            e= "PERSONA MAYOR";
        }

        System.out.print("La persona tiene edad de "+e);
    }







}

