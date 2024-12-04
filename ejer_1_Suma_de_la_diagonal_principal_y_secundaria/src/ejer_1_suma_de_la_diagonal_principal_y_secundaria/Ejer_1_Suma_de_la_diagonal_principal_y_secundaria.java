package ejer_1_suma_de_la_diagonal_principal_y_secundaria;

import java.util.Random;
import java.util.Scanner;

public class Ejer_1_Suma_de_la_diagonal_principal_y_secundaria {

    public static void main(String[] args) {
//        Dada una matriz cuadrada mmm de números enteros de dimensión ddd,  
//        escribe un algoritmo que calcule la suma de:
//
//Los elementos de la diagonal principal (de la esquina superior izquierda a la 
//esquina inferior derecha).
//Los elementos de la diagonal secundaria (de la esquina superior derecha a la 
//esquina inferior izquierda).
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
        
        int diagonalprin = 0;
        int diagonalsecu = 0;
        
        for (int i = 0; i < d; i++) {
                diagonalprin += m[i][i];
                diagonalsecu += m[i][d-1-i];
        }
        System.out.println("dp:"+diagonalprin);
        System.out.println("ds:"+diagonalsecu);
    }

}
