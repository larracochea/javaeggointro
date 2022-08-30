package actividad_1;

import java.util.Scanner;



public class ej_15ex {

    
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        int num1 = 0,num2 = 0;
        double respuesta;
        double check;
        String confirm = "a";
        System.out.println("ingrese dos numeros enteros positivos");
        do
        {
            check = leer.nextDouble();
        if (check > (-1) && check%1 == 0) {
            num1= (int)check;
        }else
        {
            System.out.println("numero negativo o decimal intente de vuelta");
        }
        } while (num1==0);
        do
        {
            check = leer.nextDouble();
        if (check > (-1) && check%1 == 0) {
            num2= (int)check;
        }else
        {
            System.out.println("numero negativo o decimal intente de vuelta");
        }
        } while (num2==0);
        do 
        {
            System.out.println("menu");
            System.out.println("1.sumar");
            System.out.println("2.restar");
            System.out.println("3.multiplicar");
            System.out.println("4.dividir");
            System.out.println("5.salir");
            check = leer.nextDouble();
            switch ((int)check) {
                case 1:
                    respuesta=suma(num1,num2);
                    System.out.println("la suma de los dos numeros es " + (int)respuesta);
                    break;
                case 2:
                    respuesta=resta(num1,num2);
                    System.out.println("la resta de los dos numeros es " + (int)respuesta);
                    break;
                case 3:
                    respuesta=mult(num1,num2);
                    System.out.println("la multiplicacion de los dos numeros es" + (int)respuesta);
                    break;
                case 4:
                    respuesta=div(num1,num2);
                    System.out.println("la division de los dos numeros es " + respuesta);
                    break;
                case 5:
                    System.out.println("deseas salir? (s/n)");
                    leer.nextLine();
                    confirm=leer.nextLine();
                    break;
                default:
                    System.out.println("ingrese un numero valido");
            }
           
    } while (!"s".equals(confirm));

    }
        
    public static int suma (int a, int b){
        
        return (a+b);
    }
    
    public static int resta (int a, int b){
        
        return (a-b);
    }

    public static int mult (int a, int b){

        return (a*b);
    }
    
        public static double div (int a, int b){
        
        return ((double)a/b);
    }
    }


