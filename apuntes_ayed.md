# Apuntes de Algoritmos y Estructuras de Datos
Escribir aquí los algoritmos clave para la resolución de las prácticas.

## Variables y métodos de clase: La palabra clave `static`

La palabra clave *static* declara atributos (variables) y métodos asociados con la clase en lugar de
asociados a cada una de las instancias de la clase.

Las variables de clase son compartidas por todas las instancias de la clase. En el caso de los métodos de clase se utilizan cuando se necesita algún comportamiento que **no depende de una instancia particular**. 

En ambos casos se debe anteponer la palabra clave static al tipo de dato de la variable o de retorno del método.

* No es necesario crear instancias para acceder a estos métodos y variables.
    Ejemplo:
    ```java
    // La clase Math

    Math.PI;      // Variable de clase
    Math.sen(9);  // Método de clase
    ```
* En el caso de las variables y métodos de instancia, estas dependen del objeto o instancia particular.
* Desde un método de instancia no se puede acceder a mét o vars de instancia.

## Ejecución de un método static (import)

Ejemplo:
```java
// App.java
import bin.tp1.ej1.Ejercicio1;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Ejercicio1.showNumbersFor(0, 0);
    }
}
```

```java
// Clase
package bin.tp1.ej1;

public class Ejercicio1 {
  public static void showNumbersFor(int a, int b) {
    System.out.println("a" + a);
    System.out.println("B" + b);
  }
}

```

## Sintaxis de clases

## Programa principal
```java
public class MiPrimeraAplicacion{
  // @param args the command line arguments
  public static void main(String[] args){
  // TODO code application logic here
  }
}
```

### Clase
Sintaxis:
```java
@Override// Asegurarse que no haya problemas (se verá más adelante)
public class NombreDeClase {
  /*Declaración del **estad** del objeto*/
  /*Declaración del **contructor/es***/
  /*Declaración de métodos que implementan acciones*/
}
```

### Declaración del estado interno
```java
public class Libro {
  /*Declaración de estado*/
  private String titulo;
  private int anioEdicion;
  private double precio;
  private String ISBN = 1111; /*Inicializada explícitamente*/
}
```

### Declaración de comportamiento

```java
public TipoRetorno nombreMetodo (lista de params formales) {
  // Declaración de variables locales al método.
  // Cuerpo del método.
  return valor; // Si no está declarado como void.
}
```

## Funcionalidades

## Mostrar en pantalla, log, print
Ejemplo:
```java
  System.out.println("imprimir");
  System.out.println("a"+ a);

```