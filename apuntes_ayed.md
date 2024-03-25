# Apuntes de Algoritmos y Estructuras de Datos
Escribir aquí los algoritmos clave para la resolución de las prácticas.

## Variables y métodos *de clase*: La palabra clave `static`

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

## Arrays - Arreglos
Declaración e inicialización.

### Varios pasos

```java
int[] intArray;     // sólo declara
intArray = new int[5];    //crea el declarado arriba
double montos[]=new double[12];     //declara y crea
String[] items=new String[4];     //declara y crea
```
Inicialización elemento por elemento:
```java
for (int i=0;i<4;i++){
  items[i] = "item"+i;
}
```
### Un paso

```java
int[] intArray = {6, 3, 2, 4, 9};
Cliente[] cliArray = {new Cliente(), new Cliente(), new Cliente()};
String[] items = { "item1", "item2", "item3", "item4"};
```

## Arreglo de objetos

Ejemplo:
```java
// Creamos el arreglo
Persona[] personas = new Persona[5];
// Agregar personas al arreglo
personas[0] = new Persona("Juan", 25);
personas[1] = new Persona("María", 30);
personas[2] = new Persona("Pedro", 40);
personas[3] = new Persona("Luisa", 35);
personas[4] = new Persona("Ana", 20);
```

## Programa principal
```java
public class MiPrimeraAplicacion{
  // @param args the command line arguments
  public static void main(String[] args){
  // TODO code application logic here
  }
}
```
## Sintaxis de clases

### Clase
Sintaxis:
```java
package tp1.ej2;    // Package al que pertenece el archivo de la clase.
@Override// Asegurarse que no haya problemas (se verá más adelante)
public class NombreDeClase {
  /*Declaración del **estad** del objeto*/
  /*Declaración del **contructor/es***/
  /*Declaración de métodos que implementan acciones*/
}
```
Cada clase debe alojarse en un archivo propio.

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

### Mostrar en pantalla (println)
Ejemplo:
```java
  System.out.println("imprimir");
  System.out.println("a"+ a);

```

### Leer de teclado
* `java.util.Scanner`
    - A simple text scanner which can parse primitive types and strings using regular expressions.
    - A Scanner breaks its input into tokens using a delimiter pattern, which by default matches whitespace. The resulting tokens may then be converted into values of different types using the various next methods.
* `System.in`
    - es un objeto de flujo de entrada estándar que está asociado con la entrada estándar del sistema.
    - es la fuente de entrada para el objeto Scanner.

    
```java
import java.util.Scanner;
...
Scanner consola = new Scanner(System.in);   // Create a Scanner object
int num = consola.nextInt();                // Save the value as an Integer

```


### Bucle for
```java
for (int i=1; i<=10; i++){
}
```