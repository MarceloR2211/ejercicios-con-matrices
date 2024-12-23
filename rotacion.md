# Rotación de una Matriz 90 Grados

```java
package ejer_2_rotación_de_una_matriz_90;
import java.util.Random;
import java.util.Scanner;
public class Ejer_2_Rotación_de_una_matriz_90 {

    public static void main(String[] args) {
//Inicialización de Variables
        Random rrr = new Random();
        Scanner leer = new Scanner(System.in);
//Generación de la Matriz Original
        System.out.println("INGRESE LA DIMENSION");
        int d = leer.nextInt();
        int m[][] = new int[d][d];
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
//Rotación de la Matriz
        int axi[][] = new int[d][d];
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                axi[i][j]=m[d-1-j][i];
            }
        }
//Impresión de la Matriz Rotada
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print("[" + axi[i][j] + "]  ");
            }
            System.out.println("");
        }
    }
}
```

## Descripción General

Este programa genera una matriz cuadrada de tamaño `d x d` con valores aleatorios entre 0 y 100. Posteriormente, rota la matriz 90 grados en sentido horario y muestra tanto la matriz original como la rotada.

## Funcionamiento del Código

### 1. **Inicialización de Variables**
   - Se utiliza la clase `Random` para generar valores aleatorios.
   - Se emplea la clase `Scanner` para leer la dimensión de la matriz desde la entrada del usuario.
   - Se declara la matriz `m` de tamaño `d x d` para almacenar los valores originales.

### 2. **Generación de la Matriz Original**
   - Un ciclo anidado `for` llena la matriz `m` con valores aleatorios entre 0 y 100 usando `rrr.nextInt(101)`.

### 3. **Impresión de la Matriz Original**
   - Se utiliza un ciclo anidado para recorrer e imprimir la matriz original con cada elemento rodeado de corchetes (`[ ]`).

### 4. **Rotación de la Matriz**
   - Se declara una nueva matriz `axi` del mismo tamaño (`d x d`) para almacenar la matriz rotada.
   - Mediante un ciclo anidado, cada elemento de la matriz original `m` se coloca en su nueva posición en `axi` de acuerdo con la lógica de rotación:
     - El elemento en la posición `(i, j)` de la matriz original se mueve a la posición `(j, d-1-i)` de la matriz rotada.

### 5. **Impresión de la Matriz Rotada**
   - Un ciclo anidado recorre e imprime la matriz rotada `axi`.

## Complejidad del Algoritmo

### Complejidad en Tiempo

1. **Generación de la matriz original**: Un ciclo anidado recorre toda la matriz para llenarla con valores aleatorios, lo que tiene una complejidad de **O(d²)**.

2. **Impresión de la matriz original**: Otro ciclo anidado recorre toda la matriz para imprimirla, con complejidad **O(d²)**.

3. **Rotación de la matriz**: Un ciclo anidado recorre todos los elementos de la matriz para calcular sus nuevas posiciones, con una complejidad de **O(d²)**.

4. **Impresión de la matriz rotada**: Nuevamente, se recorre toda la matriz rotada para imprimirla, con una complejidad de **O(d²)**.

En total, la complejidad en tiempo es **O(d²)**, ya que los pasos dominantes son las operaciones sobre la matriz.

### Complejidad en Espacio

1. **Matriz original**: Se utiliza espacio **O(d²)** para almacenar la matriz original.

2. **Matriz rotada**: Se utiliza espacio adicional **O(d²)** para almacenar la matriz rotada.

3. **Variables auxiliares**: Solo se utilizan variables de espacio constante **O(1)**.

En total, la complejidad en espacio es **O(d²)** debido a las dos matrices almacenadas.

## Conclusión

Este programa genera una matriz aleatoria y realiza una rotación de 90 grados en sentido horario. Es eficiente para el tamaño de matriz utilizado y su complejidad principal es **O(d²)** en tiempo y espacio.
