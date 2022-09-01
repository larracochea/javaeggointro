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
            System.out.println("v1");
         vectora [i] = leer.nextInt();
            System.out.println("v2");
         vectorb [i] = leer.nextInt();
            if (vectora [i] != vectorb [i]) {
                check=false;
              break;  
            }
        }
        if (check) {
            System.out.println("son iguales ");  
        }else{
            System.out.println("no son iguales");
        }


    }

}
