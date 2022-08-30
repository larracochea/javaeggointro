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
public class ej_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        int [] vector = new int [num];
        for (int i = 0; i < num; i++) {
            vector [i] = leer.nextInt();
        }
        for (int i = 0; i < num; i++) {
            int digitos=unidades(vector [i]);
            System.out.println(vector [i] + " posee " + digitos + " digitos");
        }
    }
    
    
    public static int unidades (int a){
        int contador = 0;
        do{
            a= a/10;
            contador++;
        } while (a>0);
        return contador;
    }
}
