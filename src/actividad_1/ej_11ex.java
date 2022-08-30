
package actividad_1;

import java.util.Scanner;


public class ej_11ex {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        int num = leer.nextInt();

            int digitos=unidades(num);
            System.out.println(num + " posee " + digitos + " digitos");
        
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