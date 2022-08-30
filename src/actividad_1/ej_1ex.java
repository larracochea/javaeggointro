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
public class ej_1ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de minutos");
        int tiempo= leer.nextInt()/60;
        System.out.println("el tiempo serida " + (tiempo/24) + " dias " + (tiempo%24) + " horas" );
    }
    
}
