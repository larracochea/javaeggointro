package actividad_1;

import java.util.Scanner;



public class ej_17ex {

    
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
        System.out.println("ingrese un numero primo");
        boolean check;
        int num=leer.nextInt();
        check=primos(num);
        if (check) {
            System.out.println("es un primo");
        }else{
            System.out.println("no son primos");
        }
        

    }
    public static boolean primos (int a){
        boolean prim;
        if (a%2==0 && a!=2 || a%3==0 && a!=3 || a%5==0 && a!=5 || a%7==0 && a!=7 || a%11==0 && a!=11 ) {
            prim=false;
        }else
        {
            prim=true;

        }
        return prim;
    }

}
