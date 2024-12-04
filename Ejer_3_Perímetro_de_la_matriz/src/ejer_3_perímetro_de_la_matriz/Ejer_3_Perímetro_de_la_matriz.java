
package ejer_3_perímetro_de_la_matriz;

import java.util.Random;
import java.util.Scanner;

public class Ejer_3_Perímetro_de_la_matriz {

    public static void main(String[] args) {
//Dada una matriz mmm de números enteros y dimensión ddd, escribe un algoritmo 
//que calcule la suma de los elementos en el "perímetro" de la matriz (es decir, 
//los elementos que están en los bordes). Por ejemplo:
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
        
        int perimetro=0;
        
        for (int i = 0; i < d; i++) {
            perimetro+=m[0][i];
            perimetro+=m[i][0];
            perimetro+=m[d-1][i];
            perimetro+=m[i][d-1];
        }
        perimetro-=m[0][0];
        perimetro-=m[d-1][d-1];
        perimetro-=m[0][d-1];
        perimetro-=m[d-1][0];

        System.out.println("el perimetro es de " + perimetro );
    }
    
}
