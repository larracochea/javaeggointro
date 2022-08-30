package actividad_1;

import java.util.Scanner;



public class ej_19ex {

    
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
        System.out.println("ingrese el tamano"); 
        int num=leer.nextInt();
        boolean check=true;
      int [] vectora = new int [num];
      int [] vectorb = new int [num];
        for (int i = 0; i < vectora.length; i++) {
         vectora [i] = leer.nextInt();
         vectorb [i] = leer.nextInt();
            if (vectora [i] != vectorb [i]) {
                check=false;
              break;  
            }
        }


    }

}
