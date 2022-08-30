
package actividad_1;

import java.util.Scanner;


public class ej_4ex {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String romano="";
        System.out.println("ingrese un numero a traducir");
        int num = leer.nextInt();
        switch (num){
            case 1: romano="I";
            break;
            case 2: romano="II";
            break;
            case 3: romano="III";
            break;
            case 4: romano="IV";
            break;
            case 5: romano="V";
            break;
            case 6: romano="VI";
            break;
            case 7: romano="VII";
            break;
            case 8: romano="VIII";
            break;
            case 9: romano="IX";
            break;
            case 10:romano="X";
            break;
            default: System.out.println("ingrese un numero entre 1 y 10");
            
        }
        if (num<11) {
            System.out.println("el numero ingresado es " + romano + " en romano");  
        }
    }
    
}
