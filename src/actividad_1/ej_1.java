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
public class ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
            int n1;
            int n2;
            System.out.println("porfavor ingrese dos numeros");
        n1 = leer.nextInt();
        n2 = leer.nextInt();
        System.out.println("el resultado de la suma fue " + (n1 + n2) );
    }

}
