# Cálculo del Perímetro de una Matriz

```java
package ejer_3_perímetro_de_la_matriz;
import java.util.Random;
import java.util.Scanner;
public class Ejer_3_Perímetro_de_la_matriz {

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
        int perimetro=0;
//Cálculo del Perímetro
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
//Cálculo del Perímetro
        System.out.println("el perimetro es de " + perimetro );
    }
}
```

## Descripción General

Este programa genera una matriz cuadrada de tamaño `d x d` con valores aleatorios entre 0 y 100. Luego, calcula la suma de los elementos que forman el **perímetro** de la matriz, evitando sumar los elementos de las esquinas más de una vez.

## Funcionamiento del Código

### 1. **Inicialización de Variables**
   - Se utiliza la clase `Random` para generar valores aleatorios.
   - Se emplea la clase `Scanner` para leer la dimensión de la matriz desde la entrada del usuario.
   - Se declara la matriz `m` de tamaño `d x d` para almacenar los valores originales.

### 2. **Generación de la Matriz**
   - Se llena la matriz `m` con valores aleatorios entre 0 y 100 mediante un ciclo anidado `for`.

### 3. **Impresión de la Matriz**
   - Se imprime la matriz fila por fila, con cada elemento rodeado de corchetes (`[ ]`).

### 4. **Cálculo del Perímetro**
   - Se inicializa una variable `perimetro` en 0.
   - Se recorren los bordes de la matriz:
     - **Primera fila** (`m[0][i]`).
     - **Primera columna** (`m[i][0]`).
     - **Última fila** (`m[d-1][i]`).
     - **Última columna** (`m[i][d-1]`).
   - Para evitar duplicar las esquinas (que están incluidas en múltiples bordes), se restan las siguientes posiciones:
     - `m[0][0]`: esquina superior izquierda.
     - `m[d-1][d-1]`: esquina inferior derecha.
     - `m[0][d-1]`: esquina superior derecha.
     - `m[d-1][0]`: esquina inferior izquierda.

### 5. **Impresión del Perímetro**
   - Se imprime el resultado del cálculo del perimetro.

## Complejidad del Algoritmo

### Complejidad en Tiempo

1. **Generación de la matriz**: Un ciclo anidado para llenar la matriz tiene una complejidad de **O(d²)**.
2. **Impresión de la matriz**: Otro ciclo anidado recorre la matriz para imprimirla, con complejidad **O(d²)**.
3. **Cálculo del perímetro**: Se recorren los bordes de la matriz, lo cual tiene una complejidad de **O(d)** para cada lado (4 lados en total), lo que resulta en **O(d)**.
4. **Impresión del perímetro**: Complejidad constante **O(1)**.

En total, la complejidad en tiempo es **O(d²)**, dominada por la generación e impresión de la matriz.

### Complejidad en Espacio

1. **Matriz original**: La matriz ocupa **O(d²)** de espacio.
2. **Variables auxiliares**: Solo se utiliza la variable `perimetro` y algunas constantes, lo que requiere **O(1)**.

Por lo tanto, la complejidad en espacio es **O(d²)** debido a la matriz.

## Conclusión

Este programa genera una matriz cuadrada y calcula la suma de los elementos que forman el perímetro, evitando duplicar las esquinas. Su complejidad principal es **O(d²)** tanto en tiempo como en espacio.
