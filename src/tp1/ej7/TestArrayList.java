package tp1.ej7;
/*
 * Escriba una clase llamada TestArrayList cuyo método main recibe una secuencia
 * de
 * números, los agrega a una lista de tipo ArrayList, y luego de haber agregado
 * todos los
 * números a la lista, imprime el contenido de la misma iterando sobre cada
 * elemento.
 */

import java.util.*;

public class TestArrayList {

  public static void main(String[] args) {
    Scanner consola = new Scanner(System.in); // Create a Scanner object
    boolean next = true;
    int num;
    List<Integer> numList = new ArrayList<Integer>();

    while (next) {
      System.out.println("Ingrese un número entero: ");
      num = consola.nextInt(); // Save the value as an Integer

      numList.add(num);

      System.out.println("¿Desea ingresar otro número? true/false");
      next = consola.nextBoolean();
    }

    for (int i = 0; i < numList.size(); i++) {
      System.out.println(numList.get(i));
    }
  }

}
