/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Franco Larracochea
 */
public class ej_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        char chr;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el numero a calcular");    
        num = leer.nextInt();
        System.out.println("el doble es " + (num*2));
        System.out.println("el triple es " + (num*3));
        System.out.println("la raiz es " + sqrt(num));

                
    }
    
}
