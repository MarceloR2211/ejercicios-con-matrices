
package ejer_2_rotación_de_una_matriz_90;

import java.util.Random;
import java.util.Scanner;


public class Ejer_2_Rotación_de_una_matriz_90 {


    public static void main(String[] args) {
//Dada una matriz cuadrada mmm de dimensión ddd, escribe un algoritmo que permita 
//rotar la matriz 90° en el sentido de las agujas del reloj. Por ejemplo:
        Random rrr = new Random();
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE LA DIMENSION");
        int d = leer.nextInt();
        int m[][] = new int[d][d];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = rrr.nextInt(101);
            }

        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print("[" + m[i][j] + "]  ");
            }
            System.out.println("");
        }
        
        int axi[][] = new int[d][d];
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                axi[i][j]=m[d-1-j][i];
            }
        }
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print("[" + axi[i][j] + "]  ");
            }
            System.out.println("");
        }
    }
    
}
