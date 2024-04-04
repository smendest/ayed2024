# Apuntes de Algoritmos y Estructuras de Datos
Escribir aquí los algoritmos clave para la resolución de las prácticas.

## Indice

- [Variables y métodos *de clase*: La palabra clave `static`](#variables-y-métodos-de-clase-la-palabra-clave-static)
- [Ejecución de un método static (import)](#ejecución-de-un-método-static-import)
- [Arrays - Arreglos](#arrays-arreglos)
  - [Varios pasos](#varios-pasos)
  - [Un paso](#un-paso)
- [Arreglo de objetos](#arreglo-de-objetos)
- [Programa principal](#programa-principal)
- [Sintaxis de clases](#sintaxis-de-clases)
  - [Clase](#clase)
  - [Declaración del estado interno](#declaración-del-estado-interno)
  - [Declaración de comportamiento](#declaración-de-comportamiento)
- [Funcionalidades](#funcionalidades)
  - [Mostrar en pantalla (println)](#mostrar-en-pantalla-println)
  - [Leer de teclado](#leer-de-teclado)
  - [Bucle for](#bucle-for)
- [Listas](#listas)
  - [LinkedList vs. ArrayList](#linkedlist-vs-arraylist)


## Run java program

Correr programa desde la terminal.

Ejemplo: correremos la clase `TestArrayList` del paquete `tp1.ej7`  ubicada en `project/src/tp1/ej7` que utiliza una clase de la misma ubicación llamda `Test`.

```bash
# Nos paramos en project/src
project/src$ javac tp1/ej7/Test.java tp1/ej7/TestArrayList.java   # Compile => Generates .class file

project/src$ java tp1.ej7.TestArrayList   # Run

```

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

### Constructor

```java
public NombreClase (params formales){
	// Inicialización del estado interno
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

## Listas

* API => `java.util`
* `ArrayList` => Lista con nodos enlazados.
* `LinkedList` => Lista con arreglos.

En Java existe un paquete llamado `java.util` que provee varias implementaciones de listas,
las principales son `ArrayList` y `LinkedList`.

Estas listas permiten almacenar datos en memoria de forma similar a los arrays pero de forma
dinámica, es decir, que no es necesario declarar su tamaño, ni este último es fijo tal como pasa con
los arreglos.

*Importar `java.util`:*
```java
importpackage tp1.ej7;

import java.util.*;
```
Importar todo el paquete java.util (de la forma java.util.*) no es menos eficiente que importar cada paquete por separado. Por ejemplo:

```java
java.util.Scanner;
java.util.ArrayList;
java.util.LinkedList;
```

### Métodos de una lista

* `add(e)`: agrega un elemento e en la última posición.
* `add(pos, e)`: agrega un elemento e en la posición e.
* `get(pos)`: recupera el elemento de la posición pos.
* `indexOf`: retorna el índice de la primera ocurrencia de e.
* `remove(pos)`: elimina el elemento de la posición pos.
* `remove(e)`: elimina el elemento e.
* `contains(e)`: retorna true si e está en la lista, false en caso contrario.
* `size()`: Retorna un entero natural que indica cuántos elementos hay en la lista => se usa para el for.

### LinkedList vs. ArrayList
Responde al ejercicio 6 de la práctica 1.

**LinkedList:**
- Los elementos se almacenan en un arreglo dinámico. 
- Permite el acceso aleatorio ya que los arreglos se basan en índices. Eso significa que acceder a cualquier elemento siempre lleva un tiempo constante O(1). 
- Verificar si existe un elemento específico en la lista dada se ejecuta en tiempo lineal O(n). 
- Agregar/Borrar elementos en/de un índice específico, en el peor de los casos, es de O(n).  tamaño de la estructura.
- Esta clase es más útil cuando se conoce que la aplicación requiere manipulación de datos (muchas inserciones y borrados).

**ArrayList:**
* Los elementos se almacenan en una lista doblemente enlazada.
* Eso significa que acceder a cualquier elemento siempre lleva un tiempo lineal O(n).
* Verificar si existe un elemento específico en la lista dada se ejecuta en tiempo lineal O(n).
* Agregar/Borrar elementos en/de en un lugar específico, en el peor de los casos, es de O(n). Suele ser más rápida porque nunca se necesita cambiar el 
* Esta clase es más útil cuando la aplicación requiereacceso a datos y su tamaño no varía demasiado. 

*Conclusión:*

Los principales beneficios de ArrayList y LinkedList es que *LinkedList* tiene un O(1) para operaciones de agregar y eliminar al principio y al final de la lista, mientras que *ArrayList* tiene O(1) para acceder a elementos por su índice.
Una *LinkedList* consume un poco más de memoria que una *ArrayList* ya que cada nodo almacena dos referencias al elemento anterior y al siguiente.

#### Difieren las implementaciones?
The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.

The LinkedList class **has all of the same methods** as the ArrayList class **because they both implement the List interface**. This means that you can add items, change items, remove items and clear the list in the same way.

However, while the ArrayList class and the LinkedList class **|**, they are built very differently.


### Recorrer una lista

**For each**

```java
List<Integer> numList = new LinkedList<Integer>();
...
for (Integer i : numList) {
  System.out.println(i);
}
```

**For**

```java
List<Integer> numList = new LinkedList<Integer>();
...
for (int i = 0; i < numList.size(); i++) {
  System.out.println(numList.get(i));
}
```

**Iterator**

[w3school - iterator](https://www.w3schools.com/java/java_iterator.asp)

### Métodos para copiar colecciones

Existen varias alternativas para copiar una estructura en otra. También podemos decir clonar en el sentido de
que las dos estructuras, luego de la copia, tendrán los mismos datos.
Supongamos que tenemos este objeto ArrayList con nombres de Peliculas:
```java
ArrayList<String> peliculas = new ArrayList<String>();
peliculas.add("Dias Perfectos");
peliculas.add("Anatomia de una caida");
peliculas.add("Los que se quedan");
```
1. Crear, mediante su constructor, un nuevo ArrayList pasando la lista original como argumento al constructor.
```java
ArrayList<String> peliculas_copiadas1 = new ArrayList<String>(peliculas);
```
2. Crear un nuevo ArrayList y agregar todos los elementos del original usando el método addAll().
```java
ArrayList<String> peliculas_copiadas2 = new ArrayList<>();
peliculas_copiadas2.addAll(peliculas);
```
3. Clonar el ArrayList usando el método clone()
```java
ArrayList<String> peliculas_clonadas = (ArrayList<String>)peliculas.clone();
```

El uso del `clone()` no se recomienda ya que se debe castear.

**¿No se puede hacer una copia directa?**
```java
ArrayList<String> peliculas2 = peliculas;
```