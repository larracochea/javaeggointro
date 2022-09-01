package actividad_1;

import java.util.Scanner;



public class ej_8ex {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       int num=0,contador1=0,contador2=0,contador3=0;
       do{
          num=leer.nextInt();
           if (num%2==0 && num>-1) {
             contador1++;  
           }else{
               contador2++;
           }
           contador3++;
       }while(num%5!=0);
        System.out.println("numeros contados " + contador3 + " numeros pares " + contador1 + " numeros impares " + contador2);


    }

}
