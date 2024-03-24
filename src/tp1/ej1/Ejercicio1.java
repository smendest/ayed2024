package tp1.ej1;

public class Ejercicio1 {
  /* Declaración del **estad** del objeto */
  /* Declaración del **contructor/es ***/

  /* Declaración de métodos que implementan acciones */
  private static int menor(int a, int b) {
    if (a > b) {
      return b;
    } else {
      return a;
    }
  }

  private static int mayor(int a, int b) {
    if (a < b) {
      return b;
    } else {
      return a;
    }
  }

  public static void showNumbersFor(int a, int b) {

    int inferior = menor(a, b);
    int superior = mayor(a, b);

    for (int i = inferior; i <= superior; i++) {
      System.out.println(i);
    }
  }

  public static void showNumbersWhile(int a, int b) {
    int inferior = menor(a, b);
    int superior = mayor(a, b);
    int aux = inferior;
    while (aux <= superior) {
      System.out.println(aux);
      aux += 1;
    }
  }

  public static void showNumbersRecursive(int a, int b) {
    int inferior = menor(a, b);
    int superior = mayor(a, b);
    if (inferior == superior) {
      System.out.println(inferior);
      // Cuando los números son iguales se imprime por última vez.
      // No se vuelve a llamar al método.
    } else {
      System.out.println(inferior);
      showNumbersRecursive(inferior + 1, superior);
    }
  }
}
