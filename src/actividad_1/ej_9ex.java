package actividad_1;

import java.util.Scanner;



public class ej_9ex {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese un numero a dividir");
        int num = leer.nextInt();
        System.out.println("ingrese el divisor");
        int div = leer.nextInt();
        divresta(num,div);
            


    }
    
    public static void divresta (int a,int b){
        int contador=0;
        do{
            a=a-b;
            contador++;
        }while (a>b);
        System.out.println("el resultado de la division fue:\n"
                + "cociente " + contador + "\n"
                        + "resto " + a);
    }

}
