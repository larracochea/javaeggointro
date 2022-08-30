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
public class ej_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de euros");
        double euro= leer.nextDouble();
        System.out.println("ingrese la moneda a cambiar\n"
                + "1.dolar\n"
                + "2.yen\n"
                + "3.libra");
       int target = leer.nextInt();   
       cambio(euro,target);
       }
      
    public static void cambio (double euro, int target){
        switch (target){
            case 1: System.out.println("usted recibira " + (euro*1.28611) + " dolares");
            break;
            case 2: System.out.println("usted recibira " + (euro*0.86) + "libras");
            break;
            case 3: System.out.println("usted recibira " + (euro*129.852) + "yenes");
            break;
            default: System.out.println("ingrese un numero valido");
        }
    }
    }
    
    

        


    

