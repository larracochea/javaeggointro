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
public class ej_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        boolean comp;
        System.out.println("ingrese la clave");
        palabra = leer.nextLine();
        comp = palabra.equals("eureka");
        if ((palabra.equals("eureka"))==true) {
            System.out.println("clave correcta");
        }
        else {
            System.out.println("clave incorrecta");
        }
    }
    
}
