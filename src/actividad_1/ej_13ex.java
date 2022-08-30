package actividad_1;

import java.util.Scanner;



public class ej_13ex {

    
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    String escalera="";
        System.out.println("ingrese el tamano de la escalera"); 
        int num=leer.nextInt();
        for (int i = 0; i < num; i++) {
          escalera=escalera.concat(Integer.toString(i+1));
            System.out.println(escalera);
        }


    }

}
