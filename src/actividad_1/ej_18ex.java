package actividad_1;

import java.util.Scanner;



public class ej_18ex {

    
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
        System.out.println("ingrese tamano del vector");
    int num=leer.nextInt(),aux=0;
    int [] vector= new int [num];
        for (int i = 0; i < 10; i++) {
         vector [i]=leer.nextInt();
         aux=aux+vector [i];
        }
        System.out.println("la suma de los vectores es " + aux);
    }

}
