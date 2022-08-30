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
public class ej_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = 0,num2;
        System.out.println("ingrese un limite");
        num2 = leer.nextInt();
        do
        {
            System.out.println("ingrese un numero a ser sumado");
            num1 = num1 + leer.nextInt();
        } while (num1 <= num2);
        System.out.println("el total fue " + num1 + " superando el limite de " + num2 );
        
    }
    
}
