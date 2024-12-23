# Suma de la Diagonal Principal y Secundaria

```java
package ejer_1_suma_de_la_diagonal_principal_y_secundaria;

import java.util.Random;
import java.util.Scanner;

public class Ejer_1_Suma_de_la_diagonal_principal_y_secundaria {

    public static void main(String[] args) {
//Inicialización de Variables
        Random rrr = new Random();
        Scanner leer = new Scanner(System.in);
//Generación de la Matriz
        System.out.println("INGRESE LA DIMENSION");
        int d = leer.nextInt();
        int m[][] = new int[d][d];
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
        int diagonalprin = 0;
        int diagonalsecu = 0;
// Cálculo de las Diagonales
        for (int i = 0; i < d; i++) {
                diagonalprin += m[i][i];
                diagonalsecu += m[i][d-1-i];
        }
//Impresión de Resultados
        System.out.println("dp:"+diagonalprin);
        System.out.println("ds:"+diagonalsecu);
    }
}
```

## Descripción General

Este programa genera una matriz cuadrada de tamaño `d x d` con valores aleatorios entre 0 y 100. Luego, calcula y muestra la suma de los elementos en las dos diagonales principales de la matriz:
- **Diagonal Principal (DP)**: Compuesta por los elementos `m[i][i]` (de la esquina superior izquierda a la inferior derecha).
- **Diagonal Secundaria (DS)**: Compuesta por los elementos `m[i][d-1-i]` (de la esquina superior derecha a la inferior izquierda).

## Funcionamiento del Código

### 1. **Inicialización de Variables**
   - Se utiliza la clase `Random` para generar valores aleatorios.
   - Se emplea la clase `Scanner` para leer la dimensión de la matriz desde la entrada del usuario.
   - Se declara la matriz `m` de tamaño `d x d`.

### 2. **Generación de la Matriz**
   - Se utiliza un ciclo anidado `for` para llenar la matriz con valores aleatorios entre 0 y 100 mediante `rrr.nextInt(101)`.

### 3. **Impresión de la Matriz**
   - La matriz se imprime fila por fila, con cada elemento rodeado de corchetes (`[ ]`).

### 4. **Cálculo de las Diagonales**
   - Se inicializan las variables `diagonalprin` y `diagonalsecu` en 0.
   - Un solo ciclo `for` recorre las diagonales:
     - **Diagonal Principal**: Se suma el valor de `m[i][i]` para cada fila.
     - **Diagonal Secundaria**: Se suma el valor de `m[i][d-1-i]` para cada fila.

### 5. **Impresión de Resultados**
   - Se imprimen las sumas de la diagonal principal y secundaria.

## Complejidad del Algoritmo

### Complejidad en Tiempo

1. **Generación de la matriz**: El ciclo anidado para llenar la matriz tiene una complejidad de **O(d²)**, ya que recorre todos los elementos de la matriz.

2. **Impresión de la matriz**: La impresión también tiene complejidad **O(d²)**, ya que recorre nuevamente todos los elementos.

3. **Cálculo de las diagonales**: El ciclo que recorre las diagonales tiene una complejidad de **O(d)**, ya que solo recorre `d` elementos.

En total, la complejidad en tiempo es **O(d²)** debido a la generación e impresión de la matriz.

### Complejidad en Espacio

1. **Matriz de dimensión `d x d`**: La matriz ocupa **O(d²)** de espacio.

2. **Variables auxiliares**: Las variables `diagonalprin` y `diagonalsecu` utilizan espacio constante **O(1)**.

Por lo tanto, la complejidad en espacio es **O(d²)** debido al almacenamiento de la matriz.

## Conclusión

Este programa genera una matriz aleatoria y calcula las sumas de sus diagonales principales y secundarias. Es eficiente para el tamaño de la matriz utilizado y tiene una complejidad principal de **O(d²)** en tiempo y espacio.
