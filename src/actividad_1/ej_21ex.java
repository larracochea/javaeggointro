package actividad_1;

import java.util.Scanner;



public class ej_21ex {

    
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    int contador1=0,contador2=0;
    double aux=0;
    String check;
    double [] vector = new double [5];
        for (int i = 0; i < vector.length; i--) {
            System.out.println("ingrese su nota de tp");
            vector [0]= leer.nextInt();
            System.out.println("segundo trabajo practico");
            vector [1]= leer.nextInt();
            System.out.println("primer integrador");
            vector [2]= leer.nextInt();
            System.out.println("segundo integrador");
            vector [3]= leer.nextInt();
            vector [4]= (vector[0]*0.10+vector[1]*0.15+vector[2]*0.25+vector[3]*0.5);
            if (vector [4]>=7) {
              contador1++;
            }else{
                contador2++;
            }
            aux=vector[4];
            System.out.println("deseas salir (s/n)");
            check=leer.next();
            if (check.equalsIgnoreCase("s")) {
               break; 
            }
        }
        System.out.println("el promedio es " + (aux/(contador1+contador2)) + "\n"
        + "cantidad de aprobados: " + contador1 + " desaprobados: " + contador2);


    }

}
