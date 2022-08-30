package actividad_1;

import java.util.Scanner;



public class ej_14ex {

    
 public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int fam,hij,promed=0,contador=0,aux;
        System.out.println("ingrese la cantidad de familias");
        fam=leer.nextInt();
        for (int i = 0; i < fam; i++) {
            System.out.println("ingrese su cantidad de hijos");
            hij=leer.nextInt();
            for (int j = 0; j < hij; j++) { 
                System.out.println("ingrese la edad de su " + (j+1) + " hijo");
              promed=promed+leer.nextInt();
              contador++;
            }
     }
        System.out.println("el promedio de edad es: " + (promed/contador));
}
}