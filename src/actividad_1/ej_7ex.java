package actividad_1;

import java.util.Scanner;



public class ej_7ex {

    
    public static void main(String[] args) {
             Scanner leer = new Scanner (System.in);
             System.out.println("ingrese la cantidad de numeros");
             int [] vector = new int [leer.nextInt()];
             int min=100000,max=0,prom=0;
             for (int i = 0; i < vector.length; i++) {
                 System.out.println("ingrese su " + (i+1) + " numero");
                 vector [i] = leer.nextInt();
                 System.out.println(Integer.toString(vector[i]).length());

                 if (vector[i]<min) {
                    min=vector[i]; 
                 }else{
                     if (vector[i]>max) {
                         max=vector[i];
                     }
                 }
                  prom=prom+vector[i];
        }
             System.out.println("el maximo fue " + max + " el minimo fue " + min + " el promedio fue " + (((double)prom/vector.length)));



    }

}
