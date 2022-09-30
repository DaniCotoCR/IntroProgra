
package tarea.pkg1;


public class Mes {
    
public void mes(int n){
        String cuatri ="";
        String mes="";
        if (n<=4){
            cuatri="Primer cuatrimestre";
        }else if(n>4 && n<8){
            cuatri="Segundo cuatrimestre";
        }else if(n>=8){
            cuatri="Tercer cuatrimestre";
        }

        if (n==1){
            mes = "Enero";
        }else if (n==2){
            mes = "Febrero";
        }else if (n==3){
            mes = "Marzo";
        }else if (n==4){
            mes = "Abril";
        }else if (n==5){
            mes = "Mayo";
        }else if (n==6){
            mes = "Junio";
        }else if (n==7){
            mes = "Julio";
        }else if (n==8){
            mes = "Agosto";
        }else if (n==9){
            mes = "Septiembre";
        }else if (n==10){
            mes = "Octubre";
        }else if (n==11){
            mes = "Noviembre";
        }else if (n==12){
            mes = "Diciembre";
        }
        System.out.print("El mes es "+mes+" y pertenece al "+cuatri+"\n");
    }








}
