package tp1.ej2;

import java.util.Scanner;

public class Ejercicio2 {
  // Escriba un método de clase que dado un número n devuelva un nuevo arreglo de
  // tamaño n
  // con los n primeros múltiplos enteros de n mayores o iguales que 1.
  // Ejemplo: f(5) = [5; 10; 15; 20; 25]; f(k) = {n*k donde k : 1..k}

  public static int[] multiplos() {
    System.out.println("Ingrese un número entero: ");
    Scanner consola = new Scanner(System.in);
    int n = consola.nextInt();
    int[] numbArr = new int[n];

    for (int i = 1; i <= n; i++) {
      numbArr[i - 1] = n * i;
    }
    mostrarArr(numbArr, n);

    return numbArr;
  }

  public static void mostrarArr(int[] arr, int n) {
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i]);
    }
  }

}
