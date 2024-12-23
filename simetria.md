# Verificar Simetría de una Matriz Cuadrada

```java
package ejer_5_verificar_simetría_de_una_matriz;
import java.util.Random;
import java.util.Scanner;
public class Ejer_5_Verificar_simetría_de_una_matriz {

    public static void main(String[] args) {
//Inicialización de Variables
        Random rrr = new Random();
        Scanner leer = new Scanner(System.in);
//Ingreso de Datos
        System.out.println("INGRESE LA DIMENSION");
        int d = leer.nextInt();
        int m[][] = new int[d][d];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.println("INGRESE EL DATO ["+(i+1)+"]["+(j+1)+"]");
                m[i][j] = leer.nextInt();
            }
        }
//Impresión de la Matriz
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print("[" + m[i][j] + "]  ");
            }
            System.out.println("");
        }
//Verificación de Simetría
        boolean simetria = true;
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                if (m[i][j]!=m[j][i]) {
                    simetria=false;
                }
            }
        }
//Salida del Resultado
        if (simetria==true) {
            System.out.println("es simetrica");
        }else{
            System.out.println("NO es simetrica");
        }  
    }
}
```

## Descripción General

Este programa verifica si una matriz cuadrada de tamaño `d x d` es **simétrica**. Una matriz es simétrica si cumple la condición `m[i][j] == m[j][i]` para todos los índices `i` y `j`.

## Funcionamiento del Código

### 1. **Inicialización de Variables**
   - Se utiliza la clase `Scanner` para leer la dimensión `d` de la matriz cuadrada desde la entrada del usuario.
   - Se declara una matriz `m` de tamaño `d x d` para almacenar los valores ingresados por el usuario.

### 2. **Ingreso de Datos**
   - Un ciclo anidado solicita al usuario que ingrese manualmente los elementos de la matriz, indicando explícitamente la posición `[i+1][j+1]` para mayor claridad.

### 3. **Impresión de la Matriz**
   - La matriz `m` se imprime fila por fila, mostrando cada elemento rodeado de corchetes (`[ ]`).

### 4. **Verificación de Simetría**
   - Se inicializa una variable booleana `simetria` con el valor `true`.
   - Un ciclo anidado recorre cada elemento de la matriz. Si para algún par de índices `i` y `j` no se cumple `m[i][j] == m[j][i]`, se establece `simetria = false`.

### 5. **Salida del Resultado**
   - Si la matriz es simétrica, se imprime `es simétrica`. De lo contrario, se imprime `NO es simétrica`.

## Complejidad del Algoritmo

### Complejidad Temporal
- **Generación e impresión de la matriz:** \( O(d^2) \).
- **Verificación de simetría:** \( O(d^2) \).
- **Total:** \( O(d^2) \).

### Complejidad Espacial
- **Espacio para la matriz `m`:** \( O(d^2) \).
- **Variables auxiliares:** \( O(1) \).
- **Total:** \( O(d^2) \).

## Conclusión
Este programa es eficiente para matrices pequeñas y medianas. Para matrices muy grandes, la complejidad espacial puede convertirse en un factor limitante.
