package tp1.ej7.d;

public class Estudiante {

  private String nombre;
  private String apellido;
  private String carrera;
  private int num_alumno;
  private int materias_aprobadas;

  public Estudiante(String nombre, String apellido, String carrera, int num, int aprobadas) {

    this.nombre = nombre;
    this.apellido = apellido;
    this.carrera = carrera;
    this.num_alumno = num;
    this.materias_aprobadas = aprobadas;

  }

  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public String getCarrera() {
    return carrera;
  }

  public int getNum_alumno() {
    return num_alumno;
  }

  public int getMaterias_aprobadas() {
    return materias_aprobadas;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public void setCarrera(String carrera) {
    this.carrera = carrera;
  }

  public void setNum_alumno(int num_alumno) {
    this.num_alumno = num_alumno;
  }

  public void setMaterias_aprobadas(int materias_aprobadas) {
    this.materias_aprobadas = materias_aprobadas;
  }

}