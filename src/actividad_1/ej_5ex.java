package actividad_1;

import java.util.Scanner;



public class ej_5ex {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String socio="";
        double precio=2500;
        System.out.println("usted debera pagar " + precio);
        System.out.println("ingrese su tipo de socio");
        do{
            socio=leer.next();
            switch (socio.toLowerCase()){
                case "a": precio=precio*0.5;
                socio="a";
                break;
                case "b": precio=precio*0.65;
                socio="a";
                break;
                case "c": socio="a";
                break;
                default:System.out.println("ingrese un tipo valido (a,b,c)");
                    
            }
        }while (!socio.equalsIgnoreCase("a"));
        System.out.println("el precio final es de " + precio);


    }

}
