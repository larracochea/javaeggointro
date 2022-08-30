package actividad_1;

import java.util.Scanner;



public class ej_6ex {

    
    public static void main(String[] args) {
             Scanner leer = new Scanner (System.in);
             double aux,contador1=0,contador2=0,promedio1=0,promedio2=0;
             boolean check=false;
             do{
                 System.out.println("ingrese altura");
                 aux=leer.nextDouble();
                 if (aux!=0) {
                     
                 
                 if (aux<1.60) {
                     promedio2=promedio2+aux;
                     contador2++;
                 }
                 promedio1=promedio1+aux;
                 contador1++;
                 }else{
                     check=true;
                 }
             }while (check==false);
             System.out.println("el promedio es de " + (promedio1/contador1) + " el promedio de gente menor a 1.60m es " + (promedio2/contador2) );
             


    }

}
