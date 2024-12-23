# Transposición de una Matriz

```java
package ejercicio_4_transpuesta_de_una_matriz;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio_4_Transpuesta_de_una_matriz {

    public static void main(String[] args) {
//Inicialización de Variables
        Random rrr = new Random();
        Scanner leer = new Scanner(System.in);
//Generación de la Matriz
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
//Impresión de la Matriz Original
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print("[" + m[i][j] + "]  ");
            }
            System.out.println("");
        }
        int transpuesta[][] = new int[c][f];
//Cálculo de la Transpuesta
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                transpuesta[j][i]=m[i][j];
            }
        }
        System.out.println("");
//Impresión de la Matriz Transpuesta
        for (int i = 0; i < transpuesta.length; i++) {
            for (int j = 0; j < transpuesta[0].length; j++) {
                System.out.print("[" + transpuesta[i][j] + "]  ");
            }
            System.out.println("");
        }
    }
}
```

## Descripción General

Este programa genera una matriz de tamaño `f x c` con valores aleatorios entre 0 y 100. Luego, calcula y muestra la **matriz transpuesta**, donde las filas de la matriz original pasan a ser las columnas de la nueva matriz.

## Funcionamiento del Código

### 1. **Inicialización de Variables**
   - Se utiliza la clase `Random` para generar valores aleatorios.
   - Se emplea la clase `Scanner` para leer las dimensiones de la matriz (`f` filas y `c` columnas) desde la entrada del usuario.
   - Se declara la matriz `m` de tamaño `f x c` para almacenar los valores originales.

### 2. **Generación de la Matriz**
   - Se llena la matriz `m` con valores aleatorios entre 0 y 100 mediante un ciclo anidado `for`.

### 3. **Impresión de la Matriz Original**
   - Se imprime la matriz fila por fila, con cada elemento rodeado de corchetes (`[ ]`).

### 4. **Cálculo de la Transpuesta**
   - Se declara una nueva matriz `transpuesta` de tamaño `c x f` (intercambiando filas por columnas).
   - Un ciclo anidado copia los valores de la matriz original `m` a la matriz `transpuesta` siguiendo la regla:
     ```
     transpuesta[j][i] = m[i][j]
     ```
     Esto asigna a cada posición `[i][j]` de la matriz original a la posición `[j][i]` en la matriz transpuesta.

### 5. **Impresión de la Matriz Transpuesta**
   - Se imprime la matriz `transpuesta` fila por fila.

## Complejidad del Algoritmo

### Complejidad en Tiempo

1. **Generación de la matriz original**: Un ciclo anidado para llenar la matriz tiene una complejidad de **O(f × c)**.
2. **Impresión de la matriz original**: Otro ciclo anidado con complejidad **O(f × c)**.
3. **Cálculo de la transpuesta**: Otro ciclo anidado que recorre cada elemento de la matriz original con complejidad **O(f × c)**.
4. **Impresión de la matriz transpuesta**: Complejidad **O(c × f)** (equivalente a la original en términos del producto total).

En total, la complejidad en tiempo es **O(f × c)**.

### Complejidad en Espacio

1. **Matriz original**: Ocupa **O(f × c)** de espacio.
2. **Matriz transpuesta**: Ocupa **O(c × f)** de espacio.
3. **Variables auxiliares**: Solo se utiliza una constante cantidad de espacio adicional.

Por lo tanto, la complejidad en espacio es **O(f × c)**.

## Conclusión

Este programa calcula eficientemente la matriz transpuesta de una matriz rectangular de tamaño `f x c`. La complejidad del algoritmo es **O(f × c)** tanto en tiempo como en espacio, siendo adecuada para trabajar con matrices de tamaños moderados.

