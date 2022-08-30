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
public class ej_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int grados;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de grados C ");
        grados = leer.nextInt();
        System.out.println("la traduccion a grados F es: " + (32+(grados*9/5)));
    }
    
}
