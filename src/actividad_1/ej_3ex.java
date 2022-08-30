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
public class ej_3ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una letra");
        String letra = leer.next();
        if (letra.substring(0, 1).equalsIgnoreCase("a") || letra.substring(0, 1).equalsIgnoreCase("e") || 
            letra.substring(0, 1).equalsIgnoreCase("i") || letra.substring(0, 1).equalsIgnoreCase("o") || 
            letra.substring(0, 1).equalsIgnoreCase("u")){
            System.out.println("ingresaste una vocal");
        }else
        {
            System.out.println("ingresaste una consonante");
        }
    }
    
}
