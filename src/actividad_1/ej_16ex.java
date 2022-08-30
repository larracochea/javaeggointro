package actividad_1;

import java.util.Scanner;



public class ej_16ex {

    
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    int n=leer.nextInt();
    String nom;
    String [] personas = new String [n];
    int [] edad = new int [n];
        for (int i = 0; i < personas.length; i++) {
            System.out.println("ingrese el nombre de la " + (i+1) + " persona");
            personas [i] = leer.next();
            System.out.println("ingrese la edad de la " + (i+1) + " persona");
            edad [i] = leer.nextInt();
            System.out.println("deseas salir? (s/n)");
            nom=leer.next();
            if (nom.equalsIgnoreCase("s")) {
               break; 
            }
            System.out.println("a");
        }
        for (int i = 0; i < edad.length; i++) {
            System.out.println(personas [i] + " edad " + edad [i]); 
        }
     
        


    }

}
