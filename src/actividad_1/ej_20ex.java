package actividad_1;

import java.util.Scanner;



public class ej_20ex {

    
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
      int [] vector = new int [5];
        for (int i = 0; i < vector.length; i++) {
           vector [i] = random(vector,i);
        }
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector [i] + " ");
        }


    }

    
    public static int random (int [] a,int b){
        a [b]= (int)( Math.random()*10);
        return a [b];
    }
}
