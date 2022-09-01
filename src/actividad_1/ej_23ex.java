package actividad_1;

import java.util.Scanner;



public class ej_23ex {

    
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    boolean check=false;
    String [] vector = new String [5];
    int [] filas = new int [5];
    String [] [] matriz = new String [20] [20];
        System.out.println("ingrese 5 palabras entre 3 y 5 letras");
        
        for (int i = 0; i < 20; i++) {
            if (i<5) {
             do{
                 System.out.println("ingrese la palabra");
               vector[i]=leer.next();
             }while(vector [i].length()<3 || vector [i].length()>5); 
            System.out.println("dato correcto");   
            
            do{
             filas [i]= leer.nextInt();
             check=true;
                for (int j = 0; j < i; j++) {
                    if (filas[i] == filas[j] && i!=j) {
                      check=false;  
                    }
  
                }
            }while(check=false);
            }
            
            for (int j = 0; j < 20; j++) {
               matriz [i] [j] =Integer.toString( (int) (Math.random()*10)); 
            }
            
            }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < vector[i].length() ; j++) {
              matriz [filas[i]] [j] = vector [i].substring(j, (j+1));
            }           
        }
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(matriz [i] [j] + " "); 
            }
            System.out.println("");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(filas [i] + " "); 
        }

        }
        


    }


