# Recorrido en Espiral de una Matriz

```java
package ejercicio_6_verificar_simetría_de_una_matriz;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_6_Verificar_simetría_de_una_matriz {

    public static void main(String[] args) {
        Random rrr = new Random();
        Scanner leer = new Scanner(System.in);
//Inicialización de Variables
        System.out.println("INGRESE LA CANTIDAD DE FILAS");
        int f = leer.nextInt();
        System.out.println("INGRESE LA CANTIDAD DE COLUMNAS");
        int c = leer.nextInt();
        int m[][] = new int[f][c];
//Generación de la Matriz
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = rrr.nextInt(101);
            }

        }
//Impresión de la Matriz
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print("[" + m[i][j] + "]  ");
            }
            System.out.println("");
        }

        int arriba = 0;
        int abajo = f - 1;
        int izquierda = 0;
        int derecha = c - 1;
        //esto son las lineas
        int a = 0;
        int recorrido[] = new int[f*c];
//Recorrido en Espiral
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
//Impresión del Recorrido
        for (int i = 0; i < recorrido.length; i++) {
            System.out.println(recorrido[i]+", ");
        }
    }
}
```

## Descripción General

Este programa genera una matriz de tamaño `f x c` (donde `f` es el número de filas y `c` el de columnas) con valores aleatorios entre 0 y 100. Posteriormente, realiza un recorrido en **forma de espiral** desde la esquina superior izquierda, en sentido horario, y almacena los elementos en un arreglo unidimensional.

## Funcionamiento del Código

### 1. **Inicialización de Variables**
   - Se usa la clase `Random` para generar números aleatorios.
   - Se emplea la clase `Scanner` para leer las dimensiones de la matriz `f` (filas) y `c` (columnas).
   - Se crea una matriz `m` de tamaño `f x c` para almacenar los valores generados.

### 2. **Generación de la Matriz**
   - La matriz se llena con valores aleatorios mediante un doble bucle `for`.

### 3. **Impresión de la Matriz**
   - Se imprime la matriz, mostrando cada fila con los valores generados.

### 4. **Recorrido en Espiral**
   - Se definen las variables de control para los límites del recorrido:
     - `arriba` y `abajo`: representan las filas superior e inferior que delimitan el recorrido.
     - `izquierda` y `derecha`: representan las columnas izquierda y derecha que delimitan el recorrido.
   - Se define un arreglo unidimensional `recorrido` para almacenar los elementos en el orden en que son visitados.

   #### Lógica del Recorrido
   - **1. Recorrer de izquierda a derecha**:
     - Desde la posición `m[arriba][izquierda]` hasta `m[arriba][derecha]`.
     - Incrementa el límite superior (`arriba++`).

   - **2. Recorrer de arriba a abajo**:
     - Desde la posición `m[arriba][derecha]` hasta `m[abajo][derecha]`.
     - Decrementa el límite derecho (`derecha--`).

   - **3. Recorrer de derecha a izquierda (si es válido)**:
     - Desde la posición `m[abajo][derecha]` hasta `m[abajo][izquierda]`.
     - Decrementa el límite inferior (`abajo--`).

   - **4. Recorrer de abajo a arriba (si es válido)**:
     - Desde la posición `m[abajo][izquierda]` hasta `m[arriba][izquierda]`.
     - Incrementa el límite izquierdo (`izquierda++`).

   - El proceso se repite mientras los límites de las filas y columnas no se crucen.

### 5. **Impresión del Recorrido**
   - Se imprime el arreglo `recorrido` con los elementos en el orden en que fueron visitados.

## Complejidad del Algoritmo

### Complejidad en Tiempo
1. **Generación de la matriz**: Requiere recorrer todos los elementos, con complejidad **O(f × c)**.
2. **Impresión de la matriz**: Recorre todos los elementos, con complejidad **O(f × c)**.
3. **Recorrido en espiral**:
   - Se recorren todos los elementos exactamente una vez, lo que resulta en **O(f × c)**.
4. **Impresión del recorrido**: Tiene una complejidad **O(f × c)**.

En total, la complejidad en tiempo es **O(f × c)**.

### Complejidad en Espacio
1. **Matriz original (`m`)**: Ocupa **O(f × c)**.
2. **Arreglo `recorrido`**: Ocupa **O(f × c)**.
3. **Variables auxiliares**: Utiliza variables escalares (`arriba`, `abajo`, `izquierda`, `derecha`, `a`) y constantes, que tienen una complejidad **O(1)**.

En total, la complejidad en espacio es **O(f × c)**.

## Conclusión

Este programa realiza un recorrido en espiral de una matriz, devolviendo los elementos en el orden visitado. La complejidad principal, tanto en tiempo como en espacio, es **O(f × c)**, siendo eficiente para matrices de tamaño moderado.

