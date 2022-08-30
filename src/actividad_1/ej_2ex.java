/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_1;

import java.util.Scanner;

/**
 *
 * @author Franco Larracochea
 */
public class ej_2ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese los valores de las variables");
       int a=leer.nextInt(),b=leer.nextByte(),c=leer.nextInt(),d=leer.nextInt(),aux;
        System.out.println("\n"
                + "valores iniciales:\n"
                + a + "\n"
                + b + "\n"
                + c + "\n"
                + d);
        aux=b;
        b=c;
        c=a;
        a=d;
        d=aux;
         System.out.println("\n"
                + "valores finales:\n"
                + a + "\n"
                + b + "\n"
                + c + "\n"
                + d);
        
        
        
        
    }
    
}
