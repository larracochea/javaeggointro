package actividad_1;

import java.util.Scanner;



public class ej_22ex {

    
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
        System.out.println("ingrese dimensiones de la matriz");
        int n=leer.nextInt(),m=leer.nextInt(),aux=0;
        int [] [] matriz = new int [n] [m];
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < m-1; j++) {
              matriz [i] [j] = (int)(Math.random()*10); 
              aux=matriz [i] [j]+aux;
                System.out.print(matriz [i] [j] + " ");
            }
            System.out.println(""); 
        }
        System.out.println("la suma de los elementos es " + aux);


    }

}
