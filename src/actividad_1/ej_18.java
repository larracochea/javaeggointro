/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_1;

/**
 *
 * @author Franco Larracochea
 */
public class ej_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int [] [] matriz = new int [4] [4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz [i] [j] = (int) (Math.random()*10);
            }
            
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz [i] [j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz [j] [i] + " ");
            }
            System.out.println("");
        }
    }
    
}
