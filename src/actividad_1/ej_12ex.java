package actividad_1;

import java.util.Scanner;



public class ej_12ex {

    
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
        int contador1=0,contador2=0,contador3=0;
        do{
            if (contador2==9 && contador1!=9) {
               contador1++;
               contador2=0;
               contador3=0;
            }else{
                if (contador3==9 && (contador1+contador2)!=18) {
                  contador2++;
                       contador3=0; 
                }else{
                    contador3++;
                }
            }
            if (Integer.toString(contador3).equalsIgnoreCase("3")
                    && !Integer.toString(contador2).equalsIgnoreCase("3") 
                                  && !Integer.toString(contador1).equalsIgnoreCase("3")) {
                System.out.println( contador1 + "-" + contador2 + "-" + "E"); 
            }else{
              if (Integer.toString(contador2).equalsIgnoreCase("3")
                      && !Integer.toString(contador3).equalsIgnoreCase("3") 
                                  && !Integer.toString(contador1).equalsIgnoreCase("3")) {
                System.out.println( contador1 + "-" + "E" + "-" + contador3); 
            }else{
                  if (Integer.toString(contador1).equalsIgnoreCase("3")
                          && !Integer.toString(contador2).equalsIgnoreCase("3") 
                                  && !Integer.toString(contador3).equalsIgnoreCase("3")) {
                System.out.println( "E" + "-" + contador2 + "-" + contador3); 
            }else{ 
                      if (Integer.toString(contador3).equalsIgnoreCase("3")
                              && Integer.toString(contador2).equalsIgnoreCase("3") 
                                  && !Integer.toString(contador1).equalsIgnoreCase("3")) {
                          System.out.println( contador1 + "-" + "E" + "-" + "E");
                      }else{
                          if (Integer.toString(contador3).equalsIgnoreCase("3") 
                                  && Integer.toString(contador2).equalsIgnoreCase("3") 
                                  && Integer.toString(contador1).equalsIgnoreCase("3")) {
                              System.out.println( "E" + "-" + "E" + "-" + "E");   
                          }else{
                              System.out.println(contador1 + "-" + contador2 + "-" + contador3);
                          }
                      }
                  }
              }  
            }
            
        }while (contador1+contador2+contador3!=27);


    }

}
