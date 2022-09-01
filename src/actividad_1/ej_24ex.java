package actividad_1;

import java.util.Scanner;



public class ej_24ex {

    
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    int num=0,res;
    do{
        System.out.println("ingrese su posicion en la secuencia");
        num=leer.nextInt();
    }while(num<1);
        res=fibonacci(num-1);
        System.out.println(res);
        


    }
    
   public static int fibonacci (int a){
       int n=0;
       if (a<=1) {
           n=1;
       }else{
           if (a>1) {
             n= fibonacci(a-1) + fibonacci (a-2); 
           }
       }
       return n;
   }

}
