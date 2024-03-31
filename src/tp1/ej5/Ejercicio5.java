package tp1.ej5;

public class Ejercicio5 {

  public static Calc getCalcA(int[] arr) {
    Calc calculo = new Calc();
    int max = calculo.getMax(); // Obtener valor inicial
    int min = calculo.getMin(); // Obtener valor inicial
    int suma = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max)
        max = arr[i];
      if (arr[i] < min)
        min = arr[i];
      suma += arr[i];
    }
    calculo.setMax(max);
    calculo.setMin(min);
    calculo.setProm(suma, arr.length);
    return calculo;
  }

  public static void getCalcB(int[] arr, Calc calculo) {
    int max = calculo.getMax(); // Obtener valor inicial
    int min = calculo.getMin(); // Obtener valor inicial
    int suma = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max)
        max = arr[i];
      if (arr[i] < min)
        min = arr[i];
      suma += arr[i];
    }
    calculo.setMax(max);
    calculo.setMin(min);
    calculo.setProm(suma, arr.length);
  }

  /* Main Program */
  public static void main(String[] args) {

    int intArray[] = new int[5]; // declara y crea

    for (int i = 0; i < intArray.length; i++) {
      intArray[i] = i * -2;
    }

    /* A */
    Calc resultadoA = new Calc(); // Instancio objeto y guardo referencia en variable
    resultadoA = getCalcA(intArray);

    System.out.println("A) ");
    System.out.println("Max: " + resultadoA.getMax());
    System.out.println("Min: " + resultadoA.getMin());
    System.out.println("Prom: " + resultadoA.getProm());

    /* B */

    Calc resultadoB = new Calc(); // Instancio objeto y guardo referencia en variable
    getCalcB(intArray, resultadoB); // Objeto como parámetro de entrada/salida (Se copia la ref y es modifica el obj
                                    // desde el método)

    System.out.println("B) ");
    System.out.println("Max: " + resultadoB.getMax());
    System.out.println("Min: " + resultadoB.getMin());
    System.out.println("Prom: " + resultadoB.getProm());

  }
}
