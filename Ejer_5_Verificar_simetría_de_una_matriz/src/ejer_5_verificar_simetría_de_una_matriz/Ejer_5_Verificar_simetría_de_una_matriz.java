
package ejer_5_verificar_simetría_de_una_matriz;

import java.util.Random;
import java.util.Scanner;

public class Ejer_5_Verificar_simetría_de_una_matriz {

    public static void main(String[] args) {
//Escribe un algoritmo que determine si una matriz cuadrada m y m es simétrica 
//(es decir, si m[i][j]=m[j][i] para todos i,j).
        Random rrr = new Random();
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE LA DIMENSION");
        int d = leer.nextInt();
        int m[][] = new int[d][d];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.println("INGRESE EL DATO ["+(i+1)+"]["+(j+1)+"]");
                m[i][j] = leer.nextInt();
            }

        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print("[" + m[i][j] + "]  ");
            }
            System.out.println("");
        }
        
        boolean simetria = true;
        
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                if (m[i][j]!=m[j][i]) {
                    simetria=false;
                }
            }
        }
        
        if (simetria==true) {
            System.out.println("es simetrica");
        }else{
            System.out.println("NO es simetrica");
        }
        
    }
    
}
