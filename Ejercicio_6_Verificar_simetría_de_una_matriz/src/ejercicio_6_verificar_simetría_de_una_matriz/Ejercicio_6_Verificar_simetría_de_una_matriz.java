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
        
         //esto crea la matris
        int arriba = 0;
        int abajo = f - 1;
        int izquierda = 0;
        int derecha = c - 1;
        //esto son las lineas
        int a = 0;
        int recorrido[] = new int[f*c];
    while (arriba <= abajo && izquierda <= derecha) {
           
            for (int i = izquierda; i <= derecha; i++) {
            recorrido[a] = m[arriba][i]; 
            a++;    
            }
            arriba++;

     
            for (int i = arriba; i <= abajo; i++) {
            recorrido[a] = m[i][derecha];    
            a++;       
            }
            derecha--; 

 
            if (arriba <= abajo) {
            
            for (int i = derecha; i >= izquierda; i--) {
            recorrido[a] = m[abajo][i];  
            a++;      
            }
            abajo--; 
            }

            if (izquierda <= derecha) {
              
            for (int i = abajo; i >= arriba; i--) {
            recorrido[a] = m[i][izquierda];      
            a++;      
            }
            izquierda++;   
    }   
    
    }
        
        for (int i = 0; i < recorrido.length; i++) {
            System.out.println(recorrido[i]+", ");
        }
   
    }

}
