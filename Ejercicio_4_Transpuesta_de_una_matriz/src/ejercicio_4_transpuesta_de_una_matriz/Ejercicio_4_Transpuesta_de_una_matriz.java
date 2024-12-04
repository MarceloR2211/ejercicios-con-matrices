
package ejercicio_4_transpuesta_de_una_matriz;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_4_Transpuesta_de_una_matriz {

    public static void main(String[] args) {
//Dada una matriz mmm de n×mn \times mn×m, escribe un algoritmo que genere la 
//matriz transpuesta.
        Random rrr = new Random();
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE LA CANTIDAD DE FILAS");
        int f = leer.nextInt();
        System.out.println("INGRESE LA CANTIDAD DE COLUMNAS");
        int c = leer.nextInt();
        int m[][] = new int[f][c];
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
        
        int transpuesta[][] = new int[c][f];
        
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                transpuesta[j][i]=m[i][j];
            }
        }
        System.out.println("");
        for (int i = 0; i < transpuesta.length; i++) {
            for (int j = 0; j < transpuesta[0].length; j++) {
                System.out.print("[" + transpuesta[i][j] + "]  ");
            }
            System.out.println("");
        }

    }
    
}
