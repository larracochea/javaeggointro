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
public class ej_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("ingrese el tamano");
        num = leer.nextInt();
        for (int i=0; i<4 ; i++) {
            if (i==0 || i==3){
            for (int j = 0; j <num; j++) {
                System.out.print("*");
            }
            
        }else
            {
                for (int j = 0; j <num; j++) {
                if (j==0 || j==num-1){
                    System.out.print("*");
                }else
                {
                    System.out.print(" ");
                }
            }
            }
            System.out.println("");
        }
    }
    
}
