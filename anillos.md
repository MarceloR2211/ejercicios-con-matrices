# suma de anillos

```java

import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
//Inicialización de Variables
        Random rrr = new Random();
        Scanner leer = new Scanner(System.in);
//Lectura de la Dimensión de la Matriz
        System.out.println("INGRESE LA DIMENSION");
        int d = leer.nextInt();
        int m[][] = new int[d][d];
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
        int suma = 0;
//Lectura del Anillo a Sumar
        System.out.println("INGRESE ANILLO A SUMAR");
        int k = leer.nextInt();
        int axi1 = k - 1;
        int axi2 = d - k;
//Cálculo de la Suma del Anillo
        for (int i = k - 1; i <= d - k; i++) {
            suma += m[axi1][i];
            suma += m[axi2][i];
            suma += m[i][axi1];
            suma += m[i][axi2];
        }
        suma -= m[axi1][axi1];
        suma -= m[axi1][axi2];
        suma -= m[axi2][axi1];
        suma -= m[axi2][axi2];
//Caso Especial para Matrices Impares
        if (d % 2 != 0 && k == (d / 2) + 1) {
            int centro = d / 2;
            suma = m[centro][centro];
        }
//Impresión del Resultado
        System.out.println("la suma del anillo " + k + " es de " + suma);
    }
}
```

## Descripción General

El código genera una matriz cuadrada de tamaño `d x d` con valores aleatorios entre 0 y 100. Luego, permite al usuario ingresar un número de "anillo" (`k`), y calcula la suma de los elementos que forman dicho anillo en la matriz. Un anillo en la matriz es el conjunto de valores que se encuentran en una franja del borde de la matriz, donde `k` indica qué franja se debe sumar.

## Funcionamiento del Código

1. **Inicialización de Variables**
   - Se crea un objeto `Random` para generar números aleatorios (`rrr`).
   - Se crea un objeto `Scanner` (`leer`) para leer la entrada del usuario.

2. **Lectura de la Dimensión de la Matriz**
   - El programa solicita al usuario que ingrese la dimensión de la matriz cuadrada (`d`).
   - Se declara la matriz `m` de tipo `int` con dimensión `d x d`.

3. **Generación de la Matriz**
   - Se utiliza un ciclo anidado `for` para llenar la matriz `m` con valores aleatorios entre 0 y 100 (inclusive).
   - Cada elemento de la matriz se genera mediante `rrr.nextInt(101)`.

4. **Impresión de la Matriz**
   - El programa imprime la matriz generada en consola, con los valores rodeados de corchetes (`[ ]`) para facilitar su visualización.

5. **Lectura del Anillo a Sumar**
   - El programa solicita al usuario que ingrese el número del "anillo" (`k`) que desea sumar.
   - Se calcula el índice de los bordes del anillo a sumar, donde:
     - `axi1 = k - 1` es el índice inicial de la franja.
     - `axi2 = d - k` es el índice final de la franja.

6. **Cálculo de la Suma del Anillo**
   - Se inicializa la variable `suma` en 0.
   - Se recorren las filas y las columnas de la matriz correspondientes al anillo `k`, sumando los valores de la franja.
     - Se suman los valores de las filas `axi1` y `axi2`, y las columnas `axi1` y `axi2`.
   - Se restan los valores que se han contado dos veces (los cuatro valores de las esquinas del anillo).

7. **Caso Especial para Matrices Impares**
   - Si la dimensión de la matriz es impar y el anillo seleccionado es el central (cuando `k == (d / 2) + 1`), se asigna a `suma` el valor de la celda central de la matriz.

8. **Impresión del Resultado**
   - El programa imprime la suma de los elementos del anillo `k`.


## Complejidad del Algoritmo

### Complejidad en Tiempo

1. **Generación de la matriz**: El ciclo para llenar la matriz tiene una complejidad de **O(d^2)**, ya que se recorre toda la matriz de tamaño `d x d`.
   
2. **Impresión de la matriz**: Similar a la generación, imprimir la matriz también tiene una complejidad de **O(d^2)**, debido a que se recorre toda la matriz.

3. **Cálculo de la suma del anillo**: El ciclo que recorre las filas y columnas del anillo tiene una complejidad de **O(d)**, ya que solo se recorre la franja correspondiente al anillo.

4. **Restar las esquinas del anillo**: Las restas de las esquinas se realizan en tiempo constante **O(1)**.

En total, la complejidad en tiempo es **O(d^2)**, ya que es el paso dominante (debido a la generación y la impresión de la matriz).

### Complejidad en Espacio

1. **Matriz de dimensión `d x d`**: Se crea una matriz de tamaño `d x d`, lo que requiere **O(d^2)** espacio.
   
2. **Otras variables**: Las demás variables (`suma`, `k`, `axi1`, `axi2`) requieren solo un espacio constante **O(1)**.

Por lo tanto, la complejidad en espacio es **O(d^2)** debido al almacenamiento de la matriz.

## Conclusión

Este programa genera una matriz aleatoria, permite seleccionar un "anillo" de la matriz y calcula la suma de sus elementos. La complejidad en tiempo y espacio es **O(d^2)** debido a las operaciones sobre la matriz.
