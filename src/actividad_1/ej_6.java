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
public class ej_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("ingrese un numero");
        num = leer.nextInt();
        if (num%2==0) {
            
            System.out.println("el numero es par");         
        }
        else {
            System.out.println("el numero es impar");
        }
    }
    
}
