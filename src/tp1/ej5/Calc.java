package tp1.ej5;

public class Calc {
  private int max;
  private int min;
  private float promedio;

  public Calc() {
    this.max = -2147483648; // Low value
    this.min = 922337203; // High value
    this.promedio = 0;
  }

  public int getMax() {
    return max;
  }

  public int getMin() {
    return min;
  }

  public float getProm() {
    return promedio;
  }

  public void setMax(int max) {
    this.max = max;
  }

  public void setMin(int min) {
    this.min = min;
  }

  public void setProm(int suma, int cantidad) {
    this.promedio = suma / cantidad;
  }

}
