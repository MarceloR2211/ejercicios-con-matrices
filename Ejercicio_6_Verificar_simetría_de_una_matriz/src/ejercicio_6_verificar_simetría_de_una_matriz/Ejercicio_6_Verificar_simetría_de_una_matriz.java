package ejercicio_6_verificar_simetría_de_una_matriz;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_6_Verificar_simetría_de_una_matriz {

    public static void main(String[] args) {
//Escribe un algoritmo que recorra una matriz cuadrada o rectangular M en forma 
//de espiral, comenzando desde la esquina superior izquierda y moviéndose en 
//sentido horario. El algoritmo debe devolver los elementos en el orden en que 
//son visitados.
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
        
        int recorrido[] = new int[(f*c)];
        int axi = 0;
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                recorrido[axi] = m[i][j];
                axi++;
            }
            for (int k = 1; k < m[0].length; k++) {
                recorrido[axi] = m[k][i];
                axi++;
            }
        }
        
        for (int i = 0; i < recorrido.length; i++) {
            System.out.println(recorrido[i]+", ");
        }
   
    }

}
