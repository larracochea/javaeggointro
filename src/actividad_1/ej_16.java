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
public class ej_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese tamano de la muestra");
        int contador = 0;
        int num = leer.nextInt();
        int [] vector = new int [num];
        for (int i = 0; i < num; i++) {
            vector [i] = (int) (Math.random()*10);
        }
        System.out.println("ingrese numero a buscar");
        int buscador = leer.nextInt();
        for (int i = 0; i < num; i++) {
            if (vector [i] == buscador){
                contador++;
            }
        }
        if (contador>0) {
            System.out.println("se encontro el numero " + contador + " veces");
        }
        for (int i = 0; i < num; i++) {
            System.out.print(vector [i] + " ");
    }
    
}
}
