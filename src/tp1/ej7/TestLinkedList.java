package tp1.ej7;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestLinkedList {
  public static void main(String[] args) {
    Scanner consola = new Scanner(System.in); // Create a Scanner object
    int num = 0;
    List<Integer> numList = new LinkedList<Integer>();

    while (num != 9999) {
      System.out.println("Ingrese un número entero: ");
      num = consola.nextInt(); // Save the value as an Integer

      numList.add(num);

    }
    // Remove the 9999 value:
    numList.remove(numList.size() - 1);

    /* RECORRIDOS: */

    /* for */
    // for (int i = 0; i < numList.size(); i++) {
    // System.out.println(numList.get(i));
    // }

    /* for each */
    // System.out.println("For each: ");
    // for (Integer i : numList) {
    // System.out.println(i);
    // }

    /* Iterator */
    Iterator<Integer> it = numList.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
