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
public class ej_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int contador1=0,contador2=0;
       String input;
       boolean check;
       do {
        System.out.println("ingrese su cadena");
        input = leer.nextLine();
        if (("x".equals(input.substring(0,1))) && (input.length()<=5)) {
            if ("o".equals(input.substring((input.length()-1),input.length()))){
                check = true;
                System.out.println("cadena correcta");
            }else
            {
                check = false;
                System.out.println("cadena incorrecta");
            }
        }else
            {
               System.out.println("cadena incorrecta");
        
            check = false;
        }
        
        if (!input.equals("&&&&&")) {
            if (check==true) {
                contador1++;
            }else
            {
               if (check==false){
                contador2++;
                           }
            }
        }
         
    }while (!input.equals("&&&&&"));
        System.out.println("fin de lectura. se encontraron:");
        System.out.println(contador1 + " lecturas correctas");
        System.out.println(contador2 + " lecturas incorrectas");
}
}