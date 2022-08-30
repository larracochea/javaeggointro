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
public class ej_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int f1=0,f2=0,f3=0,c1=0,c2=0,c3=0,d1=0,d2=0;
       int [] [] matriz = new int [3] [3];
       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do{
                    System.out.println("ingrese un valor a la matriz");
                     matriz [i] [j] = leer.nextInt();
                }while(matriz [i] [j]>10 || matriz [i] [j]<=0);
                System.out.println("valor correcto");
            }

        }
        
        for (int i = 0; i < 3; i++) {
          
            for (int j = 0; j < 3; j++) {
                if (j==i){
                    d1= d1+matriz [i] [j];
                }
                if (j==2-i){
                    d2=d2+matriz [i] [j];
                }
                if (i==0){
                    f1=f1+matriz [i] [j];
                    c1 = c1+matriz [j] [i];
                }else
                {
                    if (i==1){
                        f2=f2+matriz [i] [j];
                        c2=c2+matriz [j] [i];
                    }else
                    {
                        if (i==2){
                            f3=f3+matriz [i] [j];
                            c3=c3+matriz [j] [i];
                        }
                    }
                }
            }
        }
        if (c1==c2 && c2==c3 && c3==f1 && f1==f2 && f2==f3 && f3==d1 && d1==d2) {
            System.out.println("cubo magico");
        }else
        {
            System.out.println("no es un cubo magico");
        }

        
        
    }
    
}
