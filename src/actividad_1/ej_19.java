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
public class ej_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean check=false;
        int [] [] matriz = new int [3] [3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz [i] [j] = leer.nextInt();
            }
            
    }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz [i] [j]*(-1) == matriz [j] [i]) {
                    check=true;
                }else
                {
                    check=false;
                }
            }
        }
         if (check==true) {
             System.out.println("matriz antisimetrica");
        }else
         {
             System.out.println("matriz no antisimetrica");
         }

   
   
}
}