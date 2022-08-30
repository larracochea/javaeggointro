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
public class ej_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String palabra;
        System.out.println("ingrese una palabra");
       palabra = leer.nextLine();
       if ((palabra.substring(0,1)).equals("a")== true) {
           System.out.println("correcto");
       }
       else {
           System.out.println("incorrecto");
       }

    }
    
}
