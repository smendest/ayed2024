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